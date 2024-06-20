package example;

public class Hello {
    enum Type {
        FOO, BAR, BAZ
    }

    public static void main(String[] args) {
        var type = Type.valueOf(args[0]);
        switch (type) {
            case FOO -> {
                System.out.println("Hi foo");
            }
            case BAR, BAZ -> {
            }
            default -> throw new AssertionError(type);
        }
    }
}
