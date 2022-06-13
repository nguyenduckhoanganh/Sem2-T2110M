package filedemo;

import com.example.entity.Student;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ReadFileData {
    private List<Employee> employees1 = new ArrayList<>();
    public void showList(){
        employees1.sort(Comparator.comparing(Employee::getName));
        for (Employee s : employees1){
            System.out.println(s);
        }

    }
    public void addEmployee() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID :");
        int id = sc.nextInt();
        System.out.println("Nhập first name :");
        String firstname = sc.next();
        System.out.println("Nhập Last name : ");
        String lastname = sc.next();
        String name = firstname + " " + lastname;
        System.out.println("Tên của bạn sẽ là " + name);
        System.out.println("Nhập email :");
        String email = sc.next();
        System.out.println("Nhập Vai Trò - nhập tổng số vai trò sẽ nhập :");
        int a = sc.nextInt();
        String []role = new String[a];
        for (int i = 0; i< a;i++){
            System.out.println("Nhập vai trò " + i);
            role[i] = sc.next();
        }
        System.out.println("Are you Manager ?\n1. true\n2. false");
        boolean manager = false;
        int chon = sc.nextInt();
        if(chon == 1){
            manager = true;
        } else if (chon == 2) {
            manager = false;
        }
        Employee e = new Employee(id,name,email,role,manager);
        add(e);

        Gson gson = new Gson();
        FileWriter writer = new FileWriter("employee.json");
        gson.toJson(employees1,writer);
        writer.close();
    }

    public void removeEployee(int id) throws IOException {
        Gson gson = new Gson();
        employees1.remove(id);
        FileWriter writer = new FileWriter("employee.json");
        gson.toJson(employees1,writer);
        writer.close();
    }
    public void add (Employee s){
        employees1.add(s);
    }
    public void getEmployee() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("employee.json");
        employees1 = gson.fromJson(reader,new TypeToken<List<Employee>>(){}.getType());

        for (Employee c : employees1){
            System.out.println(c);
        }
        reader.close();
    }
    public void getEmployeeId () throws IOException {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();

        FileReader reader = new FileReader("employee.json");
        employees1 = gson.fromJson(reader,new TypeToken<List<Employee>>(){}.getType());
        System.out.println("Nhập id cần tìm : ");
        int id =  sc.nextInt();

        for (Employee c : employees1){
            if (c.getId() == id){
                System.out.println(c);
            }
        }
        reader.close();
    }

    public void getEmployeeName () throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();

        FileReader reader = new FileReader("employee.json");
        employees1 = gson.fromJson(reader,new TypeToken<List<Employee>>(){}.getType());
        System.out.println("Nhập tên cần tìm");
        String name =  sc.next();

        for (Employee c : employees1){
            if (Objects.equals(c.getName(), name)){
                System.out.println(c);
            }
        }
    }
}
