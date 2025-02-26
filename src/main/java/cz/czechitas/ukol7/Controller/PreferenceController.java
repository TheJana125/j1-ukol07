package cz.czechitas.ukol7.Controller;
import Model.PreferenceBean;
import com.jgoodies.binding.PresentationModel;
import cz.czechitas.ukol7.formbuilder.ActionBuilder;

import javax.swing.*;
import java.beans.PropertyChangeEvent;


public class PreferenceController {

    private final PresentationModel<PreferenceBean> model;
    private final Action ulozitAction;


    public PreferenceController() {
        model = new PresentationModel<>(new PreferenceBean());
        ulozitAction = ActionBuilder.create("&Uložit", this::handleUlozit);
        model.addBeanPropertyChangeListener(this::handlePropertyChange);
        vypoctiStavAkci();
    }


    private void handlePropertyChange(PropertyChangeEvent propertyChangeEvent) {
        vypoctiStavAkci();
    }

    public PresentationModel<PreferenceBean> getModel() {
        return model;
    }

    public Action getUlozitAction() {
        return ulozitAction;
    }

    private void vypoctiStavAkci() {
        if (model.getBean().getBarva() != null && model.getBean().getPrezdivka() != null) {
            ulozitAction.setEnabled(true);
        } else {
            ulozitAction.setEnabled(false);
        }
    }

        public void handleUlozit() {
            PreferenceBean bean = this.model.getBean();
            System.out.printf("Přezdívka je: %s", bean.getPrezdivka()).println();
            System.out.printf("Oblíbená barva je: %s", bean.getBarva()).println();
        }


        }