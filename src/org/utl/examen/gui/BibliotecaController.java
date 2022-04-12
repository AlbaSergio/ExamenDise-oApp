/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utl.examen.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import org.utl.blb.core.model.Libro;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author zende
 */
public class BibliotecaController implements Initializable {

    @FXML
    private JFXTextField txtTitulo;

    @FXML
    private JFXTextField txtAutor;

    @FXML
    private JFXTextField txtFecha;

    @FXML
    private JFXTextField txtNumPag;

    @FXML
    private JFXTextField txtEditorial;

    @FXML
    private Button btnSave;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colTitulo;

    @FXML
    private TableColumn<?, ?> colAutor;

    @FXML
    private TableColumn<?, ?> colEditorial;

    @FXML
    private TableColumn<?, ?> colNumPag;
    ObservableList<Libro> bookList;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }
 public void saveLibro() {
        Libro book = new Libro();
        book.setIdLibro(bookList.size() + 1);
       
    }
    

}
