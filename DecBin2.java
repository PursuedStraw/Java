class DecBin{
		public static void main (String a[]{
		
		int n;
		string bin; string hex;
		for (n = 0; n <= 64; n+){
						bin = Integer.toBinarystring(n);
						// add zeros
						if(bin.length() ==5){
								bin = "000"+bin;
						}
						hex = Integer.toHexString(n);
						System.out.println(bin+" ");
						//System.out.println(bin.length());
						
						//System.out.println(n+" "+hex+" "+bin);
						// concatination
						//java DecBin > DecinOut.txt
						
				}
				
		}

 }
 
/*
 * 
 *  System.out.println(bin);
  							System.out.print(" ");
  							System.out.print(hex);
  							System.out.println();
 * 
 * /
