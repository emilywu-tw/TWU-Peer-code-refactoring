package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float average = 0;

        for(int i = 0; i < rectangles.length; i++){

            average += rectangles[i].area();
        }
        float av = average/rectangles.length;
        return av;
    }
}
