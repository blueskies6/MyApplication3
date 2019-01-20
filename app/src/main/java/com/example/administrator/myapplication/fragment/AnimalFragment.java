package com.example.administrator.myapplication.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.AnimalAdapter;
import com.example.administrator.myapplication.base.BaseFragment;

public class AnimalFragment extends BaseFragment {

    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loaddata() {

    }

    @Override
    public void initView() {
        recyclerView = getView().findViewById(R.id.animal_recycler_view);
        adapter = new AnimalAdapter(animals, getContext());
    }
}
