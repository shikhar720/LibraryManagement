package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJunitApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */
	@Mock
    private ExampleRepositoryImpl exampleRepo;
	
	@InjectMocks
	private ExampleServiceImpl helloservice = new ExampleServiceImpl();
	
	@BeforeEach
	void setMockOutput() {
		when(exampleRepo.get()).thenReturn("Hello Mockito from Repository");
	}

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals("Hello Mockito from Repository",helloservice.get());
    }

}
