package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.RoomDTO;

import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { com.example.config.RootConfig.class })
@Log4j2
public class RoomMapperTest {
    
    @Autowired
    private RoomMapper mapper;

    @Test
    public void testGetList() {
        List<RoomDTO> list = mapper.getList();
        list.forEach(room -> log.info(room));
    }
}
