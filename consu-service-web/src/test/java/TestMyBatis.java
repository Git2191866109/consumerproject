import com.mw.consumer.domain.Dictionary;
import com.mw.consumer.domain.User;
import com.mw.consumer.service.IConsumerStatisticService;
import com.mw.consumer.service.IDictionaryService;
import com.mw.consumer.service.IUserService;
import com.mw.consumer.utils.DateUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by wei.ma on 2016/9/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context-service.xml")
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Autowired
    private IUserService userService;
    @Autowired
    private IDictionaryService iDictionaryService;
    @Autowired
    private IConsumerStatisticService iConsumerStatisticService;


    @Test
    public void testSelect_user() {
        User user = userService.getUserById(1);
        logger.info("值：" + user.toString());
        System.out.println(user.toString());
    }

    @Test
    public void testSelect_Alluser() {
        List<User> userList = userService.getAll();
        for (User u : userList ) {
            System.out.println(u.toString());
        }
    }

    @Test
    public void testSelect_Dictionary() {
        Dictionary dictionary = iDictionaryService.getDictionaryById(1);
        System.out.println(dictionary.toString());
    }

    @Test
    public void testInsert__user() {
        User user = new User();
        user.setId(2);
        user.setName("李四");
        user.setDate(new Date().toString());
        userService.insertUser(user);
        System.out.println(userService.getUserById(2));

    }

    @Test
    public void testUpdate__user() {
        User user = new User();
        user.setId(2);
//        user.setName("李四");
//        user.setDate(new Date().toString());
//        user.setCost_afternoon(12.0);
//        user.setCost_morning(3.0);
//        user.setCost_noon(33.0);
//        user.setNickName("lisi");
        user.setDate(DateUtils.getToday());
        userService.updateUser(user);
        System.out.println(userService.getUserById(2).toString());

    }
}
