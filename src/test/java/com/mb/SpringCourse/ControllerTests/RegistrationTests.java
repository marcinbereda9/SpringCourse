package com.mb.SpringCourse.ControllerTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mb.SpringCourse.Controllers.HomeController;
import com.mb.SpringCourse.Services.UserService;

@SpringBootTest
public class RegistrationTests {

	@Autowired
	UserService UserService;
	
	@Test
	public void RegistrationPageTest() throws Exception {
		HomeController controller = new HomeController(UserService);
		MockMvc mock = MockMvcBuilders.standaloneSetup(controller).build();
		mock.perform(get("/registration")).andExpect(view().name("registration"));
	}
}
