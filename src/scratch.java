public class scratch {
	
	public static int addbins(String a, String b) {
		String[ ] bin = {a,b};
		int[ ] dec= {0,0};
		
		for(int i=0;i<2;i++) {
			dec[i] = Integer.valueOf(bin[i], 2);
		}

		return dec[0] + dec[1];
	}

	public static void main(String[] args) {
		
		System.out.println(addbins(args[0],args[1]));
	}
}
