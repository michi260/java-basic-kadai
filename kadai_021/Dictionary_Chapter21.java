package kadai_021;
import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
    private Map<String, String> jisho = new HashMap<>();

    // コンストラクタで辞書に例を追加
    public Dictionary_Chapter21() {
    	jisho.put("apple","りんご");
		jisho.put("peach","桃");
		jisho.put("banana","バナナ");
		jisho.put("lemon","レモン");
		jisho.put("pear","梨");
		jisho.put("kiwi","キウイ");
		jisho.put("strawberry","いちご");
		jisho.put("grape","ぶどう");
		jisho.put("muscat","マスカット");
		jisho.put("cherry","さくらんぼ");}

    // 辞書検索メソッド
    public void search(String key) {
        if (jisho.containsKey(key)) {
            System.out.println(key + "の意味は" + jisho.get(key));
        } else {
            System.out.println(key + "は辞書に存在しません");
        }
    }

   
    }
