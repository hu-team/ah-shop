using System;
using System.Windows;
using client_net.ShopServiceReference;

namespace client_net
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private ShopServiceClient client = new ShopServiceClient();

        public MainWindow()
        {
            InitializeComponent();
        }

        private void registerButton_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                var result =
                    this.client.CreateUser(new CreateUserData()
                    {
                        Name = this.registerNameField.Text,
                        Username = this.registerUsernameField.Text
                    });
                if (result.Meta.Success)
                {
                    string message =
                        $"Account created:\n\nLogin: {result.Data.username}\nPassword: {result.Data.password}";
                    MessageBox.Show(message, "Account Created!", MessageBoxButton.OK, MessageBoxImage.Information);
                    this.registerOutputBlock.Text = message;
                }
                else
                {
                    MessageBox.Show($"Failed to create account: {result.Meta.Message}",
                        "Account Created Error!", MessageBoxButton.OK, MessageBoxImage.Exclamation);
                }
            }
            catch (Exception)
            {
                MessageBox.Show("Error creating account, make sure you have internet connection!",
                       "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            }
        }

        private void loginButton_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                var result = this.client.LoginUser(new LoginUserData()
                {
                    Username = this.loginUsernameField.Text,
                    Password = this.loginPasswordField.Password
                });

                if (result.Meta.Success)
                    LoginSuccess(result.Data);
                else
                    MessageBox.Show($"Login failed: {result.Meta.Message}",
                       "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            }
            catch (Exception)
            {
                MessageBox.Show("Login failed! Connection to the internet?",
                       "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            }
        }

        private void LoginSuccess(User user)
        {
            UserDashboard userdashboard = new UserDashboard(user);
            userdashboard.Show();
            this.Close();
        }
    }
}
