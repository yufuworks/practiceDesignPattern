package com.example;

import java.util.List;

import com.example.factory.Factory;
import com.example.factory.Product;
import com.example.pc.PcFactory;

public final class App {    
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // Factoryインスタンスの生成
        Factory factory = new PcFactory();

        // Productを作る
        Product pc1 = factory.create("A001");
        Product pc2 = factory.create("A002");
        Product pc3 = factory.create("A003");

        // 改行
        System.out.println();
        
        // Productを使う
        pc1.use();
        pc2.use();
        pc3.use();
        
        // 改行
        System.out.println();

        List<String> serialNumberList = ((PcFactory) factory).getSerialNumberList();
        for (int i = 0; i < serialNumberList.size(); i++) {
            System.out.println("serialNumber" + i + "は" + serialNumberList.get(i) + "です");
        }
        
    }
}
