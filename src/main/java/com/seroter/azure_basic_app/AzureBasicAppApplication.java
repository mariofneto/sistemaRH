package com.seroter.azure_basic_app;

import com.seroter.azure_basic_app.Services.FolhaPagamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureBasicAppApplication {

	public static void main(String[] args) {

		//SpringApplication.run(AzureBasicAppApplication.class, args);
		FolhaPagamento fp = new FolhaPagamento();
		fp.mostrarHolerite();
	}

}
