package Test9L27Y00F;

interface Father{
    void fatherFunc();
}
class Deal{
    public void doSth(Father father){
        father.fatherFunc();
        System.out.println("处理其他事务");
    }
}
class SonA implements Father{
    public void fatherFunc(){
        System.out.println("SonA实现接口方法");
    }
}
class SonB implements Father{
    public void fatherFunc(){
        System.out.println("SonB实现接口方法");
    }
}
public class Test500 {
    public static void main(String[] args) {
        Deal deal =new Deal();
        Father fatherA =new SonA();
        Father fatherB =new SonB();
        deal.doSth(fatherA);
        deal.doSth(fatherB);
    }
}
