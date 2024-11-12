package com.training.mydesignpatternexamples.Structural_Patterns.DecoratorPattern;

public class PersonalRecommendationDecorator extends RecommendationDecorator {

    public PersonalRecommendationDecorator(Recommendation recommendation) {
        super(recommendation);
    }

    @Override
    public String getRecommendation() {
        return super.getRecommendation() + " and a personal recommendation";
    }


}
