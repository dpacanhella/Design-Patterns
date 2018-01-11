package br.com.dpacanhella.designpatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/design-patterns")
public class DesignPatternController {

    @GetMapping
    public String inicio() {
        return "tetes";
    }
}
