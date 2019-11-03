package com.example.databindingexample.advance;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Student extends BaseObservable {
  private String name;
  private String age;
  private String studyClass;

  public Student() {
  }

  public Student(String name, String age, String studyClass) {
    this.name = name;
    this.age = age;
    this.studyClass = studyClass;
  }

  @Bindable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    notifyPropertyChanged(BR.name);
  }

  @Bindable
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
    notifyPropertyChanged(BR.age);
  }

  @Bindable
  public String getStudyClass() {
    return studyClass;
  }

  public void setClass(String studyClass) {
    this.studyClass = studyClass;
    notifyPropertyChanged(BR.studyClass);
  }
}
