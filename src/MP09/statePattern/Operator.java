package MP09.statePattern;
public class Operator implements State {
	Calc calc;
	
	public Operator(Calc calc) {
		this.calc = calc;
	}

	@Override
	public void processNumber(String ch) {
		calc.operand2 = Integer.parseInt("" + ch);
		calc.setSate(calc.getStateSecondOperand());
	}

	@Override
	public void processOperator(char ch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printOutResult() {
		// TODO Auto-generated method stub

	}

}
