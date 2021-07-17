package com.selimhorri.pack.model;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoCollection<T> {
	
	private Collection<T> collection;
	
}
