package com.example.livingtogether.model;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passage {

    private long ID;

    private long CITIZEN_ID;

    private Date START_DATE;

    private String ERROR_MSG;
}
