package com.company;

import java.io.File;
import java.util.*;

public class ShowFile{

   public void ShowFile() {
//       dicPath dipath = new dicPath();
//       String na =dipath.dirpath();
         File FileDir = new File("D:\\LockedMe");
        if (FileDir.isDirectory()){
            List<String> listFile = Arrays.asList(FileDir.list());
            System.out.println("All File Name Are - ");
//            for ( Object S : listFile){
//                System.out.println(S);
//            }
//            System.out.println("________________||_____________________");
            Collections.sort(listFile);
            for (Object S : listFile){
                System.out.println(S);
                System.out.println("File Path - "+FileDir.getAbsoluteFile()+"\\"+S);
            }
        }
        else {
            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or foldr  ");
        }

    }

    public static void main(String[] args) {
        ShowFile NewSWF = new ShowFile();
        NewSWF.ShowFile();
    }
}
