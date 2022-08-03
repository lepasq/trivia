package com.adaptionsoft.games.uglytrivia.question.data;

import java.util.Arrays;
import java.util.List;

public class RockQuestions implements CategoryQuestions {
    List<String> questions = Arrays.asList("Rock question 1", "Rock question 2");

    @Override
    public String getQuestion() {
        return getRandom(questions);
    }
}