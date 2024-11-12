package com.training.mydesignpatternexamples.Structural_Patterns.DecoratorPattern;

public class GeneralRecommendation implements Recommendation {

    private String recommendationType;

    public GeneralRecommendation(String recommendationType) {
        this.recommendationType = recommendationType;
    }

    @Override
    public String getRecommendation() {
        return "General Recommendation";
    }
}
