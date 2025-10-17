package exClass;

// '클래스' : Person 이라는 이름의 클래스를 정의합니다. 객체를 만들기 위한 설계도입니다.
class Person {
    // '멤버 변수' : 클래스의 속성을 나타냅니다. (이름, 나이)
    String name;
    int age;

    // '생성자' : 이름과 나이를 받아 객체를 초기화합니다.
    public Person(String name, int age) {
        this.name = name; // this는 현재 인스턴스를 가리킵니다.
        this.age = age;
        System.out.println("Person(이름, 나이) 생성자 호출됨!");
    }

    // '생성자 오버로드' : 이름만 받는 생성자를 추가로 정의합니다. 나이는 1살로 기본 설정됩니다.
    public Person(String name) {
        this(name, 1); // 첫 번째 생성자를 재사용합니다.
        System.out.println("Person(이름) 생성자 호출됨!");
    }

    // '메서드' : 멤버 변수를 사용하여 자기소개 기능을 구현합니다.
    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}