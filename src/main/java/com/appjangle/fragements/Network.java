package com.appjangle.fragements;


public class Network {

	// <!-- one.upload https://u1.linnk.it/qc8sbw/usr/apps/textsync/docs/java-fragments-port-available -->
	/**
	 * Checks to see if a specific port is available.
	 * 
	 * @Author From apache Mina project
	 * 
	 * @param port
	 *            the port to check for availability
	 */
	public static boolean portAvailable(final int port) {
		if (port < 1 || port > 30000) {
			throw new IllegalArgumentException("Invalid start port: " + port);
		}

		java.net.ServerSocket ss = null;
		java.net.DatagramSocket ds = null;
		try {
			ss = new java.net.ServerSocket(port);
			ss.setReuseAddress(true);
			ds = new java.net.DatagramSocket(port);
			ds.setReuseAddress(true);
			return true;
		} catch (final java.io.IOException e) {
		} finally {
			if (ds != null) {
				ds.close();
			}

			if (ss != null) {
				try {
					ss.close();
				} catch (final java.io.IOException e) {
					/* should not be thrown */
				}
			}
		}

		return false;
	}
	// <!-- one.end -->
}
