package test;


import static org.junit.Assert.assertNotEquals;

import br.com.leandro.Valores;
import junit.framework.TestCase;

public class ValoresTest extends TestCase {

	private Valores val;

	protected void setUp() throws Exception {
		super.setUp();
		val = new Valores();
		val.ins(5); //
		val.ins(12);
		val.ins(1);
		val.ins(30);
		val.ins(152);//
		val.ins(6);
	}

	public void testIns() {
		assertEquals(false, val.ins(-10));
		assertEquals(false, val.ins(0));
		val.ins(2);
		assertEquals(7, val.size());
		val.ins(3);
		assertEquals(8, val.size());
		val.ins(4);
		assertEquals(9, val.size());
		val.ins(5);
		assertEquals(10, val.size());
		assertEquals(false, val.ins(11));
	}

	public void testDel() {
		assertEquals(5, val.del(0));
		assertNotEquals(6, val.del(4));
		assertEquals(-1, val.del(4));
		assertNotEquals(152, val.del(0));
		assertEquals(-1, val.del(0));
	}
	
	public void testSize() {
		assertEquals(6, val.size());
	}
	
	public void testGreater() {
		assertEquals(152, val.greater());
	}
	
	public void testMean() {
		assertEquals(20.0, val.mean());
	}
}