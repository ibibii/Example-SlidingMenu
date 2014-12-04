package com.qf.example_slidingmenu;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
//问题:setBehindOffsetRes值大,不容易拖出来.两个界面有交叉.
public class MainActivity extends Activity {
	//ViewPager viewPager ; 测试是否成功.
	private SlidingMenu menu ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setTitle("SlidingMenu滑动");
		setContentView(R.layout.activity_main);
		menu = new SlidingMenu(this);
		menu.setMode(SlidingMenu.LEFT);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setShadowDrawable(R.drawable.shadow);
		menu.setShadowWidth(R.dimen.shadow_width);
		menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);//另一部分
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		menu.setMenu(R.layout.menu);
	}
}
