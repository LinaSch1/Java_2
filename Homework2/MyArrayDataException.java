package Homework2;

public class MyArrayDataException extends NumberFormatException{
    public void dataException(String matrix){
       // Integer.parseInt(matrix)
            throw new ArrayStoreException("Строка содердит недопустимы символы");

    }
}
