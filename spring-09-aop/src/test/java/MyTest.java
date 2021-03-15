import com.snow.service.UserService;
import com.snow.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Snow
 * @create 2021-03-14 23:27
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();

    }
}
