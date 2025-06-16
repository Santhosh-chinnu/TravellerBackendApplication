package com.pack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Tourist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tid;
	
	@NonNull
	private String tname;
	
	@NonNull
	private String city;
	
	@NonNull
	private String packageType;
	
	@NonNull
	private Double  budget;
	
}
