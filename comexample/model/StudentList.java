package comexample.model;
import java.util.HashSet;
import java.util.Set;
class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student(int id,String firstName,String lastName, double mark) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ",lastName=" + lastName+",mark="+mark+"]";
    }
}
public class StudentList {

    private int length;
    public static final int NUM_OF_ELEMENT = 20;
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        Student student1 = new Student(1,"thanh","minh",10);
        Student student2 = new Student(2,"hai","minh",0);
        Student student3 = new Student(3,"hanh","tu",7);
        Student student4 = new Student(4,"tung","minh",4);
        Student student5 = new Student(5,"hai","tu",10);
        Student student6 = new Student(6,"son","tung",5);
        Student student7= new Student(7,"ha","my",3);
        Student student8= new Student(8,"kien","anh",10);
        Student student9 =new Student(9,"khong","thuong",8);
        Student student10= new Student(10,"anh","tu",10);
        Student student11 =new Student(11,"thanh","minh",10);
        Student student12= new Student(12,"da","hai",5);
        Student student13 =new Student(13,"anh","giang",1);
        Student student14 =new Student(14,"yen","chi",9);
        Student student15 =new Student(15,"linh","anh",6);
        Student student16 =new Student(16,"ta","dat",8);
        Student student17 =new Student(17,"hai","anh",6);
        Student student18= new Student(18,"le","lan",8);
        Student student19= new Student(19,"to","trang",10);
        Student student20= new Student(20,"thanh","binh",10);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);

    }
}
