package myProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class JoinTest {

	@Test
	public void test() {
		MyClass junit= new MyClass();
		String result=junit.join("Hello","World");
		assertEquals("HellWorld",result);
	}

}
