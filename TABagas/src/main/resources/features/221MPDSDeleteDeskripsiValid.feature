#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSMPDS003 Delete deskripsi
	Background:
		Given TSMPDS003 Admin sudah membuka tambah deskripsi
		

  @tag1
  Scenario: TSMPDS003001 Admin delete data descriptions yang tersimpan
    When TSMPDS003001 Admin klik delete
    Then TSMPDS003001 Muncul pop up delete
    And TSMPDS003001 Admin klik TIDAK
    
  @tag2
  Scenario: TSMPDS003002 Admin delete data descriptions yang tersimpan
    When TSMPDS003002 Admin klik delete
    And TSMPDS003002 Admin klik YA
    Then TSMPDS003002 Muncul pop up data telah dihapus
    And TSMPDS003002 Admin klik OK
