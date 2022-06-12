package filedemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriteFileData {
    public static void writeFileWithmap() throws IOException {
        Map<String , Object> mapData = new HashMap<>();
        mapData.put("id", "1");
        mapData.put("name", "Trung");
        mapData.put("email","trung@gmail.com");
        mapData.put("rolles",new String[]{"Adim","Manager","Member"});

        Writer writer = new FileWriter("employee.json");
        Gson gson =new Gson();
        gson.toJson(mapData,writer);

        writer.close();
    }
    public static void writeFileWithEntily() throws IOException{
        Employee employee = new Employee(1,"Nguyen","nguyen@gmail.com", new String[]{"Manager","Adim","Member"},true);

        Writer writer = Files.newBufferedWriter(Paths.get("employeeEntiti.json"));
        new Gson().toJson(employee,writer);
        writer.close();
    }
    public static void writeFileEntities() throws IOException{
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Quang","quang@gmail.com",new String[]{"Member"},false),
                new Employee(2,"Tu","tu@gmail.com",new String[]{"Member","Admin"},false),
                new Employee(3,"Ha","ha@gmail.com",new String[]{"Member","Admin"},false),
                new Employee(4,"Thanh","quang@gmail.com",new String[]{"Member"},false)
        );
        Writer writer = new FileWriter("employeeEntities.json");
        Gson gson = new Gson();
        gson.toJson(employees,writer);
        writer.close();

    }

    public static void writeFileWithFomat() throws IOException {
        Employee employee= new Employee(1,"Hieu","hieu@gmail.com",new String[]{"Admin","Maneger"},true);
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        Writer writer = Files.newBufferedWriter(Paths.get("employeesPretty.json"));
        gson.toJson(employee,writer);
        writer.close();
    }

    public static void main(String[] args) throws IOException{
        writeFileWithmap();
        writeFileWithEntily();
        writeFileEntities();
        writeFileWithmap();
    }
}
