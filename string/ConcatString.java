package string;

public class ConcatString {
	 public static void main(String[] args) {      
	        String str1 = "Hello";  
	        String str2 = "Aerus Infotech";  
	        String str3 = "Developers"; 
	        
	        // Concatenating one string   
	        String str4 = str1.concat(" "+str3);          
	        System.out.println(str4);  
	        // Concatenating multiple strings  
	        String str5 = str1.concat(" "+str2).concat(" "+str3);  
	        System.out.println(str5);
	        String str6 = str1.concat(" "+str2+" "+str3+" Jay");
	        System.out.println(str6);
	 }  
}