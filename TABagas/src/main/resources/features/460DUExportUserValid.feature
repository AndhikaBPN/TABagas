#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 
@tag
Feature: TSDU012 Membuka halaman Data Users
	Background:
	    Given TSDU012 Admin harus sudah membuka halaman Data Users NON ACTIVE

  @tag1
  Scenario: TSDU012001 Export semua NON ACTIVE Admin
    When TSDU012001 Admin klik tombol export
    Then TSDU012001 Membandingkan file size
