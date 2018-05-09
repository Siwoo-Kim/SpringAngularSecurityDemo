package com.securityangular.siwoo.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-09 오후 1:59
 **/

@RestController
@RequestMapping("/rest")
public class ResourceController {

    @GetMapping("/user")
    public Principal login(Principal user) {
        System.out.println(user);
        return user;
    }

    @GetMapping("/resource")
    public Map<String,Object> home() {
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello Angular");
        return model;
    }

}
