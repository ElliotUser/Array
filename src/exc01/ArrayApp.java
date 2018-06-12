package exc01;

public class ArrayApp {
    public static void main(String[] args) {

        long [] arr = new long[10];
        int nElems = 0;
        int j;
        long searchkey;

        arr[0]=77;
        arr[1]=5;
        arr[2]=11;
        arr[3]=2;
        arr[4]=7;
        arr[5]=21;
        arr[6]=65;
        nElems = 7;

        for ( j = 0; j < nElems; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
//----------------------------------------------------

        searchkey = 5;
        for ( j = 0; j < nElems; j++) {
            if (arr[j] == searchkey)
                break;
        }
        if (j==nElems){
            System.out.println("Cant found "+ searchkey);
        }else
            System.out.println("Found "+ searchkey);
//-----------------------------------------------------

        searchkey = 11;
        for ( j = 0; j < nElems; j++) {
           if (j == searchkey)
               break;
        }
        for (int k = j;k < nElems-1;k++){
            arr[k] = arr[k+1];
        }
        nElems--;
//-----------------------------------------------------
        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
