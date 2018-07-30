import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println("Size: " + juice.size);
      
      String longString = "Simon Zorrilla NY 11106";
      regexChecker("\\s[A-Za-z]{2,20}\\s", longString); //space followed by word a-zA-Z between 2 and 20 characters and ends with a space
      //\\d - digits, \\D - not digits, \\{x} appears x times
   }
   
   
   public static void regexChecker(String theRegex, String str2Check) {
	   
	   Pattern checkRegex = Pattern.compile(theRegex);
	   
	   Matcher regexMatcher = checkRegex.matcher(str2Check);
	   
	   while(regexMatcher.find()) {
		   if(regexMatcher.group().length() != 0) {
			   System.out.println(regexMatcher.group().trim());
		   }
		   
		   System.out.println("Start index: " + regexMatcher.start());
		   System.out.println("End index: " + regexMatcher.end());
	   }
   }
}

