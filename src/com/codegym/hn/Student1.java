package com.codegym.hn;

public class Student1 {
    private int rollno;
    private String name;
    private static String college = "BBD";

    Student1(int r, String n){
        rollno= r;
        name= n;
    }
    static void change(){
        college= "Codegym";
    }
    void display(){
        System.out.println(rollno+ " "+ name +" "+college);
    }
}
class Test{
    public static void main(String[] args) {
        Student1.change();
        Student1 s1 = new Student1(111,"hoa");
        Student1 s2= new Student1(22, "huy");
        s1.display();
        s2.display();
    }
}
