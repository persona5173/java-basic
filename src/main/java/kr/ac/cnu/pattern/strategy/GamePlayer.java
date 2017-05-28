package kr.ac.cnu.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class GamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int attack() {
        return 1;
    }
}
