package gradingmultiplechoicequestions;

public class GradingMultipleChoiceQuestions {

    public static void main(String[] args) {

        char[][] answers = new char[][]
        {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'}
        };
        
        char[][] keys = new char[][]
        {
            {'D','B','D','C','C','D','A','E','A','D'}
        };
        
        
        for(int i = 0; i < answers.length; i++){
            int score = 0;
            for(int j = 0; j < answers[i].length; j++){
                if(answers[i][j] == keys[0][j]){
                    score++;
                }
            }
            System.out.println("Student number " + (i + 1) + " score is " + score);
        }
    }

}
