package org.danielroa.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class WWhiteFragment extends Fragment {


    private TextView tvText;

    public WWhiteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_wwhite, container, false);

        initWidgets(view);
        setupListeners();

        return view;
    }

    private void initWidgets(View view) {
        tvText = view.findViewById(R.id.tvText);
    }

    private void setupListeners() {
        tvText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();

            }

        });
    }

}
