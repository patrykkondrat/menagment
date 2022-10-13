package com.airbook.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String everyone() {
        return "<h2>EVERYONE!</h2>";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping(value = "/user")
    public String user() {
        return "<h1>USER!</h1>";
    }

    @PreAuthorize("hasRole('STUFF')")
    @GetMapping(value = "/stuff")
    public String stuff() {
        return "<h1>STUFF!</h1>";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "/admin")
    public String admin() {
        return "<h1>ADMIN!</h1>";
    }


}
