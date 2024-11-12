package com.training.mydesignpatternexamples.Structural_Patterns.DecoratorPattern;

public class PersonalRecommendation implements Recommendation {

    private String recommendationType;

    public PersonalRecommendation(String recommendationType) {
        this.recommendationType = recommendationType;
    }

    @Override
    public String getRecommendation() {
        return "Personal Recommendation";
    }




}
