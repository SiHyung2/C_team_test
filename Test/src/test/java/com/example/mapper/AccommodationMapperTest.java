package com.example.mapper;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.AccommodationDTO;
import com.example.domain.RoomDTO;

import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { com.example.config.RootConfig.class })
@Log4j2
public class AccommodationMapperTest {
    
	@Autowired
	private AccommodationMapper mapper;

//	@Test
	public void testGetList() {
	    List<AccommodationDTO> list = mapper.getList();
	    list.forEach(accommodation -> log.info(accommodation));
	}
    
//    @Test
  	public void testInsertAccommodation() {
    	AccommodationDTO accommodation=new AccommodationDTO();
    	
    	Date day1 = new Date(System.currentTimeMillis());
    	
    	Date day2 = new Date(System.currentTimeMillis());
    	
    	
    	
    	accommodation.setAc_id(2);
    	accommodation.setEmail_id("testemail");
    	accommodation.setAc_title("방제1");
    	accommodation.setAc_type(2);
    	accommodation.setAc_address("주소1");
    	accommodation.setAc_info("숙소 소개1");
    	accommodation.setCheckin(day1);
    	accommodation.setCheckout(day2);
    	accommodation.setBu_name("사업자 이름");
		
		
		mapper.insertaccommdation(accommodation);
		
		log.info(accommodation);
	}
 
}