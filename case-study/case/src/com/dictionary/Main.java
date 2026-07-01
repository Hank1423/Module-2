package com.dictionary;

import com.dictionary.config.AppConstant;
import com.dictionary.controller.DictionaryController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionaryController controller = new DictionaryController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Xây dựng từ điển");
        System.out.println("Các lệnh: lookup [từ], define [loại] [từ], drop [từ], export [đường-dẫn]");
        System.out.println("Gõ '" + AppConstant.EXIT_COMMAND + "' để thoát.");
        System.out.println("--------------------------------------------");

        while (true) {
            System.out.print("Hành Động: ");
            String Input = scanner.nextLine();

            if (Input.trim().equalsIgnoreCase(AppConstant.EXIT_COMMAND)) {
                System.out.println("Tạm biệt!");
                break;
            }

            if (!Input.isBlank()) {
                controller.processRequest(Input);
            }
        }
        scanner.close();
    }
}