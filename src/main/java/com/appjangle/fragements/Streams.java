package com.appjangle.fragements;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams {

	// <!-- one.upload https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/fragements-copy-stream -->
	/**
	 * Copy Streams from Apache Commons
	 * @param input
	 * @param output
	 * @return
	 * @throws IOException
	 */
	public static int copy(InputStream input, OutputStream output)
			throws IOException {
		byte[] buffer = new byte[2024];
		int count = 0;
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
		}
		return count;
	}
	// <!-- one.end -->
	
}
