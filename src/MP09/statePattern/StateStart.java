package MP09.statePattern;
import java.util.Scanner;


public class StateStart implements State {
	Calc calc;
	
	public StateStart(Calc calc) {
		this.calc = calc;
	}
	
	/*
	@Override
	public String getInput(String s) {
		System.out.println(s);
        return calc.scanner.next();
	}*/

	@Override
	public void processNumber(String ch) {	
		calc.operand1 = Integer.parseInt("" + ch);
		calc.setSate(calc.getStateFirstOperand());

	}

	@Override
	public void processOperator(char ch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printOutResult() {
		// TODO Auto-generated method stub

	}
	/*
	public boolean run() {
		// TODO Auto-generated method stub
		calc.inputStr = getInput("���� �Ǵ� +,-,*,/,= ��ȣ �� �� ���� �Է��ϼ���");
		char ch = calc.inputStr.charAt(0);
		if (ch == 'q' || ch == 'Q') { // q�� �Է��ϸ� ���α׷� ����
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // ������ �ԷµǸ�
            processNumber(calc.inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // // ������ ó��
            processOperator(ch);
        }
        return true;

	}*/

}
