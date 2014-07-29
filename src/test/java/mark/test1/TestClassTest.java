package mark.test1;

import org.junit.Assert;
import org.junit.Test;

public class TestClassTest {
	
	@Test
	public void test() {
		Assert.assertEquals(4, new TestClass().dubbel(2));
	}
	
	@Test
	public void test2() {
		Assert.assertNotEquals(5, new TestClass().dubbel(2));
	}
}
