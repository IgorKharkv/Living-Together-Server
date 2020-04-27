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

    private long id;

    private long citizen_id;

    private Date start_date;

    private String error_msg;
}
