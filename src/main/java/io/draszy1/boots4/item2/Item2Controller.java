package io.draszy1.boots4.item2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Item2Controller {

    @GetMapping(path = "/item2")
    public ModelAndView getItem2() {
        ModelAndView modelAndView = new ModelAndView("item2");
        modelAndView.addObject("plotData", "[12, 19, 3, 5, 2, 3]");

        return modelAndView;
    }
}
