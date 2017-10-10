package com.thinkinginjava.part3.exercise7;

import java.util.Random;

/**
 * Created by vendin on 10.10.2017.
 */
public class CoinBehavior implements Coin {
    @Override
    public int toss() {
        int result;
        double res = Math.random();
        if (res < 0.5) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }
}
