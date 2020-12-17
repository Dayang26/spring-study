import com.snow.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Snow
 * @create 2020-12-17 21:19
 */
public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test2() {
        Long startTime = System.currentTimeMillis();
        Long entTime = startTime + 1000;
        Long count = (long) 0;

        while (true) {
            Math.sqrt(count);
            if (entTime < System.currentTimeMillis()) {
                break;
            }
            ++count;
        }

        System.out.println("一秒进行了  " + count + "  次循环");
    }
}
