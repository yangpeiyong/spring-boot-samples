package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/gretting")
    public Gretting gretting(){
        Gretting g = new Gretting();
        g.setName("Bob");
        g.setAddress("Wall Street");
        return g;
    }

}