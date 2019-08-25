package com.example.databindingexample.advance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.database.DatabaseUtils;
import android.os.Bundle;

import com.example.databindingexample.R;
import com.example.databindingexample.databinding.ActivityMain2Binding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2Activity extends AppCompatActivity implements StudentListener {
  Student student;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //setContentView(R.layout.activity_main2);
    ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
    student = new Student("Nguyễn Huy nam", "23", "Math");
    binding.setStudent(student);
    binding.setStudentListener(this);

  }

  @Override
  public void translateStudy(Student student) {
    List<String> study_class = new ArrayList<>();
    study_class.add("Physical");
    study_class.add("Math");
    study_class.add("Android Programmer");
    study_class.add("IOS Programmer");
    int random_class = new Random().nextInt(4);
    student.setStudyClass(study_class.get(random_class));
  }
}
