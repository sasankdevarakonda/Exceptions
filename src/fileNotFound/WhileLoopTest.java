package fileNotFound;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WhileLoopTest {
    public static void main(String[] args) {

                while (true) {
                    try {
                        FileInputStream fis = new FileInputStream("D:\\WhileTest\\sasi");
                        processFile();
                        fis.close();
                        break;
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found, retrying in 1 minute...");
                        System.out.println(e.getMessage());
                        try {
                            Thread.sleep(1 * 60 * 1000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        break;
                    }
                }
            }

            private static void processFile() throws FileNotFoundException {
                File file = new File("D:\\WhileTest\\sasi");
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                System.out.println("File found! Processing...");
            }
        }

