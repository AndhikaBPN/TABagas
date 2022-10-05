#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSMPDS001 Tambah deskripsi

  @tag1
  Scenario: TSMPDS001001 Admin klik icon plus
  	Given TSMPDS001001 Admin sudah login dan sudah membuka halaman modul
    When TSMPDS001001 Admin klik icon plus
    Then TSMPDS001001 Muncul pop up
    
  @tag2
  Scenario: TSMPDS001002 Admin tambah deskripsi modul
  	Given TSMPDS001002 Admin sudah membuka halaman modul dan sudah klik icon plus
    When TSMPDS001002 Admin mengisi field Deskripsi modul
    And TSMPDS001002 Admin klik tombol ADD
    Then TSMPDS001002 Deskripsi bertambah
    And TSMPDS001002 Deskripsi dihapus
    
  @tag3
  Scenario: TSMPDS001003 Admin tambah deskripsi modul
  	Given TSMPDS001003 Admin sudah membuka halaman modul dan sudah klik icon plus
    When TSMPDS001003 Admin mengisi field Ketentuan soal
    And TSMPDS001003 Admin klik tombol ADD
    Then TSMPDS001003 Deskripsi bertambah
    And TSMPDS001003 Deskripsi dihapus
    
  @tag4
  Scenario: TSMPDS001004 Admin tambah deskripsi modul
  	Given TSMPDS001004 Admin sudah membuka halaman modul dan sudah klik icon plus
    When TSMPDS001004 Admin mengisi field Deskripsi modul
    And TSMPDS001004 Admin mengisi field Ketentuan soal
    And TSMPDS001004 Admin klik tombol ADD
    Then TSMPDS001004 Deskripsi bertambah
