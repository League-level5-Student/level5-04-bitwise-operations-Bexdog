package _03_Printing_Binary;

import java.util.ArrayList;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		long start = 64;
		bp.printLongBinary(start);
	}
	public void printByteBinary(byte b) {
		ArrayList<Integer> submit = new ArrayList<Integer>();
		int next = b;
	while(next!=0) {
		submit.add(next%2);
		next = next/2;
	}
	for(int i = submit.size()-1; i>=0;i--) {
		System.out.print(submit.get(i));
	}
	}
	
	public void printShortBinary(short s) {
		ArrayList<Integer> submit = new ArrayList<Integer>();
		int next = s;
	while(next!=0) {
		submit.add(next%2);
		next = next/2;
	}
	for(int i = submit.size()-1; i>=0;i--) {
		System.out.print(submit.get(i));
	}
	}
	public void printIntBinary(int i) {
		ArrayList<Integer> submit = new ArrayList<Integer>();
		int next = i;
	while(next!=0) {
		submit.add(next%2);
		next = next/2;
	}
	for(int c = submit.size()-1; c>=0;c--) {
		System.out.print(submit.get(c));
	}
	}
	
	public void printLongBinary(long l) {
		ArrayList<Integer> submit = new ArrayList<Integer>();
		long next = l;
	while(next!=0) {
		submit.add((int) (next%2));
		next = next/2;
	}
	for(int i = submit.size()-1; i>=0;i--) {
		System.out.print(submit.get(i));
	}
	}
}
