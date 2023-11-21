package baseball;

public class BaseBallTeam {
 // フィールド
    private String name; // チーム名
    private int win;     // 勝利数
    private int lose;    // 敗北数
    private int draw;    // 引分数

    //　引数なしのコンストラクタ(念のため記述しただけなので中身は空でOK)
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

 // 勝率を計算するメソッド
    public double getRate() {
        // 勝ち数を、勝ち数と負け数を足した数値で除して計算
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    // チーム名/勝数/負け数/引き分け数/勝率を表示するメソッド
    public void report() {
        System.out.println(getName() + "の2022年の成績は" + getWin() + "勝" + getLose() + "敗" + getDraw() + "分、勝率は" + getRate() + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}