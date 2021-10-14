/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Vistas.AreasVista;
import Vistas.Consentimientos;
import Vistas.Cortes;
import Vistas.Estudios;
import Vistas.EstudiosInstituciones;
import Vistas.Instituciones;
import Vistas.Menu;
import static java.awt.Frame.ICONIFIED;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author alanm
 */
public class MenuController implements ActionListener, MouseListener {

    private Menu vista;

    public static void main(String[] args) {
        Menu vista = new Menu();
        MenuController menu = new MenuController(vista);
        menu.iniciar();
    }
    
    public void iniciar() {
        vista.setTitle("Menú");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public MenuController(Menu vista) {
        this.vista = vista;
        this.vista.btnAreas.addActionListener(this);
        this.vista.btnInstituciones.addActionListener(this);
        this.vista.btnEstudios.addActionListener(this);
        this.vista.btnCortes.addActionListener(this);
        this.vista.btnEstudiosInstituciones.addActionListener(this);
        this.vista.btnConsentimientos.addActionListener(this);
        this.vista.btnReagendar.addActionListener(this);
        
        this.vista.jLCerrar.addMouseListener(this);
        this.vista.jLMinimizar.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnAreas) {
            abrirAreas();
        } else if (e.getSource() == this.vista.btnInstituciones) {
            abrirInstituciones();
        } else if (e.getSource() == this.vista.btnEstudios) {
            abrirEstudios();
        } else if(e.getSource() == this.vista.btnCortes){
            abrirCortes();
        }else if(e.getSource() == this.vista.btnEstudiosInstituciones){
            abrirEstudiosInstituciones();
        }else if(e.getSource() == this.vista.btnConsentimientos){
            abrirConsentimientos();
        }else if(e.getSource() == this.vista.btnReagendar){
            abrirReagendar();
        }
    }

    private void abrirAreas(){
        vista.dispose();
        AreasController controladorAreas = new AreasController(new AreasVista());
        controladorAreas.iniciar();
    }

    private void abrirInstituciones() {
        vista.dispose();
        InstitucionesController controladorInstituciones = new InstitucionesController(new Instituciones());
        controladorInstituciones.iniciar();
    }

    private void abrirEstudios() {
        vista.dispose();
        EstudiosController estudiosController = new EstudiosController(new Estudios());
        estudiosController.iniciar();
    }

    private void abrirCortes() {
        vista.dispose();
        CortesController controladorCortes = new CortesController(new Cortes());
        controladorCortes.iniciar();
    }

    private void abrirEstudiosInstituciones() {
       vista.dispose();
        EstudiosInstitucionesController ediosInes = new EstudiosInstitucionesController(new EstudiosInstituciones());
        ediosInes.iniciar();
    }

    private void abrirConsentimientos() {
        vista.dispose();
        ConsentimientosController consentimientos = new ConsentimientosController(new Consentimientos());
        consentimientos.iniciar();
    }

    private void abrirReagendar() {
       /* vista.dispose();
        ReagendarController controladorReagendar = new ReagendarController(new Reagendar());
        controladorReagendar.iniciar();*/
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.jLMinimizar){
            vista.setExtendedState(ICONIFIED);
        }
        else if(e.getSource() == vista.jLCerrar){
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
