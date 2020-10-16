package com.company;

public class game {

    player player = new player();

    question[] arrQues = new question[3];

    String[] questionData = {"what is the name of the player","which option is correct from the below option","whats the sound you make"};
    String[] option1 = {"Lets_upgrade","3","boom"};
    String[] option2 = {"Udemy","1","loom"};
    String[] option3 = {"upgrade","kk","moon"};

    int[] ans  = {1,2,1};

    public void initgame(){
        for(int i  =0;i<3;i++)
            arrQues[i] = new question();

        for(int i = 0;i<3;i++){
            arrQues[i].ques = questionData[i];
            arrQues[i].op1 = option1[i];
            arrQues[i].op2 = option2[i];
            arrQues[i].op3 = option3[i];
            arrQues[i].correctAns = ans[i];
        }
    }

    public void playGame(){
        player.getDetails();
        for(int i  =0;i<3;i++){
            boolean status = arrQues[i].askQuestion();
            if(status == true){
                player.score += 5;
                System.out.println("Right ans .... your score "+player.score);
            }
            else{
                player.score -= 5;
                System.out.println("Wrong ans.... your score "+player.score);
            }
        }
        System.out.println(player.name+" your score is "+player.score);
    }


}
