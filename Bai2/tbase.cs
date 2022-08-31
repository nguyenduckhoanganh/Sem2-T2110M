using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bai2
{
    internal abstract class tbase
    {

        public abstract int Weight { get; set; }
        public abstract string Name { get; set; }

        public abstract void Show();
        public abstract void SetMe(int weight, string name);
        public tbase(int weight, string name)
        {
            Weight = weight;
            Name = name;
        }
    }
}