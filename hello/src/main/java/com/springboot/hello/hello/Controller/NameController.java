package com.springboot.hello.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    // 코드 작성
    @GetMapping("/name")
    public String getName() {
        return "UMI";  // 본인의 이름으로 수정
    }
}