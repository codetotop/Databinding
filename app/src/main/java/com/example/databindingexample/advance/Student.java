package com.example.databindingexample.advance;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

/*Sử dụng BaseObservable để lắng nghe sự thay đổi của dữ liệu và cập nhật view ngay sau khi thay đổi dữ liệu.
  Bằng cách thêm annotation @Bindable vào các phương thức get
  và sử dụng phương thức notifyPropertyChanged(BR.name_attribute) để cập nhật giao diện tức thời*/
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

  public void setStudyClass(String studyClass) {
    this.studyClass = studyClass;
    notifyPropertyChanged(BR.studyClass);
  }
}
