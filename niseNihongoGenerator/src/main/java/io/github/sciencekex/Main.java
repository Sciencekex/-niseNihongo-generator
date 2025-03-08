package io.github.sciencekex;

import io.github.sciencekex.Utils.NiseNihongo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("伪日本语生成器");
        NiseNihongo converter = new NiseNihongo();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("请输入中文汉字 (输入 'exit' 退出): ");
                String kanji = scanner.nextLine();

                if ("exit".equalsIgnoreCase(kanji)) {
                    System.out.println("退出程序。");
                    break;
                }

                String kanaOutput = converter.convertToKana(kanji);
                System.out.println("假名输出: " + kanaOutput);
            }
        }
    }
}