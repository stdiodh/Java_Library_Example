package console;

import console.view.InputView;
import console.view.OutputView;

public class ConsoleMain {
    public static void main(String[] args){
        InputView input = new InputView();
        OutputView output = new OutputView();

        output.printInputPrompt();
        String userInput = input.getUserInput();

        System.out.println(userInput);
    }
}
