package org.studyeasy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.Car.Corolla;
import org.studyeasy.Car.Swift;

@Configuration
@ComponentScan("org.studyeasy")
public class AppConfig {

	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
}
