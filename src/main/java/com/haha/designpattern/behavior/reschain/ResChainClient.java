package com.haha.designpattern.behavior.reschain;

import com.haha.designpattern.behavior.ImageQuestion;
import com.haha.designpattern.behavior.Question;
import com.haha.designpattern.behavior.TextQuestion;

/**
 * Created by liuhe on 16-4-9.
 */
public class ResChainClient {

    public static void main(String[] args) {
        //Client has a Handler Object
        Handler handler = new TextHandler();
        Question textQuestion = new TextQuestion();
        Question imageQuestion = new ImageQuestion();

        handler.handle(textQuestion);
        handler.handle(imageQuestion);
    }
}
