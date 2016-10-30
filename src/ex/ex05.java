﻿package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021033 黃苡珊
 */

import java.util.Random;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[][] = new int[10][10];

		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 10; j++) {
				data[i][j] = rnd.nextInt(10);
				System.out.print(data[i][j]);

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(data[j][i]);
			}
			System.out.println();

		}

	}
}
