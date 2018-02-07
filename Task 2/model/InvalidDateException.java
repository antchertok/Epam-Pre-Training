package second.model;

public class InvalidDateException extends Exception{
    public InvalidDateException(){
    }
    public InvalidDateException(String message, Throwable cause){
        super(message, cause);
    }
    public InvalidDateException(String message){
        super(message);
    }
    public InvalidDateException(Throwable cause){
        super(cause);
    }
}
