
// compile: $javac TrigTableDeg.java
// run		$java TrigTableDeg

class TrigTableDeg {

	public static void main (String args[]){
		double c, s, t; //temp double for cosine, sine and tangent so they can be rounded
		int d = 0; // degrees
		double r =0, rround = 0;// radian measure
		double pi = 3.14159265358979323846;
		int i = 15; //increment r 15 degrees equals pi radians
		// time calculation
		final long ms0, ms1;
			final float sec0, sec1;
		// end of time calculation
		String un = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\trad \t|\tcos\t|\tsin\t|\ttan" );
		System.out.println("--------------------------------------------------------------------------");
		// 9923372036854775807	18446744073709551614
		while (d <= 360){
			//convert angle t to radians r
			r = d * (pi/180.0);
			c = Math.cos(r);
			c = (Math.round(c *1000.0))/1000.0;
			s = Math.sin(r);
			s = (Math.round(s *1000.0))/1000.0;
			t = Math.tan(r);
			t = (Math.round(s *1000.0))/1000.0;
			rround = (Math.round(r*1000.0))/1000.0;
			
			if (c == 0.0)
				{System.out.println("\t"+d+ "\t|\t"+ c +"\t|\t"+ s +"\t|\t UN ");
				}else{
				 System.out.println("\t"+d+ "\t|\t"+ c +"\t|\t"+ s +"\t|\t" + t);
				 }
				d = d + i;
			}
		}
	}
			
			
