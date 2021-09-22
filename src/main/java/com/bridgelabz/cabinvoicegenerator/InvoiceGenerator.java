package com.bridgelabz.cabinvoicegenerator;

public class InvoiceGenerator {
	  private static final double MINIMUM_COST_PER_KILOMETER = 10;
	    private static final int COST_PER_TIME = 1;
	    private static final int MIN_FARE = 5;
	    
	    public double calculateFare(double distance, int time) {
	        double totalFare = distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
	        if (totalFare< MIN_FARE)
	            return MIN_FARE;
	            return totalFare;
	    }
	    public double calculateFare(Rides[] rides) {
	        double totalFare = 0;
	        for (Rides ride:rides) {
	            totalFare =totalFare+ this.calculateFare(ride.getDistance(), ride.getTime());
	        }
	        return totalFare;
	    }

}
