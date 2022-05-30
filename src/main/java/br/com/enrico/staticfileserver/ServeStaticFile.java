package br.com.enrico.staticfileserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("static")
public class ServeStaticFile {
	
	
	
	@GetMapping("/greet")
	private Mono<String> greet() {
	    return Mono.just("Hello");
	}
	
	

}
