package org.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalogue {

	@WebMethod
	public List<String>getProductCategories(){
		
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		return categories;		
	}
}
