package com.company;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DeleteFile {
    public String DeleteFile() throws IOException {
            File FileDir = new File("D:\\LockedMe");
        List<String> listFile = Arrays.asList(FileDir.list());
        File[] filenamelist = FileDir.listFiles();
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);

            System.out.println("Enter the file name(File name is case sensitive) wants to Delete With Extension( Like- .txt,.doc etc) :- ");
            String Nufil = FileName.nextLine();
            File Newfile = new File("D:\\LockedMe\\" + Nufil);
            for (File i : filenamelist) {
                String FN = i.getName();
                if (FN.equals(Nufil)) {
                    if (Newfile.delete()) {

                        System.out.println(" Your Have Successfully delete the file - " + Nufil);
                        return null;

                    }}  }
            System.out.println("File Not Found Please write correct file name with extension ");
            return null;
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


