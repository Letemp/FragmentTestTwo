package com.example.fragmenttesttwo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTwo extends Fragment {

	public fragmentBtnClickListener fbcl;
	
	//定义接口
	public interface fragmentBtnClickListener{
		//在方法中传递数据
		public void changActivity(String data);
	}
	
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		//onAttach在activity加载时就调用
		super.onAttach(activity);
		//强制转换为fragment的接口
		fbcl=(fragmentBtnClickListener) activity;

	}

	/*public void setfragmentBtnClickListener(fragmentBtnClickListener f2){
		this.fbcl=f2;
	}*/
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view=inflater.inflate(R.layout.fragment_two, container, false);
		
		Button btnFragment2=(Button) view.findViewById(R.id.btnFragment2);
	    btnFragment2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				fbcl.changActivity("瑶湖");
			}
		});
		
		return view;
	}

}
