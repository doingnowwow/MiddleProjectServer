package kr.or.ddit.service.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClient extends Remote{
	/**
	 * 클라이언트에 메시지를 전송해주기 위해 필요한 메서드
	 */
	public void printMessage(String msg) throws RemoteException;
}
