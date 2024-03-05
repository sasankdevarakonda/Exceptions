package unCheckedException;

public class InvalidpasswordException extends RuntimeException{
    private String errorCode;

    public InvalidpasswordException(String password,String message){
        super(message);
        this.errorCode=password;

    }
    public String geterrorCode(){

        return errorCode;
    }
}
