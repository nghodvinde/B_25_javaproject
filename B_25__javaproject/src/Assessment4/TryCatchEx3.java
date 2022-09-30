package Assessment4;

public class TryCatchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=100, y=0;
       try
       {
    	   System.out.println("111");
    	   int z=x/y;
    	   
    	   System.out.print("Result of z:"+z);
       }
	catch(ArithmeticException ae )
       {
		System.out.println(" Hello Java");
		
		}
       System.out.println("333");
       
       }

}
