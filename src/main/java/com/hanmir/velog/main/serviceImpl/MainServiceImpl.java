package com.hanmir.velog.main.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.hanmir.velog.main.service.MainService;

@SuppressWarnings("rawtypes")
@Service("mainService")
public class MainServiceImpl implements MainService{

	
	@Override
	public HashMap getPostCount() {
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			list.add(i, i);
		}
		
		map.put("postCount", list);
		
		return map;
	}
	
}
