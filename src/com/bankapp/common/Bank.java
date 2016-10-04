package com.bankapp.common;

import java.io.IOException;
import java.util.List;
import java.lang.String;

public interface Bank {
	List<String> dataRead() throws NumberFormatException, IOException;

	public void getData() throws NumberFormatException, IOException;

	public int rateOfInterest() throws NumberFormatException, IOException;

	public void getRateOfInterest() throws NumberFormatException, IOException;
}
