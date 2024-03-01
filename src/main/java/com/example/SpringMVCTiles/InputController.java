package com.example.SpringMVCTiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {


    @GetMapping("/")
    public String home()
    {
        return input();
    }
    @GetMapping("/input")
    public String input ()
    {
        return "input";
    }
    @GetMapping("/result")
    public String result (@RequestParam(name = "firstname" , defaultValue = "") String firstName
        , @RequestParam(name = "lastname" , defaultValue = "") String lastName
        , Model model )
    {
        model.addAttribute("firstname",firstName)
                .addAttribute("lastname",lastName);

        return "result";
    }

}
