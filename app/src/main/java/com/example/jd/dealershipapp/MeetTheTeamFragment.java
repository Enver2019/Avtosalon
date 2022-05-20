package com.example.jd.dealershipapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.jd.dealershipapp.JavaBean.Employee;

import java.util.ArrayList;



public class MeetTheTeamFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ArrayList<Employee> employees;

    private OnFragmentInteractionListener mListener;

    public MeetTheTeamFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static MeetTheTeamFragment newInstance(String param1, String param2) {
        MeetTheTeamFragment fragment = new MeetTheTeamFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_meet_the_team, container, false);

        //creating list
        ArrayList<Employee> personList = new ArrayList<>();
        ArrayList<Integer> imagesOfEmployees = new ArrayList<>();
        imagesOfEmployees.add(R.drawable.pic1);


        String rebeccaName = "Энвер";
        String[] rebeccaEmail = {"kayaliev_enver@mail.ru"};



        personList.add(new Employee(rebeccaName, "Разработчик", R.drawable.pic1, rebeccaEmail));



        RecyclerView recyclerView = view.findViewById(R.id.recycle_view_employee);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        EmployeeCustomRecycleViewAdapter adapter = new EmployeeCustomRecycleViewAdapter(personList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
