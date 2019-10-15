package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${application1.prop}")
    String appProp;

    @Value("${application.prop}")
    String appProb2;

    @RequestMapping("/hello")
    public void hello() {
        System.out.println(appProp + "___________________" + appProb2);
        System.out.println("_____________HELLO_____________");
    }
}
