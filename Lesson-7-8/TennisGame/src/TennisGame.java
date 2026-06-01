package src;

public class TennisGame {
    public static final int SCORE_LOVE = 0;
    public static final int SCORE_FIFTEEN = 1;
    public static final int SCORE_THIRTY = 2;
    public static final int SCORE_FORTY = 3;
    public static final int MINIMUM_WINNING_SCORE = 4;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score){
        if (player1Score == player2Score){
            return getTieScore(player1Score);
        }

        if (player1Score >= MINIMUM_WINNING_SCORE || player2Score >= MINIMUM_WINNING_SCORE) {
            return getEndGameScore(player1Score, player2Score);
        }

        return getNormalScore(player1Score, player2Score);
    }

    private static String getTieScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love-All";
            case SCORE_FIFTEEN:
                return "Fifteen-All";
            case SCORE_THIRTY:
                return "Thirty-All";
            case SCORE_FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getEndGameScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;

        if (scoreDifference == 1){
            return "Advantage player1";
        } else if (scoreDifference == -1) {
            return "Advantage player2";
        } else if (scoreDifference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return translateScore(player1Score) + "-" + translateScore(player2Score);
    }

    private static String translateScore(int score) {
        switch (score) {
            case SCORE_LOVE:
                return "Love";
            case SCORE_FIFTEEN:
                return "Fifteen";
            case SCORE_THIRTY:
                return "Thirty";
            case SCORE_FORTY:
                return "Forty";
            default:
                return "";
        }
    }
}
