package ru.tkachenko.buyerassistent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.tkachenko.buyerassistent.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class})

public class Application {

    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
