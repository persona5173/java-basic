package kr.ac.cnu.pattern.singleton;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class OldSingleton {
    private static OldSingleton uniqueInstance;

    private OldSingleton() {

    }

    public static OldSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new OldSingleton();
        }

        return uniqueInstance;
    }
}
