package demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/vuejs")
public class VuejsDemoController {
	@RequestMapping("vuejsDemo")
	public String vuejsDemo() {
		return "vuejsDemo";
	}
}
