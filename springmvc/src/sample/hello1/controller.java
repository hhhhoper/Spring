package sample.hello1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class controller {
    @RequestMapping(method = RequestMethod.GET)
    public String PrintHello(ModelMap modelMap){
        modelMap.addAttribute("message","HelloSpringmvc");
        return "hello";
    }
}
