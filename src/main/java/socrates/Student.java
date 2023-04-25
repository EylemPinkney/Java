package socrates;

public class Student {


        String name;//name is not static and we attach it to objects. There is not a name here so default value is null.

        static String college ="UNF"; // college is static and we attach it to the class. Inital value is UNF



        Student(String n, String college){ //Constructor has a same name with the class. What does it do?
            //we put n for name, when we put name, that will go to name bucket same with college as well

            this.name = n;

            this.college = college;

        }

    public static void main(String[] args) {
        Student s1 = new Student("Mark", "UCF"); //While I create s1, I should use an
                                                            //object constructor -->Student("Mark", "UCF"). Where is it?
                                                            //It is above main method -->   Student(String n, String college){
        Student s2 = new Student("Kevin", "FIU");

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);

        /*
         What is the output?
        */
    }

}



