package logic;

public class Validator {
    public void validate(int age){
        if(age < 18){
            throw new ArithmeticException("not valid age");
        }else {
            System.out.println("vote confirmed");
        }
    }
}
