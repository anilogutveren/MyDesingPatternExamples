package com.training.mydesignpatternexamples.Structural_Patterns.DecoratorPattern;

/**
 * This class is the decorator class that implements the Recommendation interface
 * It has a constructor that takes in a Recommendation object
 * It has a getRecommendation method that returns the recommendation
 * It is the base class for the concrete decorators
 * It has a reference to the Recommendation object
 */
public class RecommendationDecorator implements Recommendation{

    private Recommendation recommendation;

    public RecommendationDecorator(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String getRecommendation() {
        return recommendation.getRecommendation();
    }
}
