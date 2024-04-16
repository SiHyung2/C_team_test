package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.domain.AccommodationDTO;
import com.example.domain.BookingDTO;

public interface AccommodationMapper {
	
	public List<AccommodationDTO> getList();
	public void insertaccommdation(AccommodationDTO accommdation);
	public void updateaccommdation(AccommodationDTO accommdation);
	public void deleteaccommdation(AccommodationDTO accommdation);
	
	public List<AccommodationDTO> searchByac_id(AccommodationDTO accommodation);
	public List<AccommodationDTO> searchListByTitleAndDateRange(@Param("ac_title") AccommodationDTO ac_title,
																@Param("checkin_day") BookingDTO checkin_day,
																@Param("checkout_day") BookingDTO checkout_day);
	public List<AccommodationDTO> searchByac_type(AccommodationDTO accommdation);
	
}