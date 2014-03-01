package com.fagyapong.rain.graphics;

public class Screen {
	
	private int width;
	private int height;
	public int[] pixels;
	
	private int time = 0;
	private int counter = 0;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		
		pixels = new int[width * height];
	}
	
	public void clear() {
		
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render() {
		
		counter++;
		if ((counter % 100) == 0) {
			time++;
		}
		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[time + time * width] = 0xff00ff;
			}
		}
	}
}
