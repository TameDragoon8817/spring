import org.config.ConfigJava;
import org.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
