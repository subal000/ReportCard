package com.android.example.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ResultAdapter extends ArrayAdapter<Result> {
    private static final String LOG_TAG = ResultAdapter.class.getSimpleName();

    public ResultAdapter(Activity context, ArrayList<Result> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.resultdetail, parent, false);
        }

        Result currentResult = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.Name0);
        name.setText(currentResult.getmName());
        TextView physics = (TextView) listItemView.findViewById(R.id.Phy0);
        physics.setText(currentResult.getmPhysics());
        TextView chemistry = (TextView) listItemView.findViewById(R.id.Chem0);
        chemistry.setText(currentResult.getmPhysics());
        TextView maths = (TextView) listItemView.findViewById(R.id.Math0);
        maths.setText(currentResult.getmMaths());
        return listItemView;

    }
}
