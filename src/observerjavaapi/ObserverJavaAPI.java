/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjavaapi;

import java.util.Observer;

/**
 *
 * @author warin
 */
public class ObserverJavaAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marketing obj = new Marketing();
        Senior obj2 = new Senior();
        HeadQuater data = new HeadQuater();       
        data.addObserver(obj);
        data.addObserver(obj2);
        data.setSomeData(8);
	data.setSomeData(9);
    }
    
}
