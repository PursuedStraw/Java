// challenge 1 - add 5 inputs
class Input {
	public static void main (String a[]){
		String input1, input2, input3, input4, input5;
		int ai, bi, ci, di, ei;
		int sum, diff, pro, div;
		ai = Integer.parseInt(a[0]);
		bi = Integer.parseInt(a[1]);
		ci = Integer.parseInt(a[2]);
		di = Integer.parseInt(a[3]);
		ei = Integer.parseInt(a[4]);
		
		System.out.print(ai+" ");
		System.out.print(bi+" ");
		System.out.print(ci+" ");
		System.out.print(di+" ");
		System.out.print(ei+"\n");
		sum = ai + bi + ci + di + ei;
		diff = -(ai) - bi - ci - di - ei;
		pro = ai * bi * ci * di * ei;
		div = ai / bi / ci / di / ei;
		
		System.out.print("sum=" +sum);
		System.out.print("diff=" +diff);
		System.out.print("pro=" +pro);
		System.out.print("div=" +div);
		System.out.print("\n");
		
		System.out.println(ai+bi+ci+di+ei);
	}
}
