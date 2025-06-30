package exception.ex1.baisc.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCath();
        System.out.println("정상 종료");
    }
}
