import domain.A;
import domain.C;
import domain.Student;
import interfaces.Printable;
import logic.E;
import logic.Operation;
import logic.Validator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("beans.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
        //Student s1 = (Student) factory.getBean("studentBean");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s1 = (Student) context.getBean("studentBean");
        s1.displayInfo();
        System.out.println("----------");
        Student s2 = (Student) context.getBean("s2");
        s2.displayInfo();
        System.out.println("----------");
        Student s3 = context.getBean("student", Student.class);
        s3.displayInfo();
        System.out.println("----------");
        // auto wiring byName & byType & constructor
        A a = context.getBean("a", A.class);
        a.show();

        System.out.println("----------");
        // factory methods test
        C c = (C) context.getBean("c");
        c.msg();
        Printable p = (Printable) context.getBean("p");
        p.print();
        Printable p2 = (Printable) context.getBean("p2");
        p2.print();

        System.out.println("----------");
        // AOP test MethodBeforeAdvice & AfterReturningAdvice & MethodInterceptor & ThrowAdvice
        E e = context.getBean("proxy", E.class);
        System.out.println("proxy class name: " + e.getClass().getName());
        e.m();
        Validator vdr = context.getBean("proxy2", Validator.class);
        try {
            vdr.validate(15);
        }catch (Exception exception){
            exception.printStackTrace();
        }

        System.out.println("----------");
        //BeforeAdvice & AfterReturningAdvice & joinPoint & pointcut example using annotation
        Operation operation = context.getBean("opBean", Operation.class);
        operation.msg();
        operation.m();
        operation.k();
    }
}