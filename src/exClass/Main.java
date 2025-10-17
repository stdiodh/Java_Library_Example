package exClass;

public class Main {
    public static void main(String[] args) {
        // '객체', '인스턴스' 생성
        // new Person("이순신", 30) 코드를 통해 Person 클래스의 '인스턴스'(객체)가 메모리에 생성됩니다.
        // personLee은 '참조 변수'이고, 이 변수에는 생성된 인스턴스의 메모리 주소('참조 값')가 저장됩니다.
        Person personLee = new Person("이순신", 30); // '생성자' Person(String, int) 호출

        // 생성자 오버로드를 사용한 두 번째 인스턴스 생성
        Person personSe = new Person("세종대왕"); // '생성자' Person(String) 호출

        // 각 인스턴스의 메서드 호출
        System.out.println("\n--- 자기소개 시작 ---");
        personLee.introduce(); // personLee 인스턴스의 introduce 메서드 실행
        personSe.introduce(); // personSe 인스턴스의 introduce 메서드 실행

        System.out.println("\n--- 참조 값 확인 ---");
        // 참조 변수 person1은 인스턴스의 주소 값을 가짐 (예: Person@1b6d3586)
        System.out.println("personLee 참조 변수가 가리키는 값: " + personLee);
        System.out.println("personSe 참조 변수가 가리키는 값: " + personSe);
    }
}