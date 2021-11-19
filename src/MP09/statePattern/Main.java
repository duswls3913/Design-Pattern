package MP09.statePattern;
public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        boolean run = true;
        while (run) {
            run = calc.run();
        }
    }
}
