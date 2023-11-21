package baseball;
public class Review03 {

    public static void main(String[] args) {
        // 野球チームと成績を定義
        BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam chuunichi = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        //　野球チームと成績を表示
        tokyo.report(); // 東京ヤクルトスワローズの結果を表示する
        yokohama.report(); // 横浜DeNAベイスターズの結果を表示する
        hanshin.report(); // 阪神タイガースの結果を表示する
        yomiuri.report(); // 読売ジャイアンツの結果を表示する
        hiroshima.report(); // 広島東洋カープの結果を表示する
        chuunichi.report(); // 中日ドラゴンズの結果を表示する
    }

}