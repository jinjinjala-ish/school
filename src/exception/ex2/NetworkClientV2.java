package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address){
        this.address = address;
    }

    public String connect()  throws  NetworkClientExceptionV2{
        //연결 실패
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }

        //연결 성공
        System.out.println(address + " 연결 성공");
        return "success";
    }


    public String send(String data){
        //연결 실패
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }

        //연결 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";

    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.equals("error1")) {
            connectError = true;
        }
        if (data.equals("error2")) {
            sendError = true;
        }
    }
}
