package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/whiskey")
public class whiskeyController {

    //Inserting info into object
    @RequestMapping("/Whiskey-form")
    public String ShowWiskey(Model theModel) {
        // create the whiskey object
        whiskey thewhiskey = new whiskey();

        // add whiskey object to the model
        theModel.addAttribute("whiskey", thewhiskey);

        return "Whiskey-form";
    }

    // calls upon a html process and retrives information into whiskey object and this rederaects it back into conformation html.
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("whiskey")whiskey thewiskey){

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("whisky ID: "+ thewiskey.getWId());
        System.out.println("whisky Name: "+ thewiskey.getWName());
        System.out.println("whisky Location: "+ thewiskey.getWLocation());
    return "Whiskey-conformation";
    }
}
