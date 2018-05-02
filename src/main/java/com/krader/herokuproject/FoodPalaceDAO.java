package com.krader.herokuproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FoodPalaceDAO {
	private static final Map<String, FoodPalace> foodMap = new HashMap<String, FoodPalace>();
	static {
		initfoods();
	}

	private static void initfoods() {
		FoodPalace fp1 = new FoodPalace("1", "Tiệm chè anh Bảy", "nhà anh Bảy", "091239754");
		FoodPalace fp2 = new FoodPalace("2", "Tiệm trà sữa chú Tư", "nhà vợ chú Tư", "54036960");
		FoodPalace fp3 = new FoodPalace("3", "Tiệm hớt tóc chị Dậu", "ngã tư chị Dậu", "817367907");

		foodMap.put(fp1.getId(), fp1);
		foodMap.put(fp2.getId(), fp2);
		foodMap.put(fp3.getId(), fp3);
	}

	public static FoodPalace getFoodPalace(String id) {
		return foodMap.get(id);
	}

	public static FoodPalace addFoodPalace(FoodPalace fp) {
		foodMap.put(fp.getId(), fp);
		return fp;
	}

	public static FoodPalace updateFoodPalace(FoodPalace fp) {
		foodMap.put(fp.getId(), fp);
		return fp;
	}

	public static void deleteFoodPalace(String id) {
		foodMap.remove(id);
	}

	public static ArrayList<FoodPalace> getAllFoodPalaces() {
		Collection<FoodPalace> c = foodMap.values();
		ArrayList<FoodPalace> list = new ArrayList<FoodPalace>();
		list.addAll(c);
		return list;
	}

}
