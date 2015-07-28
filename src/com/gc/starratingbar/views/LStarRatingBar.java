package com.gc.starratingbar.views;

import com.gc.starratingbar.R;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/**
 * 
 * @author Android����
 * @function ˮƽ��ֱ���Զ���RatingBar
 * @time 2015/07/27
 */
@SuppressLint("Recycle") 
public class LStarRatingBar extends LinearLayout{

	private Context mContext;
	/**
	 * ֵΪ0ʱˮƽ���У�ֵΪ1ʱ��ֱ����
	 */
	private int orientation;
	/**
	 * ����ֵ�Ĳ�ͬӦ�ò�ͬ�Ķ���Ч��
	 */
	private int animationEffect;
	/**
	 * ����δѡ�е�ͼƬ��Դ
	 */
	private Drawable starUnselect;
	/**
	 * ����ѡ�е�ͼƬ��Դ
	 */
	private Drawable starSelected;
	/**
	 * ����ѡ�е���������
	 */
	private int starSelectedNum;
	public LStarRatingBar(Context context) {
		this(context, null);
		
	}

	public LStarRatingBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.mContext=context;
		TypedArray mTypedArray=context.obtainStyledAttributes(attrs, R.styleable.LStarRatingBar);
		//��ȡ�Զ������Ե�ֵ
		orientation=mTypedArray.getInt(R.styleable.LStarRatingBar_orientation, 0);
		animationEffect=mTypedArray.getInt(R.styleable.LStarRatingBar_animationEffect, 0);
		starUnselect=mTypedArray.getDrawable(R.styleable.LStarRatingBar_starUnselect);
		starSelected=mTypedArray.getDrawable(R.styleable.LStarRatingBar_starSelected);
		starSelectedNum=mTypedArray.getInt(R.styleable.LStarRatingBar_starSelectedNum, 0);
	}
	
	

}
