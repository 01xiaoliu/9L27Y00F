package Test9L27Y00F;

public class Test300 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        Animal2 a =dog;
        Runnable r =dog;
        Swimmable s =dog;
        a.eat();r.run();s.swim();
    }
}
interface Runnable{
    public abstract void run();
}
interface Swimmable{
    public abstract void swim();
}
abstract class Animal2{
    public void eat(){
        System.out.println("animal eat");
    }
    public void sleep(){
        System.out.println("animal sleep");
    }
}
class Dog extends Animal2 implements Runnable,Swimmable{
    public  void  run(){
        System.out.println("Dog run");
    }
    public void swim(){
        System.out.println("Dog swim");
    }
    public void shout(){
        System.out.println("Dog www");
    }
}