package advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object obj;
        System.out.println("inside interceptor before");
        obj = invocation.proceed();
        System.out.println("inside interceptor after");
        return obj;
    }
}
