package com.bridgelabz.cabinvoicegenerator;

public class Rides {
	 private int time;
	 private double distance;
	  public Rides(double distance, int time) {
	        this.distance = distance;
	        this.time = time;
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
}
