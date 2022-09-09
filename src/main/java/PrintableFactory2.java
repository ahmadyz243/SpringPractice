import domain.F;
import interfaces.Printable;

public class PrintableFactory2 {
    //non-static factory method
    public Printable getPrintable(){
        //return any one instance, either D
        return new F();
    }
}
