package myProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		MyClass junit= new MyClass();
		int result=junit.add(30, 20);
		assertEquals(50,result);
	}

}
