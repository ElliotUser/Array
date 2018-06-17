package exc04;

public class OrdArray {

    private long[] a;
    private int nElems;

    public OrdArray(int max) {
    }

    public int size(){
        return nElems;
    }

//Используется метод двоичного поиска find()
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn ;

        while (true){
            curIn = (lowerBound + upperBound)/2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else{                                   //Деление диапазона
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;         //В верхней половине
                else
                    upperBound = curIn - 1;         //В нижней половине
            }
        }
    }

    public void insert(long value){                 //Вставка элемента в массив
        int j;
        for ( j = 0; j < nElems; j++) {             //Определение позиции вставки(линейный поиск)
            if (a[j] == value)
                break;
        }
        for (int k = nElems; k > j ; k--) {              //Перемещение последующих элементов
            a[k] = a[k-1];
        }
        a[j] = value;                               //Вставка
        nElems++;                                   //Увеличение размера
    }

    public boolean delete(long value){
        int j = find(value);
        if (j == nElems)                            //Найти не удалось
            return false;
        else {                                      //Элемент найден
            for (int k = j; k < nElems ; k++)       //Перемещение последующих элементов
                a[k] = a[k+1];
            nElems--;                                   //Уменьшение размера
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElems ; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}
