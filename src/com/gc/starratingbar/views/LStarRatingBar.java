package com.gc.starratingbar.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/**
 * 
 * @author Android����
 * @function ˮƽ��ֱ���Զ���RatingBar
 * @time 2015/07/27
 */
public class LStarRatingBar extends LinearLayout{

	private Context mContext;
	public LStarRatingBar(Context context) {
		this(context, null);
		
	}

	public LStarRatingBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.mContext=context;
		
	}

}
