package exc03;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);

        arr.insert(22);
        arr.insert(88);
        arr.insert(19);
        arr.insert(77);
        arr.insert(56);
        arr.insert(26);

        arr.display();

        int searchKey = 34;
        if (arr.find(searchKey)){
            System.out.println("Found "+searchKey);
        }
        else
            System.out.println("Cant find " + searchKey);

        arr.delete(77);

        arr.display();
    }
}
