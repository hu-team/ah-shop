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
                    this.client.CreateUser(new createUser()
                    {
                        nameField = this.registerNameField.Text,
                        usernameField = this.registerUsernameField.Text
                    });
                if (result.useridField != "")
                    MessageBox.Show(
                        string.Format("Account created:\n\nLogin: {0}\nPassword: {1}", result.usernameField,
                            result.passwordField), "Account Created!", MessageBoxButton.OK, MessageBoxImage.Information);
                else
                    MessageBox.Show("Failed to create account, make sure the username doesn't exists!",
                        "Account Created Error!", MessageBoxButton.OK, MessageBoxImage.Exclamation);
            }
            catch (Exception)
            {
                MessageBox.Show("Error creating account, make sure the username is unique and doesn't exists already!",
                       "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            }
        }

        private void loginButton_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                var result = this.client.LoginUser(new loginUser()
                {
                    usernameField = this.loginUsernameField.Text,
                    passwordField = this.loginPasswordField.Password
                });

                if (result.successField)
                    LoginSuccess(int.Parse(result.useridField));
                else
                    MessageBox.Show("Login failed, correct credentials?",
                       "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            }
            catch (Exception)
            {
                MessageBox.Show("Login failed, correct credentials? Connection to the internet?",
                       "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            }

            UserDashboard userdashboard = new UserDashboard();
            userdashboard.Show();
            this.Close();
        }

        private void LoginSuccess(int UserID)
        {
            var result = this.client.UserDetails(new userDetails() {userField = UserID + ""});
        }
    }
}
