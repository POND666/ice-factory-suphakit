package nvc.it.ice_factory_suphakit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactorysuphakitApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactorysuphakitApplication.class, args);
	}

}
