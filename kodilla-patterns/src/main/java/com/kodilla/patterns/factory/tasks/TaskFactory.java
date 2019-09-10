package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("The driving task", "go ahead", "car");
            case PAINTING:
                return new PaintingTask("The painting task", "Pink", "image");
            case SHOPPING:
                return new ShoppingTask("The shopping task", "coffee", 5);
            default:
                return null;
        }

    }
}
