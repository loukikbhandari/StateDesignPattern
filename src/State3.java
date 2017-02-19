
public class State3 implements State {

	@Override
	public void doActionOnA(FiniteState context) {
		// TODO Auto-generated method stub

		context.setState(new State2());
		
	}

	@Override
	public void doActionOnB(FiniteState context) {
		// TODO Auto-generated method stub

		context.setState(new State1());
		
	}

	@Override
	public void doActionOnC(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(new State4());

	}
	
	public String toString()
	{
		return "In  state 3 ..String not accepted";
		
		
	}


}
