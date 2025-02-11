package BehavioralDesignPatterns.IteratorDesignPattern;

//concreate Aggregate
public class NumberCollection implements Aggregate{
   private int[] numbers;

    public NumberCollection(int[] numbers){
        this.numbers = numbers;
    }

    @Override
    public Iterator createIterator() {
       return new NumberIterator(numbers);
    }
}
