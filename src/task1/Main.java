package task1;

public class Main {
    public static void main(String[] args) {

        GenericArray<Integer> arrayInteger = new GenericArray<>();
        System.out.println("-----Integer-----");
        arrayInteger.add(1);
        arrayInteger.add(2);
        arrayInteger.add(3);
        arrayInteger.add(4);
        arrayInteger.add(5);
        GenericArray.GenericIterator genericIntIterator =
                arrayInteger.new GenericIterator<>(arrayInteger.arr);
        while (genericIntIterator.hasNext()) {
            System.out.println(genericIntIterator.next());
        }

        GenericArray<String> arrayString = new GenericArray<>();
        System.out.println("-----String-----");
        arrayString.add("one");
        arrayString.add("two");
        arrayString.add("three");
        GenericArray.GenericIterator genericStringIterator =
                arrayString.new GenericIterator<>(arrayString.arr);
        while (genericStringIterator.hasNext()) {
            System.out.println(genericStringIterator.next());
        }
    }

}