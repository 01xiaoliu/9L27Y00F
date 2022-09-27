package Test9L27Y00F;

class A{
    final static int b=3;
    public void test(){}
}
class B extends A{
    public void test(){}
}
public class Test200 {
    public static void main(String[] args) {
        if (A.b==3){
            System.out.println("进行状态值的判断");
        }
    }

}
