package com.citron.cit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {

    @GetMapping("/")
    public String home() {
        return "index"; // static 폴더 내의 index.html 파일을 반환
    }
}