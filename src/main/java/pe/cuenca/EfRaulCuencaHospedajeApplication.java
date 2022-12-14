package pe.cuenca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EfRaulCuencaHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfRaulCuencaHospedajeApplication.class, args);
	}

}
