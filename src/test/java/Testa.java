import com.jsz.config.SpringConfig;
import com.jsz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Testa{

    @Autowired
    private UserService userService;

    @Test
    public void getUserAll(){

        System.out.println(userService.selectAll());

    }

}
