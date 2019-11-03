package com.example.mvvmexample.viewmodel;

import android.content.Context;

import com.example.mvvmexample.model.People;

import java.util.List;

public interface PeopleViewModelContract {

    interface MainView {
        void loadData(List<People> peoples);

        Context getContext();
    }

    interface ViewModel {
        void destroy();
    }
}
