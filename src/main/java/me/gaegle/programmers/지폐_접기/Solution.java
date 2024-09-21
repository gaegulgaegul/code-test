package me.gaegle.programmers.지폐_접기;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/340199
 */
class Solution {
	private int widthBill;
	private int heightBill;
	private int widthWallet;
	private int heightWallet;

	public int solution(int[] wallet, int[] bill) {
		int foldCashCount = 0;
		settings(wallet, bill);

		while (true) {
			if (includeForwardLength() || includeReverseLength()) {
				break;
			}
			if (widthBill >= heightBill) {
				widthBill = widthBill / 2;
			} else {
				heightBill = heightBill / 2;
			}
			foldCashCount++;
		}

		return foldCashCount;
	}

	private boolean includeReverseLength() {
		return heightWallet >= widthBill && widthWallet >= heightBill;
	}

	private boolean includeForwardLength() {
		return widthWallet >= widthBill && heightWallet >= heightBill;
	}

	private void settings(int[] wallet, int[] bill) {
		widthBill = bill[0];
		heightBill = bill[1];
		widthWallet = wallet[0];
		heightWallet = wallet[1];
	}
}
