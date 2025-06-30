package exception.ex1.baisc.unchecked;

public class Client { //throws 안 적어도 됨
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
