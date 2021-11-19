package MP09.statePattern;
public interface State {
	void processNumber(String ch);
	void processOperator(char ch);
	void printOutResult();

}
