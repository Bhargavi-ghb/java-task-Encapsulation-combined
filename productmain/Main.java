package com.productmain;

import com.product.Product;
import com.manufacturer.Manufacturer;

public class Main {
	public static void main(String[] args) {
		
		Manufacturer manufacturer=Manufacturer.getManufacturerObject("Thanmai", "hyderabad", "101manu908");
		Product product=Product.getProductObject("Car", "vechile", manufacturer, 200.0);
		System.out.println(product);
		if( manufacturer==null) {
			System.out.println("invalid product/manufacturer");
		}
	}
}
