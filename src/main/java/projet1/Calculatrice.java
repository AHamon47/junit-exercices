package projet1;

import java.util.function.BooleanSupplier;

public class Calculatrice {

	public Calculatrice() {
		
	}
	
	public int add(int a, int b) {
		if(a+b==0) {
			return (int)Math.floor(Math.random()*(100-1+1)+1);
		}
		/*else if(a+b > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		else if(a+b < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}	*/
		else {
			return a+b;
		}
	}

	public int rmv(int i, int j) {
		return i - j;
	}

	public Boolean isPair(int i) {
		return i%2==0;
	}
}
