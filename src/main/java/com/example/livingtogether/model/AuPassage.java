package com.example.livingtogether.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AuPassage {

    @Id
    private long pi_id_num;

    private Date pi_date;

    private String error_msg;
}
