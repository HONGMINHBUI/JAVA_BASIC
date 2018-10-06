package Conditions;

import org.testng.annotations.Test;

public class Java_String_Exercise {
	String auto = "Automation 01 Testing 345 Tutorials Online 123456";
	int lengthOfString = auto.length();
	
  @Test 
  public void TC01_numberOfA() {
	  char a = 'a';
	  char A = 'A';
	  int dem = 0;
	  for (int i = 0; i < lengthOfString; i++) {
		  if (auto.charAt(i) == a || auto.charAt(i) == A) {
			  dem++;  
		  }
	  }
	  System.out.println("number of letter a = " + dem);
  }
  
  @Test 
  public void TC02_CountNumber() {
	  char[] mang = auto.toCharArray(); 
	  int count = 0;
	  for (int i = 0; i < lengthOfString; i++) {
		  if (Character.isDigit(mang[i])) {
			  //Character.isDigit(auto.charAt(i))
			  count++;  
		  }
	  }
	  System.out.println("number of Number = " + count);
  }
  
  @Test
  public void TC03_OtherAction() {
	  String testing = "Testing";
	  boolean compare01 = auto.contains(testing);
	  System.out.println("String contains Testing? " + compare01);
	  
	  boolean compare02 = auto.startsWith("Automation");
	  System.out.println("String starts with Automation? " + compare02);
	  
	  boolean compare03 = auto.endsWith("Online");
	  System.out.println("String ends with Online? " + compare03);
	  
	  int ind = auto.indexOf("Tutorials");
	  System.out.println("Index of Tutorials is " + ind);
	  
	  String off = auto.replace("Online", "Offline");
	  System.out.println("New string is " + off);
  }
}