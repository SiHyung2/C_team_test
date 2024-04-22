package com.example.controller;

import com.example.domain.RoomDTO;
import com.example.service.RoomService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/room")
@AllArgsConstructor
@Log4j
public class RoomController {

    private final RoomService service;


    @GetMapping("/list")   //1.모든 목록 조회
	public String list(Model model) {
    	model.addAttribute("roomlist" ,service.getList());
    	log.info("list");
		 
		 model.addAttribute("list",service.getList());
		 return "redirect:/test1.jsp";
	}
    
    
//	@GetMapping("/insert")//2.입력
//	public String register(RoomDTO room) {
//
//		
//		service.insertroom(room);
//		
//		model.addAttribute("booking", booking);
//		return "redirect:/board/insert";
//		return "/";
//	}
   
//
//    @GetMapping
//    public String getAllBookings(Model model) {
//        model.addAttribute("bookings", RoomService.getAllBooking());
//        return "bookingList";
//    }
//
//    @GetMapping("/{bo_num}")
//    public String getBooking(@PathVariable String bo_num, Model model) {
//        RoomDTO booking = RoomService.getBooking(bo_num);
//        model.addAttribute("booking", booking);
//        return "bookingDetails";
//    }
//
//    @PostMapping("/{bo_num}/update")
//    public String updateBooking(@PathVariable String bo_num, @ModelAttribute("booking") RoomDTO booking, RedirectAttributes redirectAttributes) {
//        booking.setBo_num(bo_num);
//        RoomService.updateBooking(booking);
//        redirectAttributes.addFlashAttribute("message", "Booking updated successfully!");
//        return "redirect:/booking";
//    }
//
//    @GetMapping("/{bo_num}/delete")
//    public String deleteBooking(@PathVariable String bo_num, RedirectAttributes redirectAttributes) {
//        RoomService.deleteBooking(bo_num);
//        redirectAttributes.addFlashAttribute("message", "Booking deleted successfully!");
//        return "redirect:/booking";
//    }
}
