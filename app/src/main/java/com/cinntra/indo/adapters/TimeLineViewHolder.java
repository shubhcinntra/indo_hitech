package com.cinntra.indo.adapters;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import com.cinntra.indo.R;
import com.tcqq.timelineview.TimelineView;


public class TimeLineViewHolder extends RecyclerView.ViewHolder {

    public TimelineView mTimelineView;



    public TimeLineViewHolder(View itemView, int viewType) {
        super(itemView);
        mTimelineView = (TimelineView) itemView.findViewById(R.id.timeline);
        mTimelineView.initLine(viewType);
    }




}
