package come.codewithiqra;

import javax.swing.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
       File file = new File("D:\\Sample.txt");
        if(file.exists()){
            double bytes = file.length();
            System.out.println("File of size in bytes" + bytes);
        }

}}
