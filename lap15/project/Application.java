package lap15.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Character.getName;

public class Application{
    public static void main(String[]args){

    ArrayList<Person>persons=new ArrayList<>();
        persons.add(new Person("Khoi",35));
        persons.add(new Person("Minh",20));
        persons.add(new Person("Viet Anh",18));
        persons.add(new Person("Hoang",40));
        persons.add(new Person("Ngoc",30));
        persons.add(new Person("My",30));
    show(persons);
    // su dung Comparator
        Collections.sort(persons,new Comparator<Person>(){
        @Override
        public int compare(Person o1,Person o2){return o1.getName().compareTo(o2.getName());}
    });
    // Su dung Lambda
        Collections.sort(persons,((o1,o2)->{
        return o1.getName().compareTo(o2.getName());
    }));
// Sử dụng lambda để sắp xếp theo ten với phương thức compareByName
    Collections.sort(persons,((o1,o2)->Person.compareByName(o1,o2)));
                                     show(persons);
                                     // Liệt kê những người trên 30 tuổi.Không sử dụng lambda expression
                                     System.out.println("Danh sách những người trên 30 tuổi là:");
                                     for(Person person :persons){
                                     if(person.getAge()>30){
                                     }
                                     }
                                     System.out.println(persons);
                                     // Liệt kê những người trên 30 sử dụng lambda expression
                                     System.out.println("Danh sách những người trên 30 tuổi là:");
                                     persons.stream().filter(person->person.getAge()>30)
                                     .forEach(person->System.out.println(person));
            }public static void show(ArrayList<Person>persons){
        persons.forEach(person->System.out.println(person));
        }
        }