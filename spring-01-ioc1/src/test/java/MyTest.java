import com.snow.dao.UserDaoImpl;
import com.snow.dao.UserDaoMysqlImpl;
import com.snow.dao.UserDaoOracleImpl;
import com.snow.service.UserService;
import com.snow.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Snow
 * @create 2020-12-15 22:51
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
