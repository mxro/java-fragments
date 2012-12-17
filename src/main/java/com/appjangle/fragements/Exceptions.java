package com.appjangle.fragements;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Exceptions {

	// <!-- one.upload https://u1.linnk.it/qc8sbw/usr/apps/textsync/docs/java-stacktrace-to-string -->
	/**
	 * <p>Printing the stack trace of an exception to to String.</p>
	 * <p>As proposed by Brian Agnew on <a href="http://stackoverflow.com/a/1149712/270662">stackoverflow</a>
	 * @param t
	 * @return
	 */
	public static String stacktraceToString(Throwable t) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}
	
	// <!-- one.end -->
	
}
