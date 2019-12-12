package spring_ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"spring_ex1"})
public class DIConfiguration
{

    @Bean
    public Service getMessageService()
    {
        return new EmailServiceImpl();
    }
}

