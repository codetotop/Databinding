package com.example.databindingexample.advance;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.databindingexample.R;
import com.example.databindingexample.databinding.ActivityMain2Binding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentActivity extends AppCompatActivity implements StudentListener {
  Student student;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_student);
    student = new Student("Nguyễn Huy nam", "23", "Math");
    binding.setStudent(student);
    binding.setStudentListener(this);

  }

  @Override
  public void translateClass(Student student) {
    List<String> study_class = new ArrayList<>();
    study_class.add("Physical");
    study_class.add("Math");
    study_class.add("Android Programmer");
    study_class.add("IOS Programmer");
    int random_class = new Random().nextInt(4);
    student.setClass(study_class.get(random_class));
  }
}
