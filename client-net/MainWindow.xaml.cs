using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace client_net
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        
        private void button1_Click(object sender, RoutedEventArgs e)
        {
            string username = textBox1.Text;
            string firstname = textBox2.Text;
            string lastname = textBox3.Text;

            MessageBox.Show(" " + "", "Error!", MessageBoxButton.OK, MessageBoxImage.Error);
            MessageBox.Show(" " + "", "Account Created!", MessageBoxButton.OK, MessageBoxImage.Information);
        }

        private void button_Click(object sender, RoutedEventArgs e)
        {
            string username = textBox.Text;
            string password = passwordBox.Password.ToString();

            MessageBox.Show(" " + "", "Error!", MessageBoxButton.OK, MessageBoxImage.Error);

            UserDashboard userdashboard = new UserDashboard(loginuser);
            userdashboard.Show();
            this.Close();
        }
    }
}
