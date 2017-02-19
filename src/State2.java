
public class State2 implements State {

	@Override
	public void doActionOnA(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(this);
	}

	@Override
	public void doActionOnB(FiniteState context) {
		// TODO Auto-generated method stub

			context.setState(new State3());
	}

	@Override
	public void doActionOnC(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(new State1());
		

	}
	
	public String toString()
	{
		return "In  state 2 ..String not accepted";
		
		
	}


}
