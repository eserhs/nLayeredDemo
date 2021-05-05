package nLayeredDemo.jlogger;

import nLayeredDemo.core.LoggerService;

public class jLoggerManagerAdapter implements LoggerService {

	@Override
	public void logTuSystem(String message) {
	jLoggerManager jManager = new jLoggerManager();
	jManager.log(message);
	}

}
