package com.company;

import sun.rmi.runtime.NewThreadAction;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AddNewFile {
    //public AddNewFile() throws IOException {
    public static void main(String[] args) throws IOException {
        File FileDir = new File("D:\\LockedMe");
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);
            System.out.println("Enter the file name with Extantion( Like- .txt,.doc etc) :- ");
            String Nufil = FileName.nextLine();
            File Newfile = new File("D:\\LockedMe\\" + Nufil);
            Newfile.createNewFile();
            System.out.println(" Your File is Created Successfully ,Name of Your file is - " + Nufil);
        }
        else {
            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
        }
    }
}
