/**
 * Mail Client representa un cliente de correo electronico
 */
public class MailClient

{
//Hace referencia al servidor asociado al cliente
private MailServer server;
//Almacena la direccion de correo del usuario que usa el cliente
private String user;

/**
 * Constructor de la clase MailClient
 */
public MailClient(MailServer server, String user)
{
	this.server = server;
	this.user = user;
}

/**
 * Obtiene del servidor el siguiente correo del usuario y lo devuelve
 */
public MailItem getNextMailItem()
{
	MailItem email = server.getNextMailItem(user);
	return server.getNextMailItem(user);
}

/**
 * Obtiene del servidor el siguient correo del usuario y lo imprime por pantalla.Si no habia correos en el servidor informa por pantalla de ello.
 */
public void printNextMailItem()
{
	MailItem email = server.getNextMailItem(user);
	if(email==null){
	System.out.println("No había mensajes en el servidor");}
	else{
	email.print();}
}

/**
 * Envia un correo a la direccion indicada con el contenido pasado por parámetro
 */
public void sendMailItem(String address,String message)
{
	MailItem emailToSend = new MailItem(user, address, message);
	server.post(emailToSend);
}
}