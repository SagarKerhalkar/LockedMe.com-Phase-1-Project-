import java.util.Scanner;

public class dicPath {
    public String dirpath() {
        Scanner Path = new Scanner(System.in);
        System.out.print("Please Write Folder Path Were File is Save (Like - D:\\LockedMe ,etc) :- ");
        String Dirctroypath = Path.nextLine();
        return Dirctroypath;
    }
}
