package by.pipeline.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@ComponentScan (basePackages = "by.pipeline.jar")
@EnableAutoConfiguration
@Import(RepositoryRestMvcConfiguration.class)
public class PipeApp {
    public static void main(String[] args) {
        SpringApplication.run(PipeApp.class, args);

    }


}
