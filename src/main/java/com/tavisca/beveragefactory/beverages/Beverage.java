package com.tavisca.beveragefactory.beverages;

import java.util.List;

import com.tavisca.beveragefactory.factory.BeverageFactory;

public abstract class Beverage {
	
	public String beverageName;
	
	public static BeverageFactory factory = new BeverageFactory();
	
	public abstract double cost();
	
	public abstract String description();
	
	public void exclude(List<String> excludedItemsList)  throws Exception {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beverageName == null) ? 0 : beverageName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beverage other = (Beverage) obj;
		if (beverageName == null) {
			if (other.beverageName != null)
				return false;
		} else if (!beverageName.equals(other.beverageName))
			return false;
		return true;
	}
	
	
	
	
	
}
