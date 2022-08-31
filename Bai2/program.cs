using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bai2
{
    internal class program
    {
        public static void Main(string[] cmd)
        {
            string name1 = "Tiger";
            int weight = 100;
            Lion lion = new Lion(weight, name1);
            lion.Show();
            Console.WriteLine("------------");
            string name2 = "Lion";
            int weight1 = 200;
            Tiger tiger = new Tiger(weight1, name2);
            tiger.Show();
            Console.WriteLine("------------");

        }
    }
}