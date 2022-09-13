package advisor;



import logic.Operation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation{

    //Before Advice example
    @Pointcut("execution(* logic.Operation.*(..))")
    public void k(){}//pointcut name

    @Before("k()")//applying pointcut on before advice
    public void myAdvice(JoinPoint jp)//it is an advice (before advice)
    {
        System.out.println("additional concern in@Before");
        System.out.println("Method Signature: "  + jp.getSignature());
    }
    //end of Before Advice example

    // After Returning Advice example
    @AfterReturning(pointcut = "execution(* logic.Operation.*(..))", returning = "result")
    public void myAdvice2(JoinPoint jp, Object result){
        System.out.println("inside After Returning advice");
        System.out.println("Method Signature: "  + jp.getSignature());
        System.out.println("Result in advice: "+result);
        System.out.println("end of after returning advice...");
    }
}