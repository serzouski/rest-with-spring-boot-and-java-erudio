package br.com.erudio.restwithspringbootandjavaerudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final static String template = "Hello, %s!";
    private static AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting getGreeting(
            @RequestParam(value = "name", defaultValue = "world")
            String name){
        return new Greeting(id.incrementAndGet(), String.format(template, name));
    }
}
