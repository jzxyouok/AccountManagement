package com.swjtu.huxin.accountmanagement.fragment;

/**
 * Created by huxin on 2017/2/24.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swjtu.huxin.accountmanagement.R;

public class GengDuoFragment extends Fragment {

    private String mArgument;
    public static final String ARGUMENT = "argument";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // mArgument = getActivity().getIntent().getStringExtra(ARGUMENT);
        Bundle bundle = getArguments();
        if (bundle != null)
            mArgument = bundle.getString(ARGUMENT);

    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gengduo,container,false);
        return view;
    }

    /**
     * 传入需要的参数，设置给arguments
     *
     * @param argument
     * @return
     */
    public static GengDuoFragment newInstance(String argument) {
        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT, argument);
        GengDuoFragment contentFragment = new GengDuoFragment();
        contentFragment.setArguments(bundle);
        return contentFragment;
    }
}