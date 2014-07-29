package mark.test1;

import org.junit.Assert;
import org.junit.Test;

public class TestClassTest {
	
	@Test
	public void test() {
		Assert.assertEquals(4, new TestClass().dubbel(2));
	}
	
}
