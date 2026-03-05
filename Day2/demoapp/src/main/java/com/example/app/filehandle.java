package com.example.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class filehandle {
    public void ScannerWay(){
        String filePath = "names.txt";
        File f = new File(filePath);
        try {
            Scanner sc = new Scanner(f);
            if(!sc.hasNext()) {
                System.out.println("No data found in file "+ filePath);
            }
            while(sc.hasNext()){
                System.out.print(sc.next());
            }
            sc.close();
        } catch(FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
    }
    public void fr() {
        try {
            FileReader fr = new FileReader(new File("src/main/java/com/example/app/names.txt"));
            while(fr.ready()) {
                System.out.print((char)fr.read());
            }
            fr.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File f = new File("src/main/java/com/example/app/names.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Aryan Kumar");
            fw.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
