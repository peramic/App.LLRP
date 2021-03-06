package havis.llrpservice.sbc.gpio.message;

public class ResetConfigurationResponse extends Response {

	public ResetConfigurationResponse(MessageHeader messageHeader) {
		super(messageHeader, MessageType.RESET_CONFIGURATION_RESPONSE);
	}

	@Override
	public String toString() {
		return "ResetConfigurationResponse [" + super.toString() + "]";
	}
}
