package br.ce.wcaquino.taskbackend.utils;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void test() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		DateUtils.isEqualOrFutureDate(dat);
	}

}
