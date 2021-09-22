package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {
		private final int numOfRides;
	    private final double totalFare;
	    private final double avgFare;
	    
	    public InvoiceSummary(int numOfRides, double totalFare) {
	        this.numOfRides = numOfRides;
	        this.totalFare = totalFare;
	        this.avgFare = this.totalFare/this.numOfRides;
	    }
	    public int getNumberOfRides() {
			return numOfRides;
		}

		public double getTotalFare() {
			return totalFare;
		}

		public double getAverageFare() {
			return avgFare;
		}
		@Override
		public boolean equals(Object obj) {
			if(this == obj)
				return true;
			if(obj==null||getClass() != obj.getClass())
				return false;
			InvoiceSummary that = (InvoiceSummary) obj;
			return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare)==0 && Double.compare(that.avgFare, avgFare)==0;
		}
}
