
public class State5 implements State {

	@Override
	public void doActionOnA(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(this);
		
	}

	@Override
	public void doActionOnB(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(new State6());
		
	}

	@Override
	public void doActionOnC(FiniteState context) {
		// TODO Auto-generated method stub
		context.setState(new State4());
		
	}
	
	public String toString()
	{
		return "In  state 5 ..String  accepted";
		
		
	}


}
