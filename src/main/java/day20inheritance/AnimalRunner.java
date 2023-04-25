package day20inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.eat();
        myCat.drink();
        myCat.meow();

       Dog myDog = new Dog();
       myDog.bark();
       myDog.drink();
       myDog.eat();

       Bird myBird = new Bird();
       myBird.tweet();
       myBird.drink();
       myBird.eat();

    }

}
