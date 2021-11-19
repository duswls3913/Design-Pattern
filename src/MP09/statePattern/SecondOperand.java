package MP09.statePattern;
public class SecondOperand implements State {
	Calc calc;
	
	public SecondOperand(Calc calc) {
		this.calc = calc;
	}

	@Override
	public void processNumber(String ch) {
		calc.operand2 = Integer.parseInt("" + ch);
	}

	@Override
	public void processOperator(char ch) {
		printOutResult();
		calc.setSate(calc.getStateStart());
	}

	@Override
	public void printOutResult() {
		switch (calc.operator) {
        case '+':
            System.out.printf("%d + %d = %d\n", calc.operand1, calc.operand2, calc.operand1 + calc.operand2);
            break;

        case '-':
            System.out.printf("%d - %d = %d\n", calc.operand1, calc.operand2, calc.operand1 - calc.operand2);
            break;

        case '*':
            System.out.printf("%d * %d = %d\n", calc.operand1, calc.operand2, calc.operand1 * calc.operand2);
            break;

        case '/':
            System.out.printf("%d / %d = %d\n", calc.operand1, calc.operand2, calc.operand1 / calc.operand2);
            break;
    }
		

	}

}
