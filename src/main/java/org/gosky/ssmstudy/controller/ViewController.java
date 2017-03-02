package org.gosky.ssmstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guozhong on 17/3/2.
 */
@Controller
public class ViewController {

    @RequestMapping("/view")
    public String view() {
        System.out.println("哈哈哈哈");
        return "index";
    }
}
