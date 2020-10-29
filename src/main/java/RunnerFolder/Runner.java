package RunnerFolder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//first push
@SpringBootApplication
@EnableSwagger2
public class Runner {

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }


}