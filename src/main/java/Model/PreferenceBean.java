package Model;

import com.jgoodies.common.bean.ObservableBean;
import cz.czechitas.ukol7.barva.Barva;
import com.jgoodies.binding.beans.ExtendedPropertyChangeSupport;

import java.beans.PropertyChangeListener;

public class PreferenceBean implements ObservableBean {
    private final ExtendedPropertyChangeSupport pcs = new ExtendedPropertyChangeSupport(this);
    private String prezdivka;
    private Barva barva;

    public String getPrezdivka() {
        return prezdivka;

    }

    public void setPrezdivka(String prezdivka) {
        if (prezdivka.isBlank()) {
            prezdivka = null;
        }
        String oldValue = this.prezdivka;
        this.prezdivka = prezdivka;
        pcs.firePropertyChange("prezdivka", oldValue, prezdivka);
    }

    public Barva getBarva() {
        return barva;
    }

    public void setBarva(Barva newValue) {
        Barva oldValue = this.barva;
        this.barva = newValue;
        pcs.firePropertyChange("barva", oldValue, barva);
}

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }
}
