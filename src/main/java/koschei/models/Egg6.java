package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 needle;

    public Egg6(Needle7 needle) { //alt+ins constructor
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
