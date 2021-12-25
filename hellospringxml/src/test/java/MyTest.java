import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//获取Spring的上下文对象
        Object hello = context.getBean("hello3");
        System.out.println(hello.toString());
    }
}