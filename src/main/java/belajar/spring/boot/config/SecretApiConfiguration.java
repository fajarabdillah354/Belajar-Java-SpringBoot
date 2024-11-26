package belajar.spring.boot.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api")
@Data
public class SecretApiConfiguration {

    private String secretApi;


}
