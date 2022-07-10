package lap15.project;
import java.util.ArrayList;
import java.util.Comparator;
public class LambdaExpressionExample {
    public void example(){
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        numbers.add(6);
        numbers.add(11);
        numbers.add(18);
        // Sử dụng foreach để in danh sách
        for(Integer integer :numbers){
            System.out.println(integer);
        }
        // Sử dụng Lambda
        numbers.forEach((number)->{
            System.out.println(number);});
        // sắp xếp ds vơi comparator
        numbers.sort(new Comparator<Integer>(){
        @Override
        public int compare(Integer o1,Integer o2){return o1-02;}
});

           numbers.sort((Integer num1,Integer num2) ->{
           return num1 - num2;
           });
           System.out.println("Danh sạch sap xếp:");
           numbers.forEach((number) ->{
           System.out.println(number);});

}
}