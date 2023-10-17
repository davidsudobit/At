package com.JavaAllAtOnce;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGenerator {
	
	public static Map<Integer,String> generate(){
		
		Random random=new Random();
		
		return random.ints(65, 122).limit(30).boxed().collect(Collectors.<Integer,Integer,String,LinkedHashMap<Integer,String>>toMap(Function.identity(), value->"value"+value, (value01,value02)->value01,LinkedHashMap<Integer, String>::new));
		
	}

}
