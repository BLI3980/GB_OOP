public class HW03 {
    public static void main(String[] args) {
        LinkList<String> stringLinkList = new LinkList<>();
        stringLinkList.addData("One");
        stringLinkList.addData("Four");
        stringLinkList.addData("Six");
        stringLinkList.addData("Eight");
        for (String element: stringLinkList) {
            System.out.println(element);
        }
    }
}
