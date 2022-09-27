package Test9L27Y00F;

class C1{
    int a;
    public C1(){
        a=6;
    }
    public void C(int b){
        a =8;
    }
    final static int b;
    static {
        b =8;

    }
    int c =3;

}
public class Test201 {
    public static void main(String[] args) {
        final int num = 3;
        final  int[] a={3,5,6};
        final C1 c=new C1();
        c.c = 5;
        System.out.println(c);
        new C1();
        System.out.println(a);

    }
}
