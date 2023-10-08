package com.vijay.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data  
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

	private Integer id;
	private String name;
	private String email;
	private String department;
	private String city;
}


//@Setter +Getter =@Data
//If you are applying AllArgs Constructor ,then you must apply @NoArgsConstructor
//ByDefault NoArgs Constructor will be provided by @Data