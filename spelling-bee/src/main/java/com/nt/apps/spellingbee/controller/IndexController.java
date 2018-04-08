/**
 * 
 */
package com.nt.apps.spellingbee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lalsah
 *
 */
@Controller
public class IndexController {

	@GetMapping("")
	public String index() {
		return "index";
	}

}
