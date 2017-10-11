package com.beyond_h.ota.week03.Models;

import java.util.Date;

public class ResultModel {
    private long startTime;
    private long endTime;
    private long[] numbers;

    public long[] getNumbers() {
        return numbers;
    }

    public void setNumbers(long[] numbers) {
        this.numbers = numbers;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
}
