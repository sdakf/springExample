package pl.sda.springexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    List<String> strings = new ArrayList<>();

    @GetMapping("/greeting")
    @ResponseBody //to wysyla tylko dane
    public String hello() {
        return "Ok";
    }

    //http://localhost:8080/greetingMessage?message=Marcin
    @GetMapping("/greetingMessage") //to zwraca strone
    public String hello2(@RequestParam String message, Model model) {
        model.addAttribute("greetingMessage", "Siemka, jestem " + message);
        model.addAttribute("listOfValues", strings);
        return "HelloWorld";
    }

    @PostMapping("/sendText")
    public String send(@RequestParam String textValue, Model model) {
        strings.add(textValue);
        model.addAttribute("listOfValues", strings);
        return "HelloWorld";
    }
}
