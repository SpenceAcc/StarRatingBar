package com.gc.starratingbar.views;

import com.gc.starratingbar.R;
import com.gc.starratingbar.constants.StarContants;

import android.R.integer;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
/**
 * 
 * @author Android����
 * @function ˮƽ��ֱ���Զ���RatingBar,���������Ϊ5
 * @time 2015/07/27
 */
@SuppressLint({ "Recycle", "NewApi" }) 
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
	private ImageView mIvStarOne,mIvStarSecond,mIvStarThree,mIvStarFour,mIvStarFive;
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
		initView();
		startAnimation();
	}
	private void  initView()
	{
		removeAllViews();
		mIvStarOne=new ImageView(mContext);
		mIvStarOne.setBackground(starUnselect);
		mIvStarSecond=new ImageView(mContext);
		mIvStarSecond.setBackground(starUnselect);
		mIvStarThree=new ImageView(mContext);
		mIvStarThree.setBackground(starUnselect);
		mIvStarFour=new ImageView(mContext);
		mIvStarFour.setBackground(starUnselect);
		mIvStarFive=new ImageView(mContext);
		mIvStarFive.setBackground(starUnselect);
		LayoutParams mLayoutParams=new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		setOrientation(orientation);
		this.addView(mIvStarOne, mLayoutParams);
		this.addView(mIvStarSecond, mLayoutParams);
		this.addView(mIvStarThree, mLayoutParams);
		this.addView(mIvStarFour, mLayoutParams);
		this.addView(mIvStarFive, mLayoutParams);
		
	}
	private void startAnimation()
	{
		switch (animationEffect) {
		case StarContants.defEffect:
			
			break;
		case StarContants.scaleEffect:
			
			break;
		default:
			break;
		}
	}
	

}
