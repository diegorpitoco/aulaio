package br.com.utfpr.aulaio;

import java.io.File;

public class UsingIO {

    private static final String MY_FILE = "C:\\Users\\Diego Pitoco\\Documents\\ProjetoJava\\funcional\\src\\UTFPR"
            + File.separator + "file-using-io.txt";

    public UsingIO() {

        try {
            final File file = new File(MY_FILE);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(file.exists());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        writeFile();
        readFile();
    }

    private void readFile() {
    }

    private void writeFile() {
    }

    public static void main(String[] args) {

        new UsingIO();

    }

}
