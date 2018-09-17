package com.example.student.fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Id,new FragmentOne()).addToBackStack("tag").commit();
    }

    public void Click(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();

        Fragment fragment= null;

        if(view.getId()== R.id.btn1){
            fragment=new FragmentOne();



        }
        if(view.getId()== R.id.btn2){
            fragment=new FragmentTwo();

        }
        if(view.getId()== R.id.btn3){
            fragment= new FragmentThree();

        }

        if (fragment != null){
            transaction.replace(R.id.fragment_Id, fragment);
            transaction.addToBackStack("tag");

            transaction.commit();
        }

    }
}
