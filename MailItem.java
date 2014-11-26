
/**
 * Mail Item esta clase representa un mensaje de email
 */
public class MailItem

{
private String from;
//Almacena que direccion envia el mensaje
private String to;
//Almacena para que direccion es el mensaje
private String message;
//Almacena el contenido del mensaje del email
private String subject;
//Almacena el contenido del asunto del email

/**
 * Constructor de la clase MailItem
 */
public MailItem(String newfrom, String newto, String newmessage, String subject)
{
	this.from = from;
	this.to = to;
	this.message = message;
	this.subject = subject;
}

/**
 * Devuelve la direccion de origen del mensaje
 */
public String getFrom()
{
	return from;
}

/**
 * Devuelve la direccion del destino del mensaje
 */
public String getTo()
{
	return to;
}

/**
 * Devuelve el contenido del mensaje
 */
public String getMessage()
{
	return message;
}

/**
 * Devuelve el contenido del mensaje
 */
public String getSubject()
{
    return subject;
}

/**
 * Imprime por pantalla los datos del email:direcdcion de origen y destino y contenido
 */
public void print()
{
	System.out.println("Origen: " + from);
	System.out.println("Destino: " + to);
	System.out.println("Subject " + subject);
	System.out.println("Contenido del email: " + message);

}

}