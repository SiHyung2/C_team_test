package com.example.mapper;

import java.util.List;

import com.example.domain.AccommodationDTO;

public interface AccommodataionMapper {
	
	public List<AccommodationDTO> getList();
	public void insertaccommdation(AccommodationDTO accommdation);
	public void updateaccommdation(AccommodationDTO accommdation);
	public void deleteaccommdation(AccommodationDTO accommdation);
	
}