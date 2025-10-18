package calculator;

import calculator.service.CalculatorService;
import common.view.OutputView;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        OutputView outputView = new OutputView();

        int a = 1;
        int b = 2;

        int result = calculatorService.add(a, b);
        outputView.printResult(result);
    }
}
