package com.tavisca.beveragefactory.factory;

import com.tavisca.beveragefactory.beverages.BananaSmoothie;
import com.tavisca.beveragefactory.beverages.Beverage;
import com.tavisca.beveragefactory.beverages.Chaai;
import com.tavisca.beveragefactory.beverages.Coffee;
import com.tavisca.beveragefactory.beverages.Mojito;
import com.tavisca.beveragefactory.beverages.StrawberryShake;
import com.tavisca.beveragefactory.ingredients.Banana;
import com.tavisca.beveragefactory.ingredients.CoffeePowder;
import com.tavisca.beveragefactory.ingredients.Lemon;
import com.tavisca.beveragefactory.ingredients.Milk;
import com.tavisca.beveragefactory.ingredients.Mint;
import com.tavisca.beveragefactory.ingredients.Soda;
import com.tavisca.beveragefactory.ingredients.Strawberries;
import com.tavisca.beveragefactory.ingredients.Sugar;
import com.tavisca.beveragefactory.ingredients.Tea;
import com.tavisca.beveragefactory.ingredients.Water;

public class BeverageFactory {
	
	public Beverage create(String type) {
		
		if(type.equals("BananaSmoothie"))
			return new BananaSmoothie();
		else if(type.equals("Chaai"))
			return new Chaai();
		else if(type.equals("Coffee"))
			return new Coffee();
		else if(type.equals("Mojito"))
			return new Mojito();
		else if(type.equals("StrawberryShake"))
			return new StrawberryShake();
		else if(type.equals("Banana"))
			return new Banana();
		else if(type.equals("CoffeePowder"))
			return new CoffeePowder();
		else if(type.equals("Lemon"))
			return new Lemon();
		else if(type.equals("Milk"))
			return new Milk();
		else if(type.equals("Mint"))
			return new Mint();
		else if(type.equals("Soda"))
			return new Soda();
		else if(type.equals("Strawberries"))
			return new Strawberries();
		else if(type.equals("Sugar"))
			return new Sugar();
		else if(type.equals("Tea"))
			return new Tea();
		else if(type.equals("Water"))
			return new Water();
	
		return null;
	}
	


}
