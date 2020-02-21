
public class Calculator implements ICalculator {

	public int add(int x, int y) {
		return x+y;
	}
	
	
	public float divide(int x, int y) throws RuntimeException {
	     if(x==0&y!=0) {
	    	 return 0;
	     }
	     if(y==0) {
	    	 throw new RuntimeException("Not Allowed !!");
	     }
	   
		return (float)x/y;
		
	    }
}
