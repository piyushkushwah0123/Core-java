package com.stream.piyush;

import java.util.Optional;

public class User {
	
	public Optional<String>getuserName(int id){
		if(id==101) {
			return Optional.ofNullable("Daksh");
		}
		else if(id==102) {
			return Optional.ofNullable("Ahmad");
		}
		else if(id==103) {
			return Optional.ofNullable("Piyush");
		}
		else if(id==104) {
			return Optional.ofNullable("Vansh");
		}
		else if(id==105) {
			return Optional.ofNullable("Shubam");
		}
		else if(id==106) {
			return Optional.ofNullable("Seam");
		}
		else if(id==107) {
			return Optional.ofNullable("Ronak");
		}
		return null; 
		
		
	}

}
