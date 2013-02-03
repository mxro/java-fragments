package com.appjangle.fragements;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams {

	// <!-- one.upload https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/fragements-stream-to-string -->
	public static String toString(final InputStream inputStream)
            throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buffer)) != -1) {
            baos.write(buffer, 0, length);
        }
        return new String(baos.toByteArray());
    }
	// <!-- one.end -->
	
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
