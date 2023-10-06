package Lab09;

import java.util.ArrayList;
import java.util.List;

abstract class OperationTemplate {
    protected String result = "";

    public final void solve(String line) {
        readInput(line);
        operate();
        writeOutput();
    }

    private void writeOutput() {
        System.out.println("The result is " +result);
    }

    abstract void operate();

    abstract void readInput(String line);

    class AddOperation extends OperationTemplate {
        private int num1, num2;

        @Override
        public void operate() {
            result = String.valueOf(num1 + num2);
        }

        @Override
        public void readInput(String line) {
            num1 = Integer.parseInt(line.split(" ")[0]);
            num2 = Integer.parseInt(line.split(" ")[1]);
        }
    }

    class ListReverseOperation extends OperationTemplate{
        List<String> values = new ArrayList<>();

        @Override
        public void operate() {
            result += "[";
            for (int i=values.size()-1; i > -1; i--){
                result += values.get(i);
                if (i > 0){
                    result += ", ";
                }
            }
            result += "]";
        }

        @Override
        public void readInput(String line) {
            values = List.of(line.split(" "));
        }
    }
}

public class Q1toQ3 {
}
