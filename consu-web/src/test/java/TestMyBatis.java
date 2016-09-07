import com.mw.consumer.domain.User;
import com.mw.consumer.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by wei.ma on 2016/9/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Autowired
    private IUserService userService;

    @Test
    public void testSelect() {
        User user = userService.getUserById(1);
        logger.info("值：" + user.toString());
        System.out.println(user.toString());
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setId(2);
        user.setName("李四");
        user.setDate(new Date().toString());
        System.out.println(userService.insertUser(user));

    }
}
