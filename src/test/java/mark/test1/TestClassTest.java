package mark.test1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

@Test
public class TestClassTest {
	
	public void test() {
        assertThat(new TestClass().dubbel(2), is(4));
	}
	
	public void test2() {
		assertThat(new TestClass().dubbel(2), not(5));
	}
}
