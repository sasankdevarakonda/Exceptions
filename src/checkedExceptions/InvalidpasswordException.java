package checkedExceptions;

public class InvalidpasswordException extends Exception {
    private String errorCode;

    public InvalidpasswordException(String password,String message){
        super(message);
        this.errorCode=password;

    }
    public String geterrorCode(){

        return errorCode;
    }
}
