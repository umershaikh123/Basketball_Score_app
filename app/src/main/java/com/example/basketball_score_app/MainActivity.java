package com.example.basketball_score_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // This is the second version
 int score1 =0;
 int score2 = 0;
 int threePoints = 3;
 int twoPoints = 2;
 int freeThrow = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



 public int displayScore1() {
     TextView quantityTextView = (TextView) findViewById(R.id.score1);
     quantityTextView.setText(""+ score1 );
     return score1;
 }



// 1st method
    public void getThreePoints1(View view) {
        setThreePoints1();
        displayScore1();
    }

    public int setThreePoints1() {
        score1 += threePoints;
        return score1;
    }



    // 2nd method
    public void getTwoPoints1(View view){
        setTwoPoints1();
        displayScore1();
    }

    public int setTwoPoints1(){
        score1 += twoPoints;
        return score1;
    }




    // 3rd method
    public void getFreeThrow1(View view){
        setFreeThrow1();
        displayScore1();
    }

    public int setFreeThrow1(){
        score1 += freeThrow;
        return score1;
    }




    public int displayScore2() {
        TextView quantityTextView = (TextView) findViewById(R.id.score2);
        quantityTextView.setText(""+ score2 );
        return score2;
    }


    // 1st method 2
    public void getThreePoints2(View view) {
        setThreePoints2();
        displayScore2();
    }

    public int setThreePoints2() {
        score2 += threePoints;
        return score2;
    }



    // 2nd method 2
    public void getTwoPoints2(View view){
        setTwoPoints2();
        displayScore2();
    }

    public int setTwoPoints2(){
        score2 += twoPoints;
        return score2;
    }




    // 3rd method 2
    public void getFreeThrow2(View view){
        setFreeThrow2();
        displayScore2();
    }

    public int setFreeThrow2(){
        score2 += freeThrow;
        return score2;
    }


    public void getReset(View view){
         setReset();
        displayScore1();
        displayScore2();
    }

    public int setReset(){

        score1 = 0;
        score2 = 0;
        return score1+score2;

    }










}// class ended