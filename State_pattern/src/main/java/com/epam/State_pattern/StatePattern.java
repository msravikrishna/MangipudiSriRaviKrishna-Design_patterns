package com.epam.State_pattern;
//Behavioral Patterns
class Context {
	private State state;

	public Context(){
		state = null;
	}

	public void setState(State state){
		this.state = state;		
	}

	public State getState(){
		return state;
	}
}
class StartState implements State {

	public void performAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);	
	}

	public String toString(){
		return "Start State";
	}
}

interface State {
	public void performAction(Context context);
}

public class StatePattern {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.performAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.performAction(context);

		System.out.println(context.getState().toString());
	}
}
class StopState implements State {

	public void performAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);	
	}

	public String toString(){
		return "Stop State";
	}
}
