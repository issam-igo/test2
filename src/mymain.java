
public class mymain {
	
	public static void main(String[] args) {
		
		mymain c=new mymain();
		
		System.out.println(c.calculer(2));
		
		System.out.println(c.division(2));
		System.out.println(c.Mult20(5));
	}
	
	public int calculer(int x) {
		
		return x*2;
		
	}
	

	public int division(int x) {
		
		return x/2;
	}

	public int Mult20(int s) {
		
		return s*20;

	}
}
