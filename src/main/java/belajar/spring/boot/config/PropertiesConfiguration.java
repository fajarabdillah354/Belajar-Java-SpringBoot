package belajar.spring.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


//wajib memberi annotation @Configuration dan @ConfigurationProperties
@Configuration
@ConfigurationProperties(prefix = "app")//kata paling depan untuk penulisan di properties harus app. diukuti nama variable yang dibuat
@Data
public class PropertiesConfiguration {


    private String timezone;

    private String currency;

    private String saySomething;

}
