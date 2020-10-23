package com.testbindinglistener;

import com.testbindinglistener.config.AppInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppInit.class)
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }


}
