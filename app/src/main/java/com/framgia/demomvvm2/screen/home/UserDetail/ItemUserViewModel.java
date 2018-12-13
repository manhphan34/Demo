package com.framgia.demomvvm2.screen.home.UserDetail;

import android.databinding.ObservableField;

import com.framgia.demomvvm2.data.model.User;

public class ItemUserViewModel {
    public static final String EXTRA_USER = "EXTRA_USER";
    public final ObservableField<User> movieObservableField = new ObservableField<>();

}
