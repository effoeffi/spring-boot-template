package hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationTest {

    @Autowired
    private Configuration config;

    @Test
    public void testGetHelloGreeting() {

        Assert.assertNotNull(config.getHelloGreeting());
    }
}
