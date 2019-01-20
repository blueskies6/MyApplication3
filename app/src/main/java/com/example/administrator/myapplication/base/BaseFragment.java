package com.example.administrator.myapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.bean.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/1/20 0020.
 */

public abstract class BaseFragment extends Fragment {
    public abstract int setIdResource();
    private View view;
    protected List<Animal> animals = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(setIdResource(),container,false);
        this.view = view;
        loaddata();
        initView();
        return view;
    }
    public abstract void loaddata();
    public  View getView()
    {
        return view;
    }
    public abstract void initView();
}
