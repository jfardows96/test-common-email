package org.apache.commons.mail;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {

	
	private static final String[] TEST_EMAILS = { "abbccc@.com", "a.b@c.org", "jjjjk@b.com"};
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception{
		
		email = new EmailConcrete();
	}
	 @After
	 public void tearDownEmailTest() throws Exception{
		 
	 }
	 
	 @Test
	 public void testAddBcc() throws Exception{
		 
		 
		 email.addBcc(TEST_EMAILS);
		 assertEquals(3, email.getBccAddresses().size());
	 }
	 


}
