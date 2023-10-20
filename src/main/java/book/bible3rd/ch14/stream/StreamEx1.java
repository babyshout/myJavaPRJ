package book.bible3rd.ch14.stream;

import java.util.*;
import java.util.stream.*;

class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student01> studentStream = Stream.of(
                new Student01("이자바", 3, 300),
                new Student01("김자바", 1, 200),
                new Student01("안자바", 2, 100),
                new Student01("박자바", 2, 150),
                new Student01("소자바", 1, 200),
                new Student01("나자바", 3, 290),
                new Student01("감자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student01::getBan) // 반별 정렬
                        .thenComparing(Comparator.naturalOrder()))    // 기본 정렬
                .forEach(System.out::println);
    }
}

class Student01 implements Comparable<Student01> {
    String name;
    int ban;
    int totalScore;

    Student01(String name, int ban, int totalScore) {
        this.name =name;
        this.ban =ban;
        this.totalScore =totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName()     { return name;}
    int getBan()         { return ban;}
    int getTotalScore()  { return totalScore;}

    // 총점 내림차순을 기본 정렬로 한다.
    public int compareTo(Student01 s) {
        return s.totalScore - this.totalScore;
    }
}