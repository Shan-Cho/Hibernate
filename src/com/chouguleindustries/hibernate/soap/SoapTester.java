package com.chouguleindustries.hibernate.soap;

public class SoapTester {
	public static void main(String[] args) {
		SoapDTO entity = new SoapDTO(1, "Aishwarya Rai", "Glecerine", true, true, SoapType.BodyWash);

		SoapDAO dao = new SoapDAOimpl();
		dao.save(entity);
	}

}
