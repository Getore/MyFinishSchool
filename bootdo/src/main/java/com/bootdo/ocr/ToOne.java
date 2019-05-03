package com.bootdo.ocr;

import java.io.*;

/**
 * @author shenli - XD02551
 * @email 15200831505@163.com
 * @createDate 2019/5/3 15:02
 * @function 将多个 txt 文本合并成一个文本
 */
public class ToOne {

    public static void main(String[] args) throws IOException {
        String FileOut="F:\\BigStudyGraduation\\MyFinishSchool\\bootdo\\src\\main\\java\\com\\bootdo\\ocr\\treatment\\TreatmentTherapy.txt";
        BufferedWriter bw=new BufferedWriter(new FileWriter(FileOut));

        for (int i = 4; i <= 62; i++) {
            String num = Integer.toString(i);
            String FileName = "F:\\BigStudyGraduation\\MyFinishSchool\\bootdo\\src\\main\\java\\com\\bootdo\\ocr\\txt\\" + num + ".txt";
//            String FileName="C:\\Users\\Administrator\\Desktop\\基础笔记\\day"+num+"笔记.md";
            File file=new File(FileName);
            if(file.exists()) {
                System.out.println(FileName);
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while((line=br.readLine())!=null) {
                    bw.write(line);
                    bw.newLine();
                }
                br.close();
            }
        }
        bw.close();
    }

}