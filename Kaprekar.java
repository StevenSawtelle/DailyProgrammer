	import java.util.*;
	
	//Challenge 290 - Kaprekar Numbers Oct 31, 2016
	public class Kaprekar {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("First num?");
			String num = scan.nextLine();
			System.out.println("Second num?");
			String num2 = scan.nextLine();
			
			List<Integer> results = new ArrayList<Integer>();
			int iNum=0;//terminal number
			int tNum=0;//initial number
			tNum = Integer.parseInt(num);
			iNum = Integer.parseInt(num2);
			for(int j=tNum;j<iNum;j++){//loop all numbers in set
				int numSqu = j*j;
				String sNum = ""+numSqu;
				List<Character> contents = new ArrayList<Character>();
				for(int i=0;i<sNum.length();i++){//make arrayList of characters ex 2025 is 2,0,2,5
					contents.add(sNum.charAt(i));
				}
				String sub1 = "";
				String sub2 = "";
				int int1=0;
				int int2=0;
					for(int i=1;i<sNum.length();i++){//test all combos ex 2+025,20+25,202+5
						
						sub1=sNum.substring(0,i);
						sub2=sNum.substring(i,sNum.length());
						
						int1=Integer.parseInt(sub1);
						int2=Integer.parseInt(sub2);
						
						if(int1==0 || int2==0){//specific rule ex 10 is not because 10+0 doesnt count
							continue;
						}
						
						if(int1+int2==j){//number is Kaprekar
							results.add(j);
						}
					}
				}
			System.out.println(results);
		}
	
	}
