package designPattern.behavioral.chainOfResponsibility;
// Handler 인터페이스
interface Handler {
    void setNext(Handler next);
    void handleRequest(Request request);
}

// 실제 처리를 담당하는 ConcreteHandler1 클래스
class ConcreteHandler1 implements Handler {
    private Handler next;
    
    public void setNext(Handler next) {
        this.next = next;
    }
    
    public void handleRequest(Request request) {
        if (request.getType().equals("Type1")) {
            System.out.println("ConcreteHandler1 handles the request.");
            // 요청 처리 로직 작성
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

// 실제 처리를 담당하는 ConcreteHandler2 클래스
class ConcreteHandler2 implements Handler {
    private Handler next;
    
    public void setNext(Handler next) {
        this.next = next;
    }
    
    public void handleRequest(Request request) {
        if (request.getType().equals("Type2")) {
            System.out.println("ConcreteHandler2 handles the request.");
            // 요청 처리 로직 작성
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

// 요청 객체
class Request {
    private String type;
    
    public Request(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
}

// 클라이언트
public class ChainOfResponsibility01 {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        
        handler1.setNext(handler2);
        
        Request request1 = new Request("Type1");
        Request request2 = new Request("Type2");
        
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}
