package cz.czechitas.ukol7;


import com.formdev.flatlaf.FlatLightLaf;
import cz.czechitas.ukol7.Controller.PreferenceController;
import cz.czechitas.ukol7.View.HlavniOkno;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Aplikace extends JFrame {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new HlavniOkno(new PreferenceController()).start();
    }
}
