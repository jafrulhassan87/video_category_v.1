
package com.jafrulhasan.videocategory;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();



		//==========================================================================
		addVideoItem("RVpzTqwUOaw", "যেভাবে কালি লিনাক্স Windows এ ইন্সটল দিবেন", "Cyber Security full course step by step");
		addVideoItem("cyXxj2ScNFM", "How to install Volatility? 100 % working possibility ", "Cyber Security full course step by step");
		addVideoItem("Z6Is3LrL2t0", "Full Steganography Course For Beginnger", "Cyber Security full course step by step");
		addVideoItem("eoe32YcMlAM", "Burp-Suite যেভাবে কনফিগার করবেন", "Cyber Security full course step by step");
		addVideoItem("X9xpXEQ5PkQ", "যেভাবে Try Hack Me তে VPN কানেকশন দিবেন", "Cyber Security full course step by step");
		addVideoItem("Rg6TFfyCKg4", "How to Tor Browser Work ।। Dark Web", "Cyber Security full course step by step");
		addVideoItem("8rsc7F7onqI", "Ethical Hacking Live Class 1: Burp Suite A to Z Part 1 | Web Pentesting | Bug - Hunting", "Cyber Security full course step by step");
		addVideoItem("Y5tQtP8XD2Q", "Ethical Hacking Live Class 2: Burp Suite A to Z Part 2 | Web Pentesting | Bug - Hunting", "Cyber Security full course step by step");
		addVideoItem("cgZ8TlxBZlM", "Ethical Hacking Live Class 3: Hydra & OWASP ZAP | Web Pentesting | Bug - Hunting", "Cyber Security full course step by step");
		addVideoItem("UFSmjq71cQ8", "Ethical Hacking Live Class 4:IDOR Vulnerabilities | Web Penetration Testing | Bug-Hunting", "Cyber Security full course step by step");
		addVideoItem("q8pYgptz9wY", "Ethical Hacking Live Class 5:Browser Force Vulnerabilities | Web Penetration Testing | Bug-Hunting", "Cyber Security full course step by step");
		createPlayList("Cyber Security", R.drawable.cyber_security);
		//==========================================================================


		//==========================================================================
		addVideoItem("EyghgFahrk4", "Elimination of Left Recursion (part-1)", "Compiler Design");
		addVideoItem("pVRlYHkFiAo", "Elimination of Left Recursion (part-2)", "Compiler Design");
		addVideoItem("Yk7Ht9N8H5U", "Elimination of Left Recursion (part-3)", "Compiler Design");
		addVideoItem("k3jCmBD0sKU", "Elimination of Left Recursion (part-4)", "Compiler Design");
		addVideoItem("qy9fixRKZeM", "Left Factoring (Part-1)", "Compiler Design");
		addVideoItem("ND6Foi8ml1c", "Left Factoring (Part-2)", "Compiler Design");
		addVideoItem("t4Ptuy6ck00", "First and Follow (part-1)", "Compiler Design");
		addVideoItem("OT8uPHCW7bY", "First and Follow (part-2)", "Compiler Design");
		createPlayList("Compiler Design", R.drawable.compiler);
		//==========================================================================


		//==========================================================================
		addVideoItem("aFuUidBR1aQ", " If You Laugh, You Will Lose ", "Pets Reaction Videos");
		addVideoItem("NyN23EVyXYA", "Funniest Catsss", "Pets Reaction Videos");
		addVideoItem("EmasQEqG1T8", "Funny Cats Life", "Pets Reaction Videos");
		addVideoItem("KMXm1IZ81Qc", "Funniest Animals - Best Of ", "Pets Reaction Videos");
		addVideoItem("uHKfrz65KSU", "Baby Cats - Cute and Funny awwww Cat Videos", "Pets Reaction Videos");
		addVideoItem("NAFgjPGiNLU", "Cat Reaction to Playing Balloon", "Pets Reaction Videos");
		addVideoItem("zQIawgxoox4", "Baby Cats - Cute and Funny Cat", "Pets Reaction Videos");
		addVideoItem("mbfiE40az_0", "Funniest Animals - Best Of The 2021 Funny Animal Videos", "Pets Reaction Videos");
		addVideoItem("GVWVnV4tNdk", "Funniest cats and dogs", "Pets Reaction Videos");
		addVideoItem("ByH9LuSILxU", "Baby Cats - Cute and Funny ", "Pets Reaction Videos");
		addVideoItem("I5dtDcXTAPg", "Baby Cats - Cute and Funny Cat Videos", "Pets Reaction Videos");
		addVideoItem("HGK07dQbq74", "Angry Cats ", "Pets Reaction Videos");
		createPlayList("Pets Lover", R.drawable.cat);
		//==========================================================================


		//==========================================================================
		addVideoItem("QAzIMWrSLB8", "Cat and Dog Break Into Pound", "Real cat funny cartoon for kids");
		addVideoItem("ABM0eg_-djs", "The Cat Who Saved the Duckling", "Real cat funny cartoon for kids");
		addVideoItem("iKA6ZXpGcGQ", "Cats and Dragons", "Real cat funny cartoon for kids");
		addVideoItem("ekiZB-naDcE", "CATch Me If You Can 3", "Real cat funny cartoon for kids");
		addVideoItem("YIgCs4V1WwQ", "Cat Runs for Mayor", "Real cat funny cartoon for kids");
		addVideoItem("U-C0I-Ks14M", "The Runaway Duck", "Real cat funny cartoon for kids");
		addVideoItem("Z-49hrLY6y0", "Romeow & Juliet", "Real cat funny cartoon for kids");
		addVideoItem("jH7e1fDcZnY", "The Cat Raised by a Mouse", "Real cat funny cartoon for kids");
		addVideoItem("iwMqsKDTdQ0", "The Cat Cooking Show 2", "Real cat funny cartoon for kids");
		addVideoItem("bN93gt3-dhg", "Cat & Mean Birds", "Real cat funny cartoon for kids");
		addVideoItem("o1YA_6tXs5E", "Cat and Dog Road Trip", "Real cat funny cartoon for kids");
		createPlayList("Cartoon", R.drawable.cartoon);
		//==========================================================================


		//==========================================================================
		addVideoItem("qaJrxuLlCyU", "অনুপ্রেরণামূলক সংক্ষিপ্ত ওয়াজ", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("dwEKMafk63A", "এমন ওয়াজ জীবনেও শুনি নাই কান্নার ওয়াজ", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("yDadc4dkMVc", "অনুপ্রেরণামূলক সংক্ষিপ্ত ওয়াজ-2", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("zRyRhND7dPY", "আবেগপূর্ণ সংক্ষিপ্ত ওয়াজ", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("2fGFNSHRrH4", "বড্ড নাফরমান আমরা", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("_usxjcY9gP8", "আল্লাহর ওয়াস্তে মনের কান টা খুলে দেন", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("xq4vHq7x19c", "এমন ওয়াজ ইদানিং শুনাই যায়না", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("VzOyq1AKEsw", "মা ❤️", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("9dEX4KE4XTM", "আমাদের আসল সাফল্য কোথায়?", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("qwi84tX4Bog", "সবচাইতে সুখী পুরুষরা নাকি মহিলারা?", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("KryLL3cE20k", "প্রধানমন্ত্রীর কাছে একটা অনুরোধ", "সৈয়্যদ মোকাররম বারী");
		addVideoItem("s6-24_50HGk", "কান্না ধরে রাখতে পারবেন না আপনি", "সৈয়্যদ মোকাররম বারী");
		createPlayList("Bangla Waz", R.drawable.kuran);
		//==========================================================================



		//==========================================================================
		addVideoItem("js2xG9BpDQs", "কে ছিলেন আরতুগ্রুল গাজী?", "কে ছিলেন আরতুগ্রুল গাজী?");
		addVideoItem("hT16TnxCcrQ", "Ertugrul and alps rescue Sahabuddin", "Ertugrul best scene");
		addVideoItem("m-UKn75Mm84", "Ibnul Arabi confronts Ustadi Azam", "Ibnul Arabi best scene");
		addVideoItem("8noFFKvR63M", "Deli Demir advices Ertugrul", "Deli Demir advices Ertugrul");
		addVideoItem("QdesyKo93Hk", "Turgut is in a very bad sitution", "Turgut alp is in a very bad situation");
		addVideoItem("g6DzugRzUfY", "Ertugrul Cuts Mongol Hand", "Ertugrul Cuts Mongol Hand");
		addVideoItem("IWvF3c4_YRE", "Ibnul Al Arabi Save Ertugrul", "Ibnul Al Arabi Save Ertugrul");
		addVideoItem("0xKwztwZElA", "Ertugrul Save Hanli Bazar", "Ertugrul Save Hanli Bazar");
		createPlayList("Ertugrul best clips", R.drawable.ertugrul_flag);
		//==========================================================================




		//==========================================================================
		addVideoItem("srdbPK0Vmoc", "এই রকম এনিমি জীবনেও দেখি নি", "PUBG_MOBILE");
		addVideoItem("TptaxSZcCmo", "ব্রিজ ক্যাম্পে অসমাপ্ত তামাশা ", "PUBG_MOBILE");
		addVideoItem("cVF_7uqszvE", "এনিমির গভীর বন্ধুত্ব", "PUBG_MOBILE");
		addVideoItem("ncE6mQrPmbA", "এক লুকায়িত সাপের গল্প", "PUBG_MOBILE");
		addVideoItem("2ezkVsDm-UI", "ওরে তামাশা, এনিমির বাঁচার কত আশা", "PUBG_MOBILE");
		addVideoItem("1mJbIjfGnWQ", "দিনশেষে সাপই খাপে খাপ ক্যাম্পারের বাপ", "PUBG_MOBILE");
		addVideoItem("d0SGuAdAb_E", "প্রো স্কোয়াডের বড় আশা - করে দিলাম বেহাল দশা", "PUBG_MOBILE");
		addVideoItem("aoP7AN9mtoM", "রাগান্বিত কিউট প্লেয়ারের সাথে নমনীয় আচরণ", "PUBG_MOBILE");
		addVideoItem("UG1XPJF5OPA", "সকল নষ্টের মূলে যখন এই এনিমি", "PUBG_MOBILE");
		addVideoItem("sTMLGp0m6XQ", "বট চোরদের অবস্থার ব্যবস্থা করলাম", "PUBG_MOBILE");
		createPlayList("PUBG Funny Clips", R.drawable.ppubg);

		//==========================================================================


		//==========================================================================
		addVideoItem("srdbPK0Vmoc", "এই রকম এনিমি জীবনেও দেখি নি", "PUBG_MOBILE");
		addVideoItem("TptaxSZcCmo", "ব্রিজ ক্যাম্পে অসমাপ্ত তামাশা ", "PUBG_MOBILE");
		addVideoItem("cVF_7uqszvE", "এনিমির গভীর বন্ধুত্ব", "PUBG_MOBILE");
		addVideoItem("ncE6mQrPmbA", "এক লুকায়িত সাপের গল্প", "PUBG_MOBILE");
		addVideoItem("2ezkVsDm-UI", "ওরে তামাশা, এনিমির বাঁচার কত আশা", "PUBG_MOBILE");
		addVideoItem("1mJbIjfGnWQ", "দিনশেষে সাপই খাপে খাপ ক্যাম্পারের বাপ", "PUBG_MOBILE");
		addVideoItem("d0SGuAdAb_E", "প্রো স্কোয়াডের বড় আশা - করে দিলাম বেহাল দশা", "PUBG_MOBILE");
		addVideoItem("aoP7AN9mtoM", "রাগান্বিত কিউট প্লেয়ারের সাথে নমনীয় আচরণ", "PUBG_MOBILE");
		addVideoItem("UG1XPJF5OPA", "সকল নষ্টের মূলে যখন এই এনিমি", "PUBG_MOBILE");
		addVideoItem("sTMLGp0m6XQ", "বট চোরদের অবস্থার ব্যবস্থা করলাম", "PUBG_MOBILE");
		createPlayList("PUBG Funny Clips", R.drawable.icon_warrior);

		//==========================================================================













	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

