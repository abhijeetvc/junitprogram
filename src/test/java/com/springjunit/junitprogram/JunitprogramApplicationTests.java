package com.springjunit.junitprogram;

import com.springjunit.junitprogram.model.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpStatus.OK;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JunitprogramApplicationTests {

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	void testGetAllEmployees(){

		ResponseEntity<Employee[]> entity=testRestTemplate
				.getForEntity("/getallem",Employee[].class);

		assertEquals(OK,entity.getStatusCode());
		assertEquals(3,entity.getBody().length);
	}

}
