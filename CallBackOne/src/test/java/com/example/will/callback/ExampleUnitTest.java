package com.example.will.callback;

import com.example.will.callback.aclass.Wang;
import com.example.will.callback.bclass.Li;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        /**
         * new 一个小李
         */
        Li li = new Li();

        /**
         * new 一个小王
         */
        Wang wang = new Wang(li);

        /**
         * 小王问小李问题
         */
        wang.askQuestion("1 + 1 = ?");
    }
}