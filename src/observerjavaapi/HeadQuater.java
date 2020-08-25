/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjavaapi;

import java.util.Observable;
/**
 *
 * @author sarun
 */
public class HeadQuater extends Observable {
    private int someData;

    public void setSomeData(int data) {
	someData = data;
        setChanged();
	notifyObservers("From HeadQuater");
    }
    public int getSomeData() {
	return someData;
    }
}
