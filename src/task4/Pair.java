package task4;

public class Pair<T, K> {

    T first;
    K second;

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" + first.toString() + "; " + second.toString() + '}';
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

}
