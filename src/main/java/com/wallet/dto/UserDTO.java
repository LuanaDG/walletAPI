package com.wallet.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
	
	private Long id;
	@Email(message="Email inválido")
	private String email;
	@Length(min=3, max=50, message="O nome deve conter entre 3 e 50 caracteres")
	private String name;
	@NotNull
	@Length(min=6, message="A senha deve conter no mínimo 6 caracteres")
	private String password;
	
	
	public UserDTO() {
	}

	public UserDTO(Long id, String email, String name, String password) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
