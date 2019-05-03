package com.bootdo.ocr;

import java.util.List;

/**
 * @author shenli
 * @email
 * @createDate 2019/5/2 22:06
 */
public class Photo {

    /**
     * log_id : 2341361152978856002
     * words_result : [{"words":"GB/T16751.3-1997"},{"words":"4.6疏表通经"},{"words":"通过使用方药,或推拿、外治等,达到疏散表邪舒畅经气目的的治疗方法。主要适用于外邪束表,"},{"words":"经气不利的病证"},{"words":"4.7解表宣肺"},{"words":"具有发散表邪,宣发肺气作用,适用于邪在肺卫所致风寒袭肺证、风寒闭肺证的治疗方法。"},{"words":"4.8调和营卫"},{"words":"通过解散风邪以治卫气,收敛益阴以治营气,使营卫恢复正常协调状态,适用于营卫不和证的治疗"},{"words":"方法。"},{"words":"4.9祛湿解表"},{"words":"具有解散表邪、芳香化湿作用,适用于风湿袭表证的治疗方法。"},{"words":"4.10埋气解表"},{"words":"发散解表药与调埋气机药并用,适用于外有表邪、内有气滞证候的治疗方法。"},{"words":"4.11扶正解表"},{"words":"泛指发散解表药与补养气血阴阳药并用,适用于气虚外感证、血虚外感证等的治疗方法。"},{"words":"4.11.7益气解表"},{"words":"解表药与补气药并用,适用于气虚外感证的治疗方法"},{"words":"4.11.2养血解表"},{"words":"解表药与补血药并用,适用于血虚外感证的治疗方法。"},{"words":"4.11.3滋阴解表二发汗]"},{"words":"解表药与滋阴药并用,适用于阴虚外感证的治疗方法"},{"words":"4.11.4助阳解表L发汗"},{"words":"解表药与温阳药并用,适用于阳虚外感证的治疗方法"},{"words":"4.11.5温经解表_发汗]"},{"words":"具有辛温解表与温通经脉作用,适用于风寒袭络、寒胜痛痹等证的治疗方法。"},{"words":"5涌吐法"},{"words":"5.1涌吐痰涎"},{"words":"通过催吐而达到祛除痰涎作用,适用于痰浊壅盛而病位偏上的病症的治疗方法。"},{"words":"5.2涌吐风痠"},{"words":"通过催吐而达到祛除痰涎作用,适用于风痰壅盛证的治疗方法。"},{"words":"5.3涌吐痰食"},{"words":"通过催吐而达到祛除痰食作用,适用于痰食互结证的治疗方法"},{"words":"5.4涌吐宿食"},{"words":"通过催吐而达到祛除宿食作用,适用于食积证的治疗方法。"},{"words":"5.5开关涌吐"},{"words":"通过催吐而达到开窍通闭作用,适用于痰浊壅盛所致神昏等的治疗方法。"},{"words":"同义词:涌吐开关"},{"words":"6攻下法"},{"words":"6.1清热[泻火]攻下[通腑J通便]"},{"words":"清热药与攻下药并用,适用于大肠热结证的治疗方法。"},{"words":"同义词:苦寒攻[通]下;峻下热结"},{"words":"6.2泻结行滞"},{"words":"4"}]
     * words_result_num : 43
     */

    private long log_id;
    private int words_result_num;
    private List<WordsResultBean> words_result;

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public int getWords_result_num() {
        return words_result_num;
    }

    public void setWords_result_num(int words_result_num) {
        this.words_result_num = words_result_num;
    }

    public List<WordsResultBean> getWords_result() {
        return words_result;
    }

    public void setWords_result(List<WordsResultBean> words_result) {
        this.words_result = words_result;
    }

    public static class WordsResultBean {
        /**
         * words : GB/T16751.3-1997
         */

        private String words;

        public String getWords() {
            return words;
        }

        public void setWords(String words) {
            this.words = words;
        }
    }
}