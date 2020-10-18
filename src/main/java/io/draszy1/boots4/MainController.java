package io.draszy1.boots4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public String getIndex() {
        return "index";
    }

    @GetMapping(path = "/item1")
    public String getItem1() {
        return "item1";
    }

    @GetMapping(path = "/item2")
    public String getItem2() {
        return "item2";
    }
}
