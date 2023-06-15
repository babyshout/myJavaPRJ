package designPattern.structural.proxy;

// Subject 인터페이스
interface Image {
    void display();
}

// RealSubject 클래스
class RealImage implements Image {
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }
    
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Proxy 클래스
class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;
    
    public ProxyImage(String filename) {
        this.filename = filename;
    }
    
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

// 클라이언트 코드
public class ProxyPattern01 {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");
        
        // 실제 이미지 로딩이 필요한 시점에 display() 호출
        image.display();
        
        // 이미지 로딩이 이미 완료되어 display() 호출 시 로딩 과정을 거치지 않음
        image.display();
    }
}
