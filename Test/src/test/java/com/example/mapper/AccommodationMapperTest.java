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
import com.example.domain.BookingDTO;
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
 
//  @Test
	public void testupdateAccommodation() {
		AccommodationDTO accommodation=new AccommodationDTO();
  	
	  	Date day1 = new Date(System.currentTimeMillis());
	  	
	  	Date day2 = new Date(System.currentTimeMillis());
	  	
	  	
	  	
	  	accommodation.setAc_id(2);
	  	accommodation.setEmail_id("testemail");
	  	accommodation.setAc_title("변경된 방제1");
	  	accommodation.setAc_type(2);
	  	accommodation.setAc_address("변경된주소1");
	  	accommodation.setAc_info("변경된 숙소 소개1");
	  	accommodation.setCheckin(day1);
	  	accommodation.setCheckout(day2);
	  	accommodation.setBu_name("사업자 이름");
		
		
		mapper.updateaccommdation(accommodation);
		
		log.info(accommodation);
	}
	
//	@Test
	public void testdeleteAccommodation() {
		AccommodationDTO accommodation=new AccommodationDTO();
	  	accommodation.setAc_id(4);
		
		
		mapper.deleteaccommdation(accommodation);
		
		log.info(accommodation);
	}
	
//	@Test
	public void testsearchByac_id() {
		AccommodationDTO accommodation=new AccommodationDTO();
		accommodation.setAc_id(2);
		mapper.searchByac_id(accommodation);
		
		log.info(accommodation);
		
	}
	
	@Test
	public void testsearchListByTitleAndDateRange() {
		AccommodationDTO accommodation=new AccommodationDTO();
		accommodation.setAc_id(2);
		mapper.searchByac_id(accommodation);
		
		log.info(accommodation);
		
	}
	
//	@Test          이건 어떻게 테스트하는지 안 배워서 모르겠다.. 
	public void testSearchListByTitleAndDateRange() {
		
//		AccommodationDTO accommodation=new AccommodationDTO();
//	    acTitle.setAc_title("검색 테스트1");
//	    
//	    BookingDTO checkinDay = new BookingDTO();
//	    checkinDay.setCheckin_day(LocalDate.of(2024, 4, 1));
//	    checkinDay.setCheckin_day(LocalDate.of(2024, 4, 1)); 
//	    	    
//	    
//	   mapper.searchListByTitleAndDateRange();
	   
	    
	}
	
//	@Test
	public void testsearchByac_type() {
		AccommodationDTO accommodation=new AccommodationDTO();
		accommodation.setAc_type(2);
		mapper.searchByac_type(accommodation);
		
		log.info(accommodation);
		
	}

}