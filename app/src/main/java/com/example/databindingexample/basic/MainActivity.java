package com.example.databindingexample.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.databindingexample.R;
import com.example.databindingexample.advance.Main2Activity;
import com.example.databindingexample.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements MainActivityListener {
  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //setContentView(R.layout.activity_main);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setUser(new User("Nguyễn Bá Dũng", "123456@@"));
    binding.setListener(this);
  }

  @Override
  public void onReplaceUserClick() {
    Random random = new Random();
    int user_position = random.nextInt(5);

    List<User> users = new ArrayList<>();
    users.add(new User("Nguyễn Huy Hùng", "09123712"));
    users.add(new User("Nguyễn Hoàng Hải", "7234683"));
    users.add(new User("Ronadinho", "2374372"));
    users.add(new User("Đỗ Duy Kiên", "329472389"));
    users.add(new User("Trần Đình Hoàng", "3131235"));
    binding.setUser(users.get(user_position));
  }

  @Override
  public void nextActivity() {
    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
    startActivity(intent);
  }
}
