package com.example.livingtogether.service;

import com.example.livingtogether.model.AuPassage;
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
                .ID(1234)
                .CITIZEN_ID(123456789)
                .START_DATE(new Date())
                .ERROR_MSG("no data")
                .build();

        Passage passage2 = Passage.builder()
                .ID(1234)
                .CITIZEN_ID(123456789)
                .START_DATE(new Date())
                .ERROR_MSG("no data")
                .build();

        passages.add(passage1);
        passages.add(passage2);
    }

    public List<Passage> getPassages() {
        return passages;
    }

    public List<Passage> fixConnectionPassages(List<Passage> passages) {
        return null;
    }

    public List<Passage> fixLogicPassages(List<Passage> passages) {
        return null;
    }
}
