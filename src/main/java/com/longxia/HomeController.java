package com.longxia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gongtao on 2017/5/1.
 */

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("")
    public String index(){
        return "Hello World!!!";
    }

}
