
package Controlador;

import Modelo.EditarPropiedadDAO;
import Vista.App;
import Vista.EditarPropiedad;
import byrn.BYRN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 *
 * @author Samlml
 */
public class ControladorEditarPropiedad implements ActionListener{

    
    private EditarPropiedad jf;
    private EditarPropiedadDAO dao;
    private App app;
    
    public ControladorEditarPropiedad ( EditarPropiedad jf,  EditarPropiedadDAO dao,App app){
        this.jf=jf;
        this.dao=dao;
        this.app=app;
        jf.btnGuardarCambiosDeEdicionDePropiedades.addActionListener((ActionListener)this);
        mostrar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jf.btnGuardarCambiosDeEdicionDePropiedades==e.getSource()) {
            //HttpRequest request = PeticionHTTP.
            
            app.setVisible(false);
        }
    }
    
    private void mostrar(){
        jf.txtNumeroDePropiedadEdicion.setText(dao.getEstate().get("id").toString());
        jf.txtNombreDePropiedadEdicion.setText(dao.getEstate().get("name").toString());
        jf.txtDueñoDePropiedadEdicion.setText(dao.getEstate().get("owner_id").toString());
        jf.txtTipoDePropiedadEdicion.setText(BYRN.gson.fromJson(BYRN.gson.toJson(dao.getEstate().get("estate_type")), HashMap.class).get("name").toString());
        jf.txtDireccion.setText(dao.getEstate().get("address").toString());
        jf.txtDescripcionDePropiedadEdicion.setText(dao.getEstate().get("description").toString());
        jf.txtArea.setText(dao.getEstate().get("surface_area").toString());
        jf.txtCiudad.setText(dao.getEstate().get("city_id").toString());
        
    }
    
    
}
