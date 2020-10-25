package io.draszy1.boots4.item2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Item2Controller {

    @GetMapping(path = "/item2")
    public String getItem1() {
        return "item2";
    }
}
