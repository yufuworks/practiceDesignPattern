package com.example;

import java.util.ArrayList;
import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        // 社員一覧の作成
        List<Employee> employeeList = new ArrayList<>();
        
        Employee yamada = new Employee("山田太郎", 30, "営業部");
        employeeList.add(yamada);

        Employee tanaka = new Employee("田中花子", 28, "総務部");
        employeeList.add(tanaka);

        // CSV作成
        CsvBuilder csvBuilder = new CsvBuilder();
        Director csvDirector = new Director(csvBuilder);

        csvDirector.construct(employeeList);

        String csv = csvBuilder.getResult();
        System.out.println(csv);
        System.out.println();

        // テキストファイル作成
        TextBuilder textBuilder = new TextBuilder();
        Director textDirector = new Director(textBuilder);

        textDirector.construct(employeeList);

        String textFile = textBuilder.getResult();
        System.out.println(textFile + "を作成しました");
        System.out.println();

    }
}
