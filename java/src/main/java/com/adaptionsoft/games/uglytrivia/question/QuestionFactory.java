package com.adaptionsoft.games.uglytrivia.question;

import com.adaptionsoft.games.uglytrivia.question.data.QuestionDatabase;

import java.util.LinkedList;

public class QuestionFactory {
    QuestionDatabase db = new QuestionDatabase();

    public String getQuestion(Question question) {
        return db.getQuestion(question);
    }

    public LinkedList<String> getQuestions(Question question, int n) {
        LinkedList<String> questions = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            questions.add(getQuestion(question));
        }
        return questions;
    }
}