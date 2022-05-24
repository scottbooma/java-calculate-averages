import java.util.Arrays;

class App {
  public static void main(String args[]){

  System.out.println(String.format("The lowest score is %d", App.lowestScore(scores)));
  System.out.println(String.format("The highest score is %d", App.highestScore(scores)));
  System.out.println(String.format("The mean score is %f", App.meanScore(scores)));
  System.out.println(String.format("The median score is %f", App.medianScore(scores)));
  }

  private static int[] scores = {72, 95, 91, 85, 87, 51, 65, 72, 75};
  
  private static int lowestScore(int[] scoreArray){
    Arrays.sort(scoreArray);
    return scoreArray[0];
  };

  private static int highestScore(int[] scoreArray){
    Arrays.sort(scoreArray);
    return scoreArray[scoreArray.length - 1];
  }

  private static double meanScore(int[] scoreArray){
    double sum = 0;
    for (int i = 0; i < scoreArray.length; i++){
      sum = sum + scoreArray[i];
    };
    return sum / scoreArray.length;
  }

  private static float medianScore(int[] scoreArray){
    return (scoreArray[scoreArray.length / 2] + scoreArray[(scoreArray.length / 2) - 1]) / (float) 2;
  }
};

