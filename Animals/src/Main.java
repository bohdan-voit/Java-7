//Спростив для себе, для кращого розуміння і багато коду трохи мені важко сприймати поки.

import java.util.Arrays;
public class Main implements Comparable <Main> {
    public static void main(String[] args) {

Dog dog = new Dog();
CanRun canRun = dog;
dog  = (Dog) canRun;
Flyable flyable = new Bird ();
flyable.fly();
    }

    @Override
    public int compareTo(Main o) {
        return 0;
    }

}