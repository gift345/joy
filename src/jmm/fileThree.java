package jmm;

import javax.swing.*;

public class fileThree {
    public static void main(String[] args) {
        String[] watu;
        String output;
        watu = new String[5];
        watu[0] = "seffu";
        watu[1] = "clare";
        watu[2] = "wanyama";
        watu[3] = "nelly";
        watu[4] = "jian";
        output = watu[0]+"\n"+watu[1]+"\n"+watu[2]+"\n"+watu[3]+"\n"+watu[4];
        JOptionPane.showMessageDialog(null,output);
    }
}
