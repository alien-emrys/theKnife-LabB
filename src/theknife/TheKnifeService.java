package theknife;

import java.rmi.Remote;

/*interfaccia che contiene i metodi che il client chiama e che il server esegue (RMI)
 * il client tramite questa interfaccia sa cosa può chiedere di fare al server, senza sapere come lo fa.
 * lo stub quindi sarà di tipo TheKnifeService.
 * 
 * Estende Remote perché i suoi metodi possono essere chiamati in remoto dal client, tramite lo stub
 * 
 * RMI riceva la richiesta e chiama i metodi dell'oggetto registrato che è invece di tipo TheKnifeServiceImpl, dove 
 * i metodi sono effettivamente implementati*/

public interface TheKnifeService extends Remote{

}
