package in.ardagro.kc_otp_provider;

import java.util.Map;


public class SmsServiceFactory {
    public static SmsService get(Map<String, String> config) {
         return (phoneNumber, message) ->
        System.out.println(String.format("*****LOGGING FOR DEVELOPMENT ***** Would send SMS to %s with text: %s", phoneNumber, message));
		/*if (Boolean.parseBoolean(config.getOrDefault(SmsConstants.SIMULATION_MODE, "false"))) {
			
		} else {
			//return new AwsSmsService(config);
		}*/
	}
}
