package com.masai.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plant {
	private Integer plantId;
	private Integer plantHeight;
	private String plantSpread;
	
	private String commonName;
	
	private String bloomTime;
	
	private String medicalOrCulinaryUse;
	
	private String difficultyLevel;
	
	private String temprature;
	
	private String typeOfPlant;
	
	private String plantDescription;
	
}
