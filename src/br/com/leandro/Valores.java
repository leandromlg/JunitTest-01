package br.com.leandro;

import java.util.Arrays;

public class Valores implements ValoresITF {

	private int[] valores = new int[10];

	@Override
	public boolean ins(int v) {
		// TODO Auto-generated method stub
		if (v <= 0) {
			return false;
		}
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == 0) {
				valores[i] = v;
				return true;
			}
		}
		return false;
	}

	@Override
	public int del(int i) {
		if (i < 0) {
			return -1;
		}
		int contador;
		int valorRetornar;
		
		if (valores[i] != 0) {
			valorRetornar = valores[i];
//			valores[i] = null;
			valores[i] = 0;
			return valorRetornar;
		}
		return -1;
	}

	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] != 0) {
				size++;
			}
		}
		return size;
	}

	@Override
	public double mean() {
		int sum = 0;
		for (int i = 0; i < valores.length; i++) {
			sum = sum + valores[i];
		}
		return sum / valores.length;
	}

	@Override
	public int greater() {
		return Arrays.stream(valores).max().getAsInt();
	}

	@Override
	public int lower() {
		return Arrays.stream(valores).min().getAsInt();
	}

}