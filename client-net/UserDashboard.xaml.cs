using System.Text;
using System.Threading.Tasks;
using System.Windows;
using client_net.ShopServiceReference;

namespace client_net
{
    /// <summary>
    /// Interaction logic for UserDashboard.xaml
    /// </summary>
    public partial class UserDashboard : Window
    {
        private ShopServiceClient client = new ShopServiceClient();
        private User user;

        public UserDashboard(User user)
        {
            this.user = user;

            InitializeComponent();
            RefreshContents();
        }

        private async void RefreshContents()
        {
            // Reset and clear lists
            productList.Items.Clear();
            historyList.Items.Clear();
            balanceLabel.Content = $"Balance: € ? (Loading...)";

            // Refresh from server
            await this.LoadUser();
            await this.LoadProducts();
            await this.LoadHistory();
        }

        private async Task LoadUser()
        {
            var result = await this.client.UserDetailsAsync(new UserDetailsData() {UserID = this.user.userid});
            if (result.Meta.Success)
            {
                this.user = result.Data;
                balanceLabel.Content = $"Balance: € {this.user.balance.ToString("F")}";
            }
        }

        private async Task LoadProducts()
        {
            var result = await this.client.ProductListAsync();
            this.productList.Items.Clear();
            if (result.Meta.Success)
                foreach (var product in result.Data)
                    this.productList.Items.Add(new GuiProduct(product));
        }


        private async Task LoadHistory()
        {
            var result = await this.client.HistoryListAsync(new HistoryListData() {UserID = this.user.userid});
            this.historyList.Items.Clear();
            if (result.Meta.Success)
                foreach (var purchase in result.Data)
                    this.historyList.Items.Add(new GuiPurchase(purchase));
        }


        private async Task Purchase(Product product)
        {
            var result = await this.client.PurchaseProductAsync(new PurchaseProductData()
            {
                UserID = this.user.userid,
                ProductID = product.productid
            });

            if (!result.Meta.Success)
            {
                MessageBox.Show($"Can't purchase product: {result.Meta.Message}", "Error Purchasing Product",
                    MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            else
            {
                this.RefreshContents();
            }
        }


        private void BuyButton_Click(object sender, RoutedEventArgs e)
        {
            GuiProduct selectedProduct = (GuiProduct)productList.SelectedItem;
            if (selectedProduct == null) return; // Prevent null

            Product product = selectedProduct.Product;
            this.Purchase(product);
        }

        private void RefreshButton_Click(object sender, RoutedEventArgs e)
        {
            RefreshContents();
        }
    }
}
