import com.lagou.entity.User;
import com.lagou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {


    // 要测试IOC哪个对象注入即可
    @Autowired
    private UserService userService;

    @Test
    public void findByUsernameTest(){
        User admin = userService.findByUsername("admin");
        System.out.println(admin);
    }



}
