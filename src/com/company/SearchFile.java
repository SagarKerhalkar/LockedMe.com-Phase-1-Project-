package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchFile {
   public void SearchFile(){
        File FileDir = new File("D:\\LockedMe");
        List<String> listFile = Arrays.asList(FileDir.list());
        File[] filelist = FileDir.listFiles();
                if (FileDir.isDirectory()) {
                    Scanner SearchFile = new Scanner(System.in);
                    System.out.println("Enter the file name(File name is case sensitive) wants to Search With Extension( Like- .txt,.doc etc) :- ");
                    String serfil = SearchFile.nextLine();
                    File SerFile = new File("D:\\LockedMe\\" + serfil);

                    assert filelist != null;
                    for (File i : filelist) {
                        String SF = i.getName();
                        if (SF.equals(serfil)) {
                            System.out.println("Your File is = " + SerFile);
                        }

                    }
                    for (File j : filelist) {
                        String lF = j.getName();
                        if (lF == serfil) {
                        }
                        else {
                            System.out.println("File not Found ");
                            break;
                        }
                    }
                }
   }

    public static void main(String[] args) {
        SearchFile FSE = new SearchFile();
        FSE.SearchFile();

    }
}
