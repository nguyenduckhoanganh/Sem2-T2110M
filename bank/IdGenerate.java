package bank;
import java.util.concurrent.locks.ReentrantLock;



public class IdGenerate {
    private static Long id= 0L;
    private static ReentrantLock Lock = new ReentrantLock();
    public static Long getNewID(){
        long result;
        Lock.lock();// Khoá biến id lại chỉ cho duy nhất một thread được truy xuất cập
        // để tránh tình trạng Data RacingI
        try{
            result=++ id;// Tăng rồi gán vào result
        }finally{
            Lock.unlock();// Tăng rồi thì mở lock cho thread khác cùng truy cập
            // Nhiều như mình dùng xong nhà vệ sinh thì đi ra thôi.
        }
        return result;
    }
    private IdGenerate(){}
}
