package belajar.spring.boot;

import belajar.spring.boot.service.MyFirstClassService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//hanya boleh ada annotation @SpringBootApplication dalam 1 project, sebagai main class untuk menjalankan springboot
@SpringBootApplication
public class SpringbootApplication {

	//kita bisa mengubah properties seperti mengubah port yang digunakan dengan server.port=numberport(ex=8090)

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringbootApplication.class, args);

		MyFirstClassService myFirstClass = context.getBean(MyFirstClassService.class);
		System.out.println(myFirstClass.sayHello());
	}



	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


	//kita bisa membuat @Bean secara manual atau membuat annotation @Component pada class yang ingin dijadikan bean, sehingga secara otomatis Spring akan membuat bean dari nama class yang di camelCase


//	@Bean
//	public MyFirstClassService myFirstClass(){
//		return new MyFirstClassService();
//	}

}
