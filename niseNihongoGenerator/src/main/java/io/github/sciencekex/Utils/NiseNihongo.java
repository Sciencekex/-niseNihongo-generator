package io.github.sciencekex.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class NiseNihongo {
    private static final HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();

    static {
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
    }

    public String chineseToPinyin(String text) {
        StringBuilder pinyin = new StringBuilder();
        for (char c : text.toCharArray()) {
            try {
                String[] pinyins = PinyinHelper.toHanyuPinyinStringArray(c, format);
                if (pinyins != null && pinyins.length > 0) {
                    pinyin.append(pinyins[0]).append(" ");
                } else {
                    pinyin.append(c);
                }
            } catch (BadHanyuPinyinOutputFormatCombination e) {
                pinyin.append(c);
            }
        }
        return pinyin.toString().trim();
    }

    public String kanjiToPinyinMain(String txt) {
        return chineseToPinyin(txt);
    }

    public Map<String, String> loadConversionRules() {
        Map<String, String> rules = new HashMap<>();
        rules.put( "a", "あ");
        rules.put( "ai", "あい");
        rules.put( "ang", "あん");
        rules.put( "ao", "あう");
        rules.put( "ba", "ば");
        rules.put( "bai", "ばい");
        rules.put( "bang", "ばん");
        rules.put( "bao", "ばう");
        rules.put( "bei", "べい");
        rules.put( "beng", "べん");
        rules.put( "bi", "び");
        rules.put( "bia", "びあ");
        rules.put( "biang", "びあん");
        rules.put( "biao", "びあう");
        rules.put( "bie", "びえ");
        rules.put( "bing", "びん");
        rules.put( "bo", "ぼ");
        rules.put( "bu", "ぶ");
        rules.put( "ca", "つぁ");
        rules.put( "cai", "つぁい");
        rules.put( "cang", "つぁん");
        rules.put( "cao", "つぁう");
        rules.put( "ceng", "つぇん");
        rules.put( "ci", "つぃ");
        rules.put( "cong", "つぉん");
        rules.put( "cou", "つぉう");
        rules.put( "cu", "つ");
        rules.put( "cuan", "つあん");
        rules.put( "cui", "つえい");
        rules.put( "cuo", "つお");
        rules.put( "da", "だ");
        rules.put( "dai", "だい");
        rules.put( "dang", "だん");
        rules.put( "dao", "だう");
        rules.put( "dei", "でい");
        rules.put( "deng", "でん");
        rules.put( "di", "でぃ");
        rules.put( "dia", "でぃあ");
        rules.put( "dian", "でぃあん");
        rules.put( "diao", "でぃあう");
        rules.put( "die", "でぃえ");
        rules.put( "ding", "でぃん");
        rules.put( "diu", "でゅよ");
        rules.put( "dong", "どん");
        rules.put( "dou", "どう");
        rules.put( "du", "どぅ");
        rules.put( "duan", "どぅあん");
        rules.put( "dui", "どぅえい");
        rules.put( "dun", "どぅん");
        rules.put( "duo", "どぅお");
        rules.put( "ei", "えい");
        rules.put( "eng", "えん");
        rules.put( "fa", "ふぁ");
        rules.put( "fang", "ふぁん");
        rules.put( "fei", "ふぇい");
        rules.put( "feng", "ふぇん");
        rules.put( "fiao", "ふぃあう");
        rules.put( "fo", "ふぉ");
        rules.put( "fou", "ふぉう");
        rules.put( "fu", "ふ");
        rules.put( "ga", "が");
        rules.put( "gai", "がい");
        rules.put( "gang", "がん");
        rules.put( "gao", "がう");
        rules.put( "gei", "げい");
        rules.put( "geng", "げん");
        rules.put( "gong", "ごん");
        rules.put( "gou", "ごう");
        rules.put( "gu", "ぐ");
        rules.put( "gua", "ぐあ");
        rules.put( "guai", "ぐあい");
        rules.put( "guang", "ぐあん");
        rules.put( "gui", "ぐえい");
        rules.put( "gun", "ぐん");
        rules.put( "guo", "ぐお");
        rules.put( "ha", "は");
        rules.put( "hai", "はい");
        rules.put( "hang", "はん");
        rules.put( "hao", "はう");
        rules.put( "hei", "へい");
        rules.put( "heng", "へん");
        rules.put( "hong", "ほん");
        rules.put( "hou", "ほう");
        rules.put( "ji", "じ");
        rules.put( "jia", "じあ");
        rules.put( "jiang", "じあん");
        rules.put( "jiao", "じあう");
        rules.put( "jie", "じえ");
        rules.put( "jing", "じん");
        rules.put( "jiong", "じよん");
        rules.put( "jiu", "じよ");
        rules.put( "ju", "じゅゆ");
        rules.put( "jue", "じゅゆえ");
        rules.put( "ka", "か");
        rules.put( "kai", "かい");
        rules.put( "kang", "かん");
        rules.put( "kao", "かう");
        rules.put( "kei", "けい");
        rules.put( "keng", "けん");
        rules.put( "kong", "こん");
        rules.put( "kou", "こう");
        rules.put( "ku", "くク");
        rules.put( "kua", "くあ");
        rules.put( "kuai", "くあい");
        rules.put( "kuang", "くあん");
        rules.put( "kui", "くえい");
        rules.put( "kun", "くん");
        rules.put( "kuo", "くお");
        rules.put( "la", "ら");
        rules.put( "lai", "らい");
        rules.put( "lang", "らん");
        rules.put( "lao", "らう");
        rules.put( "lei", "れい");
        rules.put( "leng", "れん");
        rules.put( "li", "り");
        rules.put( "lia", "りあ");
        rules.put( "liang", "りあん");
        rules.put( "liao", "りあう");
        rules.put( "lie", "りえ");
        rules.put( "ling", "りん");
        rules.put( "liu", "りよ");
        rules.put( "lo", "ろ");
        rules.put( "long", "ろん");
        rules.put( "lou", "ろう");
        rules.put( "lu", "る");
        rules.put( "luang", "るあん");
        rules.put( "lun", "るん");
        rules.put( "luo", "るお");
        rules.put( "ma", "ま");
        rules.put( "mai", "まい");
        rules.put( "mang", "まん");
        rules.put( "mao", "まう");
        rules.put( "mei", "めい");
        rules.put( "meng", "めん");
        rules.put( "mi", "み");
        rules.put( "mia", "みあ");
        rules.put( "mian", "みあん");
        rules.put( "miao", "みあう");
        rules.put( "mie", "みえ");
        rules.put( "ming", "みん");
        rules.put( "miu", "みよ");
        rules.put( "mo", "も");
        rules.put( "mou", "もう");
        rules.put( "mu", "む");
        rules.put( "na", "な");
        rules.put( "nai", "ない");
        rules.put( "nang", "なん");
        rules.put( "nao", "なう");
        rules.put( "nei", "ねい");
        rules.put( "neng", "ねん");
        rules.put( "ni", "に");
        rules.put( "niang", "にあん");
        rules.put( "niao", "にあう");
        rules.put( "nie", "にえ");
        rules.put( "ning", "にん");
        rules.put( "niu", "によ");
        rules.put( "nong", "のん");
        rules.put( "nou", "のう");
        rules.put( "nu", "ぬ");
        rules.put( "nuang", "ぬん");
        rules.put( "nun", "ぬん");
        rules.put( "nuo", "ぬお");
        rules.put( "o", "お");
        rules.put( "ou", "おう");
        rules.put( "pa", "ぱ");
        rules.put( "pai", "ぱい");
        rules.put( "pang", "ぱん");
        rules.put( "pao", "ぱう");
        rules.put( "pei", "ぺい");
        rules.put( "peng", "ぺん");
        rules.put( "pi", "ぴ");
        rules.put( "pia", "ぴあ");
        rules.put( "pian", "ぴあん");
        rules.put( "piao", "ぴあう");
        rules.put( "pie", "ぴえ");
        rules.put( "ping", "ぴん");
        rules.put( "po", "ぽ");
        rules.put( "pou", "ぽう");
        rules.put( "pu", "ぷ");
        rules.put( "qi", "ち");
        rules.put( "qia", "ちあ");
        rules.put( "qiang", "ちあん");
        rules.put( "qiao", "ちあう");
        rules.put( "qie", "ちえ");
        rules.put( "qing", "ちん");
        rules.put( "qiong", "ちよん");
        rules.put( "qiu", "ちよ");
        rules.put( "qu", "ちゅゆ");
        rules.put( "que", "ちゅゆえ");
        rules.put( "sa", "た");
        rules.put( "sai", "たい");
        rules.put( "sang", "たん");
        rules.put( "sao", "たう");
        rules.put( "seng", "せん");
        rules.put( "si", "スィ");
        rules.put( "song", "そん");
        rules.put( "sou", "そう");
        rules.put( "su", "す");
        rules.put( "suan", "すあん");
        rules.put( "sui", "すえい");
        rules.put( "suo", "すお");
        rules.put( "ta", "た");
        rules.put( "tai", "たい");
        rules.put( "tang", "たん");
        rules.put( "tao", "たう");
        rules.put( "teng", "てん");
        rules.put( "ti", "てぃ");
        rules.put( "tian", "てぃあん");
        rules.put( "tiao", "てぃあう");
        rules.put( "tie", "てぃえ");
        rules.put( "ting", "てぃん");
        rules.put( "tong", "とん");
        rules.put( "tou", "とう");
        rules.put( "tu", "とぅ");
        rules.put( "tuan", "とぅあん");
        rules.put( "tui", "とぅえい");
        rules.put( "tun", "とぅん");
        rules.put( "tuo", "とぅお");
        rules.put( "wa", "わ");
        rules.put( "wai", "わい");
        rules.put( "wang", "わん");
        rules.put( "wei", "うい");
        rules.put( "wen", "うえん");
        rules.put( "weng", "うん");
        rules.put( "wo", "を");
        rules.put( "wu", "う");
        rules.put( "xi", "し");
        rules.put( "xia", "しあ");
        rules.put( "xiang", "しあん");
        rules.put( "xiao", "しあう");
        rules.put( "xie", "しえ");
        rules.put( "xing", "しん");
        rules.put( "xiong", "しよん");
        rules.put( "xiu", "しよ");
        rules.put( "xu", "しゅゆ");
        rules.put( "xue", "しゅゆえ");
        rules.put( "ya", "や");
        rules.put( "yang", "やん");
        rules.put( "yao", "やう");
        rules.put( "ye", "いえ");
        rules.put( "yi", "い");
        rules.put( "ying", "いん");
        rules.put( "yong", "よん");
        rules.put( "you", "よ");
        rules.put( "yu", "ゆ");
        rules.put( "yuang", "ゆあん");
        rules.put( "yue", "ゆえ");
        rules.put( "yun", "ゆん");
        rules.put( "za", "ざ");
        rules.put( "zai", "ざい");
        rules.put( "zang", "ざん");
        rules.put( "zao", "ざう");
        rules.put( "zei", "ぜい");
        rules.put( "zeng", "ぜん");
        rules.put( "zi", "ズィ");
        rules.put( "zong", "ぞん");
        rules.put( "zou", "ぞう");
        rules.put( "zu", "ず");
        rules.put( "zuan", "ずあん");
        rules.put( "zui", "ずえい");
        rules.put( "zuo", "ずお");
        return rules;
    }

    public String pinyinToKana(String pinyin, Map<String, String> conversionRules) {
        String[] words = pinyin.split(" ");
        List<String> kanaResult = new ArrayList<>();

        for (String word : words) {
            kanaResult.add(conversionRules.getOrDefault(word, "[" + word + "]"));
        }
        return String.join(" ", kanaResult);
    }

    public String convertToKana(String input) {
        Map<String, String> rules = loadConversionRules();
        String pinyin = kanjiToPinyinMain(input);
        return pinyinToKana(pinyin, rules);
    }
}