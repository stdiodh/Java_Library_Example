import camp.nextstep.edu.missionutils.Console;

public class Main {
    public static void main(String[] args) {
        System.out.println("이름을 입력해주세요: ");

        //이름 입력
        String name = Console.readLine();
        System.out.println("입력하신 이름은 \"" + name + "\" 입니다.");

        //나이 입력
        System.out.println("나이를 입력해주세요: ");
        String ageInput = Console.readLine();
        int age = Integer.parseInt(ageInput);

        System.out.println("당신의 나이는 : " + age + "살 입니다.");
        Console.close();
    }
}