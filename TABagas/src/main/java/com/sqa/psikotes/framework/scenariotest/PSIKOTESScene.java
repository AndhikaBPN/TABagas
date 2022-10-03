package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	B1("TSDU001001 Admin membuka data users page"),//1
	B2("TSDU002 Admin mencari name, email, dan status dengan tombol search"),//3
	B3("TSDU002 Admin mencari name, email, dan status data dengan tombol hijau"),//3
	B4("TSDU002 Admin mencari name, email, dan status data dengan enter"),//3
	B5("TSDU003001 Admin menampilkan data dengan status NON ACTIVE"),//1
	B6("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B7("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B8("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan enter"),//2
	B9("TSDU005001 Admin menampilkan data dengan status ACTIVE"),//1
	B10("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B11("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B12("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan enter"),//2
	B13("TSDU007 Admin ingin melihat detail salah satu Data Users"),//1
	B14("TSDU008001 Admin klik  icon edit"),//1
	B15("TSDU008002 Admin edit status user NON ACTIVE menjadi ATCIVE validasi pop up"),//1
	B16("TSDU008003 Admin edit status user NON ACTIVE menjadi ATCIVE validasi dengan data"),//1
	B17("TSDU008004 Admin edit kategori dengan mencentang kategori STAFF di status Admin NON ACTIVE"),//1
	B18("TSDU008005 Admin edit kategori dengan mencentang kategori LEADER di status Admin NON ACTIVE"),//1
	B19("TSDU008006 Admin edit kategori dengan mencentang kategori LEADER di status Admin NON ACTIVE"),//1
	B20("TSDU008007 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User NON ACTIVE"),//1
	B21("TSDU008008 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User NON ACTIVE"),//1
	B22("TSDU008009 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User NON ACTIVE");//1
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
