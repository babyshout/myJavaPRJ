package book.bible.ch10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    System.out.println("actionEvent occurred!!!");
                                }
                            }   //익명 클래스의 끝
        );
        
    }   //main메서드의 끝
}   //InnerEx8클래스의 끝
