package BehavioralDesignPatterns.IteratorDesignPattern;

//concrete Iterator
public class NumberIterator implements Iterator {

    private int[] numbers;
    private int index = 0;

    public NumberIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return index < numbers.length;
    }

    @Override
    public int next() {
        return numbers[index++];
    }
}
