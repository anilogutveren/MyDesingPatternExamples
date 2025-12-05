package com.training.mydesignpatternexamples.Structural_Patterns.DecoratorPattern;

public class RecommendationsUtil {

    public static String getRecommendation(String recommendationType) {
        if (recommendationType.contains("General")) {
            return "General Recommendation";
        } else if (recommendationType.contains("Personal")) {
            return "Personal Recommendation";
        } else {
            return "No Recommendation";
        }
    }
}
