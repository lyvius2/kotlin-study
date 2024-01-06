package jakarta.cls;

public class JavaPerson {
    private final String name;
    private int age;

    public JavaPerson(String name) {
        this(name, 1);
    }

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.age <= 0) {
            throw new IllegalArgumentException(String.format("나이는 %s살일 수는 없습니다.", age));
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 20;
    }
}
