package Seminar_3;



class IncorrectValueException extends RuntimeException{
    public IncorrectValueException(String message) {
        super(message);
    }}
class EmptyStringException extends RuntimeException{
    public EmptyStringException(String message) {
        super(message);
    }
}

class ArrayCountElementException extends RuntimeException{
    public ArrayCountElementException(String message) {
        super(message);
    }
}
