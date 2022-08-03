package com.adaptionsoft.games.uglytrivia.question.data;

import com.adaptionsoft.games.uglytrivia.question.Question;

public class QuestionDatabase {
    public String getQuestion(Question question) {
        PopQuestions popQuestions = new PopQuestions();
        RockQuestions rockQuestions = new RockQuestions();
        SportsQuestions sportsQuestions = new SportsQuestions();
        ScienceQuestions scienceQuestions = new ScienceQuestions();

        switch (question) {
            case POP:
                return popQuestions.getQuestion();
            case ROCK:
                return rockQuestions.getQuestion();
            case SCIENCE:
                return sportsQuestions.getQuestion();
            case SPORTS:
                return scienceQuestions.getQuestion();
            default:
                // TODO: Should use CategoryNotImplementedException in the future
                throw new RuntimeException("This method has not been implemented yet.");
        }
    }
}
