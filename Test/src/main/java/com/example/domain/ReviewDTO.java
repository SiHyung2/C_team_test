package com.example.domain;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 

@Getter 
@Setter 

public class ReviewDTO {

    private long rev_Num;
    private String bo_Num;
    private String ac_Title;
    private int room_Num;
    private String content;
    private Date review_Date;
    private Date update_Date;

    
    }
 
   