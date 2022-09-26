
public class mymain {
	
	public static void main(String[] args) {
		
		mymain c=new mymain();
		
		System.out.println(c.calculer(2));
		
		System.out.println(c.division(2));
	}
	
	public int calculer(int x) {
		
		return x*2;
		
	}
	
	public int division(int x) {
		
		return x/2;
	}
}
