package de.hsmainz.gi.indoornavcl;

/**
 * Created by keks on 26.01.15.
 */
public class Measurement {
    private int rssi;
    private int txPower;

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public int getTxPower() {
        return txPower;
    }

    public void setTxPower(int txPower) {
        this.txPower = txPower;
    }
}
