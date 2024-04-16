package com.example.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.flash;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.domain.BookingDTO;
import com.example.service.BookingService;

@RunWith(SpringRunner.class)
@WebMvcTest(BookingController.class)
public class BookingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookingService bookingService;

    @Before
    public void setUp() {
        // MockMvc 설정
        this.mockMvc = MockMvcBuilders.standaloneSetup(new BookingController(bookingService)).build();
    }

    @Test
    public void showBookingFormTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/booking/form"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(view().name("bookingForm"))
               .andExpect(model().attributeExists("booking"));
    }

    @Test
    public void addBookingTest() throws Exception {
        BookingDTO booking = new BookingDTO();
        booking.setBo_num("12345");

        mockMvc.perform(MockMvcRequestBuilders.post("/booking/add")
               .flashAttr("booking", booking))
               .andExpect(status().is3xxRedirection())
               .andExpect(redirectedUrl("/booking"))
               .andExpect(flash().attributeExists("message"));
    }

    @Test
    public void getAllBookingsTest() throws Exception {
        when(bookingService.getAllBooking()).thenReturn(Collections.emptyList());

        mockMvc.perform(MockMvcRequestBuilders.get("/booking"))
               .andExpect(status().isOk())
               .andExpect(view().name("bookingList"))
               .andExpect(model().attributeExists("bookings"));
    }

    @Test
    public void getBookingTest() throws Exception {
        BookingDTO booking = new BookingDTO();
        booking.setBo_num("12345");

        when(bookingService.getBooking("12345")).thenReturn(booking);

        mockMvc.perform(MockMvcRequestBuilders.get("/booking/12345"))
               .andExpect(status().isOk())
               .andExpect(view().name("bookingDetails"))
               .andExpect(model().attributeExists("booking"));
    }

    @Test
    public void updateBookingTest() throws Exception {
        BookingDTO booking = new BookingDTO();
        booking.setBo_num("12345");

        mockMvc.perform(MockMvcRequestBuilders.post("/booking/12345/update")
               .flashAttr("booking", booking))
               .andExpect(status().is3xxRedirection())
               .andExpect(redirectedUrl("/booking"))
               .andExpect(flash().attributeExists("message"));
    }

    @Test
    public void deleteBookingTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/booking/12345/delete"))
               .andExpect(status().is3xxRedirection())
               .andExpect(redirectedUrl("/booking"))
               .andExpect(flash().attributeExists("message"));
    }
}
