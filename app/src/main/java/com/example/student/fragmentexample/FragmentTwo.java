package com.example.student.fragmentexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentTwo extends Fragment {

    View view;
    TextView textView;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
       view =  inflater.inflate(R.layout.frag_two,null);
        //inflater.inflate(R.layout.frag_one,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
    }

    private void initView() {
        textView = view.findViewById(R.id.tv_fragment_two);
        button = view.findViewById(R.id.btn_frag_two);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello,Fragment two");
                Toast.makeText(getActivity(), "Fragment two", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
