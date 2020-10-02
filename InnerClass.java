import javafx.scene.effect.InnerShadow;

public class InnerClass {
    public static int a=5;
    public int multiplyByFour(){
        class LocalInnerClass{
            int c;
            LocalInnerClass(int a){c=a;}
            int multiply(int a){return c*a;}
        }
        LocalInnerClass localinnerclass = new LocalInnerClass(a);
        return localinnerclass.multiply(4);
    }
    class MemberInnerClass{
        public int getA(){return a;}
    }
    public static void main(String[] args)
    {
        InnerClass innerclass = new InnerClass();
        System.out.println(innerclass.new MemberInnerClass().getA());
        System.out.println(innerclass.multiplyByFour());
    }
}
