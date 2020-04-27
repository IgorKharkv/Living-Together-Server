package com.example.livingtogether.controller;

import com.example.livingtogether.model.AuPassage;
import com.example.livingtogether.service.AuPassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AuPassageController {

    @Autowired
    private AuPassageService auPassageService;

    @GetMapping("/auConnectionPassages")
    public List<AuPassage> connectionAuPassages() {
        return auPassageService.getAuPassages();
    }

    @GetMapping("/auLogicPassages")
    public List<AuPassage> LogicAuPassages() {
        return auPassageService.getAuPassages();
    }

    @PostMapping("/fixAuConnectionPassages")
    public boolean fixConnectionAuPassages(@RequestBody List<AuPassage> auPassages) {
        return auPassageService.fixConnectionAuPassages(auPassages);
    }

    @PostMapping("/fixAuLogicPassages")
    public boolean fixLogicAuPassages(@RequestBody List<AuPassage> auPassages) {
        return auPassageService.fixLogicAuPassages(auPassages);
    }
}
