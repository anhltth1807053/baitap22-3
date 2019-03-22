package controller;

import entity.Foods;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private static ArrayList<Foods> list = new ArrayList<>();

    public static void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã món ăn:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mô tả: ");
        String description = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày tạo: ");
        String createAt = scanner.nextLine();
        Foods foods = new Foods(id, name, description, price, createAt);
        list.add(foods);
        System.out.println("Đã thêm thành công.");
    }

    public static void printfList() {
        if (list == null || list.size() == 0){
            System.out.println("Hiện tại ko có món ăn nào.");
            return;
        }
        System.out.printf("%15s %15s %15s %15s\n", "Mã món ăn","Tên món ăn","Giá","Ngày bán");
        for (Foods foods :list){
            System.out.println(foods.toString());
        }
    }
}
