package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {

	private static final String[] TEST_EMAILS = {"bbbbbbbbbb@gmail.com", "bcccccss@yahoo.com", "kkksbcccc@bd.com"};
	private static final String TEST_EMAILS2 =  "Jannatul@gmail.com";
	private static String header = "check";
	
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
	
	@Test
	public void testAddReplyTo() throws Exception{
		
		email.addReplyTo(TEST_EMAILS2, "Jannatul");
		assertEquals(1, email.getReplyToAddresses().size());
	}
	@Test
	public void testgetSocketConnectionTimeout() throws Exception{
		
		email.socketConnectionTimeout = 6000;
		assertEquals(6000, email.getSocketConnectionTimeout());
	}

}
