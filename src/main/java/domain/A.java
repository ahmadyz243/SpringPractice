package domain;

public class A {
    private B b;
    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    public void show(){
        System.out.println("Hello a");
        b.print();
    }
}
