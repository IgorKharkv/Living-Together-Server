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
                .pi_id_num(123456789)
                .pi_date(new Date())
                .error_msg("no_data_found")
                .build();

        AuPassage passage2 = AuPassage.builder()
                .pi_id_num(1000000009)
                .pi_date(new Date())
                .error_msg("no_data_found")
                .build();

        AuPassage passage3 = AuPassage.builder()
                .pi_id_num(123456789)
                .pi_date(new Date())
                .error_msg("unique_constraint")
                .build();

        AuPassage passage4 = AuPassage.builder()
                .pi_id_num(1000000009)
                .pi_date(new Date())
                .error_msg("connection_error")
                .build();

        auPassages.add(passage1);
        auPassages.add(passage2);
        auPassages.add(passage3);
        auPassages.add(passage4);
    }

    public List<AuPassage> getAuPassages() {
        return auPassages;
    }

    public boolean fixConnectionAuPassages(List<AuPassage> passages) {
        return true;
    }

    public boolean fixLogicAuPassages(List<AuPassage> passages) {
        return true;
    }
}
