package exam.kakao1stCompetition;

import java.util.Arrays;
import java.util.Scanner;

class PageFrame {
    String cityName;
    int count;
    
    public PageFrame(String cityName) {
        this.cityName = cityName;
    }
    
    {
        count = 0;
    }
    
    
    public void cacheHit() {
        count = 0;
    }
    
    public String getCityName() {
        return this.cityName;
    }
    
    public void frameReplace(String cityName) {
        this.cityName = cityName;
        this.count = 0;
    }
    
    public int getCount() {
        return count;
    }
    
    public void addCount(int i) {
        this.count += i;
    }
}

class VirtualMemoryPage {
    static int cacheHit = 1;
    static int cacheMiss = 5;
    int totalRuntime;
    PageFrame[] pageFrame;
    private final int cacheSize;
    
    int getTotalRuntime() {
        return totalRuntime;
    }
    
    VirtualMemoryPage() {
        this(0);
    }
    
    VirtualMemoryPage(int cacheSize) {
        this.cacheSize = cacheSize;
        this.totalRuntime = 0;
        this.pageFrame = new PageFrame[cacheSize];
    }
    
    public void reference(String cityName) {
        if(this.cacheSize == 0) {
            totalRuntime += 5;
            return;
        }
        if (isCacheHit(cityName)) {
            getPageFrame();
            System.out.println();
            return;
        } else {
            cacheMiss(cityName);
            getPageFrame();
            System.out.println();
            return;
        }
    }
    
    private void getPageFrame() {
        for (int i = 0; i < cacheSize; i++) {
            try {
                System.out.print(pageFrame[i].getCityName() + ", ");
            } catch (Exception e) {
                System.out.println(", not founded");
            }
        }
    }
    
    private boolean isCacheHit(String cityName) {
        for (int i = 0; i < cacheSize; i++) {
            try {
                if (pageFrame[i].getCityName().equals(cityName)) {
                    pageFrame[i].cacheHit();
                    for (int j = 0; j < cacheSize; j++) {
                        if (i != j) {
                            int a = pageFrame[j].getCount();
                        }
                    }
                    for (int j = 0; j < cacheSize; j++) {
                        if (i != j) {
                            pageFrame[j].addCount(1);
                        }
                    }
                    
                    this.totalRuntime += 1;
                    return true;
                }
            } catch (Exception e) {
                pageFrame[i] = new PageFrame(cityName);
                for (int j = 0; j < i; j++) {
                    if (i != j) {
                        pageFrame[j].addCount(1);
                    }
                }
//                this.totalRuntime += 1;
                this.totalRuntime += 5;
                return true;
            }
        }
        
        return false;
        
    }
    
    private void cacheMiss(String cityName) {
        totalRuntime += 5;
        int longestPageFrameIndex = 0;
        int maxCount = 0;
        
        for (int i = 0; i < cacheSize; i++) {
            if (pageFrame[i].getCount() > maxCount) {
                longestPageFrameIndex = i;
                maxCount = pageFrame[i].getCount();
            }
        }
        
        pageFrame[longestPageFrameIndex].frameReplace(cityName);
        
        for (int i = 0; i < cacheSize; i++) {
            if(i != longestPageFrameIndex){
                pageFrame[i].addCount(1);
            }
        }
        
        
    }
    
    
}


public class KakaoExam3rd {
    
    public String[] adjustInputCities(String input) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        
        input = input.replace("[", "");
        input = input.replace("]", "");
        System.out.println(input);
        input = input.replace("“", "");
        System.out.println(input);
        input = input.replace("”", "");
        System.out.println(input);
        input = input.replace("\t", "");
        System.out.println(input);
        
        String output[] = input.split(", ");
        for (int i = 0; i < output.length; i++) {
            output[i] = output[i].replace(" ", "");
        }
        
        return output;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cacheSize = sc.nextInt();
        VirtualMemoryPage page = new VirtualMemoryPage(cacheSize);
        
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        
        String input = sc.nextLine();
        
//        input = input.replace("[", "");
//        input = input.replace("]", "");
//        System.out.println(input);
//        input = input.replace("“", "");
//        System.out.println(input);
//        input = input.replace("”", "");
//        System.out.println(input);
//        input = input.replace("\t", "");
//        System.out.println(input);
        
        KakaoExam3rd myMain = new KakaoExam3rd();
        
        cities = myMain.adjustInputCities(input);
        
        
        System.out.println("cities : " + Arrays.toString(cities));
        
        for (int i = 0; i < cities.length; i++) {
            page.reference(cities[i]);
        }


//        List<String> list = new ArrayList<>(Arrays.asList(cities));
//
//
//        list.forEach(cityName -> {
//            page.reference(cityName);
//        });
        
        System.out.println(page.getTotalRuntime());
        
    }
}
