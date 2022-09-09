package advisor;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvisor implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("additional concern if exception occurs");
    }
}
