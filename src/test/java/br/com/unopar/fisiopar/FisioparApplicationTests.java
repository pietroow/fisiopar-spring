package br.com.unopar.fisiopar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FisioparApplicationTests {

	@Test
	public void contextLoads() {


	}

	@Test
	public void teste(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}
}
