package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("iphone");

	}
	private void phoneMieiNum() {
		System.out.println("180100000000L");

	}
	private void camera() {
		System.out.println("64Mp");

	}
	private void storage() {
		System.out.println("128gb");

	}
	private void osName() {
		System.out.println("ios 10");

	}
	public static void main(String[] args) {
		//class name object = new class name;
		PhoneInfo n = new PhoneInfo();
		n.phoneName();
		n.phoneMieiNum();
		n.camera();
		n.storage();
		n.osName();
	}

}
