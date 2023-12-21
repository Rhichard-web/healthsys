package cn.chan.healthsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("cn.chan.healthsys.dao")
@SpringBootApplication
public class HealthsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthsysApplication.class, args);
	}

}
