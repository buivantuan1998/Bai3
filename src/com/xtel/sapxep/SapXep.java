/**
 * 
 */
package com.xtel.sapxep;

/**
 * @author admin
 *
 */
public class SapXep {

	int temp;
	int a[];
	
	public void SapXepChon(int a[]) {
		for(int i=0; i< a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void input(int a[]) {
		System.out.println("Day duoc sap xep la: ");
		for(int i=0; i< a.length; i++) {
			System.out.printf(" "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7, 1, 9, 4, 5, 8, 3, 2};
		SapXep s= new SapXep();
		s.SapXepChon(a);
		s.input(a);
	}


}
