package cool;

import java.util.Random;
import java.util.Scanner;

public class Popular {
	static Scanner c = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			String s = c.nextLine();
			try {
				System.out.println(hipThings(s));
			} catch (NotCoolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("");
				System.out.println("that is extremely uncool and that fact that you are merely bringing that up is immature and innapropriate");
			}
		}
	}
	public static String hipThings(String s) throws NotCoolException {
		if(new Random().nextInt(2) == 0) {
			//It is hip
			return ("That is apparently in style right now.");
		}
		else {
			if(new Random().nextInt(2) == 0) {
				throw new NotCoolException("");
			}
			else {
				throw new OutOfStyleException();
			}
		}
	}
}
