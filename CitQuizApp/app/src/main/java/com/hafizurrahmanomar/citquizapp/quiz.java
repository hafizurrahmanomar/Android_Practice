package com.hafizurrahmanomar.citquizapp;

import java.util.ArrayList;
import java.util.List;

public class quiz {

    String questions,option,answer1,answer2,answer3,answer4,rightAnswer;

    public quiz(String questions, String option, String answer1, String answer2, String answer3, String answer4, String rightAnswer) {
        this.questions = questions;
        this.option = option;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestions() {
        return questions;
    }


    public String getOption() {
        return option;
    }


    public String getAnswer1() {
        return answer1;
    }


    public String getAnswer2() {
        return answer2;
    }


    public String getAnswer3() {
        return answer3;
    }


    public String getAnswer4() {
        return answer4;
    }


    public String getRightAnswer() {
        return rightAnswer;
    }


}

