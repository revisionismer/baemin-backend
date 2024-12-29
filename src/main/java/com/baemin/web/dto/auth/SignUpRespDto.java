package com.baemin.web.dto.auth;

import com.baemin.constant.user.UserEnum;
import com.baemin.domain.user.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class SignUpRespDto {

	private Long id;
	private String username;
	private String name;
	private UserEnum role;
	private String email;
	
	public SignUpRespDto(Long id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
	public SignUpRespDto(Long id, String username, String name, String email) {
		this.id = id;
		this.username = username;
		this.name = name;
		this.email = email;
	}
	
	public SignUpRespDto(User userEntity) {
		this.id = userEntity.getId();
		this.username = userEntity.getUsername();
		this.name = userEntity.getName();
		this.email = userEntity.getEmail();
		this.role = userEntity.getRole();
	}
}
