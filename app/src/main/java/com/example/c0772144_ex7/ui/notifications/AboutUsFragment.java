package com.example.c0772144_ex7.ui.notifications;

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

public class AboutUsFragment extends Fragment {
    private AboutUsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(AboutUsViewModel.class);
        View root = inflater.inflate(R.layout.aboutus_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_aboutUs);
        final TextView textView1= root.findViewById(R.id.textView4);

        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("ABOUT US");
                textView1.setText("Lambton College is a public college located in Sarnia, Ontario, Canada. Lambton College has established a licensing agreement in Toronto, Ontario, Canada with Cestar College of Business, Health and Technology (Cestar College); a registered private career college. We refer to this licensing agreement as Lambton in Toronto. For over 10 years, Lambton College has been a leader in establishing overseas and off-site licensing agreements for the delivery of its curriculum. International students can now take advantage of this opportunity to study in Toronto. ");
            }
        });
        return root;
    }
}
