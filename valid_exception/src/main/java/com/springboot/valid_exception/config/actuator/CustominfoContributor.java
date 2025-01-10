package com.springboot.valid_exception.config.actuator;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustominfoContributor implements InfoContributor {

    @Override
    public void constribute(Builder bilder) {
        Map<String, Object> content = new HashMap<>;
        content.put("code-info", "InfoContributor 구현체에서 정의한 정보입니다.");
        builder.withDetail("custom-info-contributor", content);
    }
}
