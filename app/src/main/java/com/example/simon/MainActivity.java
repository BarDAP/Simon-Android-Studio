package com.example.simon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.*;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blue_btn = findViewById(R.id.blue_btn);


    }
    
//    int AIe = 0;
//    int highScore = 20;
//    int chain = 0;
//    Queue<Integer> AI = new LinkedList<>();
//    // green = 0, red = 1, yellow = 2, blue = 3
////    int[] sequence = new int [500];
//    Queue<Integer> sequence = new LinkedList<>();
//
//
//    int[] playerAnswers = new int [500];
//    int roundNumber = 1;
//
////    flashSequence();
////    timedLoop(10, function() {
////        setText("chain", "Score: " + chain);
////        if (AIe == 1) {
////            setText("cpuFac", "Cpu Play");
////            wait(500);
////            Draw();
////        } else {
////            setText("cpuFac", "");
////        }
////    });
//
//
//     void flashSequence(){
//        int [] playerAnswers;
//         Random rand = new Random();
//        sequence.add(rand.nextInt(4));
//        for(int i = 0; i < roundNumber; i++){
//            int currentLight = sequence.peek();
//            //int currentLight = sequence[i];
//            AI = sequence;
//            if(currentLight == 0) flashGreen();
//            if(currentLight == 1) flashRed();
//            if(currentLight == 2) flashYellow();
//            if(currentLight == 3) flashBlue();
//        }
//    }
//
//    void checkAnswer() throws InterruptedException {
//        // sequence [1, 2, 3, 0]
//        // playerAns [1, 2, 3, 0]
//        int currentAnswerIndex = playerAnswers.length -1;
//        int currentAnswer = playerAnswers[currentAnswerIndex];
//        if(currentAnswer != sequence[currentAnswerIndex]){
//            gameOver();
//        }else if((currentAnswerIndex == sequence.length -1)){ //last answer
//            roundNumber++;
//            wait(1000);
//            flashSequence();
//            chain = chain + 1;
//        }
//    }
//
//    void Draw() {
//        if (sequence == AI) {
//            flashSequence();
//            roundNumber++;
//            wait(1000);
//            flashSequence();
//            chain = chain + 1;
//        }
//    }
//
//    void gameOver(){
//        setText("newHs", "");
//        setScreen("gameOver");
//        setText("score", chain);
//        if (chain > highScore) {
//            highScore = chain;
//            setText("newHs", "New");
//        }
//        wait(50);
//        setText("highScore", highScore);
//        wait(2000);
//    }
//
//    void flashGreen(){
//        playSound("sound://category_digital/coin_1.mp3", false);
//        console.log("green");
//        setProperty("greenButton","background-color", "#00FF00");
//        wait(250);
//        setProperty("greenButton","background-color", "#009900");
//        wait(100);
//    }
//
//    void flashRed(){
//        playSound("sound://category_digital/ring_2.mp3", false);
//        console.log("red");
//        setProperty("redButton","background-color", "#FF0000");
//        wait(250);
//        setProperty("redButton","background-color", "#990000");
//        wait(200);
//    }
//
//    void flashYellow(){
//        playSound("sound://category_digital/whistle_up.mp3", false);
//        console.log("yellow");
//        setProperty("yellowButton","background-color", "#FFFF00");
//        wait(250);
//        setProperty("yellowButton","background-color", "#999900");
//        wait(200);
//    }
//
//    void flashBlue(){
//        playSound("sound://category_digital/whistle_down.mp3", false);
//        console.log("blue");
//        setProperty("blueButton","background-color", "#0000FF");
//        wait(250);
//        setProperty("blueButton","background-color", "#000099");
//        wait(200);
//    }
//
//    void wait(ms){
//        var startTime = getTime() ;
//        var currentTime = getTime();
//        while(currentTime - startTime < ms){
//            currentTime =getTime();
//        }
//    }
}



//
//    var AIe = 0;
//    var highScore = 20;
//    var chain = 0;
//    var AI = [];
//// green = 0, red = 1, yellow = 2, blue = 3
//        var sequence = [];
//        var playerAnswers = [];
//        var roundNumber = 1;
//
//        flashSequence();
//        timedLoop(10, function() {
//        setText("chain", "Score: " + chain);
//        if (AIe == 1) {
//        setText("cpuFac", "Cpu Play");
//        wait(500);
//        Draw();
//        } else {
//        setText("cpuFac", "");
//        }
//        });
//
//        function flashSequence(){
//        playerAnswers = [];
//        sequence.push(randomNumber(0,3));
//        for(var i = 0; i < roundNumber; i++){
//        var currentLight = sequence[i];
//        AI = sequence;
//        if(currentLight === 0) flashGreen();
//        if(currentLight === 1) flashRed();
//        if(currentLight === 2) (flashYellow());
//        if(currentLight === 3) flashBlue();
//        }
//        }
//
//        function checkAnswer(){
//        // sequence [1, 2, 3, 0]
//        // playerAns [1, 2, 3, 0]
//        var currentAnswerIndex = playerAnswers.length -1;
//        var currentAnswer = playerAnswers[currentAnswerIndex];
//        if(currentAnswer != sequence[currentAnswerIndex]){
//        gameOver();
//        }else if((currentAnswerIndex == sequence.length -1)){ //last answer
//        roundNumber++;
//        wait(1000);
//        flashSequence();
//        chain = chain + 1;
//        }
//        }
//
//        function Draw() {
//        if (sequence == AI) {
//        flashSequence();
//        roundNumber++;
//        wait(1000);
//        flashSequence();
//        chain = chain + 1;
//        }
//        }
//
//        function gameOver(){
//        setText("newHs", "");
//        setScreen("gameOver");
//        setText("score", chain);
//        if (chain > highScore) {
//        highScore = chain;
//        setText("newHs", "New");
//        }
//        wait(50);
//        setText("highScore", highScore);
//        wait(2000);
//        }
//
//
//        function flashGreen(){
//        playSound("sound://category_digital/coin_1.mp3", false);
//        console.log("green");
//        setProperty("greenButton","background-color", "#00FF00");
//        wait(250);
//        setProperty("greenButton","background-color", "#009900");
//        wait(100);
//        }
//
//        function flashRed(){
//        playSound("sound://category_digital/ring_2.mp3", false);
//        console.log("red");
//        setProperty("redButton","background-color", "#FF0000");
//        wait(250);
//        setProperty("redButton","background-color", "#990000");
//        wait(200);
//        }
//
//        function flashYellow(){
//        playSound("sound://category_digital/whistle_up.mp3", false);
//        console.log("yellow");
//        setProperty("yellowButton","background-color", "#FFFF00");
//        wait(250);
//        setProperty("yellowButton","background-color", "#999900");
//        wait(200);
//        }
//
//        function flashBlue(){
//        playSound("sound://category_digital/whistle_down.mp3", false);
//        console.log("blue");
//        setProperty("blueButton","background-color", "#0000FF");
//        wait(250);
//        setProperty("blueButton","background-color", "#000099");
//        wait(200);
//        }
//
//
//        function wait(ms){
//        var startTime = getTime() ;
//        var currentTime = getTime();
//        while(currentTime - startTime < ms){
//        currentTime =getTime();
//        }
//        }
//
//
//        onEvent("greenButton", "mousedown", function(){
//        playSound("sound://category_digital/coin_1.mp3", false);
//        setProperty("greenButton", "background-color", "#00FF00");
//        });
//        onEvent("greenButton", "mouseup", function(){
//        setProperty("greenButton", "background-color", "#009900");
//        playerAnswers.push(0);
//        checkAnswer();
//        });
//
//        onEvent("redButton", "mousedown", function(){
//        playSound("sound://category_digital/ring_2.mp3", false);
//        setProperty("redButton", "background-color", "#FF0000");
//        });
//        onEvent("redButton", "mouseup", function(){
//        setProperty("redButton", "background-color", "#990000");
//        playerAnswers.push(1);
//        checkAnswer();
//        });
//
//        onEvent("yellowButton", "mousedown", function(){
//        playSound("sound://category_digital/whistle_up.mp3", false);
//        setProperty("yellowButton", "background-color", "#FFFF00");
//        });
//        onEvent("yellowButton", "mouseup", function(){
//        setProperty("yellowButton", "background-color", "#999900");
//        playerAnswers.push(2);
//        checkAnswer();
//        });
//
//        onEvent("blueButton", "mousedown", function(){
//        playSound("sound://category_digital/whistle_down.mp3", false);
//        setProperty("blueButton", "background-color", "#0000FF");
//        });
//        onEvent("blueButton", "mouseup", function(){
//        setProperty("blueButton", "background-color", "#000099");
//        playerAnswers.push(3);
//        checkAnswer();
//        });
