package com.adaptionsoft.games.uglytrivia.question.data;

import java.util.Arrays;
import java.util.List;

public class PopQuestions implements CategoryQuestions {
    List<String> questions = Arrays.asList("Pop Question 1", "Pop Question 2");

    @Override
    public String getQuestion() {
        return getRandom(questions);
    }
}
