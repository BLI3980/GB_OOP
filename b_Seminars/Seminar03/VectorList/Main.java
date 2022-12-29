package VectorList;

public class Main {
    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList();
        vectorList.addElement(1);
        vectorList.addElement(4);
        vectorList.addElement(6);
        vectorList.addElement(2);
        for (Integer item: vectorList) {
            System.out.println(item);
        }
        System.out.println();

        VectorList<String> stringVectorList = new VectorList<String>();
        stringVectorList.addElement("One");
        stringVectorList.addElement("Ten");
        stringVectorList.addElement("Four");
        stringVectorList.addElement("Six");
        for (String item: stringVectorList) {
            System.out.println(item);
        }


    }
}
