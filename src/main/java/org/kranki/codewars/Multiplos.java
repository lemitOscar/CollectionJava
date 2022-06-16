package org.kranki.codewars;

public class Multiplos {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    static int solution(int number) {
        int c = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                c += i;//sumando
            }
        }
        return c;
    }
}
