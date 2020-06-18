package calcapp.main;
import calcapp.logics.*;
public class Calc {
	public static void main(String[] args) {
		int a = 100; int b = 2;
		int total = CalcLogic.tasu(a,b);
		int delta = CalcLogic.hiku(a,b);
		System.out.println(a+"と"+b+"足すと"+total+"引くと"+delta);
	}
}
