//The purpose of this class is to model a television
// 12/04/2022 By Jonathan Prill

package com.prill.television;

public class Television {
	
	final String MANUFACTURER; // represents the brand
	final int SCREEN_SIZE; // represents the screen size
	private boolean powerOn; // represents the current state of the power
	private int channel; // represents the current station
	private int volume; // represents the current volume
	
	
	// This constructor method will initialize the power to off, the volume to 20, the channel to 2,
	// And will accept inputs for brand and screen size
	public Television(String brand, int size) {
		super();
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		this.powerOn = false;
		this.volume = 20;
		this.channel = 2;
	}

	
	/**
	 * Set the channel to user input
	 * @param station
	 */
	public void setChannel(int station) {
		this.channel = station;
	}
	
	/**
	 * Alternates the power state
	 */
	public void power() {
		powerOn = !powerOn;
	}
	
	/**
	 * Increases volume by 1
	 */
	public void increaseVolume() {
		volume += 1;
	}

	/**
	 * Decreases volume by 1
	 */
	public void decreaseVolume() {
		volume -= 1;
	}

	/**
	 * Getter for channel
	 * @return 
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * Getter for Volume
	 * @return
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * Getter for Brand
	 * @return
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * Getter for Screen Size
	 * @return
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}


	
	
}
