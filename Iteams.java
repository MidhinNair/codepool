package work.out.hm;
import java.util.Collections;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Iteams {

	public static void main(String[] args) {
		//COLLECTION DEFINE
		ArrayList<Integer> iteamid =new ArrayList<Integer> ();
		ArrayList<String> shortDescreption=new ArrayList<String> ();
		ArrayList<Integer> price=new ArrayList<Integer> ();
		ArrayList<String> brand=new ArrayList<String> ();
	
		
		
		//	String iteam= "RAM";
		iteamid.add(1);
		shortDescreption.add("32 gb capacity");
		 price.add(3000);
		 brand.add("ADATA");

//	String iteam1= "TV";
	iteamid.add(2);
	shortDescreption.add("55 INCH QLED");
	 price.add(60000);
	 brand.add("LG");
	
		
	
		//String iteam2= "LAPTOP";
		iteamid.add(3);
		shortDescreption.add("I MAC PRO");
		 price.add(103000);
		 brand.add("APPLE");
	
		 
		 
		//	String iteam3= "CAMERA";
			iteamid.add(4);
			shortDescreption.add("ALPHA MARK 4");
			 price.add(183000);
			 brand.add("SONY");
	
				
			 
			//	String iteam4= "PHONE";
				iteamid.add(5);
				shortDescreption.add("256 gb capacity");
				 price.add(60000);
				 brand.add("ONEPLUS");

				 
				 
			//		String iteam5= "CONNECTOR";
					iteamid.add(6);
					shortDescreption.add("4 SOCATE CONNECT");
					 price.add(300);
					 brand.add("LUKE");

					 
					//	String iteam6= "BULB";
						iteamid.add(7);
						shortDescreption.add("LED 4 W");
						 price.add(100);
						 brand.add("TATA");
						
					
						 
						 
						// String iteam7= "FAN";
							iteamid.add(8);
							shortDescreption.add("1600 RPM DUAL MOTOR");
							 price.add(5000);
							 brand.add("USHA");
						
								
							 
						//	 String iteam8= "BOOK";
								iteamid.add(9);
								shortDescreption.add("300 PAGE");
								 price.add(200);
								 brand.add("CLASSMATES");

								

									 String iteams= " RAM  TV LAPTOP CAMERA PHONE CONNECTOR BULB FAN  BOOK ROBOT";
									 
										iteamid.add(10);
										shortDescreption.add("MINI DANCING ROBO BOOK");
										 price.add(8000);
										 brand.add("XONT");

											System.out.println(iteams);
											System.out.println(iteamid);
											System.out.println(shortDescreption);	
											System.out.println(price);
											System.out.println(brand);
											
											
											System.out.println();
											System.out.println();
	
											
											//Filter items by brands starts with "T".
	long count = brand.stream() .filter(x -> x.startsWith("T")) .count();
	System.out.println("start with T ="+count+"  BRAND");
	
//Sort by highest price. (i.e., descending order of price).
Collections.reverse(price);
System.out.println("price descending order"+ price);
	
											
											
	}

}
