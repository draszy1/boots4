package io.draszy1.boots4.item1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Item1Controller {

    @GetMapping(path = "/item1")
    public ModelAndView getItem1() {
        return new ModelAndView("item1");
    }
}
