package com.example.livingtogether.service;

import com.example.livingtogether.model.Passage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PassageService {

    private static List<Passage> passages = new ArrayList<>();

    static {
        // Initialize Data
        Passage passage1 = Passage.builder()
                .id(3234)
                .citizen_id(123456789)
                .start_date(new Date())
                .error_msg("no_data_found")
                .build();

        Passage passage2 = Passage.builder()
                .id(2234)
                .citizen_id(223456789)
                .start_date(new Date())
                .error_msg("unique_constraint")
                .build();

        Passage passage3 = Passage.builder()
                .id(1234)
                .citizen_id(323456789)
                .start_date(new Date())
                .error_msg("connection_error")
                .build();

        passages.add(passage1);
        passages.add(passage2);
        passages.add(passage3);
    }

    public List<Passage> getPassages() {
        return passages;
    }

    public boolean fixConnectionPassages(List<Passage> passages) { return true; }

    public boolean fixLogicPassage(Passage passage) { return true; }
}
