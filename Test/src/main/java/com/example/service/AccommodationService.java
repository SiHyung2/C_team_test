package com.example.service;

import java.util.List;

import com.example.domain.AccommodationDTO;

public interface AccommodationService {
	
	public List<AccommodationDTO> getList();
	public void insertaccommdation(AccommodationDTO accommdation);
	public void updateaccommdation(AccommodationDTO accommdation);
	public void deleteaccommdation(AccommodationDTO accommdation);
	
	public void searchByac_id(AccommodationDTO accommdation);
	public void searchListByTitleAndDateRange(AccommodationDTO accommdation);
	public void searchByac_type(AccommodationDTO accommdation);
	
}
