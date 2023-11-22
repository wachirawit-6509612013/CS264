package core;

import junit.framework.TestCase;

public class JUNITIStack extends TestCase {

	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack(5) ;
		int size = s1.getSize() ;
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop() {
		Stack s2 = new Stack(5);
		s2.push(1);
		int size = s2.getSize();
		assertEquals(1, size);
	}
}
