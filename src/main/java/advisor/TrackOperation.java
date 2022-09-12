package advisor;



import logic.Operation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation{

    @Pointcut("execution(* logic.Operation.*(..))")
    public void k(){}//pointcut name

    @Before("k()")//applying pointcut on before advice
    public void myadvice(JoinPoint jp)//it is an advice (before advice)
    {
        System.out.println("additional concern in@Before");
        System.out.println("Method Signature: "  + jp.getSignature());
    }
}