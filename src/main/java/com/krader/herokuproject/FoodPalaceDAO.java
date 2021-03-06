package com.krader.herokuproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
		FoodPalace fp4 = new FoodPalace("4", "Chả cá chú Hào", "ngã tư chị Dậu", "817367907");
		FoodPalace fp5 = new FoodPalace("5", "Làng sen cô Huy", "Đàn cò Đồng Tháp", "1231241241");
		FoodPalace fp6 = new FoodPalace("6", "Thịt voi anh Nhi", "Buôn Mê Thuộc", "4214124124");
		FoodPalace fp7 = new FoodPalace("7", "Thịt gà ngựa Khếnh Tòn", "Hóc Môn", "412412412");
		FoodPalace fp8 = new FoodPalace("8", "Hành xào Nam xoăn", "Gò Vấp", "817367907");
		FoodPalace fp9 = new FoodPalace("9", "Cứ vội chú Tấn", "Q9", "1241241242");
		


		foodMap.put(fp1.getId(), fp1);
		foodMap.put(fp2.getId(), fp2);
		foodMap.put(fp3.getId(), fp3);
		foodMap.put(fp4.getId(), fp4);
		foodMap.put(fp5.getId(), fp5);
		foodMap.put(fp6.getId(), fp6);
		foodMap.put(fp7.getId(), fp7);
		foodMap.put(fp8.getId(), fp8);
		foodMap.put(fp9.getId(), fp9);

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

	List<FoodPalace> list;

}
