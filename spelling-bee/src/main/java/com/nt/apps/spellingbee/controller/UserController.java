/**
 * 
 */
package com.nt.apps.spellingbee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.apps.spellingbee.model.User;

/**
 * @author lalsah
 *
 */
@Controller
public class UserController {

	@GetMapping("users")
	public @ResponseBody String users() throws JsonProcessingException {

		User userLal = new User(10000l, "Lal", "Sah");
		User userRohan = new User(10001l, "Rohan", "Sah");
		User userShubham = new User(10002l, "Shubham", "Sah");

		final List<User> users = Arrays.asList(userLal, userRohan, userShubham);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(users);
	}

}
