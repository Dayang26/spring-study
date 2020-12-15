import com.snow.dao.UserDaoImpl;
import com.snow.dao.UserDaoMysqlImpl;
import com.snow.dao.UserDaoOracleImpl;
import com.snow.service.UserService;
import com.snow.service.UserServiceImpl;

/**
 * @author Snow
 * @create 2020-12-15 22:51
 */
public class MyTest {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
