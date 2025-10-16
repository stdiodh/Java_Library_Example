package exception;

import console.view.InputView;

public class TryCatch {
    public static void main(String[] args){
        InputView inputView = new InputView();

        String age = inputView.getUserInput();
        int stringToIntAge = toInt(age);

        System.out.println(checkAge(stringToIntAge));
    }

    public static boolean checkAge(int age) {
        if (age < 19) {
            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
        }
        return true;
    }

    public static int toInt(String st){
        return Integer.parseInt(st);
    }
}