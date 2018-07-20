package com.aliabao.springbootspringdatajpa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FreeMarkerController {

    @RequestMapping("/demo")
    public String demo(Map<String, Object> map){
        map.put("name", "FreeMarker之铜牙开通");
        return "demo";
    }

}
