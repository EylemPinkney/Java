package socrates;

public class Static03 {
    static int counter = 0;//If you want to count objects, create from the class, put counter increment inside the constructor.
    int age = 0;
    public Static03() {
        counter++;//Use the increment operator, ++, to increase the value of your variable by one.
                  // If the variable count is initially set to zero,
                  // the following code increases the value of count to 1: count++;
        age++;
    }
    public static void main(String[] args) {
        Static03 obj1 = new Static03();
        Static03 obj2 = new Static03();
        Static03 obj3 = new Static03();
        System.out.println(obj1.counter);
        System.out.println(obj2.counter);
        System.out.println(obj3.counter);
        System.out.print(" - ");
        System.out.println(obj1.age);
        System.out.println(obj2.age);
        System.out.println(obj3.age);
    }
}
