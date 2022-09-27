package Test9L27Y00F;

interface MyTnterface{
    String a ="静态属性";
    void methoud();
}
class Impl implements MyTnterface{
    public void methoud(){
        System.out.println("重写方法");
    }
}
public class Test400 {
    public static void main(String[] args) {
        MyTnterface in = new Impl();
        in.methoud();
    }
}
