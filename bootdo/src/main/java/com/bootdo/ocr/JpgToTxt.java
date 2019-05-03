package com.bootdo.ocr;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author shenli
 * @email 15200831505@163.com
 * @createDate 2019/5/2 21:03
 * @function 将多个 jpg 的图片，转换成多个 txt 纯文本
 */
public class JpgToTxt {
    //设置APPID/AK/SK
    public static final String APP_ID = "16158105";
    public static final String API_KEY = "94CyyquazPNcA1m5Tp97AO7t";
    public static final String SECRET_KEY = "NF0FnTdGniPkCMoCxGQdYE2A0kDQnPro";

    public static void main(String[] args) throws IOException {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(20000);
        client.setSocketTimeoutInMillis(600000);
        System.setProperty("aip.log4j.conf", "log4j.properties");

        int txtNum = 1;
        int photoNum = 1;

        for (int j=0; j< 95; j++){
            String outputFile = "F:\\BigStudyGraduation\\MyFinishSchool\\bootdo\\src\\main\\java\\com\\bootdo\\ocr\\txt\\" + photoNum + ".txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            String path = "F:\\BigStudyGraduation\\MyFinishSchool\\bootdo\\src\\main\\java\\com\\bootdo\\ocr\\photo\\" + txtNum + ".jpg";
            JSONObject res = client.basicGeneral(path, new HashMap<String, String>());

//            Photo ph = new Photo();
//            ph.setLog_id(res.getLong("log_id"));
//            ph.setWords_result_num(res.getInt("words_result_num"));
//            ArrayList<Photo.WordsResultBean> words = new ArrayList<>();
//            ph.setWords_result(words);

            JSONArray jsonArray2 = res.getJSONArray("words_result");
            for (int i=0; i<jsonArray2.length(); i++){
                JSONObject jsonObject3 = jsonArray2.getJSONObject(i);
                Photo.WordsResultBean wordsResultBean = new Photo.WordsResultBean();
                wordsResultBean.setWords(jsonObject3.getString("words"));
                String word = jsonObject3.getString("words");
                bw.write(word);
                bw.newLine();

            }
            bw.close();

            txtNum++;
            photoNum++;
        }
    }
}