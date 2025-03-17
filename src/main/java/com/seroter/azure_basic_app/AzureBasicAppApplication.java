package com.seroter.azure_basic_app;

import com.seroter.azure_basic_app.Entities.Funcionario;
import com.seroter.azure_basic_app.Entities.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureBasicAppApplication {

	public static void main(String[] args) {

		//SpringApplication.run(AzureBasicAppApplication.class, args);
		Funcionario Func = new Funcionario("Mario", "99999999999", 1500.00);

		System.out.println("Hello World!");
	}

}
