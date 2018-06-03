package designPatterns.singleton;

public class Person {
    private static Person ourInstance = new Person();

    public static Person getInstance() {
        return ourInstance;
    }

    private Person() {
    }
}
