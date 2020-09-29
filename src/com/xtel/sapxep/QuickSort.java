/**
 * 
 */
package com.xtel.sapxep;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author admin
 *
 */
public class QuickSort {

	int a[];
	
	//ReadFile
	public void readFile() throws IOException{
		FileInputStream fis = new FileInputStream("C:\\log\\input.txt");
        Scanner sc = new Scanner(fis,"UTF-8");
        String temp = sc.nextLine(); //doc dong mang trong file
        sc.close();
        String [] item = temp.split(" "); //tach chuoi thanh cac phan tu chuoi
        a = new int[item.length];
        for(int i=0; i<item.length; i++) //doi kiem string sang int cua cac phan tu
            a[i] = Integer.parseInt(item[i]);
        
        System.out.println("Du lieu lay ra tu file la: ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
    }
	
	
	//QuickSort
	public void quickSort(int a[], int first,int last) {
		int p = a[((first+last)/2)+1];
		int i = first, j = last;
		while(i<j) {
			while(a[i]<p) {
				i++;
			}
			while(a[j]>p) {
				j--;
			}
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if(i<last) {
			quickSort(a, i, last);
		}
		if(first < j) {
			quickSort(a, first, j);
		}
	}
	
	//Info data
	public void outPut() {
		quickSort(a, 0, a.length-1);
		System.out.println("\nMang sau khi sap xep la: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		QuickSort q = new QuickSort();
		q.readFile();
		q.outPut();
	}

}
