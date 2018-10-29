package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FunctionController {
    String[] intArray = new String[]{ "A","B","C" };

    @GetMapping("/Function")
    public String greeting(@RequestParam(name="name", required=false, defaultValue=("Mambo")) String name, Model model) {
        model.addAttribute("name", name);

        return "Function";
    }
}
// https://www.boraji.com/spring-4-mvc-requestparam-annotation-example
// https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/spring-mvc-request-param.html
// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html
