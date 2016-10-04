package com.bankapp.implementations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.bankapp.common.Bank;

public class Hdfc implements Bank {
	String eid, ename, eaddress;

	public List<String> dataRead() throws NumberFormatException, IOException {
		List<String> list = new ArrayList<String>();
		System.out
				.println("How many HDFC Bank employee details you are going to enter");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Employee id,name,address details");
			for (int j = 0; j < 3; j++) {
				br = new BufferedReader(new InputStreamReader(System.in));
				String edetails = br.readLine();
				list.add(edetails);
			}
		}
		return (list);
	}

	public void getData() throws NumberFormatException, IOException {
		List<String> l = dataRead();
		int c = 0;
		for (int i = 0; i < l.size(); i = i + 3) {
			System.out.println("HDFC Bank Employee " + (c + 1) + " details");
			for (int j = i; j < i + 3; j++) {
				System.out.println(l.get(j));
			}
			c++;
		}
	}

	public int rateOfInterest() throws NumberFormatException, IOException {
		int roi;
		System.out.println("Please Enter Rate Of Interest for HDFC Bank");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		roi = Integer.parseInt(br.readLine());
		try {
			if (roi == 0)
				throw new ArithmeticException("not valid");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		return roi;
	}

	public void getRateOfInterest() throws NumberFormatException, IOException {
		int roi = rateOfInterest();
		System.out.println("Rate of Interest for HDFC Bank is:" + roi);
	}

}
