package com.alphatica.genotick.genotick;

public enum Prediction {
    UP(1),
    DOWN(-1),
    OUT(0);
    private final int value;

    Prediction(int value) {
        this.value = value;
    }
    public static Prediction getPrediction(double change) {
        if(change > 0)
            return Prediction.UP;
        if(change < 0)
            return Prediction.DOWN;
        return Prediction.OUT;
    }

    public int getValue() {
        return value;
    }

    public double toProfit(double actualChange) {
        return actualChange * value;
    }

    public boolean isCorrect(double actualFutureChange) {
        return actualFutureChange * value > 0;
    }

    @Override
    public String toString() {
        return name();
    }
}
