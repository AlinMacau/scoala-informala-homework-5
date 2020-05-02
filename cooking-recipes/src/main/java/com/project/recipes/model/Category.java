package com.project.recipes.model;

public enum Category {
    SOUP("soup"),
    MAIN_DISH("main dish"),
    SALAD("salad"),
    DESSERT("dessert"),
    MISCELLANEOUS("miscellaneous");

    private final String displayName;



    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
