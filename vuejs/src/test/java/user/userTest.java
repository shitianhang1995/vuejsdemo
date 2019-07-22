package user;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: root
 * @Date: 2019/7/22 18:18
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class userTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }

}
