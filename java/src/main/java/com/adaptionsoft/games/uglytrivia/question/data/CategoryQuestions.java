package com.adaptionsoft.games.uglytrivia.question.data;

import java.util.List;
import java.util.Random;

public interface CategoryQuestions {
    String getQuestion();

    default String getRandom(List<String> q) {
        int rnd = new Random().nextInt(q.size());
        return q.get(rnd);
    }
}
