package des;

import java.util.Scanner;

public class main8 {

    public static void main(String[] args) {
        System.out.println("相性診断をはじめる！！");
        System.out.println("※やめる場合は　NO　を記述してください");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        while(true) {

            String[] qst = {
                    "Q1. 休日は家で過ごしますか？",
                    "Q2. ゲームは好きですか？",
                    "Q3. ネコは好きですか？",
                    "Q4. ジャンプ好きですか？",
                    "Q5. 田舎好きですか？"
            };
            String[] answer = {
                    "1: すごくいいと思う。",
                    "2:　まあまあそう思う。",
                    "3: あまりそう思わない。",
                    "4: まったくそう思わない。",
            };

            Scanner scanner = new Scanner(System.in);
            int[] inputs = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println(qst[i]);
                for (int z = 0; z < 4; z++) {
                    System.out.print(answer[z]);
                }
                System.out.print("\n");
                int input = scanner.nextInt();
                inputs[i] = input;
                if (input < 1 || input > 4) {
                    i--;
                    System.out.println("１～４の半角英数字で入力してください");
                    continue;
                }
            }
            int sum = 0;
            for (int i = 0; i < inputs.length; i++) {
                sum += inputs[i];
            }
            System.out.println("「 相性診断結果 」");
            System.out.println("相性ポイントは" + sum + "点ですね！！");

            if (sum < 6) {
                System.out.println("相性最悪ですね！");
            } else if (sum >= 6 && sum <= 10) {
                System.out.println("そこそこ気が合いそうですね！");
            } else if (sum > 10 && sum <= 15) {
                System.out.println("よく気が合うみたいですよ！");
            } else if (sum > 15 && sum <= 19) {
                System.out.println("かなり気が合うみたいですよ！");
            } else if (sum == 20) {
                System.out.println("運命です！！");
            }
        if (inputs.equals("NO")) {
            break;
        }
        }
    }
}
