package edu.csye6220.assignment04.declan.Assignment04.part5;

import edu.csye6220.assignment04.declan.Assignment04.util.StringGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class ApplicationConfiguration {

    @Bean(name="stringGenerator")
    public StringGenerator stringGenerator(){
        return new StringGenerator();
    }

}
