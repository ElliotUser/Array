package exc05;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray array = new ClassDataArray(100);

        array.insert("Evans", "Patty", 24);
        array.insert("Yee", "Tom", 21);
        array.insert("Iris", "Po", 37);
        array.insert("Polsky", "Ivan", 66);
        array.insert("Jenkins", "Ivan", 44);
        array.insert("Enjoy", "Tytty", 11);
        array.insert("Filisson", "Sergo", 56);
        array.insert("Bond", "Jamis", 45);
        array.insert("Tramp", "Donald", 55);

        array.display();

        String searchName = "Tramp";
        Person found;
        found = array.find(searchName);
        if (found != null){
            System.out.print("Found ");
            found.displayPerson();
        }
        else
            System.out.println("Can't find " + searchName);
        System.out.println();

        System.out.println("Deleting Fillisson, Yee, and Enjoy ");
        array.delete("Fillison");
        array.delete("Yee");
        array.delete("Enjoy");

        array.display();
    }
}
