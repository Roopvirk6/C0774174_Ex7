package com.example.c0774174_ex7.ui.home;

import android.content.Intent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.c0774174_ex7.ContentDisplay;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        Intent intent = getIntent();
        ContentDisplay details = intent.getParcelableExtra("Detail");
        mText.setValue(details.toString());

    }

    public LiveData<String> getText() {
        return mText;
    }
}