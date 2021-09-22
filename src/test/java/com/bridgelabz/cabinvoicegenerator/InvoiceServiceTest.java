package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;
import static com.bridgelabz.cabinvoicegenerator.InvoiceGenerator.RideType.NORMAL;
import static com.bridgelabz.cabinvoicegenerator.InvoiceGenerator.RideType.PREMIUM;
public class InvoiceServiceTest  {
	 InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	  @Test
	    public void givenDistanceAndTime_ShouldReturnTotalFare()
	  {
	       // InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	        double distance = 2.0;
	        int time = 5;
	        double fare = invoiceGenerator.calculateFare(distance, time, NORMAL);
	        Assert.assertEquals(25, fare, 0.0);
	   }
	  @Test
	    public void givenLessDistanceAndTime_ShouldReturnMinFare() 
	  {
	       // InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
	        double distance = 0.1;
	        int time = 1;
	        double fare = invoiceGenerator.calculateFare(distance, time, NORMAL);
	        Assert.assertEquals(5, fare,0.0);
	   }
	  @Test
	    public void givenMultipleRides_shouldReturnTotalFare() {
		  Rides[] rides = {
	                new Rides(2.0, 5, NORMAL),
	                new Rides(0.1, 1, NORMAL),
	                new Rides(10, 6, NORMAL)
	        };
	        InvoiceSummary summary = invoiceGenerator.calculateTotalFare(rides);
	        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 136.0);
	        Assert.assertEquals(expectedInvoiceSummary, summary);
	    }
	  @Test
		public void givenMultipleRides_ShouldReturnInvoiceSummary() {

			Rides[] rides = {new Rides(2.0, 5, NORMAL), 
							new Rides(0.1, 1, NORMAL)};
			InvoiceSummary summary = invoiceGenerator.calculateTotalFare(rides);
			InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
			 Assert.assertEquals(expectedInvoiceSummary, summary);
		}
	  @Test
	    public void givenUserIdAndRides_shouldReturnInvoiceSummary()  {
	        String userId = "firstUser";
	        Rides[] rides = {new Rides(2.0, 5,  NORMAL),
	                         new Rides(0.1, 1,NORMAL)};
	        invoiceGenerator.addRides(userId, rides);
	        InvoiceSummary summary = invoiceGenerator.getInvoiceSummary(userId);
	        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
	        Assert.assertEquals(expectedInvoiceSummary, summary);
	    }
	  @Test
	    public void givenUserIdRidesAndType_shouldReturnInvoiceSummary() throws InvoiceException {
	        String userId = "firstUser";
	        Rides[] rides = {new Rides(2.0, 5, NORMAL),
	                new Rides(0.1, 1, NORMAL)};
	        invoiceGenerator.addRides(userId, rides);
	        InvoiceSummary summary = invoiceGenerator.getInvoiceSummary(userId);
	        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
	        Assert.assertEquals(expectedInvoiceSummary, summary);
	    }

	    @Test
	    public void givenCategories_WhenRideList_ShouldReturnInvoiceSummary() throws InvoiceException {
	        String userId = "firstUser";
	        Rides[] rides = {new Rides(2.0, 5, PREMIUM),
	                new Rides(0.1, 1, PREMIUM)};
	        invoiceGenerator.addRides(userId, rides);
	        InvoiceSummary summary = invoiceGenerator.getInvoiceSummary(userId);
	        InvoiceSummary expectedSummary = new InvoiceSummary(2, 60.0);
	        Assert.assertEquals(summary, expectedSummary);
	    }
}
