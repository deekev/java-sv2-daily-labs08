package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int numberOfRandoms, int origin, int bound) {
        Random random = new Random();
        for (int i = 0; i < numberOfRandoms; i++) {
            int number = random.nextInt(origin, bound + 1);
            numbers.add(number);
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        double averege = getAverage();
        for (int i: numbers) {
            if (Math.abs(averege - i) <= value) {
                result.add(i);
            }
        }
        return result;
    }

    private double getAverage() {
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return (double) sum / numbers.size();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}