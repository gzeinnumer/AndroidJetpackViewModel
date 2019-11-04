package com.gzeinnumer.androidjetpackviewmodel;

import android.annotation.SuppressLint;
import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;
//you need this
//    implementation 'android.arch.lifecycle:extensions:1.1.1'
//    annotationProcessor 'android.arch.lifecycle:compiler:1.1.1'
//if you want to make activity no cleared when screen rotation change
@SuppressLint("LongLogTag")
public class MainActivityViewModel extends ViewModel {
    private static final String TAG = "MainActivityViewModel";
    private String rndmNumber;

    public String getNumber(){
        Log.i(TAG, "getNumber");
        if (rndmNumber == null){
            createNumber();
        }
        return rndmNumber;
    }

    private void createNumber() {
        Log.i(TAG, "createNumber");
        Random random = new Random();
        rndmNumber = "Number:"+(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "onCleared: Viewmodel Destoyed");
    }
}
