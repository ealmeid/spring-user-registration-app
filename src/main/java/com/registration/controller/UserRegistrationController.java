/**
 * Our controller class, this is what will handle our http endpoints and present
 * the views to the users. This is also where we deal with saving users
 * to the H2 database, and finding out if a specific user exists within
 * the database.
 */

package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.registration.model.User;
import com.registration.repo.UserRepository;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	
    @GetMapping("/register")
    public String greetingForm(Model model) {
        model.addAttribute("register", new User());
        return "register";
    }

    @PostMapping("/register")
    public String greetingSubmit(@ModelAttribute User user) {
    	if(userRepository.findByUsername(user.getUsername())==null){
        	userRepository.save(user);
        	return "registrationStatus";
    	}
        return "registrationError";
    }

}