package com.wallet.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class WalletDTO {
	
	private Long id;
	@Length(min = 3, message = "O nome deve conter no mínimo 3 caracteres")
	@NotNull(message = "O nome não pode ser nulo")
	private String name;
	@NotNull(message = "Insira um valor para a carteira")
	private BigDecimal value;
	
	
	public WalletDTO() {
	}

	public WalletDTO(Long id, @Length(min = 3) @NotNull String name, @NotNull BigDecimal value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
}
