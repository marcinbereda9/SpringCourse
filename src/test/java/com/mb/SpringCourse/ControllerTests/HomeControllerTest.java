package com.mb.SpringCourse.ControllerTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import com.mb.SpringCourse.Controllers.HomeController;
import com.mb.SpringCourse.Models.User;
import com.mb.SpringCourse.Services.UserService;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HomeControllerTest {

	@Mock
	UserService userService;
	
	HomeController homeController;
	@Mock
	Model model;
	
    @SuppressWarnings("deprecation")
	@Before
    public void setUp() {
    	MockitoAnnotations.initMocks(this);
    	homeController = new HomeController(userService);
    }
    
    @Test
    public void homeTest(){
    	
    	List<User> users = new ArrayList<>();
    	users.add(new User());
    	User user = new User();
    	user.setId(1);
    	users.add(user);
    	when(userService.findAll()).thenReturn(users);
    	
    	homeController.Home(model);
    	ArgumentCaptor<List<User>> argumentCapture = ArgumentCaptor.forClass(List.class);   	
    	verify(userService, times(1)).findAll();
    	verify(model, times(1)).addAttribute(eq("users1"), argumentCapture.capture());
    	List<User> resutsToVerify = argumentCapture.getValue();
    	assertEquals(2, resutsToVerify.size());
    	assertEquals(2, resutsToVerify.size());
    	
    }
	@Test
	public void RegistrationPageTest() throws Exception {
		HomeController controller = new HomeController(userService);
		MockMvc mock = MockMvcBuilders.standaloneSetup(controller).build();
		mock.perform(get("/registration")).andExpect(view().name("registration.jsp"));
	}
	
	@Test 
	public void sucessTest() {
		
	}
}
