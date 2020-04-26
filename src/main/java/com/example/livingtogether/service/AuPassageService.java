package com.example.livingtogether.service;



import com.example.livingtogether.model.AuPassage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AuPassageService {

    private static List<AuPassage> auPassages = new ArrayList<>();

    static {
        // Initialize Data
        AuPassage passage1 = AuPassage.builder()
                .PI_ID_NUM(123456789)
                .PI_DATE(new Date())
                .ERROR_MSG("no data")
                .build();

        AuPassage passage2 = AuPassage.builder()
                .PI_ID_NUM(1000000009)
                .PI_DATE(new Date())
                .ERROR_MSG("no data")
                .build();

        auPassages.add(passage1);
        auPassages.add(passage2);
    }

    public List<AuPassage> getAupassages() {
        return auPassages;
    }

    public List<AuPassage> fixConnectionAuPassages(List<AuPassage> passages) {
        return null;
    }

    public List<AuPassage> fixLogicAuPassages(List<AuPassage> passages) {
        return null;
    }
}
