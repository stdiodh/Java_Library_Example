package member.domain;

public class User {
    private static final String ERROR_NAME_NULL = "[ERROR] 이름은 공백일 수 없습니다.";
    private static final String ERROR_NAME_OVER_LENGTH = "[ERROR] 이름은 6자를 넘을 수 없습니다.";
    private String name;

    public User(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        validateName(name);
        validateLength(name);
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(ERROR_NAME_NULL);
        }
    }

    private void validateLength(String name) {
        if (name.length() > 6) {
            throw new IllegalArgumentException(ERROR_NAME_OVER_LENGTH);
        }
    }
}
