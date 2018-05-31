package com.example.manushrivastava.fragmentstatic;

import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TitleFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TitleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TitleFragment extends Fragment implements View.OnClickListener {

    public TitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_title, container, false);
        Button b=(Button) v.findViewById(R.id.but);
        b.setOnClickListener(this);
        Button b1=(Button) v.findViewById(R.id.but1);
        b1.setOnClickListener(this);
        return v;
    }
    public void onClick(android.view.View v)
    {


        android.support.v4.app.FragmentManager fragmentmanager=getFragmentManager();
        android.support.v4.app.FragmentTransaction fragmenttransaction=fragmentmanager.beginTransaction();
        if(v.getId()==R.id.but) {
            fragmenttransaction.add(R.id.Quote_frame, new QuoteFragment());
            fragmenttransaction.addToBackStack(null);
            fragmenttransaction.commit();
            fragmentmanager.executePendingTransactions();
        }
        if(v.getId()==R.id.but1) {
            fragmenttransaction.add(R.id.Quote_frame, new TitleFragment());
            fragmenttransaction.addToBackStack(null);
            fragmenttransaction.commit();
            fragmentmanager.executePendingTransactions();
        }
    }
}
