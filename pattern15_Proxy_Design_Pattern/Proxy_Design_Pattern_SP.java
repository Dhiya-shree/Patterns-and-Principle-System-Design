package src.design00_Patterns.pattern15_Proxy_Design_Pattern;

/**
 *
 * Proxy Design pattern
 *
 * Structural Design pattern
 *
 * Proxy  introduce proxy class between client and the subject
 *
 *    ______________Image___
 *   |                      \
 *   |                     ProxyImage
 *  Real Image------------<*>:realImageObject
 *                         methods() <---------------------- Client
 *
 *
 * Examples :
 * Mocker - Unit test used where DB is connected
 *      code----Mocker(ProxyForDb)----DB
 *
 * Java SpringBoot uses Proxy pattern AOP
 *
 * Proxy acts as Wrapper class
 *
 * Java RMI - Remote Method Invocation uses proxy for
 *               RTC / RTP calls
 *
 *
 *
 *
 */
public class Proxy_Design_Pattern_SP {
    public static void main(String[] args) {

        Image proxy=new ProxyImage("Scam%#Phishing");
        proxy.display();


        proxy=new ProxyImage("ValidProxyName");
        proxy.display();

        // Proxy can also act as cache
        // It can store the image object with LRU and share the content if available
        Image real=new RealImage(" Real");
        real.display();

    }
}
