package com.example.livingtogether.controller;

import com.example.livingtogether.model.AuPassage;
import com.example.livingtogether.service.AuPassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuPassageController {

    @Autowired
    private AuPassageService auPassageService;

    @GetMapping("/auConnectionPassages")
    public List<AuPassage> connectionAuPassages() {
        return auPassageService.getAupassages();
    }

    @GetMapping("/auLogicPassages")
    public List<AuPassage> LogicAuPassages() {
        return auPassageService.getAupassages();
    }

    @PostMapping("/fixAuConnectionPassages")
    public List<AuPassage> fixConnectionAuPassages(@RequestBody List<AuPassage> auPassages) {
        return auPassageService.fixConnectionAuPassages(auPassages);
    }

    @PostMapping("/fixAuLogicPassages")
    public List<AuPassage> fixLogicAuPassages(@RequestBody List<AuPassage> auPassages) {
        return auPassageService.fixLogicAuPassages(auPassages);
    }
}
