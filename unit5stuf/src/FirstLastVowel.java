//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.lang.System.*;
public class FirstLastVowel
{
	
   public String go( String a )
	{
	   
	   char s=Character.toLowerCase(a.charAt(0));
	   char e=a.charAt(a.length()-1);
	   if(s=='a') {
		   return "yes";
	   } else if (s=='e') {
		   return "yes";
	   } else if (s=='i') {
		   return "yes";
	   } else if (s=='o') {
		   return "yes";
	   } else if (s=='u') {
		   return "yes";
	   } else if(e=='a') {
		   return "yes";
	   } else if (e=='e') {
		   return "yes";
	   } else if (e=='i') {
		   return "yes";
	   } else if (e=='o') {
		   return "yes";
	   } else if (e=='u') {
		   return "yes";
	   } else {
			return "no";
	   }
	}
}