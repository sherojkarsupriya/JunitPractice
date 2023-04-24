package com.junitsample;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class junittestpractice {

junitpractice j1=new junitpractice();
@Test
public void testbiggest() {
	
	int exp=6;
	int res=j1.biggest(5, 6);
	assertEquals(exp,res);
	
}
@Test
public void testbiggest2() {
	
	assertNotEquals(4,j1.biggest(3, 3));
}
@Test
public void checkname() {
	
	assertSame("Supriya",j1.whatisyourname());
}
@Test
public void checkname2() {
	
	assertNotSame("java",j1.whatisyourname());
}
@Test
public void eventest() {
	boolean res=j1.even(6);
	assertTrue(res);
}
@Test
public void testodd() {
	boolean res=j1.even(7);
    assertFalse(res);
}
	

	
}

	



