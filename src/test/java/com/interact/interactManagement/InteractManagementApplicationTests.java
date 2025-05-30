package com.interact.interactManagement;

import com.interact.interactManagement.users.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MainApplication.class)
class InteractManagementApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
	}

}
