package me.gaegle.programmers.동영상_재생기;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
 */
class Solution {
	private static final LocalTime TEN_SEC_TIME = LocalTime.of(0, 0, 10);
	private static final LocalTime START_TIME = LocalTime.of(0, 0, 0);
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("mm:ss");
	private static final int TEN_SEC = 10;

	private LocalTime currentTime;
	private LocalTime lastTime;
	private LocalTime lastTimeBeforeTenSec;
	private LocalTime openingStartTime;
	private LocalTime openingEndTime;

	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		settings(video_len, pos, op_start, op_end);

		for (String command : commands) {
			skipOpening();
			switch (command) {
				case "next":
					currentTime = currentTime.plusSeconds(TEN_SEC);

					if (currentTime.isAfter(lastTimeBeforeTenSec)) {
						currentTime = LocalTime.from(lastTime);
					}
					break;
				case "prev":
					if (currentTime.getHour() != 0 || currentTime.isBefore(TEN_SEC_TIME)) {
						currentTime = START_TIME;
					}

					currentTime = currentTime.minusSeconds(TEN_SEC);
					break;
			}
		}
		skipOpening();

		return currentTime.format(TIME_FORMATTER);
	}

	private void skipOpening() {
		if (isOpeningSection()) {
			currentTime = LocalTime.from(openingEndTime);
		}
	}

	private boolean isOpeningSection() {
		return (currentTime.isAfter(openingStartTime) || currentTime.equals(openingStartTime))
			&& (currentTime.isBefore(openingEndTime) || currentTime.equals(openingEndTime));
	}

	private void settings(String video_len, String pos, String op_start, String op_end) {
		currentTime = parseTime(pos);
		lastTime = parseTime(video_len);
		lastTimeBeforeTenSec = lastTime.minusSeconds(TEN_SEC);
		openingStartTime = parseTime(op_start);
		openingEndTime = parseTime(op_end);
	}

	private LocalTime parseTime(String timeFormatString) {
		String[] timeStrings = timeFormatString.split(":");
		return LocalTime.of(0, Integer.parseInt(timeStrings[0]),
			Integer.parseInt(timeStrings[1]));
	}

}
