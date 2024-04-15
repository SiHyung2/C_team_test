package com.example.domain;

import lombok.Data;

@Data
public class MemberDTO {
	private String email_id;
	private String password;
	private String name;
	private String tel;
	private String type_code;
}
