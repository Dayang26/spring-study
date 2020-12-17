import com.snow.pojo.Student;
import com.snow.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Snow
 * @create 2020-12-17 9:14
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }


    @Test
    public void test2() {
        ApplicationContext Context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = Context.getBean("user2", User.class);
        User user2 = Context.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user == user2);

    }
}
