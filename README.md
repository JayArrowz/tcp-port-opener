# tcp-port-opener
Quick tool to open ports VIA UPNP

Download: https://mega.nz/#!oUkzCIDC!8jrAVxHHQTTciA0btvjGlE9iN3qCKFTqzh2TuTL0YjY

Source: https://github.com/atlassanjay/tcp-port-opener

Usage: port nic-ip



Guide:
Step 1: Find out the address for your NIC by typing ipconfig or ifconfig


Step 2: 
Run the server or bind any server to a port


Step 3: 
Run portopener.jar using java -jar portopener.jar PORT IP

To Test:
https://www.canyouseeme.org/

This opens ports with UPNP. If there is no service bound to the port then the port will not be forwarded, so make sure you are running the server before running the port opener.

The program will close the port if exited.
