package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Convert {
public static void main(String[] args) {
    String sourceName = "firstfile.txt";
    try {
    Path source = FileSystems.getDefault().getPath(sourceName);
    Path temp = FileSystems.getDefault().getPath("tmp_" + sourceName);
    FileReader fr = new FileReader(source.toFile());
    BufferedReader in = new BufferedReader(fr);
    FileWriter fw = new FileWriter(temp.toFile());
    BufferedWriter out = new BufferedWriter(fw);
    boolean eof = false;
    int inChar;
    do {
    inChar = in.read();
    if (inChar != -1) {
        char outChar = Character.toUpperCase((char) inChar);
        out.write(outChar);
    } else{
        eof = true;
    } while (!eof);
    in.close();
    out.close();
    FileOutputStream writer = new FileOutputStream("firstfile.txt");
    writer.write(("").getBytes());
    writer.close();
    source = FileSystems.getDefault().getPath(sourceName);
    temp = FileSystems.getDefault().getPath("tmp_" + sourceName);
    fr = new FileReader(temp.toFile());
    in = new BufferedReader(fr);
    fw = new FileWriter(source.toFile());
    out = new BufferedWriter(fw);
    eof = false;
    int nChar;
    do {
        nChar = in.read();
        if (nChar != -1) {
            char outChar = Character.toUpperCase((char) nChar);
            out.write(outChar);
        } else{
            eof = true;
        } while (!eof);
        //out.write("TOLD YOU ALREADY. Boom, nailed it!!");
        in.close();
        out.close();
        Files.delete(temp);
    } catch (IOException | SecurityException se) {
        System.out.println("Error -- " + se.toString());
    }
    }
}