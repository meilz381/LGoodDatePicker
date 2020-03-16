package com.github.lgooddatepicker.components;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tag{
	private LocalDate tag;
	private LocalTime Zeit_1;
	private LocalTime Zeit_2;

	public Tag(LocalDate tag, LocalTime zeit_1, LocalTime zeit_2) {
		super();
		this.tag = tag;
		Zeit_1 = zeit_1;
		Zeit_2 = zeit_2;
	}
	public LocalDate getTag() {
		return tag;
	}
	public LocalTime getZeit_1() {
		return Zeit_1;
	}
	public void setZeit_1(LocalTime zeit_1) {
		Zeit_1 = zeit_1;
	}
	public LocalTime getZeit_2() {
		return Zeit_2;
	}
	public void setZeit_2(LocalTime zeit_2) {
		Zeit_2 = zeit_2;
	}
}
