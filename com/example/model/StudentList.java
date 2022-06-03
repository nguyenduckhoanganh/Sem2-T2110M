package com.example.model;


import com.example.entity.Student;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {
    private LinkedList<Student> list = new LinkedList<>() ;
    private int length;

    public StudentList(){
        list.add( new Student(1,"thanh","minh",10));
        list.add( new Student(2,"hai","minh",0));
        list.add( new Student(3,"hanh","tu",7));
        list.add( new Student(4,"tung","minh",4));
        list.add( new Student(5,"hai","tu",10));
        list.add( new Student(6,"son","tung",5));
        list.add( new Student(7,"ha","my",3));
        list.add( new Student(8,"kien","anh",10));
        list.add( new Student(9,"khong","thuong",8));
        list.add( new Student(10,"anh","tu",10));
        list.add( new Student(11,"thanh","minh",10));
        list.add( new Student(12,"da","hai",5));
        list.add( new Student(13,"anh","giang",1));
        list.add( new Student(14,"yen","chi",9));
        list.add( new Student(15,"linh","anh",6));
        list.add( new Student(16,"ta","dat",8));
        list.add( new Student(17,"hai","anh",6));
        list.add( new Student(18,"le","lan",8));
        list.add( new Student(19,"to","trang",10));
        list.add( new Student(20,"thanh","binh",10));
    }

    public StudentList(){list = new LinkedList<Student>();}

    public LinkedList<Student> findByName(String name) {
        boolean found = false;
        LinkedList<Student> matches = new LinkedList();
        for (Student s : list) {
            String fullName = new String(s.getFirstName() + "" + s.getLastName()).toLowerCase();
            if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")) {
                matches.add(s);
                found = true;
            }
        }
            if (found == false) {
                System.out.println("Not found");
            }
            return matches;
        }
        public Student findById ( int id){
            for (Student s: list) {
                if (s.getId() == id) {
                    return s;
                }
            }
                return null;
            }
            public void add (Student s){list.add(s);}
            public void remove ( int id){
                boolean found = false;
                for (Student s : list) {
                    if (s.getId() == id) {
                        int choice;
                        System.out.println("Are you sure deleting this student?(1.Yes 2.No)");
                        choice = new Scanner(System.in).nextInt();
                        if (choice == 1)
                            list.remove(s);
                        found = true;
                    }
                }
                if (found == false) {
                    System.out.println("Can not find student with id" + id);
                }
            }
            public void sortByMarks() {
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {return new Double(s2.getMark()).compareTo(s1.getMark());}
                });
            }
            public void showList() {
                for (Student s:list) {
                    s.printInfo();
                }
            }
            public void showList (LinkedList<Student>slist) {
                for (Student s:slist) {
                    s.printInfo();
                }
            }
        }
