package com.example.domain;

import java.util.Date;

import lombok.Data;

public class BookingDTO {

	private String bo_num;
    private String email_id;
    private int ro_num;
    private String ac_id;
    private String checkin_day;
    private String checkout_day;
    private int status;
    private String payment_code;
    private String reg_date;
	
}