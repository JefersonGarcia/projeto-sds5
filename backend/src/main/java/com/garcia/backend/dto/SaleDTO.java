package com.garcia.backend.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.garcia.backend.entities.Sale;
import com.garcia.backend.entities.Seller;

import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonPropertyOrder({ "id", "visited", "deals", "amount", "date", "seller" })
@Data
@EqualsAndHashCode(callSuper = false)
public class SaleDTO extends RepresentationModel<SaleDTO> implements Serializable {
	private static final long serialVersionUID = 2790966204977266620L;

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("visited")
	private Integer visited;
	
	@JsonProperty("deals")
	private Integer deals;
	
	@JsonProperty("amount")
	private Double amount;
	
	@JsonProperty("date")
	private LocalDate date;
	
	@JsonProperty("seller")
	private SellerDTO seller;
	
	
	
	public static SaleDTO create(Sale sale) {
        return new ModelMapper().map(sale, SaleDTO.class);
    }

}
