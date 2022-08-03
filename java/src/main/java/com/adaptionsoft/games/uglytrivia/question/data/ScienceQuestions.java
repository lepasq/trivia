package com.adaptionsoft.games.uglytrivia.question.data;

import java.util.Arrays;
import java.util.List;

public class ScienceQuestions implements CategoryQuestions {
    List<String> questions = Arrays.asList("Science Question 1", "Science question 2");

    @Override
    public String getQuestion() {
        return getRandom(questions);
    }
}
