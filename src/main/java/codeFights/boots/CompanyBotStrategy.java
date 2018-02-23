package codeFights.boots;

public class CompanyBotStrategy {
    public static double companyBotStrategy(int[][] trainingData) {
        int goodAnswerCounter = 0;
        int sum = 0;

        for (int i = 0; i < trainingData.length; i++) {
            if (trainingData[i][1] == 1) {
                sum += trainingData[i][0];
                goodAnswerCounter++;
            }
        }
        if (goodAnswerCounter == 0){
            return 0.0;
        }
        return (1.0 *sum)/goodAnswerCounter;
    }
}
