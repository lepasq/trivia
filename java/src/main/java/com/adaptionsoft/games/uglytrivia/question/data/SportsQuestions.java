package com.adaptionsoft.games.uglytrivia.question.data;

import java.util.Arrays;
import java.util.List;

public class SportsQuestions implements CategoryQuestions {
    List<String> questions = Arrays.asList("Sports Question 1", "Sports Question 2");

    @Override
    public String getQuestion() {
        return getRandom(questions);
    }
}
