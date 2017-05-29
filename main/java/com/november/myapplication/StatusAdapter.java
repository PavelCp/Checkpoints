package com.november.myapplication;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by November on 29.05.2017.
 */

public class StatusAdapter extends ArrayAdapter<Checkpoint> {

    public StatusAdapter(Context context, List<Checkpoint> checkpoints) {
        super(context, 0, checkpoints);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.checkpoint, parent, false);
        }

        Checkpoint currentCheckpoint = getItem(position);
        TextView checkpointNameView = (TextView) listItemView.findViewById(R.id.pointName);
        TextView checkpointStatusView = (TextView) listItemView.findViewById(R.id.pointStatus);

        checkpointNameView.setText(currentCheckpoint.getCheckpointName());
        checkpointNameView.setTextSize(20);
        checkpointStatusView.setText(currentCheckpoint.getCheckpointStatus());
        checkpointStatusView.setTextSize(20);
        return listItemView;
    }

}
