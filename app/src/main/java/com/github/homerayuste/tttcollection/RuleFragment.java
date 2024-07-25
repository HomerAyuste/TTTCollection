package com.github.homerayuste.tttcollection;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.homerayuste.tttcollection.databinding.FragmentRuleBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RuleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RuleFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String TITLE = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String title = "R ule";
    private String mParam2;

    public RuleFragment() {
        // Required empty public constructor
    }
    public RuleFragment(String title){
        this.title = title;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RuleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RuleFragment newInstance(String param1, String param2) {
        RuleFragment fragment = new RuleFragment();
        Bundle args = new Bundle();
        args.putString(TITLE, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(TITLE);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_rule, container, false);
        //setTitleText(this.title);
        FragmentRuleBinding fragmentRuleBinding = FragmentRuleBinding.inflate(inflater,container,false);
        View view = fragmentRuleBinding.getRoot();
        fragmentRuleBinding.ruleName.setText(this.title);
        //setTitleText(this.title, view);
        return view;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}