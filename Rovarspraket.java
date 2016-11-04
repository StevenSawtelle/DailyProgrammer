import java.io.*;
import java.util.*;

public class Rovarspraket {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inp = new BufferedReader(isr);
		
		String word="";
		try{
		word = inp.readLine().trim();
		}catch(Exception e){}
		List<Character> chars = new ArrayList<Character>();
		for(int i=0;i<word.length();i++){//add all chars of string to char array
			chars.add(word.charAt(i));
		}
		String notok = "AEIOUaeiou.'/?!@#$%^&*()-_<>;: ";//chars to not double with a middle o
		String fWord="";
		for(int i=0;i<word.length();i++){
			if(notok.indexOf(chars.get(i))>-1){//if vowel or punc, no double
				fWord+=chars.get(i);
			}
			else{//otherwise, add letter + "o" + letter
				fWord+=chars.get(i)+"o"+Character.toLowerCase(chars.get(i));
			}
		}
		System.out.println(fWord);
	}

}
