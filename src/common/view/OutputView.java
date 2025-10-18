package common.view;

public class OutputView {
    private final String USER_INPUT_MESSAGE = "문자열을 입력해주세요.";
    private final String OUTPUT_MESSAGE = "결과 : ";

    public void printInputPrompt() {
        System.out.println(USER_INPUT_MESSAGE);
    }

    public void printResult(int result) {
        System.out.println(OUTPUT_MESSAGE + result);
    }
}
