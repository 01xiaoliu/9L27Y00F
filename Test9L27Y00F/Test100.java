package Test9L27Y00F;

class C{
    String a="属性";
    static int b =3;
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println(a);
        System.out.println("动态代码块");;
    }
    public static  void c(){
        System.out.println("构造方法");
    }
    public static void show(){
        System.out.println("静态方法");
    }
}
class D extends C{
    public D(){
        System.out.println("D构造");
    }
}
public class Test100 {
    public static void main(String[] args) throws ClassNotFoundException {
        new D();
    }
}
