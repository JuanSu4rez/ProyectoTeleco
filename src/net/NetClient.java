package net;
import java.net.*;  
import java.io.*;  


public class NetClient {
	
	DataInputStream dataInputStream;  
	DataOutputStream dataOutputStream;
	Socket socket;
	
	public NetClient() {
		try {
			socket = new Socket("localhost", 3333);  
			dataInputStream = new DataInputStream(socket.getInputStream());  
			dataOutputStream = new DataOutputStream(socket.getOutputStream());  
			//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));  
			
			/*
			 * 
			
			String str = "", str2 = "";  
			while(!str.equals("stop")){  
				//str = bufferedReader.readLine();  
				dataOutputStream.writeUTF(str);  
				dataOutputStream.flush();  
				//str2 = dataInputStream.readUTF();  
				System.out.println("Server says: "+str2);  
			}  
			   */
			//dataOutputStream.close();  
			//socket.close();  
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
	}
	
	public void getServerData(){		
		String message = "GET_DATA";
		try {
			dataOutputStream.writeUTF(message);  
			dataOutputStream.flush();  
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception client");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e);
		}
	}

}
