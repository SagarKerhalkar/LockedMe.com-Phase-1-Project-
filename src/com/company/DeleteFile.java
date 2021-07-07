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
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);
            System.out.println("Enter the file name wants to Delete With Extension( Like- .txt,.doc etc) :- ");
            String Nufil = FileName.nextLine();
            File Newfile = new File("D:\\LockedMe\\" + Nufil);

                       // for (Object S : listFile) {
            // boolean S = listFile.contains(Nufil);

//           if(FileDir.exists() && Newfile.getCanonicalPath().equals(listFile)){
            if(Newfile.delete()){
                Collections.sort(listFile) ;
                System.out.println(" Your Have Successfully delete the file - " + Nufil);
            } else {
                System.out.println("File Not Found Please write correct file name with extension ");
                return DeleteFile();
            }

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


