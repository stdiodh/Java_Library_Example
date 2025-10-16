package exception;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            System.out.println(input);
        } catch (Exception e) {
            System.out.println("예외 처리" + e.getMessage());
        }
    }
}