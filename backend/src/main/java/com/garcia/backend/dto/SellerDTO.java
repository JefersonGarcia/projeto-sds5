package com.garcia.backend.dto;

import java.io.Serializable;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.garcia.backend.entities.Seller;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({ "id", "name" })
@Data
@EqualsAndHashCode(callSuper = false)
public class SellerDTO extends RepresentationModel<SellerDTO> implements Serializable {

	private static final long serialVersionUID = -9070189024708433554L;

	@JsonProperty("id")
	private Long id;

	@JsonProperty("name")
	private String name;

	public static SellerDTO create(Seller seller) {
		return new ModelMapper().map(seller, SellerDTO.class);
	}

}
