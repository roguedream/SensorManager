package com.ubhave.sensormanager.config;

public class Constants
{	
	public static final int STOP_SENSING_BATTERY_LEVEL = 20;

	public static final long ACCELEROMETER_SAMPLING_WINDOW_SIZE_MILLIS = 8000;
	public static final int BLUETOOTH_SAMPLING_CYCLES = 1;
	public static final long LOCATION_SAMPLING_WINDOW_SIZE_MILLIS = 60000;
	public static final long MICROPHONE_SAMPLING_WINDOW_SIZE_MILLIS = 5000;
	public static final int WIFI_SAMPLING_CYCLES = 1;

	public static final long ACCELEROMETER_SLEEP_INTERVAL = 2 * 60 * 1000;
	public static final long BLUETOOTH_SLEEP_INTERVAL = 15 * 60 * 1000;
	public static final long LOCATION_SLEEP_INTERVAL = 15 * 60 * 1000;
	public static final long MICROPHONE_SLEEP_INTERVAL = 2 * 60 * 1000;
	public static final long WIFI_SLEEP_INTERVAL = 15 * 60 * 1000;	
	
	// low battery threshold
	public static final int LOW_BATTERY_THRESHOLD_LEVEL = 20; 
	
	// classifier thresholds
	public final static int ACCELEROMETER_MOVEMENT_THRESHOLD = 25;
	public final static int LOCATION_CHANGE_DISTANCE_THRESHOLD = 100;
	public static final int MICROPHONE_SOUND_THRESHOLD = 800;
	
	// adaptive sensing constants
	public final static double PROBABILITY_INITIAL_VALUE = 0.5;
	public final static double MIN_PROBABILITY_VALUE = 0.1;
	public final static double MAX_PROBABILITY_VALUE = 0.9;
	public final static double ALPHA_VALUE = 0.5;

}
