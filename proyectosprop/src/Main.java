
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número a utilizar en lugar del 0: ");
        String replaceNum = scanner.nextLine() + "_";

        String folderPath = "C:\\Users\\Reisel_Rol_7\\Documents\\AutoItem\\Resultado";
        File folder = new File(folderPath);
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
                String filename = file.getName();
                if (filename.contains("0_")) {
                    String newFilename = filename.replace("0_", replaceNum);
                    File newFile = new File(folderPath + "\\" + newFilename);
                    file.renameTo(newFile);
                    System.out.println("El archivo " + filename + " se ha renombrado como " + newFilename);
                }
            }
        }
    }
}
