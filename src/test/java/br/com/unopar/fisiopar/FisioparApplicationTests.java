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

		Aluno instance = Aluno.getInstance();
		instance.setNome("Pedro");

		System.out.println(instance.getNome());

	}

}
