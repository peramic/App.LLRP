package havis.llrpservice.server.service.fsm.rfc;

import havis.llrpservice.server.service.fsm.gpio.GPIORuntimeData;
import havis.llrpservice.server.service.fsm.lllrp.LLRPRuntimeData;

public class FSMRFCSetConfigurationResponseEvent extends FSMRFCEvent {

	private GPIORuntimeData gpioRuntimeData;

	public void setRuntimeData(LLRPRuntimeData llrpRuntimeData,
			RFCRuntimeData runtimeData, GPIORuntimeData gpioRuntimeData) {
		setRuntimeData(llrpRuntimeData, runtimeData);
		this.gpioRuntimeData = gpioRuntimeData;
	}

	public GPIORuntimeData getGPIORuntimeData() {
		return gpioRuntimeData;
	}

	@Override
	public String toString() {
		return "FSMRFCSetConfigurationResponseEvent [gpioRuntimeData="
				+ gpioRuntimeData + ", " + super.toString() + "]";
	}
}