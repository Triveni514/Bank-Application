package com.bankapp.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bankapp.implementations.Citi;
import com.bankapp.implementations.Hdfc;
import com.bankapp.implementations.Hsbc;
import com.bankapp.implementations.Icici;
import com.bankapp.implementations.Sbi;

public class MainBank {
	public static void main(String[] args) throws NumberFormatException,IOException {
		System.out.println("which bank employee details you are going to enter Choose Menu\n1.ICICI\n2.HSBC\n3.SBI\n4.CITI\n5.HDFC\n6.Exit");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		switch (n) {
		case 1:
			Icici i = new Icici();
			i.getData();
			i.getRateOfInterest();
			break;
		case 2:
			Hsbc h = new Hsbc();
			h.getData();
			h.getRateOfInterest();
			break;
		case 3:
			Sbi s = new Sbi();
			s.getData();
			s.getRateOfInterest();
			break;
		case 4:
			Citi c = new Citi();
			c.getData();
			c.getRateOfInterest();
			break;
		case 5:
			Hdfc hf = new Hdfc();
			hf.getData();
			hf.getRateOfInterest();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("invalid selection");

		}
	}

}
