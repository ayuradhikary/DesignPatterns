package BehavioralDesignPatterns.IteratorDesignPattern;

public class IteratorDesignPatternClient {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        NumberCollection numberCollection = new NumberCollection(numbers);
        Iterator iterator = numberCollection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
