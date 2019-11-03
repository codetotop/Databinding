package com.example.mvvmexample;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmexample.adapter.PeopleAdapter;
import com.example.mvvmexample.databinding.ActivityPeopleBinding;
import com.example.mvvmexample.model.People;
import com.example.mvvmexample.viewmodel.PeopleViewModel;
import com.example.mvvmexample.viewmodel.PeopleViewModelContract;

import java.util.List;
public class PeopleActivity extends AppCompatActivity implements PeopleViewModelContract.MainView {

    private ActivityPeopleBinding mActivityPeopleBinding;
    private PeopleViewModel mPeopleViewModel;
    private PeopleViewModelContract.MainView mMainView = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        setupListPeopleView(mActivityPeopleBinding.listPeople);
    }

    private void initDataBinding() {
        mActivityPeopleBinding = DataBindingUtil.setContentView(this, R.layout.activity_people);
        mPeopleViewModel = new PeopleViewModel(mMainView, getContext());
        mActivityPeopleBinding.setMainViewModel(mPeopleViewModel);
    }

    private void setupListPeopleView(RecyclerView listPeople) {
        PeopleAdapter adapter = new PeopleAdapter();
        listPeople.setAdapter(adapter);
        listPeople.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void loadData(List<People> peoples) {
        PeopleAdapter peopleAdapter = (PeopleAdapter) mActivityPeopleBinding.listPeople.getAdapter();
        peopleAdapter.setPeopleList(peoples);
    }

    @Override
    public Context getContext() {
        return PeopleActivity.this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPeopleViewModel.destroy();
    }
}
