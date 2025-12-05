package com.training.mydesignpatternexamples.Structural_Patterns.DecoratorPattern;

public class GeneralRecommendationDecorator extends RecommendationDecorator {

    public GeneralRecommendationDecorator(Recommendation recommendation) {
        super(recommendation);
    }

    @Override
    public String getRecommendation() {
        return super.getRecommendation() + "General Recommendation";
    }
}
