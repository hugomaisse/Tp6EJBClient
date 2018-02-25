package mtii.maisse;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientEjb {
	public static void main(String[] args) {
		try {
			/*
			Hashtable ht=new Hashtable();
			ht.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			ht.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
			ht.put("java.naming.provider.url", "localhost");

			Context context=new InitialContext(ht);
			 */
			Context context = new InitialContext();
			EjbSessionTp6Remote beanRemote = (EjbSessionTp6Remote)
					context.lookup("EjbSessionTp6/remote");
			
			System.out.println("Mise en place de la liaison... ");
			System.out.println("La meteo est : " +
					beanRemote.afficherBulletincourant());
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
