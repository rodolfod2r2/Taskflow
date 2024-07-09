package org.framework.rodolfo.freire.git.taskflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class APIMongoDBApplication {

    public static void main(String[] args) {
        SpringApplication.run(APIMongoDBApplication.class, args);
    }
}
