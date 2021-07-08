package com.company;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DeleteFile {
    public String DeleteFile() throws IOException {
    //public static String main(String[] args) {

    //public static String main(String[] args) throws IOException {
        File FileDir = new File("D:\\LockedMe");
        List<String> listFile = Arrays.asList(FileDir.list());
        File[] filenamelist = FileDir.listFiles();
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);

            System.out.println("Enter the file name wants to Delete With Extension( Like- .txt,.doc etc) :- ");
            String Nufil = FileName.nextLine();
            File Newfile = new File("D:\\LockedMe\\" + Nufil);
            //System.out.println(Newfile);
            //boolean test;
            for (File i : filenamelist) {
//              System.out.println( i );
                String FN = i.getName();
//              String M= FN.toLowerCase();
//              //String N = Nufil.toLowerCase();
//               System.out.println(FN);
//               //test = M.equals(N);
                if (FN.equals(Nufil)) {
                    if (Newfile.delete()) {

                        System.out.println(" Your Have Successfully delete the file - " + Nufil);
                        return null;

                    }}  }
            System.out.println("File Not Found Please write correct file name with extension ");
            return DeleteFile();

//                } else {
//                    System.out.println("File Not Found Please write correct file name with extension ");
//                    return DeleteFile();
//                }

        }



        else {
            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        DeleteFile Def = new DeleteFile();
        Def.DeleteFile();
    }
}


