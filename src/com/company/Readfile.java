package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
    public static void main(String[] args) throws FileNotFoundException {
        File FileDir = new File("D:\\LockedMe");
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);
            System.out.println("Enter the file name for read, with Extension( Like- .txt,.doc etc) :- ");
            String RF = FileName.nextLine();
            File Redfile = new File("D:\\LockedMe\\" + RF);
            Scanner sc = new Scanner(Redfile);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            System.out.println(" ");
            sc.close();
        }
    }
}
