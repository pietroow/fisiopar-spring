package br.com.unopar.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"br.com", "br.com.unopar"})
@ComponentScan(basePackages = {"br.com.unopar"})
@EnableJpaRepositories(basePackages = {"br.com.unopar"})
@EntityScan(basePackages = {"br.com.unopar"})
public class FisioparApplication {

    public static void main(String[] args) {
        SpringApplication.run(FisioparApplication.class, args);
    }

}
