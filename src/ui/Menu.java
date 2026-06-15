package ui;
import dao.CategoryDAO;
import dao.ProductDAO;
import model.Category;
import model.Product;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    private javax.swing.JPopupMenu optionsMenu;
    private boolean cargandoCategorias = false;
    
    public Menu() {
        initComponents();
        setSize(1000, 610);
        setResizable(false);
        setLocationRelativeTo(null);
        
        OptionsMenu();
        //escalarTodosLosIconos();
        cargarCategorias();
        cargarTodosLosProductos();
        btnAgregarProducto.setEnabled(false);
        btnAgregarCategoria.setEnabled(false);
    }
    
    private void cargarCategorias() {
        cargandoCategorias = true;

        CategoryDAO categoryDAO = new CategoryDAO();
        List<Category> categorias = categoryDAO.listCategories();

        cmbCategorias.removeAllItems();
        cmbCategorias.addItem("Todas las categorías");

        for (Category categoria : categorias) {
            cmbCategorias.addItem(categoria.getName());
        }

        cargandoCategorias = false;
    }
    
    private void cargarTodosLosProductos() {
        ProductDAO productDAO = new ProductDAO();

        List<Product> productos = productDAO.listProducts();

        cargarTablaProductos(productos);
    }
    
    private void cargarProductosPorCategoria(int idCategory) {
        ProductDAO productDAO = new ProductDAO();

        List<Product> productos =
                productDAO.listProductsByCategory(idCategory);

        cargarTablaProductos(productos);
    }
    
    private void cargarTablaProductos(List<Product> productos) {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Marca");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoría");
        modelo.addColumn("Puntaje");

        for (Product producto : productos) {
            modelo.addRow(new Object[]{
            producto.getIdProduct(),
            producto.getName(),
            producto.getBrand(),
            producto.getPrice(),
            producto.getCategory() != null
                    ? producto.getCategory().getName()
                    : "",
            producto.getAverageScore()
        });
        }

        tblProductos.setModel(modelo);

        // Ocultar columna ID
        tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(0).setWidth(0);
    }
    private void OptionsMenu(){
        optionsMenu = new javax.swing.JPopupMenu();  
        
        javax.swing.JMenuItem itemProfile = new javax.swing.JMenuItem("Mi Información Personal");
        javax.swing.JMenuItem itemReviews = new javax.swing.JMenuItem("Mis Reseñas");
        javax.swing.JMenuItem itemSearch = new javax.swing.JMenuItem("Buscar");
        
        
        javax.swing.JMenuItem itemCredits = new javax.swing.JMenuItem("Créditos");
        itemCredits.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Paraguay Review - Versión 1.0\nDesarrollado por el Equipo de Backend & PM"
                    + "\n Mauricio Agüero - CI: 5.285.627 \n Nayeli Bernal - CI: 5.664.170 \n Antonella Garay - CI: 5.644.950 \n Ezequiel Gonzalez - CI: 5.932.597 "
                    + "\n Fabrizio Mazó - CI: 5.708.103 \n Francisco Núñez - CI: 5.728.021 \n Matias Ojeda - CI: 5.643.062 \n Jorge Ríos - CI: 6.547.706 "
                    + "\n Ivo Vallejos - CI: 5.100.144", "Créditos", JOptionPane.INFORMATION_MESSAGE);
        });
        
        optionsMenu.add(itemProfile);
        optionsMenu.add(itemReviews);
        optionsMenu.add(itemSearch);
        optionsMenu.addSeparator(); 
        optionsMenu.add(itemCredits);
        
    }
    /*
    private void escalarYCentrarIcono(javax.swing.JLabel label, String rutaRecurso, int ancho, int alto) {
        java.net.URL imgURL = getClass().getResource(rutaRecurso);
        if (imgURL != null) {
            javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(imgURL);
            java.awt.Image imagenOriginal = iconoOriginal.getImage();
            
            java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
            label.setIcon(new javax.swing.ImageIcon(imagenEscalada));
            
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        } else {
            logger.log(java.util.logging.Level.WARNING, "No se encontró el recurso: " + rutaRecurso);
        }
    }*/
/*
    private void escalarTodosLosIconos() {
        int anchoIcono = 140; 
        int altoIcono = 110;

        escalarYCentrarIcono(icon1, "/recursos/tech_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon2, "/recursos/book_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon3, "/recursos/house_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon4, "/recursos/beauty_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon5, "/recursos/clothe_icon.png", anchoIcono, altoIcono);
        escalarYCentrarIcono(icon6, "/recursos/toys_icon.png", anchoIcono, altoIcono);
    }
    
    */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        cmbCategorias = new javax.swing.JComboBox<>();
        scrlProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        btnAgregarCategoria = new javax.swing.JButton();
        btnVerDetalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 246, 247));

        btnMenu.setBackground(new java.awt.Color(50, 74, 129));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menú");
        btnMenu.setBorder(null);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusable(false);
        btnMenu.addActionListener(this::btnMenuActionPerformed);

        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategorias.addActionListener(this::cmbCategoriasActionPerformed);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrlProductos.setViewportView(tblProductos);

        btnAgregarProducto.setText("Agregar producto");
        btnAgregarProducto.addActionListener(this::btnAgregarProductoActionPerformed);

        btnAgregarCategoria.setText("Agregar categoría");
        btnAgregarCategoria.addActionListener(this::btnAgregarCategoriaActionPerformed);

        btnVerDetalle.setText("Ver detalles");
        btnVerDetalle.addActionListener(this::btnVerDetalleActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerDetalle))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProducto)
                    .addComponent(btnAgregarCategoria)
                    .addComponent(btnVerDetalle))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
      /*  AgregarProducto ventana = new AgregarProducto();
        ventana.setVisible(true);*/
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void cmbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriasActionPerformed
        if (cargandoCategorias) {
            return;
        }

        Object itemSeleccionado = cmbCategorias.getSelectedItem();

        if (itemSeleccionado == null) {
            return;
        }

        String nombreCategoria = itemSeleccionado.toString();

        if (nombreCategoria.equals("Todas las categorías")) {
            cargarTodosLosProductos();
            return;
        }

        CategoryDAO categoryDAO = new CategoryDAO();
        List<Category> categorias = categoryDAO.listCategories();

        for (Category categoria : categorias) {
            if (categoria.getName().equals(nombreCategoria)) {
                cargarProductosPorCategoria(categoria.getIdCategory());
                break;
            }
        }
    }//GEN-LAST:event_cmbCategoriasActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        optionsMenu.show(btnMenu, 0, btnMenu.getHeight());
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
  /*       AgregarCategoria ventana = new AgregarCategoria(this, true);
        ventana.setVisible(true);

        cargarCategorias();*/
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalleActionPerformed
        int fila = tblProductos.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un producto primero.");
        return;
    }

    int idProducto = Integer.parseInt(tblProductos.getValueAt(fila, 0).toString());
    model.User usuarioPrueba = new model.User();
    usuarioPrueba.setIdUser(2);
    usuarioPrueba.setUsername("usuario_prueba");
    DetalleProducto ventana = new DetalleProducto(this, true, idProducto, usuarioPrueba);
    ventana.setVisible(true);
    cargarTodosLosProductos();
    }//GEN-LAST:event_btnVerDetalleActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrlProductos;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
