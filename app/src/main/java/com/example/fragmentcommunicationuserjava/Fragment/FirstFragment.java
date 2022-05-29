package com.example.fragmentcommunicationuserjava.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentcommunicationuserjava.Model.User;
import com.example.fragmentcommunicationuserjava.R;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {


    FirtListener listener;
    TextView txt_first;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        txt_first = view.findViewById(R.id.txt_first);
        Button b_first = view.findViewById(R.id.b_first);

        b_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user = new User("Otabek", "Boboyev");
                listener.onFirstSend(user.toString());
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof FirtListener) {
            listener = (FirtListener) context;
        } else {
            throw new RuntimeException(context.toString());
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

   public void updateFirstText(String str) {
        txt_first.setText(str);
    }

    public interface FirtListener {
        void onFirstSend(String str);
    }

}
