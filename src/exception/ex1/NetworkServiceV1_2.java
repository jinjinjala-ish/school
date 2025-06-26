package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data){
        String address  = "http://example.com ";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        String connectResult = client.connect();
        //결과가 성공이 아니다 = 오류임
        //if문에 !connectResult.equals("success") 부정 조건을 넣는 것 대신 isError()메서드 사용
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return; //return이 되면 sendMessage 호출 안 됨
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return; //return이 되면 sendMessage 호출 안 됨
        }


        client.disconnect();
        }

    private static boolean isError(String connectResult){
        return !connectResult.equals("success");
    }
}
