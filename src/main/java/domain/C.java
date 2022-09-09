package domain;

public class C {
    private static final C obj=new C();
    private C(){System.out.println("private constructor");}
    public static C getC(){
        System.out.println("factory method ");
        return obj;
    }
    public void msg(){
        System.out.println("hello user");
    }
}