#Author: Bagas
#Created_date: 29/9/2022
#Modified_date: 
Feature: Admin mencari data
	Background:
	    Given Admin harus klik field search Data Users pada halaman Data Users

  @tag1
  Scenario: TSDU002001 Admin ingin mencari data yang ada berdasarkan name menggunakan tombol search
    When TSDU002001 Admin mengisi field dengan nama yang ingin dicari
    And TSDU002001 Admin klik tombol search
    Then TSDU002001 Tampil nama yang dicari