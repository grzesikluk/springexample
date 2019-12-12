
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_ex1.MyXMLApp;
import spring_ex1.Service;

@Configuration
@ComponentScan(value = "spring_ex1")
public class MyApplicationTest
{

    private AnnotationConfigApplicationContext context = null;

    @Bean
    public Service getMessageService()
    {
        return new Service()
        {

            public boolean sendMessage(String msg, String rec)
            {
                System.out.println("Mock Service");
                return true;
            }
        };
    }

    @Before
    public void setUp()
    {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
    }

    @After
    public void tearDown()
    {
        context.close();
    }

    @Test
    public void test()
    {
        MyXMLApp app = context.getBean(MyXMLApp.class);
        Assert.assertTrue(app.processMessage("Hi", "lgrzesik@akamai.com"));
    }
}