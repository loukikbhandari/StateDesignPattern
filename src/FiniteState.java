
public class FiniteState {
	 private State state; 
	 
	   public FiniteState(){       state = new State1();    } 
	 
	   public void setState(State state){       this.state = state;      } 
	 
	   
	   public State getState(){    
		   return state;    }  
}
