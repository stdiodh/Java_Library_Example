package exception;

public class TryCatchFinally {
    public static void main(String[] args){
        try {
            // ArithmeticException 발생지점
            int result = 10 / 0;
        } catch(ArithmeticException e) {
            // ArithmeticException 이 발생했을 때 실행될 코드
            System.out.println("ArithmeticException 예외가 발생했습니다.");
        }
    }
}
