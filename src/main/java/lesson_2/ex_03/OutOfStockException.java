package lesson_2.ex_03;

public class OutOfStockException extends Exception {

    private String name;



    private String errorMessage;

    public OutOfStockException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
       return super.getMessage();
    }

}
