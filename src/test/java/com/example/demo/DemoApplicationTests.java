package com.example.demo;

import com.example.demo.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("hello");

		//objectMapper 사용시 get 메서드 필요
		//object -> json_text
		var objectMapper = new ObjectMapper();
		var user = new User("park", 30, "111", "인천");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		//json_text -> object , default 생성자 필요
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);

	}
}
