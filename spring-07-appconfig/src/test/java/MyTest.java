import com.snow.config.SnowConfig;
import com.snow.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Snow
 * @create 2021-03-11 16:44
 */
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contest = new AnnotationConfigApplicationContext(SnowConfig.class);
        User getUser = (User) contest.getBean("getUser");
        System.out.println(getUser);
    }
}
