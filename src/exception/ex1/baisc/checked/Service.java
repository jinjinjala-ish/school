package exception.ex1.baisc.checked;

public class Service {
    Client client = new Client();


    //예외를 잡아서 처리하는 코드
    public void callCath() {

        try {
            client.call();//call()메서드에서 예외가 발생하고 메서드를 호출한 곳 callCath() 메서드로 예외를 던짐.
        } catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    //체크 예외를 밖으로 던지는 코드
    //체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 함
    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}