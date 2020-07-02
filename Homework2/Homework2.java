package Homework2;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        MyArraySizeException arraySizeException = new MyArraySizeException();
        arraySizeException.arraySize(4, 4);
        MyArrayDataException numberFormatException = new MyArrayDataException();
        numberFormatException.dataException(str);


        try {
            arrInNum(str);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
            System.out.println("Ошибка!");
        }


    }

    // Создаём метод, который возвращает числовой массив
    // int[][] с названием ArrInNum
    // В скобках передаём строковое значение str
    static int arrInNum(String a) throws MyArraySizeException, MyArrayDataException {
        String[] b = a.split("\n"); // сплит возвращает массив
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i].split(" ");
        }
        // Создаём массив из чисел
        int numArr[][] = new int[4][4];
        // цикл проходит по элементам массива строк
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // И переводит значения в числа
                numArr[i][j] = Integer.parseInt(arr[i][j]);
            }
        }
        //Считаем сумму элементов
        //и во вложенном цикле делим сумму на 2
            int sum1 = 0;
            int sum2 = 0;
            for (int x = 0; x < numArr.length; x++) {
                for (int y = 0; y < numArr.length; y++) {
                    sum1 += numArr[x][y];
                    sum2 = sum1/2;
                }
            }

        System.out.println(sum1);
        System.out.println(sum2);

            System.out.println(Arrays.deepToString(numArr));
            //возвращаем полученное значение
            return sum2;


    }
}