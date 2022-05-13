package com.gautam.medicinetime;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link project1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class project1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //have_time haveTime=new have_time();
    less_time lessTime=new less_time();
    monthly_plan monthlyPlan=new monthly_plan();

    public project1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment project1.
     */
    // TODO: Rename and change types and number of parameters
    public static project1 newInstance(String param1, String param2) {
        project1 fragment = new project1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    Button b1,b2,b3,b4;
    first f=new first();
    second s=new second();
    third t=new third();
    have_time haveTime=new have_time();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_project1, container, false);

        //drop down using spinner code//////////////////////////////////////////////////////////////
        //Spinner mySpinner = view.findViewById(R.id.spinner1);
        //mySpinner.setTransitionName("own made");
        /*ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(getContext(),
                R.layout.spinnertext, getResources().getStringArray(R.array.dropdown));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                    /*if (i == 1) {
                                                        FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                                                        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                                                        if(!f.isAdded())
                                                            fragmentTransaction1.add(R.id.frameLayout,f); //or return false/true, based on where you are calling from
                                                        //else
                                                            //fragmentTransaction.replace(R.id.frameLayout,f);
                                                        //fragmentTransaction1.addToBackStack(null);
                                                        fragmentTransaction1.commit();
                                                    }*/ /*else if (i == 2) {
                                                        FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                                                        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                                                        fragmentTransaction2.add(R.id.frameLayout,s); //or return false/true, based on where you are calling from
                                                        //else
                                                            //fragmentTransaction.replace(R.id.frameLayout,s);
                                                        fragmentTransaction2.addToBackStack(null);
                                                        fragmentTransaction2.commit();
                                                    }
                                                }*/

                                                //@Override
                                                /*public void onNothingSelected(AdapterView<?> adapterView) {
                                                    /*FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                                                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                                                    fragmentTransaction1.replace(R.id.frameLayout,new project1()); //or return false/true, based on where you are calling from
                                                    fragmentTransaction1.addToBackStack(null);
                                                    fragmentTransaction1.commit();*/

//                                                }
  //                                          });*/

            ////////////////////////////////////////////////////////////////////////////////////////////
        b1=(Button) view.findViewById(R.id.have_time);//defining button for 'start service' button functionality
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,haveTime);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b2=(Button) view.findViewById(R.id.less_time);//defining button for 'start service' button functionality
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,lessTime);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });

        b3=(Button) view.findViewById(R.id.monthly_plan);//defining button for 'start service' button functionality
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,monthlyPlan);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        b4=(Button) view.findViewById(R.id.elderly_exercise);//defining button for 'start service' button functionality
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,t);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //Intent intent=new Intent(MainActivity.this,Service_1.class);
                //intent.putStringArrayListExtra("newlist",list);
                //startService(intent);
            }
        });


        return view;

}}