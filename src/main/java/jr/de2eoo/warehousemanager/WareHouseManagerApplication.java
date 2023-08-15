package jr.de2eoo.warehousemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "data")
@EnableJpaRepositories(basePackages = "data")
@EntityScan(basePackages = "data")
public class WareHouseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WareHouseManagerApplication.class, args);
    }

}
