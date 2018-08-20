import java.lang.Math;

public class StringBinAdd {

	public static void main(String[] args) {
		
		String[ ] bin = {"1010010101", "1001011101"};
		int decDigit, binDigit, exp;
		int[ ] dec = {0, 0};
		
		for(int k=0;k<2;k++) {
			for(int i=0;i<bin[k].length();i++) {
				exp = bin[k].length()-i-1;
				binDigit = bin[k].charAt(i)-48;
				decDigit = (int) (Math.pow(2,exp)) * binDigit;
				System.out.print(String.format("exp = %d, binDigit = %d, decDigit = %d, dec = %d\n", 
						exp, binDigit, decDigit, dec[k]));
				dec[k] += decDigit;
			}
			System.out.println(" ");
		}
		System.out.println(dec[0]);
		System.out.println(dec[1]);
		System.out.println(dec[0] + dec[1]);
	}

}
