package VectorList;

public class Main {
    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList();
        vectorList.add(1);
        vectorList.add(4);
        vectorList.add(6);
        vectorList.add(2);
        for (Integer item: vectorList) {
            System.out.println(item);
        }
        System.out.println();

        VectorList<String> stringVectorList = new VectorList<String>();
        stringVectorList.add("One");
        stringVectorList.add("Ten");
        stringVectorList.add("Four");
        stringVectorList.add("Six");
        for (String item: stringVectorList) {
            System.out.println(item);
        }


    }
}
