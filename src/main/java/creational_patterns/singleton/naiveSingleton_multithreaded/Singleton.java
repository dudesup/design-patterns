package creational_patterns.singleton.naiveSingleton_multithreaded;

public final class Singleton {
    private static Singleton instance;
    public String value;

    public Singleton(String value) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
