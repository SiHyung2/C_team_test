package com.example.service;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.BoardVO;
import com.example.domain.Criteria;
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
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
//	@Test
	public void testReister() {
		RoomDTO room=new RoomDTO();
		room.setAc_id("asdf");
		
		service.register(board);
		
//		log.info("생성된 게시물의 번호: "+board.getBno());
	}
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
		
	}
	
//	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
	
//	@Test
	public void testDelete() {
		log.info("REMOVE RESULT: "+service.remove(2L));
	}
	
//	@Test
	public void testUpdate() {
		BoardVO board=service.get(1L);
		if(board==null) {
			return;
		}
		
		board.setTitle("제목 수정합니다.");
		log.info("MODIFY RESULT: "+service.modify(board));
	}
	
}
