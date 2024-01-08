package com.jafor.hth;

import android.content.*;
import android.net.*;
import android.os.*;
import androidx.fragment.app.Fragment;
import android.view.*;
import android.widget.*;


public class CharityFragment extends Fragment {

    Button khidmat, edhi, skhospital, chipa, jdc, saylani;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_charity, container, false);

        khidmat = rootView.findViewById(R.id.btnkhidmat);
        edhi = rootView.findViewById(R.id.btnedhi);
        skhospital = rootView.findViewById(R.id.skHosppital);
        chipa = rootView.findViewById(R.id.chipa);
        jdc = rootView.findViewById(R.id.jdc);
        saylani = rootView.findViewById(R.id.saylani);

        khidmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://www.bidyanondo.org/projects/2"));
                startActivity(myWeblink);
            }
        });

        edhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://www.bidyanondo.org/projects/3"));
                startActivity(myWeblink);
            }
        });

        skhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://www.bidyanondo.org/projects/1"));
                startActivity(myWeblink);
            }
        });

        chipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://www.bidyanondo.org/projects/3"));
                startActivity(myWeblink);
            }
        });

        jdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://jdcwelfare.org/donation-form/"));
                startActivity(myWeblink);
            }
        });

        saylani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://www.saylaniwelfareusa.com/en/donate"));
                startActivity(myWeblink);
            }
        });




        return rootView;


    }
}