import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ecm.service.UserService;

public class MyTest {
    @RunWith(value = SpringJUnit4ClassRunner.class)   //测试运行器
    @ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})   //加载配置文件
    public class TestMyBatis {

     @Autowired
     private UserService userService;

     @Test
     public void test(){
      System.err.println(userService.getUserById(1).getUserName());

     }
    }
}
