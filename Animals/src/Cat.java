public class Cat extends Animal implements CanRun {
    public void eat() {
        System.out.println("Віскас");
        }
    @Override
    public void run() {
        System.out.println("Кіт біжить");
    }
}
