package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {	
	@Test
	void testPlus() {
		assertThat("Hello").isEqualTo("Hello");
	}
}
