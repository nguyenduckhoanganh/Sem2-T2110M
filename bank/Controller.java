package bank;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Controller {
    private static long balanceNumber=1000000;
    List<TransactionHistory> listHistory =new ArrayList<TransactionHistory>();;

    public long getBalanceNumber(){
        return balanceNumber;
    }

    public static long transfer(long money){

        if (money > balanceNumber){
            System.out.println("Tai khoan khong du ");
        }else {
            balanceNumber=balanceNumber-money;
            System.out.println("Chuyen thanh cong");
        };
        // Kiểm tra nếu số tiền nhỏ hơn 50.000 thì thông báo số tiền chuyển tối thiểu phải là 50.000
        // Nếu số tiền chuyển lớn hơn số dư thì thông báo tài khoản không đủ
        // Nếu chuyển thành công,thì thông báo chuyển khoản thành công,in ra số dư mới và thêm lịch sử giao dịch mới
        return balanceNumber;
    }
    public void actionTransfer(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so tai khoan thu huong: ");
        String b =scanner.next();
        System.out.println("Nhap so tien ban muon chuyen: ");
        long a = scanner.nextLong();
        transfer(a);
        System.out.println("nhap thong tin: ");
        String c = scanner.next();
        System.out.println(""+a);
        listHistory.add(new TransactionHistory(c,b,a));
        // Thực hiện các công việc như nhập số tài khoản thụ hưởng,số tiền mô tả tại đây
    }
    public void getHistory(){
        System.out.println(listHistory);
        // In danh sách lịch sử giao dịch
    }
    // Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter=new DecimalFormat("###,###,##00");
        //100000->100,000.00
        return formatter.format(money);
    }
}
