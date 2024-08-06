package com.easy_mart.config;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalTimeAdapter extends XmlAdapter<String, LocalTime> {
	@Override
	public LocalTime unmarshal(String dateString) throws Exception {
		return LocalTime.parse(dateString, DateTimeFormatter.ofPattern("h:m a"));
	}

	@Override
	public String marshal(LocalTime localDate) throws Exception {
		return DateTimeFormatter.ofPattern("hh:mm a").format(localDate);
	}
}
