package com.example.service;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.RoomDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { com.example.config.RootConfig.class })
@Log4j
public class RoomServicetest {
	
	@Setter(onMethod_ = @Autowired)
	private RoomService service;

//	@Test
	public void testGetList() {
        List<RoomDTO> list = service.getList();
        list.forEach(room -> log.info(room));
    }
	
//	@Test
    public void testInsertRoom() {
    	RoomDTO room=new RoomDTO();
		room.setRo_type(4);
		room.setAc_id("asd123");
		room.setRo_name("스탠다드");
		room.setRo_basic_count(2);
		room.setRo_max_count(4);
		room.setRo_info("삽입 테스트2");
		room.setRo_count(10);
		
		
		service.insertroom(room);
		
		log.info(room);
	}
	
	
//  @Test
  public void testUpdateRoom() {
  	RoomDTO room=new RoomDTO();
  	room.setRo_type(3);
		room.setAc_id("asd123");
		room.setRo_name("스탠다드_수정_서비스2");
		room.setRo_basic_count(2);
		room.setRo_max_count(4);
		room.setRo_info("수정 테스트22222");
		room.setRo_count(10);
		
		service.updateroom(room);
		
		log.info(room);
	}
  
  @Test
  public void testDeleteRoom() {
  	RoomDTO room=new RoomDTO();
		room.setRo_type(4);
		
		service.deleteroom(room);
		
		log.info(room);
	}
	
}
