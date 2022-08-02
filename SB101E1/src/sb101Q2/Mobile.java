package sb101Q2;

import java.util.*;

public class Mobile {
	
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	
	public String addMobile(String company, String model) {
		
		if(mobiles.containsKey(company)) {
			
			mobiles.get(company).add(model);
		}else {
			
			
			ArrayList<String> list = new ArrayList<>();
			list.add(model);
			mobiles.put(company, list);
		}
		return "Mobile Succefully Added";
		
	}
	
	public ArrayList<String> getModels(String company){
		
		return mobiles.get(company);
	}
	
	
	public static void main(String[] args) {
		
		
		Mobile mob = new Mobile();
		
		mob.addMobile("Apple", "iphone14");
		
		mob.addMobile("Samsung", "Galaxy S20FE");
		
		mob.addMobile("Sony", "XperiaZ");
		
		mob.addMobile("Asus", "Rog 5");
		
		
		ArrayList<String> brand = mob.getModels("Apple");
		
		ArrayList<String> models = mob.getModels("Samsung");
		
		System.out.println(brand);
		
		System.out.println(models);
	}
		
	

}
