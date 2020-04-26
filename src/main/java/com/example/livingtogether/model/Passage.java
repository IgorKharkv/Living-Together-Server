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
public class Passage {

    @Id
    private long id;

    private long citizen_id;

    private Date start_date;

    private String error_msg;
}
