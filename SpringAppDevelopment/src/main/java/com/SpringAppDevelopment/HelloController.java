package com.SpringAppDevelopment;

import com.SpringAppDevelopment.beans.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //Correct SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    // Inject ApplicationContext
    @Autowired
    private ApplicationContext context;

    //UC1: Simple Hello World
    @GetMapping("/uc1")
    public String sayHelloUC1() {
        return "Hello from BridgeLabz";
    }

    //UC2: Hello World with Logging
    @GetMapping("/uc2")
    public String sayHelloUC2() {
        logger.info("INFO: sayHellouc2() method called");
        logger.debug("DEBUG: Returning hello message");
        return "Hello from BridgeLabz with Logging";
    }

    //UC3

    @GetMapping("/uc3")
    public String sayHelloUC3() {
        Employee employee = context.getBean(Employee.class);
        employee.showEmployeeDetails();
        return "Employee details logged successfully!";
    }
}




