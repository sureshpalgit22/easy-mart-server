package com.easy_mart.config;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class LocalDateAdapter extends XmlAdapter<String, LocalDate>  {

	@Override
	public LocalDate unmarshal(String dateString) throws Exception {
		return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d MMM uuuu"));
	}

	@Override
	public String marshal(LocalDate localDate) throws Exception {
		return DateTimeFormatter.ofPattern("d MMM uuuu").format(localDate);
	}
}

	