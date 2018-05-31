package com.example.manushrivastava.fragmentstatic;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentmanager=getFragmentManager();
        android.support.v4.app.FragmentTransaction fragmenttransaction=getSupportFragmentManager().beginTransaction();
        TitleFragment t=new TitleFragment();
        fragmenttransaction.add(R.id.title_frame, t);
        fragmenttransaction.add(R.id.Quote_frame1, t);
       // fragmenttransaction.add(R.id.Quote_frame, new QuoteFragment());
        fragmenttransaction.commit();



    }


}
