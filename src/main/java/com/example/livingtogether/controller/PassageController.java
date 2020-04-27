package com.example.livingtogether.controller;

import com.example.livingtogether.model.Passage;
import com.example.livingtogether.service.PassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    public boolean fixConnectionPassages(@RequestBody List<Passage> passages) {
        return passageService.fixConnectionPassages(passages);
    }

    @PostMapping("/fixLogicPassages")
    public boolean fixLogicPassages(@RequestBody List<Passage> passages) {
        return passageService.fixLogicPassages(passages);
    }
}
