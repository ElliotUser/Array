package exc02;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr  = new LowArray(15);
        int nElems = 0;
        int j;

        arr.setElem(0,10);
        arr.setElem(1,20);
        arr.setElem(2,55);
        arr.setElem(3,88);
        arr.setElem(4,66);
        nElems = 5;

        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();

        int searchkey = 88;
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == searchkey)
                break;
        }
        if (j == nElems)
            System.out.println("Cant found "+ searchkey);
        else
            System.out.println("Found "+ searchkey);

        //Remove element 55
        for (j = 0; j < nElems; j++) {
            if (arr.getElem(j) == 55)
                break;
        }
        for (int k = j; k < nElems; k++) {
            arr.setElem(k, arr.getElem(k+1));
        }
        nElems--;

        for ( j = 0; j < nElems; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println();
    }
}
