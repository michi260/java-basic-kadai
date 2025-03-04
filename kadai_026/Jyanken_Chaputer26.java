package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chaputer26 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        while (true) {
            System.out.println("じゃんけんの手を入力してください（r: グー, s: チョキ, p: パー）:");
            choice = scanner.nextLine().toLowerCase();
            
            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                break;
            } else {
                System.out.println("無効な入力です。もう一度試してください。");
            }
        }
        
        return choice;
    }

    public static void main(String[] args) {
        Jyanken_Chaputer26 game = new Jyanken_Chaputer26();
        String myChoice = game.getMyChoice();
        System.out.println("あなたの選んだ手は: " + myChoice);
    }
    public String getRandom() {
        String[] rivals = {"r", "s", "p"};
        // Math.random() は 0.0 以上 1.0 未満を返すので、3 を掛けて 0, 1, 2 のいずれかに。Math.floorで整数部分を取得
        int randomIndex = (int) Math.floor(Math.random() * 3);
        return rivals[randomIndex];
    }
  //じゃんけんを行う
    public void playGame () {
        HashMap<String, String> key = new HashMap<String, String>();
        key.put("r", "グー");
        key.put("s", "チョキ");
        key.put("p", "パー");
        
        String me = this.getMyChoice();
        String you = this.getRandom();
        
        // 自分の手と対戦相手の手を日本語で表示する
        System.out.println("自分の手は" + key.get(me) + ",対戦相手の手は" + key.get(you));
        
        if (me.equals(you)) {
            System.out.println("あいこです");
        } else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
                || (me.equals("p") && you.equals("r"))) {
            System.out.println("あなたの勝ちです");
        } else {
            System.out.println("あなたの負けです");
        }
    }    
}





