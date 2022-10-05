package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	B001("TSDU001001 Admin membuka data users page"),//1
//	1
	
	B002("TSDU002 Admin mencari name, email, dan status dengan tombol search"),//3
	B003("TSDU002 Admin mencari name, email, dan status data dengan tombol hijau"),//3
	B004("TSDU002 Admin mencari name, email, dan status data dengan enter"),//3
//	3,3,3
	
	B005("TSDU003001 Admin menampilkan data dengan status NON ACTIVE"),//1
//	1
	
	B006("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B007("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B008("TSDU004 Admin ingin menampilkan beberapa data NON ACTIVE berdasarkan name dan email menggunakan enter"),//2
//	2,2,2
	
	B009("TSDU005001 Admin menampilkan data dengan status ACTIVE"),//1
//	1
	
	B010("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol search"),//2
	B011("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan tombol hijau"),//2
	B012("TSDU006 Admin ingin menampilkan beberapa data ACTIVE berdasarkan name dan email menggunakan enter"),//2
//	2,2,2
	
	B013("TSDU007 Admin ingin melihat detail salah satu Data Users"),//1
//	1
	
	B014("TSDU008001 Admin klik  icon edit"),//1
	B015("TSDU008002 Admin edit status user NON ACTIVE menjadi ATCIVE validasi pop up"),//1
	B016("TSDU008003 Admin edit status user NON ACTIVE menjadi ATCIVE validasi dengan data"),//1
	B017("TSDU008004 Admin edit kategori dengan mencentang kategori STAFF di status Admin NON ACTIVE"),//1
	B018("TSDU008005 Admin edit kategori dengan mencentang kategori LEADER di status Admin NON ACTIVE"),//1
	B020("TSDU008006 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User NON ACTIVE"),//1
	B021("TSDU008007 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User NON ACTIVE"),//1
	B019("TSDU008008 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User NON ACTIVE"),//1
	B022("TSDU008009 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User NON ACTIVE"),//1
//	1,1,1,1,1,1,1,1,1
	
	B023("TSDU009001 Admin edit status user ACTIVE menjadi NON ATCIVE validasi pop up"),//1
	B024("TSDU009002 Admin edit status user ACTIVE menjadi NON ATCIVE validasi dengan data"),//1
	B025("TSDU009003 Admin edit kategori dengan mencentang kategori STAFF di status User ACTIVE"),//1
	B026("TSDU009004 Admin edit kategori dengan mencentang kategori LEADER di status User ACTIVE"),//1
	B028("TSDU009005 Admin edit kategori dengan menghilangkan centang kategori STAFF di status User ACTIVE"),//1
	B029("TSDU009006 Admin edit kategori dengan menghilangkan centang kategori LEADER di status User ACTIVE"),//1
	B027("TSDU009007 Admin edit kategori dengan mencentang kategori STAFF dan LEADER di status User ACTIVE"),//1
	B030("TSDU009008 Admin edit kategori dengan menghilangkan centang kategori STAFF dan LEADER di status User ACTIVE"),//1
//	1,1,1,1,1,1,1,1
	
	B031("TSDU010001 Admin klik icon edit password"),//1
	B032("TSDU010002 Admin edit password non active user"),//1
	B033("TSDU010003 Admin edit password active user"),//1
//	1,1,1
	
	B034("TSDU011001 Admin klik show page 10 NON ACTIVE User"),//1
	B035("TSDU011002 Admin klik page 1 NON ACTIVE User"),//1
	B036("TSDU011003 Admin klik page 2 NON ACTIVE User"),//1
	B037("TSDU011004 Admin klik page 3 NON ACTIVE User"),//1
	B038("TSDU011005 Admin klik page 4 NON ACTIVE User"),//1
	B039("TSDU011006 Admin klik page 5 NON ACTIVE User"),//1
	B040("TSDU011007 Admin klik page 6 NON ACTIVE User"),//1
	B041("TSDU011008 Admin klik page 7 NON ACTIVE User"),//1
	B042("TSDU011009 Admin klik page 8 NON ACTIVE User"),//1
	B043("TSDU011010 Admin klik page 9 NON ACTIVE User"),//1
	B044("TSDU011011 Admin klik page 10 NON ACTIVE User"),//1
	B045("TSDU011012 Admin klik icon << NON ACTIVE User"),//1
	B046("TSDU011013 Admin klik icon >> NON ACTIVE User"),//1
//	1,1,1,1,1,1,1,1,1,1,1,1,1
	
	B047("TSDU011014 Admin klik show page 25 NON ACTIVE User"),//1
	B048("TSDU011015 Admin klik page 1 NON ACTIVE User"),//1
	B049("TSDU011016 Admin klik page 2 NON ACTIVE User"),//1
	B050("TSDU011017 Admin klik page 3 NON ACTIVE User"),//1
	B051("TSDU011018 Admin klik page 4 NON ACTIVE User"),//1
	B052("TSDU011019 Admin klik icon << NON ACTIVE User"),//1
	B053("TSDU011020 Admin klik icon >> NON ACTIVE User"),//1
//	1,1,1,1,1,1,1
	
	B054("TSDU011021 Admin klik show page 50 NON ACTIVE User"),//1
	B055("TSDU011022 Admin klik page 1 NON ACTIVE User"),//1
	B056("TSDU011023 Admin klik page 2 NON ACTIVE User"),//1
	B057("TSDU011024 Admin klik icon << NON ACTIVE User"),//1
	B058("TSDU011025 Admin klik icon >> NON ACTIVE User"),//1
//	1,1,1,1,1
	
	B059("TSDU011026 Admin klik show page 100 NON ACTIVE User"),//1
	B060("TSDU011027 Admin klik page 1 NON ACTIVE User"),//1
//	1,1
	
	B061("TSDU011028 Admin klik show page 10 ACTIVE User"),//1
	B062("TSDU011029 Admin klik page 1 ACTIVE User"),//1
	B063("TSDU011030 Admin klik page 2 ACTIVE User"),//1
	B064("TSDU011031 Admin klik page 3 ACTIVE User"),//1
	B065("TSDU011032 Admin klik page 4 ACTIVE User"),//1
	B066("TSDU011033 Admin klik page 5 ACTIVE User"),//1
	B067("TSDU011034 Admin klik page 6 ACTIVE User"),//1
	B068("TSDU011035 Admin klik page 7 ACTIVE User"),//1
	B069("TSDU011036 Admin klik page 8 ACTIVE User"),//1
	B070("TSDU011037 Admin klik page 9 ACTIVE User"),//1
	B071("TSDU011038 Admin klik page 10 ACTIVE User"),//1
	B072("TSDU011039 Admin klik icon << ACTIVE User"),//1
	B073("TSDU011040 Admin klik icon >> ACTIVE User"),//1
//	1,1,1,1,1,1,1,1,1,1,1,1,1
	
	B074("TSDU011041 Admin klik show page 25 ACTIVE User"),//1
	B075("TSDU011042 Admin klik page 1 ACTIVE User"),//1
	B076("TSDU011043 Admin klik page 2 ACTIVE User"),//1
	B077("TSDU011044 Admin klik page 3 ACTIVE User"),//1
	B078("TSDU011045 Admin klik page 4 ACTIVE User"),//1
	B079("TSDU011046 Admin klik icon << ACTIVE User"),//1
	B080("TSDU011047 Admin klik icon >> ACTIVE User"),//1
//	1,1,1,1,1,1,1
	
	B081("TSDU011048 Admin klik show page 50 ACTIVE User"),//1
	B082("TSDU011049 Admin klik page 1 ACTIVE User"),//1
	B083("TSDU011050 Admin klik page 2 ACTIVE User"),//1
	B084("TSDU011051 Admin klik icon << ACTIVE User"),//1
	B085("TSDU011052 Admin klik icon >> ACTIVE User"),//1
//	1,1,1,1,1
	
	B086("TSDU011053 Admin klik show page 100 ACTIVE User"),//1
	B087("TSDU011054 Admin klik page 1 ACTIVE User"),//1
//	1,1
	
	B088("TSDU012001 Admin export semua NON ACTIVE User"),//1
	B089("TSDU012002 Admin export NON ACTIVE user berdasarkan name, email"),//2
	B090("TSDU012003 Admin export semua ACTIVE User"),//1
	B091("TSDU012002 Admin export ACTIVE user berdasarkan name, email"),//2
//	1,2,1,2
	
	B092("TSDUN001001 Admin search field kosong pada status NON ACTIVE"),//1
	B093("TSDUN001002 Admin search dengan value kombinasi pada status NON ACTIVE"),//1
	B094("TSDUN001003 Admin search field kosong pada status ACTIVE"),//1
	B095("TSDUN001004 Admin search dengan value kombinasi pada status ACTIVE"),//1
//	1,1,1,1
	
	B096("TSDUN002001 Admin klik icon panah di sebelah kanan status User NON ACTIVE"),//1
	B097("TSDUN002002 Admin klik icon panah di sebelah kanan status User NON ACTIVE dengan search field diisi data"),//1
	B098("TSDUN002003 Admin klik icon panah di sebelah kanan status User ACTIVE"),//1
	B099("TSDUN002002 Admin klik icon panah di sebelah kanan status User ACTIVE dengan search field diisi data"),//1
//	1,1,1,1
	
	B100("TSDUN003001 Admin edit status NON ACTIVE dengan value (pilih)"),//1
	B101("TSDUN003002 Admin edit status ACTIVE dengan value (pilih)"),//1
//	1,1
	
	B102("TSDUN004001 Admin klik tombol X di pop up View"),//1
	B103("TSDUN004001 Admin klik tombol X di pop up View"),//1
	B104("TSDUN004001 Admin klik tombol X di pop up View"),//1
//	1,1,1
	
	B105("TSDUN005001 Admin edit password user dengan field kosong"),//1
	B106("TSDUN005002 Admin edit password user dengan value kurang dari 9 karakter"),//1
	B107("TSDUN005003 Admin edit password user dengan field kosong"),//1
	B108("TSDUN005004 Admin edit password user dengan value kurang dari 9 karakter"),//1
//	1,1,1,1
	
	B109("TSRP001001 Admin membuka halaman report"),//1
//	1
	
	B110("TSRP002001 Admin mencari data report"),//1
	B111("TSRP002002 Admin export report"),//1
//	1,1
	
	B112("TSRPN001 Search Report invalid"),//1
//	1
	
	B113("TSRA001001 Admin membuka remove activity page"),//1
//	1
	
	B114("TSRA002001 Admin mencari data berdasarkan NIK, Nama, Email, Telpon"),//4
//	4
	
	B115("TSRA003001 Admin klik icon delete"),//1
	B116("TSRA003002 Admin delete data"),//1
//	1,1
	
	B117("TSRAN001001 Admin mencari data berdasarkan Value kosong, kombinasi, nilai, tipe modul, dan nama modul"),//5
//	5
	
	B118("TSRAN002001 Admin klik tombol X");//1
//	1
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
