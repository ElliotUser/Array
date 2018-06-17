package exc04;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);

        array.insert(2);
        array.insert(58);
        array.insert(22);
        array.insert(34);
        array.insert(80);
        array.insert(78);
        array.insert(15);

        int searchaKey = 80;
        if (array.find(searchaKey) != array.size())
            System.out.println("Found " +searchaKey );
        else
            System.out.println("Can't find "+ searchaKey);

        array.display();

        array.delete(58);
        array.delete(78);
        array.delete(00);

        array.display();
    }
}
