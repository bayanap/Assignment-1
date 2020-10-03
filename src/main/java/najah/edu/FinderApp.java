package najah.edu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinderApp {
Home home=new Home(0, 0, 0, 0, 0, 0, null, null, null, null, null);
	static Map <String,String> feature_repsitory = new HashMap();
//	static HashMap<String,String>feature_repsitory = new HashMap<String, String>();

	public static Map<String, String> getFeature_repsitory() {
		return feature_repsitory;
	}

	public static void setFeature_repsitory(Map<String, String> feature_repsitory) {
		FinderApp.feature_repsitory = feature_repsitory;
	}

	public FinderApp() {
		
			

	}
	static List<Home> getrepository = new ArrayList<Home>();

	public  static List<Home> getGetrepository() {
		return getrepository;
	}
	
	public void CreatRepositoryFromFeatureRepository() {
		List<Home> repository = getGetrepository();
		boolean contain =repository.contains(home);
		//if(true) {
		//	home.}
		
	}
	 
 //public List<Home> byType(String type) {
	 
	//return  null;}
	 

 
 
public Home byPrice(String s)
{
	int i=Integer.parseInt(s);  
	   home.setPrice(i);
return home;
 
}

public Home bybedroom(String s)
{
	int i=Integer.parseInt(s);  
	   home.setNo_of_bedrooms(i);
return home;
 
}

public Home bybathroom(String s)
{
	int i=Integer.parseInt(s);  
	   home.setNo_of_bathrooms(i);
return home;
 
}
public Home byArea(String s)
{
	int i=Integer.parseInt(s);  
	   home.setArea(i);
return home;
 
}

public Home byLease_length(String s)
{
	int i=Integer.parseInt(s);  
	   home.setLease_length(i);
return home;
 
}


   public  HomeType CheckType(String s) {
	   HomeType type=new HomeType();
	   s=type.getHouse();
	   home.setType(type);
	return type;
	   
   }
 

   
   public  HomeMaterial CheckMaterial(String s) {
	   HomeMaterial matrrial =new HomeMaterial();
	   s=matrrial.getBrick();
	   home.setMaterial(matrrial);
		return matrrial;
		   
	   }
   
   
   
   public  HomePlacement CheckPlaceMemnt(String s) {
	   HomePlacement place=new HomePlacement();
	   place.getVillage();
	return place;
	   
		   
	   }
   public  HomePets CheckPets(String s) {
	   HomePets pets = new HomePets();
	   pets.setPets(false);
		return pets;
		   
	   }
   
   public  HomeAmenities CheckAmenities(String s) {
	   HomeAmenities amenities = new HomeAmenities();
	
	   amenities.setAirConditioning(false);
	   amenities.setBalcony(false);
	   amenities.setElevator(true);
	   amenities.setFirePlace(true);
	   amenities.setGarageParking(true);
	   amenities.setSwimmingPool(false);
		return amenities;
		 
		
	   }
   
   public void  PrintRepository ()
   {
	   System.out.println(Arrays.asList(feature_repsitory));
   }
   
   
   
   


}
