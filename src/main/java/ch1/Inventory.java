package ch1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Instrument> inventory;
    // Inventory constructor
    public Inventory(){
        inventory = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber){
        for(Iterator i = inventory.iterator();i.hasNext();){
            Instrument instrument = (Instrument) i.next();
            if(instrument.getSerialNumber().equals(serialNumber))
                return instrument;
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec){

        List<Instrument> matchingInstruments = new LinkedList<Instrument>();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSpec().matches(searchSpec))
                matchingInstruments.add(instrument);
        }

        return matchingInstruments;
    }

}
