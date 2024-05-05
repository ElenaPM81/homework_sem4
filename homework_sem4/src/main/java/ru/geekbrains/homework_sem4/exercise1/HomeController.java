package ru.geekbrains.homework_sem4.exercise1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/world")
    public String home() {
        return "index";
    }
}
