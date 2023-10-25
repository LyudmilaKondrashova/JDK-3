package task4;

public class Main {
    public static void main(String[] args) {

        Pair pair1 = new Pair<>(123, "Hello!");
        System.out.println("(" + pair1.getFirst() + ";" + pair1.getSecond() + ") -> " + pair1.toString());

        Pair pair2 = new Pair<>(5.55, -200);
        System.out.println("(" + pair2.getFirst() + ";" + pair2.getSecond() + ") -> " + pair2.toString());

        Pair pair3 = new Pair<>("Test", 'A');
        System.out.println("(" + pair3.getFirst() + ";" + pair3.getSecond() + ") -> " + pair3.toString());

        boolean flag = true;
        Pair pair4 = new Pair<>(flag, 145.55f);
        System.out.println("(" + pair4.getFirst() + ";" + pair4.getSecond() + ") -> " + pair4.toString());


    }

}