package com.example.livingtogether.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuPassage {

    private long PI_ID_NUM;

    private Date PI_DATE;

    private String ERROR_MSG;
}
