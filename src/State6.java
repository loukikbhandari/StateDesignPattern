
public class State6 implements State {

	@Override
	public void doActionOnA(FiniteState context) {
		// TODO Auto-generated method stub

		context.setState(new State5());
	}

	@Override
	public void doActionOnB(FiniteState context) {
		// TODO Auto-generated method stub

		context.setState(new State4());
	}

	@Override
	public void doActionOnC(FiniteState context) {
		// TODO Auto-generated method stub

		context.setState(new State1());
	}
	
	public String toString()
	{
		return "In  state 6 ..String not accepted";
		
		
	}


}
