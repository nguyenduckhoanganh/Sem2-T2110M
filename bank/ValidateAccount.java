package bank;

public class ValidateAccount {
    // Kiểm tra đăng nhập
    public final String MOBILE="0902049928";
    public final String PASSWORLD="hoanganh";
    public boolean checkAcount(String mobile,String passworld){
        if(mobile.equals(MOBILE)){
            if(passworld.equals(PASSWORLD)){
                System.out.println("Đăng nhập thành công!");
                return true;
            }else{
                System.out.println("Mật khẩu sai,vui lòng nhập lại");
                return false;
            }
        }else{
            System.out.println("Kiểm tra lại số điên thoại hoặc passworld");
            return false;
        }
    }
}
