import com.snow.config.SnowConfig;
import com.snow.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Snow
 * @create 2020-12-18 8:50
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext Context = new AnnotationConfigApplicationContext(SnowConfig.class);
        User user = Context.getBean("user", User.class);
        System.out.println(user);
    }
}
