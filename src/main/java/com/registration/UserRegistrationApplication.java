/**
 * Just our Application file to run everything, everything's packaged 
 * and run through main().
 */
package com.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRegistrationApplication.class, args);
    }

}