package com.bridgelabz.cabinvoicegenerator;

import org.junit.Test;
import org.junit.Assert;

public class InvoiceServiceTest {
	 InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	  @Test
	    public void givenDistanceAndTime_ShouldReturnTotalFare()
	  {
	       // InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	        double distance = 2.0;
	        int time = 5;
	        double fare = invoiceGenerator.calculateFare(distance, time);
	        Assert.assertEquals(25, fare, 0.0);
	   }
	  @Test
	    public void givenLessDistanceAndTime_ShouldReturnMinFare() 
	  {
	       // InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	        double distance = 0.1;
	        int time = 1;
	        double fare = invoiceGenerator.calculateFare(distance, time);
	        Assert.assertEquals(5, fare,0.0);
	   }
	  @Test
	    public void givenMultipleRides_shouldReturnTotalFare() {
	        Rides[] rides = { new Rides(2.0, 5),
	                         new Rides(0.1, 1)
	                        };
	        double fare = invoiceGenerator.calculateFare(rides);
	        Assert.assertEquals(30, fare, 0.0);
	    }
}
