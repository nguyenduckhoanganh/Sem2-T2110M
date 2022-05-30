package shop;

public class Menu {
    public static void mainMenu(){
        System.out.println("1-xem thong tin san pham");
        System.out.println("2-in danh sach san pham co gia tren 10.000");
        System.out.println("3-Dem so san pham co so luong ban tu 50 tro len");
        System.out.println("4-Liet ke san pham theo loai san pham ");
        System.out.println("5-Liet ke san pham theo so luong ban duoc ");
        System.out.println("6-Dua ra san pham ban nhieu nhat");
        System.out.println("7-Sap xep san pham theo ten");
        System.out.println("0-Thoat chuong trinh");
        System.out.println("Lựa chon cua ban la: ");
    }
    public static void chooseCategory(){
        System.out.println("1-Thực phẩm");
                System.out.println("2-Do gia dung");
    }
    public static void secondMenu(){
        System.out.println("1 -Sửa thông tin sản phẩm");
                System.out.println("2-Xoá sản phẩm");
                        System.out.println("0-Quay về trang chủ");
                                System.out.println("Lựa chọn của bạn là:");
    }

}
