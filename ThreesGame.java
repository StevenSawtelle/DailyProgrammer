import java.io.*;

public class ThreesGame {

	public static void main(String[] args) {
		/*
		 * game of threes is when you take a large number and if
		 * its divisible by 3, do that until it goes to 1. if its not
		 * just add 1 or subtract 1 to make it divisibly by 3
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inp = new BufferedReader(isr);
		int input=0;
		try{
		input = Integer.parseInt(inp.readLine().trim());
		}catch(Exception e){}
		while(input>1){//loop until you get to 1
			System.out.print(input+ " ");
			if(input%3==0){//divisible by 3
				System.out.print("0");
				input=input/3;
			}
			else if((input+1)%3==0){//plus 1 is divisible by 3
				System.out.print("1");
				input=(input+1)/3;
			}
			else if((input-1)%3==0){//minus 1 is divisible by 3
				System.out.print("-1");
				input=(input-1)/3;
			}
			System.out.println();
		}
		System.out.println(input);//print 1
	}

}
