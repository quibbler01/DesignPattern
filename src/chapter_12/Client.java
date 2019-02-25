package chapter_12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main_(String[] args) {
		IGamePlayer player = new GamePlayer("San");
		InvocationHandler handler = new GamePlayIH(player);
		ClassLoader classLoader = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[] { IGamePlayer.class },
				handler);
		proxy.login("San", "");
		proxy.killBoss();
		proxy.upgrade();
	}
}
