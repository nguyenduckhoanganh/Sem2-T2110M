package shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
    List<Product> listProducts= new ArrayList<>();
    public Repository(){
        listProducts.add(new Product("01","Banh Doremon 3 vi", Category.FOOD,100,3500,57));
        listProducts.add(new Product("02","Xuc xich suon non", Category.FOOD,150,3500,12));
        listProducts.add(new Product("03","Thanh cua", Category.FOOD,100,5000,85));
        listProducts.add(new Product("04","Banh khoai mon", Category.FOOD,200,42000,78));
        listProducts.add(new Product("05","Thia an com inox ma vang", Category.HOUSEWARE,50,8000,4));
        listProducts.add(new Product("06","Bat dung gia vi", Category.HOUSEWARE,65,4000,44));
        listProducts.add(new Product("07","Nuoc hoa hong soothing facial toner simple", Category.COSMETICS,140,639000,7));
        listProducts.add(new Product("08","Combo goi xa Hairburst", Category.COSMETICS,100,249000,24));
        listProducts.add(new Product("09","Tinh chat duong am sau Klairs rich moist soothing serum", Category.COSMETICS,50,249000,24));
        listProducts.add(new Product("10","Kem duong the paula's choice resist weightless body treatment", Category.FOOD,80,71500,63));
        listProducts.add(new Product("11","Ao thun Tsun", Category.FASHION,250,32000,246));
    }
    public void show(){
        // Su dung foreach
        //for(Product product : listProduct){
        // System.out.println(products);
        //}
        //su dung lambda
        listProducts.forEach(product -> System.out.println(product));
    }
    public void sortProductByname(){
        //Su dung comparator
        // listProduct.sort(new Comparator<Product>(){
        //@Override
        // public int compare(Product o1, Product o2){
        // return o1.getName().compareTo(o2.getName());
        //}
        //}):

        //su dung lambda
        listProducts.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
    }
    public void filterProductByPrice() {
        // for(Product product:list Products){
        //if(product.getPrice()>10000){//
        // System.out.println(product);
        //}
        //}
        // sử dụng lambda và stream
        listProducts.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }
            public void countProductByAmountSale(){
                long count=listProducts.stream()
                        .filter(product->product.getAmountSale()>=50)
                        .count();
                System.out.println("số lượng sản phẩm bán được từ 50 trở lên là:"+count);
            }
}
