#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSMPDS002 Edit deskripsi

  @tag1
  Scenario: TSMPDS002001 Admin klik icon edit
  	Given TSMPDS002001 Admin sudah membuka tambah deskripsi
    When TSMPDS002001 Admin klik icon edit
    Then TSMPDS002001 Muncul pop up
    
  @tag2
  Scenario: TSMPDS002002 Admin edit Deskripsi modul
  	Given TSMPDS002002 Admin sudah masuk ke pop up edit deskripsi
    When TSMPDS002002 Admin isi field Deskripsi soal
    And TSMPDS002002 Admin klik tombol UPDATE
    Then TSMPDS002002 Muncul pop up
    And TSMPDS002002 Admin klik OK
    
  @tag3
  Scenario: TSMPDS002003 Admin edit Deskripsi modul
  	Given TSMPDS002003 Admin sudah masuk ke pop up edit deskripsi
    When TSMPDS002003 Admin isi field Ketentuan soal
    And TSMPDS002003 Admin klik tombol UPDATE
    Then TSMPDS002003 Muncul pop up
    And TSMPDS002003 Admin klik OK
    
  @tag4
  Scenario: TSMPDS002004 Admin edit Deskripsi modul
  	Given TSMPDS002004 Admin sudah masuk ke pop up edit deskripsi
    When TSMPDS002004 Admin isi field Deskripsi soal
    And TSMPDS002004 Admin isi field Ketentuan soal
    And TSMPDS002004 Admin klik tombol UPDATE
    Then TSMPDS002004 Muncul pop up
    And TSMPDS002004 Admin klik OK
    
  @tag5
  Scenario: TSMPDS002005 Admin edit Deskripsi modul
  	Given TSMPDS002005 Admin sudah masuk ke pop up edit deskripsi
    When TSMPDS002005 Admin hapus value di field Deskripsi soal
    And TSMPDS002005 Admin klik tombol UPDATE
    Then TSMPDS002005 Muncul pop up
    And TSMPDS002005 Admin klik OK
    
  @tag6
  Scenario: TSMPDS002006 Admin edit Deskripsi modul
  	Given TSMPDS002006 Admin sudah masuk ke pop up edit deskripsi
    When TSMPDS002006 Admin hapus value di field Ketentuan soal
    And TSMPDS002006 Admin klik tombol UPDATE
    Then TSMPDS002006 Muncul pop up
    And TSMPDS002006 Admin klik OK
