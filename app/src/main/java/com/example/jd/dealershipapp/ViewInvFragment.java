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

import com.example.jd.dealershipapp.JavaBean.Vehicle;

import java.util.ArrayList;



public class ViewInvFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private boolean mTwoPane;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView list;

    private OnFragmentInteractionListener mListener;

    public ViewInvFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ViewInvFragment newInstance(String param1, String param2) {
        ViewInvFragment fragment = new ViewInvFragment();
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
        View view = inflater.inflate(R.layout.fragment_view_inv, container, false);

        //creating list
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        ArrayList<Integer> images = new ArrayList<>();
        Uri jeep1 = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.jeep1);
        images.add(R.raw.jeep1);
        images.add(R.raw.jeep2);
        images.add(R.raw.jeep3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand1), getResources().getString(R.string.model1), getResources().getString(R.string.year1), getResources().getString(R.string.price1), getResources().getString(R.string.description1), R.raw.jeep1, images));
        images = new ArrayList<>();
        images.add(R.raw.vestacross2);
        images.add(R.raw.vestacross1);
        images.add(R.raw.vestacross3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand7), getResources().getString(R.string.model7), getResources().getString(R.string.year7), getResources().getString(R.string.price7), getResources().getString(R.string.description7), R.raw.vestacross2, images));
        images = new ArrayList<>();
        images.add(R.raw.vestasw2);
        images.add(R.raw.vestasw1);
        images.add(R.raw.vestasw3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand8), getResources().getString(R.string.model8), getResources().getString(R.string.year8), getResources().getString(R.string.price8), getResources().getString(R.string.description8), R.raw.vestasw2, images));
        images = new ArrayList<>();
        images.add(R.raw.mustang1);
        images.add(R.raw.mustang2);
        images.add(R.raw.mustang3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand2), getResources().getString(R.string.model2), getResources().getString(R.string.year2), getResources().getString(R.string.price2), getResources().getString(R.string.description2), R.raw.mustang1, images));
        images = new ArrayList<>();
        images.add(R.raw.urban);
        images.add(R.raw.urban);
        images.add(R.raw.urban);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand9), getResources().getString(R.string.model9), getResources().getString(R.string.year9), getResources().getString(R.string.price9), getResources().getString(R.string.description9), R.raw.urban, images));
        images = new ArrayList<>();
        images.add(R.raw.bronto);
        images.add(R.raw.bronto);
        images.add(R.raw.bronto);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand10), getResources().getString(R.string.model10), getResources().getString(R.string.year10), getResources().getString(R.string.price10), getResources().getString(R.string.description10), R.raw.bronto, images));
        images = new ArrayList<>();
        images.add(R.raw.gmc1);
        images.add(R.raw.gmc2);
        images.add(R.raw.gmc3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand3), getResources().getString(R.string.model3), getResources().getString(R.string.year3), getResources().getString(R.string.price3), getResources().getString(R.string.description3), R.raw.gmc1, images));
        images = new ArrayList<>();
        images.add(R.raw.larguscr1);
        images.add(R.raw.larguscr2);
        images.add(R.raw.largus3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand11), getResources().getString(R.string.model11), getResources().getString(R.string.year11), getResources().getString(R.string.price11), getResources().getString(R.string.description11), R.raw.larguscr1, images));
        images = new ArrayList<>();
        images.add(R.raw.fur);
        images.add(R.raw.fur2);
        images.add(R.raw.fur3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand12), getResources().getString(R.string.model12), getResources().getString(R.string.year12), getResources().getString(R.string.price12), getResources().getString(R.string.description12), R.raw.fur, images));
        images = new ArrayList<>();
        images.add(R.raw.mini1);
        images.add(R.raw.mini2);
        images.add(R.raw.mini3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand4), getResources().getString(R.string.model4), getResources().getString(R.string.year4), getResources().getString(R.string.price4), getResources().getString(R.string.description4), R.raw.mini1, images));
        images = new ArrayList<>();
        images.add(R.raw.lf1);
        images.add(R.raw.lf2);
        images.add(R.raw.lf3);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand13), getResources().getString(R.string.model13), getResources().getString(R.string.year13), getResources().getString(R.string.price13), getResources().getString(R.string.description13), R.raw.lf1, images));
        images = new ArrayList<>();
        images.add(R.raw.cr);
        images.add(R.raw.cr1);
        images.add(R.raw.cr2);
        vehicleList.add(new Vehicle(getResources().getString(R.string.brand6), getResources().getString(R.string.model6), getResources().getString(R.string.year6), getResources().getString(R.string.price6), getResources().getString(R.string.description6), R.raw.cr, images));





        RecyclerView rec = view.findViewById(R.id.recycle);
        rec.setLayoutManager(new LinearLayoutManager(getContext()));

        CustomCardViewAdapter adapter = new CustomCardViewAdapter(vehicleList);
        rec.setAdapter(adapter);

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
