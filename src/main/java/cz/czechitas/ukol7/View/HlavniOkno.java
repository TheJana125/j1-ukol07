package cz.czechitas.ukol7.View;

import Model.PreferenceBean;
import cz.czechitas.ukol7.Aplikace;
import cz.czechitas.ukol7.Controller.PreferenceController;
import cz.czechitas.ukol7.barva.Barva;
import cz.czechitas.ukol7.formbuilder.FormBuilder;
import cz.czechitas.ukol7.formbuilder.FormBuilderWithContainer;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class HlavniOkno extends JFrame {
    private final PreferenceController controller;

    public HlavniOkno(PreferenceController controller) throws HeadlessException {
        super("Přezdívka a barva");
        this.controller = controller;
        this.init();

    }
        public void start() {
            setLocationRelativeTo(null);
            setVisible(true);
}

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(Aplikace.class.getResource("czechitas-icon.png")).getImage());
        setLayout(new MigLayout("wrap 2", "[right, 100]rel[50:75:250,grow,fill]"));
        setMinimumSize(new Dimension(500, 300));

        FormBuilderWithContainer<PreferenceBean> formBuilder = FormBuilder.create(controller.getModel())
                .container(this);

        formBuilder
                .label("&Přezdívka")
                .textField("prezdivka")
                .add();


        formBuilder
                .radioButton("zelená", "barva", Barva.Zelena)
                        .add("left, span");

        formBuilder
                .radioButton("žlutá", "barva", Barva.Zluta)
                .add("left, span");

        formBuilder
                .radioButton("fialová", "barva", Barva.Fialova)
                .add("left, span");

        formBuilder
                .radioButton("černá", "barva", Barva.Cerna)
                .add("left, span");


        formBuilder
                .radioButton("modrá", "barva", Barva.Modra)
                .add("left, span");


        formBuilder
                .radioButton("červená", "barva", Barva.Cervena)
                .add("left, span");


        formBuilder
                .panel(panel -> {
                            JButton ulozitButton = new JButton(controller.getUlozitAction());
                            getRootPane().setDefaultButton(ulozitButton);
                            panel.add(ulozitButton);
                        })
                        .add("right, span");


        pack();
        }

    }