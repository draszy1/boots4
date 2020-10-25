package io.draszy1.boots4.item1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Item1Controller {

    @GetMapping(path = "/item1")
    public String getItem1() {
        return "item1";
    }
}
