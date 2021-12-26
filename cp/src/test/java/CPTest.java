import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CPTest {
    public static void main(String[] args) {

    }
    @Test
    public void testp () {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object user = classPathXmlApplicationContext.getBean("user2");
        System.out.println(user);
    }
}
