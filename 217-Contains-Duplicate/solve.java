HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 for(int i=0; i<nums.length; i++){
		 
		if(map.containsKey(nums[i]))
			 	return true;	
	 	map.put(nums[i], i);
	 }
	 
	 return false;
    }
