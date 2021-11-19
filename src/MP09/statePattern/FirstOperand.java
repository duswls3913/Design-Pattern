package MP09.statePattern;
public class FirstOperand implements State {
	
	Calc calc;
	
	public FirstOperand(Calc calc) {
		this.calc = calc;
	}


	@Override
	public void processNumber(String ch) {
		calc.operand1 = Integer.parseInt("" + ch);
		//calc.setSate(calc.getStateFirstOperand());

	}

	@Override
	public void processOperator(char ch) {
		calc.operator = ch;
		calc.setSate(calc.getStateOperator());

	}

	@Override
	public void printOutResult() {
		// TODO Auto-generated method stub

	}

}
