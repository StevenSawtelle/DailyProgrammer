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
		for(int i=0;i<word.length();i++){
			chars.add(word.charAt(i));
		}
		String notok = "AEIOUaeiou.'/?!@#$%^&*()-_<>;: ";
		String fWord="";
		int countTo=word.length();
		for(int i=0;i<countTo;i++){
			if(notok.indexOf(chars.get(i))>-1){
				fWord+=chars.get(i);
			}
			else{
				fWord+=chars.get(i)+"o"+Character.toLowerCase(chars.get(i));
			}
		}
		System.out.println(fWord);
	}

}
