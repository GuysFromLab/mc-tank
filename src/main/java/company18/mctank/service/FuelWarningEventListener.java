package company18.mctank.service;

import company18.mctank.domain.FuelWarningEvent;
import org.springframework.context.ApplicationListener;

public class FuelWarningEventListener implements ApplicationListener<FuelWarningEvent> {

	@Override
	public void onApplicationEvent(FuelWarningEvent event){
		//do stuff
	}
}
