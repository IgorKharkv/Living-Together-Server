package com.example.livingtogether.controller;

import com.example.livingtogether.model.Passage;
import com.example.livingtogether.service.PassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassageController {

    @Autowired
    private PassageService passageService;

    @GetMapping("/connectionPassages")
    public List<Passage> connectionPassages() {
        return passageService.getPassages();
    }

    @GetMapping("/logicPassages")
    public List<Passage> LogicPassages() {
        return passageService.getPassages();
    }

    @PostMapping("/fixConnectionPassages")
    public List<Passage> fixConnectionPassages(@RequestBody List<Passage> passages) {
        return passageService.fixConnectionPassages(passages);
    }

    @PostMapping("/fixLogicPassages")
    public List<Passage> fixLogicPassages(@RequestBody List<Passage> passages) {
        return passageService.fixLogicPassages(passages);
    }
}
