package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    String[] intArray = new String[]{ "A","B","C" };

    @GetMapping("/testTextRecever")
    public String receveTextFromInput(){
        return "testTextRecever";
    }
}
