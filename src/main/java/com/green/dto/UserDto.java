package com.green.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor  // 추가되면 기본 생성자 모든 인자 생성자로 변경 → noArgsConst 추가 필요
public class UserDto {

	private String userid;
	private String userpass;
	private String username;
}
