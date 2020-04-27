package com.example.livingtogether.model;


import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuPassage {

    private long pi_id_num;

    private Date pi_date;

    private String error_msg;
}
