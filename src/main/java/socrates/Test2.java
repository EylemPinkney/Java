package socrates;

import java.util.Scanner;

public class Test2 {
    String studentName;//Non-static
    String year = "2020";//Non-static
    static int counter = 1000;//Static
    String studentId;//non static
    public Test2() { //How did I understand this was a constructor; NAme is as same as the class and there is no return type
        Scanner scan = new Scanner(System.in);//This part get data from the user
        System.out.println("Enter your name");//This part get data from the user
        studentName = scan.next();//This part get data from the user. User entered "Ali Can", but Java will process only
        //first part of the name because we have next() not nextln()
        setStudentId();//Then Im calling setStudentId() method. That is below, at the end.
    }
    public static void main(String[] args) {
        Test2 student1 = new Test2();//This is asking JAva to create an object from the constructor.
        System.out.println(student1.studentName + student1.studentId); //A
        Test2 student2 = new Test2();
        System.out.println(student2.studentName + student2.studentId); //B
    }
    public void setStudentId() {//What is this method doing?
        counter++;//increasing the value of counter by one
        this.studentId = year + "" + counter;//concantination here

        /*
        If user enters "Ali Can" for the first student's name, and "Veli Han" for the second student's
        name, what is the output for A and B?
         */
    }
}

