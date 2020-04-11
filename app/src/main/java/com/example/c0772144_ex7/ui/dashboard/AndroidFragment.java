package com.example.c0772144_ex7.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.c0772144_ex7.R;

public class AndroidFragment extends Fragment {

    private AndroidViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(AndroidViewModel.class);
        View root = inflater.inflate(R.layout.android_fragment, container, false);
        final TextView textView = root.findViewById(R.id.txtAndroid);
        final TextView textView1 = root.findViewById(R.id.txtDesc);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("WHAT IS ANDROID?");
                textView1.setText("Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets.When a device goes from just working to actually making life easier, Android is behind it. It’s the reason your GPS avoids traffic, your watch can text and your Assistant can answer questions. It’s the operating system inside 2.5 billion active devices. Everything from 5G phones to stunning tablets, Android powers them all.");

            }
        });
        return root;
    }
}
