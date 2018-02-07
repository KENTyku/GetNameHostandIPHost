/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getnamehostandiphost;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
/**
 *
 * @author user
 */
public class GetNameHostandIpHost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, UnknownHostException {
//        Inet4Address h;
//       h.getCanonicalHostName();
Gui window=new Gui();
window.setVisible(true);
//System.out.println(InetAddress.getLocalHost());
//System.out.println(NetworkInterface.getNetworkInterfaces());
    }
    
   public  class Host {
       String ip4;
       String nameHost;
       
   }
    
    
    
    
}
