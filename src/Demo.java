import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		 FiniteState context = new FiniteState(); 
		 Scanner st= new Scanner(System.in);
		 System.out.println("Enter the string:(Must contain only a's or b's or c's )");
		 String input = st.nextLine();
		 int flag=0;
	     for (int i = 0 ; i<input.length();i++)
	     {
	    	 char c = input.charAt(i);
	    	 if(c=='a' || c=='A')
	    	 {
	    		 State s=context.getState();
	    		 s.doActionOnA(context);
	    	 }
	    	 else if (c=='b' || c=='B')
	    	 {
	    		 State s=context.getState();
	    		 s.doActionOnB(context);
	    	 }
	    	 else if (c=='c' || c=='C')
	    	 {
	    		 State s=context.getState();
	    		 s.doActionOnC(context);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("String invalid");
	    		 flag=1;
	    	 }
	    	     	 
	    	     	 
	     }
	     if(flag==0)
	     {
	     System.out.println(context.getState().toString());
	     
	     }
	     
	     System.out.println("\nOnly strings with odd no of substrings abc is accepted");
	    // System.out.println(context.getState().toString()); 
	}
	
}
