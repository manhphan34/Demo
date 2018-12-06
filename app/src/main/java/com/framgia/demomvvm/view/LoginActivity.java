package com.framgia.demomvvm.view;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.framgia.demo.R;
import com.framgia.demo.databinding.ActivityMainBinding;
import com.framgia.demo.model.User;
import com.framgia.demo.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {
    private final String TEXT_EMPTY = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setViewModel(new LoginViewModel(new User(TEXT_EMPTY, TEXT_EMPTY )));
        binding.executePendingBindings();
    }

    @BindingAdapter({"mToastMessage"})
    public static void showToast(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
