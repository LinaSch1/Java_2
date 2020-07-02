package Homework2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public void arraySize(int length, int width){
        int arrayLength = length;
        int arrayWidth = width;
        if (arrayLength != 4){
            throw new ArrayIndexOutOfBoundsException("Неверная длина массива");
        } else if (arrayWidth != 4){
            throw new ArrayIndexOutOfBoundsException("Неверная ширина массива");
        }
    }

}
