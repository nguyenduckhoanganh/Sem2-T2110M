package thith2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static String bookID;
    private static String bookName;
    private static String author;
    private static int price;
    private static final String MYSQL_SELECT = "select * from books";
    private static final String MYSQL_INSERT = "Insert into books values(?,?,?,?)";
    public Connection getMssql() throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/dbtest";
        String username ="sa";
        String password ="";
        Connection connection = DriverManager.getConnection(dbURL,username,password);
        return connection;
    }
    private static Scanner sc = new Scanner(System.in);
    public void add(StoreBooks storeBook){
        System.out.println("ID : ");
        bookID = sc.next();
        System.out.println("Name : ");
        bookName = sc.next();
        System.out.println("Author : ");
        author = sc.next();
        System.out.println("Price : ");
        price = sc.nextInt();
    }
    @Override
    public int insert(StoreBooks book)  {
        try {
            Connection connection = getMssql();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            int result = 0;
            preparedStatement = connection.prepareStatement(MYSQL_INSERT);
            preparedStatement.setString(1, bookID);
            preparedStatement.setString(2, bookName);
            preparedStatement.setString(3, author);
            preparedStatement.setInt(4, price);
            result = preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<StoreBooks> getAll() throws SQLException {
        try {
            Connection connection = getMssql();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            List<StoreBooks> list = new ArrayList<>();
            StoreBooks storeBook = null;

            preparedStatement = connection.prepareStatement(MYSQL_SELECT);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null) {
                System.out.println("Thành công");
            } else {
                System.out.println("Không thành công");
            }
            while (resultSet.next()) {
                boolean add = list.add(new StoreBooks(resultSet.getString("bookID"), resultSet.getString("bookName"), resultSet.getString("author"), resultSet.getInt("price")) {
                    @Override
                    public int insert(StoreBooks book) throws SQLException {
                        return 0;
                    }

                    @Override
                    public List<StoreBooks> getAll() throws SQLException {
                        return null;
                    }
                });
            }
            for (StoreBooks a : list) {
                System.out.println(a.toString());
            }
            return list;
        } catch (SQLException a) {
        }
        return null;
    }

    public static void menu(){
        System.out.println("1. Add\n2. Save\n3. Display\n4. Exit ");
    }
    public static void main(String[] args) throws SQLException {
        StoreBooks storeBook = new StoreBooks() {
            @Override
            public int insert(StoreBooks book) throws SQLException {
                return 0;
            }

            @Override
            public List<StoreBooks> getAll() throws SQLException {
                return null;
            }
        };
        Menu storeBookProduct = new Menu();
        storeBookProduct.getMssql();
        if (storeBookProduct.getMssql() != null){
            System.out.println("Kết nối thành công");
        }
        while (true){
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    storeBookProduct.add(storeBook);
                    menu();
                    break;
                case 2:
                    storeBookProduct.insert(storeBook);
                    menu();
                    break;
                case 3:
                    storeBookProduct.getAll();
                    menu();
                    break;
                case 4:
                    storeBookProduct.getMssql().close();
                    System.exit(0);
                    break;
            }
        }
    }
}
