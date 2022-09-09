import domain.D;
import interfaces.Printable;

public class PrintableFactory {
    public static Printable getPrintable(){
        //return any one instance, either A or B
        //return new F();
        return new D();
    }
}
