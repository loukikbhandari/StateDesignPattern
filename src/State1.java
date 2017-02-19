
public class State1 implements State{

	@Override
	public void doActionOnA(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(new State2());
	}

	@Override
	public void doActionOnB(FiniteState context) {
		// TODO Auto-generated method stub
		
		context.setState(this);
		
	}

	@Override
	public void doActionOnC(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(this);
		
	}
	
	public String toString()
	{
		return "In  state 1 ..String not accepted";
		
		
	}

}
