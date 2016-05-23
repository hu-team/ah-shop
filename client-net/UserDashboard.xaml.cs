using System.Text;
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

        public UserDashboard()
        {
            InitializeComponent();
            RefreshContents();
        }

        private void RefreshContents()
        {
            // Reset and clear lists
            listBox.Items.Clear();
            listBox2.Items.Clear();

            // Clear text fields
            label2.Content = "Balance: € ?";


            // Refresh from server
            this.LoadUser();

        }

        private void LoadUser()
        {
            
        }
        /*
        private void getInventory()
        {
            string urlpart = url + "inventory/" + user.data[0].id;
            string getInventory = wc.DownloadString(urlpart);
            JavaScriptSerializer ser = new JavaScriptSerializer();
            getInventory inventory = ser.Deserialize<getInventory>(getInventory);

            if (inventory.data.Count > 0)
            {
                foreach (Inventory i in inventory.data)
                {
                    listBox.Items.Add((i));
                }
            }
        }
        
        private void getShopItems()
        {


            foreach (Product p in products.data)
            {
                listBox2.Items.Add((p));
            }
        }

        private void setBalance()
        {
            label2.Content = "Balance: €" + user.data[0].user_info.balance;
        }

        private void refreshView()
        {
            //reset
            listBox.Items.Clear();
            listBox2.Items.Clear();

            setBalance();
            getShopItems();
            getInventory();

        }
        */
        private void button_Click(object sender, RoutedEventArgs e)
        {
            /*
            Product selectedProduct = (Product)listBox2.SelectedItem;
            if (selectedProduct == null)
            {
                return; // Prevent NullPointer.
            }

            int productid = selectedProduct.id;
            int userid = user.data[0].id;

            System.Collections.Specialized.NameValueCollection reqparm = new System.Collections.Specialized.NameValueCollection();
            reqparm.Add("userid", userid.ToString());
            reqparm.Add("productid", productid.ToString());
            byte[] repsonsebytes = wc.UploadValues(url + "purchased", "POST", reqparm);
            string responsebody = Encoding.UTF8.GetString(repsonsebytes);
            JavaScriptSerializer ser = new JavaScriptSerializer();
            Purchased purchased = ser.Deserialize<Purchased>(responsebody);

            if (purchased.type == "notEnoughMoney")
            {
                MessageBox.Show(" " + purchased.message, "Not Enough Money", MessageBoxButton.OK, MessageBoxImage.Warning);
            }

            if (purchased.type == "isSoldOut")
            {
                MessageBox.Show(" " + purchased.message, "Product is Sold Out", MessageBoxButton.OK, MessageBoxImage.Warning);
                refreshView();
            }

            if (purchased.type == "boughtItem")
            {
                MessageBox.Show(" " + purchased.message, "Thank You!", MessageBoxButton.OK, MessageBoxImage.Information);
                refreshView();
            }
            */

        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            // refreshView();
        }
    }
}
