package kobietydokodu.koty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@EnableJpaAuditing
@SpringBootApplication
@EntityScan(basePackageClasses = {
		KociarniaApplication.class,
		Jsr310JpaConverters.class
})
public class KociarniaApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}


	public static void main(String[] args) {
		SpringApplication.run(KociarniaApplication.class, args);


		System.out.println("");
	}
}
