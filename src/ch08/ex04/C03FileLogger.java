package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void log() throws Exception { // throws 예외 발생
		Handler handler = new FileHandler("c:/DEV'ch08.ex04.xml");
		logger.addHandler(handler);
		
		logger.info("logging start.");
		logger.severe("예외 발생.");
		logger.info("logging end.");
		
		handler.flush();
		handler.close();
	}
	
	public static void main(String[] args) throws Exception {
		new C03FileLogger().log(); // 컴파일 에러-try 블럭으로 묶고 싶지 않아 떠넘김  방지 
	}
}
