import java.util.LinkedList;
import java.util.Queue;

package com.timeseries;


public class MovingAverage {
    private final int windowSize;
    private final Queue<Double> window;
    private double sum;

    public MovingAverage(int windowSize) {
        if (windowSize <= 0) {
            throw new IllegalArgumentException("Window size must be positive");
        }
        this.windowSize = windowSize;
        this.window = new LinkedList<>();
        this.sum = 0.0;
    }

    public double next(double value) {
        if (window.size() == windowSize) {
            sum -= window.poll();
        }
        window.offer(value);
        sum += value;
        return sum / window.size();
    }

    public int getWindowSize() {
        return windowSize;
    }
}