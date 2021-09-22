package com.bridgelabz.cabinvoicegenerator;

import com.bridgelabz.cabinvoicegenerator.InvoiceGenerator.RideType;

public class Rides {
	 private int time;
	 private double distance;
	 private InvoiceGenerator.RideType rideType;
	  public Rides(double distance, int time, RideType rideType) {
	        this.distance = distance;
	        this.time = time;
	        this.rideType = rideType;
	    }
	  public int getTime() {
	        return time;
	    }

	    public void setTime(int time) {
	        this.time = time;
	    }

	    public double getDistance() {
	        return distance;
	    }

	    public void setDistance(double distance) {
	        this.distance = distance;
	    }
	    public InvoiceGenerator.RideType getRideType() {
	        return rideType;
	    }

	    public void setRideType(InvoiceGenerator.RideType rideType) {
	        this.rideType = rideType;
	    }
}
