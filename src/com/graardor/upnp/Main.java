package com.graardor.upnp;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, UnknownHostException {
		int tcpPort = Integer.parseInt(args[0]);
		Inet4Address address = args.length == 2 ? (Inet4Address) InetAddress.getByName(args[1]) : (Inet4Address)  InetAddress.getLoopbackAddress();
		System.out.println("Opening TCP PORT: " + tcpPort + " Router IP: "+address.toString());

		UPnP.openPortTCP(address, tcpPort);

		Scanner s = new Scanner(System.in);
		System.out.println("Success opening TCP PORT: " + tcpPort + " Router IP: "+address.toString());

		boolean exited = false;
		while (!exited) {
			System.out.println("Type exit to exit.");
			String command = s.nextLine();
			
			if(command.equalsIgnoreCase("exit")) {
				UPnP.closePortTCP(tcpPort);
				exited = true;
				System.exit(0);
			}
		}
	}

}
