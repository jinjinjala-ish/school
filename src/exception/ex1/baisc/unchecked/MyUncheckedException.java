package exception.ex1.baisc.unchecked;


//RuntimeException을 상속받은 예외는 언체크 예외가 됨
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
