package com.example.service;

import java.util.List;

import com.example.domain.RoomDTO;

public interface RoomService {
	public List<RoomDTO> getList();
	public void insertroom(RoomDTO room);
	public void updateroom(RoomDTO room);
	public void deleteroom(RoomDTO room);
	
}
