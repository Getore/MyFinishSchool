package com.bootdo.ocr;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author shenli
 * @email
 * @createDate 2019/5/2 21:03
 */
public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "16158105";
    public static final String API_KEY = "94CyyquazPNcA1m5Tp97AO7t";
    public static final String SECRET_KEY = "NF0FnTdGniPkCMoCxGQdYE2A0kDQnPro";

    public static int txtNum = 1;
    public static int photoNum = 1;
    private static String outputFile = "F:\\BigStudyGraduation\\MyFinishSchool\\bootdo\\src\\main\\java\\com\\bootdo\\ocr\\txt\\" + 4 + ".txt";

    public static void main(String[] args) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "log4j.properties");

        // 调用接口
        String path = "F:\\BigStudyGraduation\\MyFinishSchool\\bootdo\\src\\main\\java\\com\\bootdo\\ocr\\photo\\" + 4 + ".jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());

        Photo ph = new Photo();
        ph.setLog_id(res.getLong("log_id"));
        ph.setWords_result_num(res.getInt("words_result_num"));
        ArrayList<Photo.WordsResultBean> words = new ArrayList<>();
        ph.setWords_result(words);

        JSONArray jsonArray2 = res.getJSONArray("words_result");
        for (int i=0; i<jsonArray2.length(); i++){
            JSONObject jsonObject3 = jsonArray2.getJSONObject(i);
            Photo.WordsResultBean wordsResultBean = new Photo.WordsResultBean();
            wordsResultBean.setWords(jsonObject3.getString("words"));
            String aaa = jsonObject3.getString("words");
            System.out.println(aaa);
        }
    }
}