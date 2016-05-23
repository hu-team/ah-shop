using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace client_net.Models
{
    class User
    {
        public int ID { get; set; }

        public string Name { get; set; }

        public string Username { get; set; }

        public string Password { get; set; }

        public float Balance { get; set; }
    }

    class Product
    {
        public int ID { get; set; }

        public string Name { get; set; }

        public float Price { get; set; }

        public int Quantity { get; set; }
    }
    
}
