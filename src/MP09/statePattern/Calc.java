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
    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장
    char operator; // 사칙 연산자 저장
	
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
		inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
		char ch = inputStr.charAt(0);
		if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
            state.processNumber(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // // 연산자 처리
            state.processOperator(ch);
        }
        return true;

	}

	
}
