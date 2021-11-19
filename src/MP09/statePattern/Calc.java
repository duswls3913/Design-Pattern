package MP09.statePattern;
import java.util.Scanner;

public class Calc {
	State StateStart;
	State FirstOperand;
	State Operator;
	State SecondOperand;
	
	State state = null;
	
	Scanner scanner;
    String inputStr;
    int operand1; // ù ��° �� �����ڰ� ����
    int operand2; // �� ��° �� �����ڰ� ����
    char operator; // ��Ģ ������ ����
	
	public Calc() {
		StateStart = new StateStart(this);
		FirstOperand = new FirstOperand(this);
		Operator = new Operator(this);
		SecondOperand = new SecondOperand(this);
		state = StateStart;
		
		scanner = new Scanner(System.in);
	}
	
	public void setSate(State state) {
		this.state = state;		
	}
	public State getStateStart() {
		return StateStart;
	}
	public State getStateFirstOperand() {
		return FirstOperand;
	}
	public State getStateOperator() {
		return Operator;
	}
	public State getStateSecondOperand() {
		return SecondOperand;
	}
	
	public String getInput(String s) {
		System.out.println(s);
        return scanner.next();
	}
	
	public boolean run() {
		// TODO Auto-generated method stub
		inputStr = getInput("���� �Ǵ� +,-,*,/,= ��ȣ �� �� ���� �Է��ϼ���");
		char ch = inputStr.charAt(0);
		if (ch == 'q' || ch == 'Q') { // q�� �Է��ϸ� ���α׷� ����
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // ������ �ԷµǸ�
            state.processNumber(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // // ������ ó��
            state.processOperator(ch);
        }
        return true;

	}

	
}
