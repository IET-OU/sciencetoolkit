package org.greengin.sciencetoolkit.ui.modelconfig.sensors;

import org.greengin.sciencetoolkit.logic.sensors.SensorWrapper;
import org.greengin.sciencetoolkit.ui.modelconfig.ModelFragment;

import android.view.View;

public class LocationSensorConfigViewCreator {
	public static void createView(ModelFragment fragment, View container, SensorWrapper sensor) {
		SensorConfigViewCreator.addEmptyWarning(fragment);
	}
}