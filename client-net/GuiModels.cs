using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using client_net.ShopServiceReference;

namespace client_net
{
    class GuiProduct
    {
        public Product Product { get; set; }

        public GuiProduct(Product product)
        {
            this.Product = product;
        }

        public override string ToString()
        {
            return $"{this.Product.name}, {this.Product.price.ToString("F")}, ({this.Product.quantity}x)";
        }
    }


    class GuiPurchase
    {
        public Purchase Purchase { get; set; }

        public GuiPurchase(Purchase purchase)
        {
            this.Purchase = purchase;
        }

        public override string ToString()
        {
            return $"1x {this.Purchase.Product.name}, {this.Purchase.price.ToString("F")}";
        }
    }
}
