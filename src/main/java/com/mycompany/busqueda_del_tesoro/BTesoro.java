package com.mycompany.busqueda_del_tesoro;

import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class BTesoro extends javax.swing.JFrame {

    DefaultTableModel Modelo;
    int jugadorFila = 0;
    int jugadorColumna = 0;
    int vidas = 3;
    int puntaje = 0;
    int tesorosTotales = 5;
    int filas = 20;
    int columnas = 10;
    int trampas = 17;

    String[][] matriz = new String[filas][columnas];

    public BTesoro() {
        initComponents();
        CrearModelo();
        actualizarPuntaje();
    }

    public void CrearModelo() {

        inicializarMatriz(matriz);
        llenarMatriz(matriz, 0, 0, tesorosTotales, trampas);
        Modelo = new DefaultTableModel(matriz, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
        Mapa.setModel(Modelo);
        inicializarTablaRecursiva(Modelo, filas, columnas, 0, 0);
        imprimirMatriz(matriz);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mapa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botonAbajo = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        Vida1 = new javax.swing.JButton();
        Vida2 = new javax.swing.JButton();
        Vida3 = new javax.swing.JButton();
        Noti = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Busqueda Del Tesoro");

        Mapa.setModel(new javax.swing.table.DefaultTableModel(
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
        Mapa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Mapa.setEnabled(false);
        Mapa.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(Mapa);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SCORE");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setFocusable(false);

        botonAbajo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\DOWN.png")); // NOI18N
        botonAbajo.setFocusPainted(false);
        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });

        botonArriba.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\UP.png")); // NOI18N
        botonArriba.setFocusPainted(false);
        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });

        botonDerecha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\RIGHT.png")); // NOI18N
        botonDerecha.setFocusPainted(false);
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });

        botonIzquierda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LEFT.png")); // NOI18N
        botonIzquierda.setFocusPainted(false);
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAbajo)
                            .addComponent(botonArriba)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botonIzquierda)
                        .addGap(62, 62, 62)
                        .addComponent(botonDerecha)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonArriba)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonIzquierda)
                    .addComponent(botonDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botonAbajo)
                .addGap(25, 25, 25))
        );

        Vida1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LIFE.png")); // NOI18N
        Vida1.setBorder(null);
        Vida1.setBorderPainted(false);
        Vida1.setContentAreaFilled(false);
        Vida1.setDefaultCapable(false);
        Vida1.setFocusPainted(false);
        Vida1.setFocusable(false);

        Vida2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LIFE.png")); // NOI18N
        Vida2.setBorder(null);
        Vida2.setBorderPainted(false);
        Vida2.setContentAreaFilled(false);
        Vida2.setDefaultCapable(false);
        Vida2.setFocusPainted(false);
        Vida2.setFocusable(false);

        Vida3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LIFE.png")); // NOI18N
        Vida3.setBorder(null);
        Vida3.setBorderPainted(false);
        Vida3.setContentAreaFilled(false);
        Vida3.setDefaultCapable(false);
        Vida3.setFocusPainted(false);
        Vida3.setFocusable(false);

        Noti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Noti.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("PISTAS");

        jButton6.setText("Solicitar Pista");
        jButton6.setFocusPainted(false);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Noti, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Vida1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Vida2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Vida3))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Vida1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Vida2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Vida3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Noti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        moverJugador(jugadorFila, jugadorColumna + 1, matriz);
        actualizarTablero();
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        moverJugador(jugadorFila - 1, jugadorColumna, matriz);
        actualizarTablero();// TODO add your handling code here:
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        moverJugador(jugadorFila + 1, jugadorColumna, matriz);
        actualizarTablero();        // TODO add your handling code here:
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        moverJugador(jugadorFila, jugadorColumna - 1, matriz);
        actualizarTablero();// TODO add your handling code here:
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BTesoro().setVisible(true);
            }
        });
    }

    // Inicializa la matriz con espacios vacíos
    public static void inicializarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
    }

    // Función recursiva para llenar la matriz
    public static void llenarMatriz(String[][] matriz, int fila, int col, int tesorosRestantes, int trampasRestantes) {
        if (fila == matriz.length) {
            return; // Caso base: se llenaron todas las filas
        }

        // Si es la casilla inicial, garantizamos que esté vacía
        if (fila == 0 && col == 0) {
            matriz[fila][col] = " ";
        } else {
            Random random = new Random();
            String valor = " ";
            if (tesorosRestantes > 0 || trampasRestantes > 0) {
                // Intenta dispersar tesoros y trampas en regiones menos ocupadas
                if (tesorosRestantes > 0 && trampasRestantes > 0) {
                    int aleatorio = random.nextInt(3); // 0: vacío, 1: tesoro, 2: trampa
                    if (aleatorio == 1 && puedeColocar(matriz, fila, col, "T") && estaDesperso(matriz, fila, col)) {
                        valor = "T";
                        tesorosRestantes--;
                    } else if (aleatorio == 2 && puedeColocar(matriz, fila, col, "X") && estaDesperso(matriz, fila, col)) {
                        valor = "X";
                        trampasRestantes--;
                    }
                } else if (tesorosRestantes > 0 && puedeColocar(matriz, fila, col, "T") && estaDesperso(matriz, fila, col)) {
                    valor = "T";
                    tesorosRestantes--;
                } else if (trampasRestantes > 0 && puedeColocar(matriz, fila, col, "X") && estaDesperso(matriz, fila, col)) {
                    valor = "X";
                    trampasRestantes--;
                }
            }
            matriz[fila][col] = valor;
        }

        // Avanzar al siguiente elemento de la matriz
        if (col < matriz[0].length - 1) {
            llenarMatriz(matriz, fila, col + 1, tesorosRestantes, trampasRestantes);
        } else {
            llenarMatriz(matriz, fila + 1, 0, tesorosRestantes, trampasRestantes);
        }
    }

    // Comprueba si se puede colocar un elemento en una posición
    public static boolean puedeColocar(String[][] matriz, int fila, int col, String tipo) {
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Arriba, abajo, izquierda, derecha

        for (int[] dir : direcciones) {
            int nuevaFila = fila + dir[0];
            int nuevaCol = col + dir[1];
            if (nuevaFila >= 0 && nuevaFila < matriz.length && nuevaCol >= 0 && nuevaCol < matriz[0].length) {
                if (matriz[nuevaFila][nuevaCol].equals(tipo)) {
                    return false; // Hay un tipo adyacente, no se puede colocar
                }
            }
        }
        return true;
    }

    // Verifica si una posición está dispersa de otros tesoros o trampas
    public static boolean estaDesperso(String[][] matriz, int fila, int col) {
        int rango = 2; // Define qué tan lejos debe estar de otros elementos
        for (int i = -rango; i <= rango; i++) {
            for (int j = -rango; j <= rango; j++) {
                int nuevaFila = fila + i;
                int nuevaCol = col + j;
                if (nuevaFila >= 0 && nuevaFila < matriz.length && nuevaCol >= 0 && nuevaCol < matriz[0].length) {
                    if (matriz[nuevaFila][nuevaCol].equals("T") || matriz[nuevaFila][nuevaCol].equals("X")) {
                        return false; // Hay otro elemento en el rango definido
                    }
                }
            }
        }
        return true;
    }

    // Imprime la matriz
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inicializarTablaRecursiva(DefaultTableModel modelo, int filas, int columnas, int i, int j) {
        if (i >= filas) {
            return; // Caso base: se recorrieron todas las filas
        }

        // Establece el valor en la celda actual
        modelo.setValueAt(" ", i, j);

        // Avanza al siguiente elemento
        if (j < columnas - 1) {
            inicializarTablaRecursiva(modelo, filas, columnas, i, j + 1); // Avanza en la misma fila
        } else {
            inicializarTablaRecursiva(modelo, filas, columnas, i + 1, 0); // Avanza a la siguiente fila
        }
    }

    private void moverJugador(int nuevaFila, int nuevaColumna, String[][] matriz) {
        if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas) {
            // Limpiar la casilla anterior
            matriz[jugadorFila][jugadorColumna] = " ";
            jugadorFila = nuevaFila;
            jugadorColumna = nuevaColumna;

            // Marcar la casilla como visitada
            casillasVisitadas[jugadorFila][jugadorColumna] = true;

            // Verificar si hay un tesoro o trampa
            if (matriz[jugadorFila][jugadorColumna].equals("T")) {
                puntaje++; // Aumentar puntaje
                if (puntaje == 3) {
                    JOptionPane.showMessageDialog(this, "¡Has ganado!");
                    reiniciarJuego();
                }
            } else if (matriz[jugadorFila][jugadorColumna].equals("X")) {
                vidas--; // Reducir vidas
                if (vidas == 0) {
                    JOptionPane.showMessageDialog(this, "¡Has perdido todas las vidas!");
                    reiniciarJuego();
                }
            }

            // Actualizar el puntaje y vidas
            actualizarPuntaje();
            actualizarTableroRecursivo(Modelo, 0, 0, Mapa); // Llamada recursiva para actualizar el tablero
        }
    }

    private void actualizarPuntaje() {
        jTextField1.setText(String.valueOf(puntaje));
        if (vidas == 3) {
            Vida1.setVisible(true);
            Vida2.setVisible(true);
            Vida3.setVisible(true);
        } else if (vidas == 2) {
            Vida1.setVisible(true);
            Vida2.setVisible(true);
            Vida3.setVisible(false);
        } else if (vidas == 1) {
            Vida1.setVisible(true);
            Vida2.setVisible(false);
            Vida3.setVisible(false);
        } else {
            Vida1.setVisible(false);
            Vida2.setVisible(false);
            Vida3.setVisible(false);
        }
    }

    private void actualizarVidas() {
        if (vidas == 2) {
            Vida3.setVisible(false);
        } else if (vidas == 1) {
            Vida2.setVisible(false);
        } else if (vidas == 0) {
            Vida1.setVisible(false);
        }
    }

    boolean[][] casillasVisitadas = new boolean[filas][columnas];

    public class CustomCellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel(value.toString());
            label.setOpaque(true);

            // Restaurar el color de fondo por defecto (blanco) si no está visitada
            if (!casillasVisitadas[row][column]) {
                label.setBackground(Color.WHITE);
            } else {
                label.setBackground(Color.GREEN);  // Color verde para las celdas visitadas
            }

            return label;
        }
    }

    public void actualizarTableroRecursivo(DefaultTableModel modelo, int i, int j, JTable tabla) {
        if (i >= filas) {
            return; // Caso base: Se recorrieron todas las filas
        }

        tabla.setDefaultRenderer(Object.class, new CustomCellRenderer());

        if (casillasVisitadas[i][j]) { // Si la casilla ha sido visitada

            if (matriz[i][j].equals("T")) {
                Modelo.setValueAt("T", i, j);
                Noti.setText("Hallaste un tesoro, +1 Punto");
            } else if (matriz[i][j].equals("X")) {
                Modelo.setValueAt("X", i, j);
                Noti.setText("Caiste en una trampa -1 Vida");
            } else if (i == jugadorFila && j == jugadorColumna) {
                Modelo.setValueAt("P", i, j); // P representa la posición del jugador
            } else {
                Modelo.setValueAt(" ", i, j); // Vacío
                Noti.setText("");
            }
        }

        // Avanza a la siguiente celda
        if (j < columnas
                - 1) {
            actualizarTableroRecursivo(modelo, i, j + 1, Mapa); // Avanza en la misma fila
        } else {
            actualizarTableroRecursivo(modelo, i + 1, 0, Mapa); // Avanza a la siguiente fila
        }
    }

    public void actualizarTablero() {
        actualizarTableroRecursivo(Modelo, 0, 0, Mapa); // Comienza desde la primera casilla
    }

    public void reiniciarJuego() {
        // Reiniciar las variables del jugador
        jugadorFila = 0;
        jugadorColumna = 0;
        vidas = 3;
        puntaje = 0;
        // Limpiar la matriz
        inicializarMatriz(matriz);
        // Volver a llenar la matriz con los elementos iniciales (tesoros y trampas)
        llenarMatriz(matriz, 0, 0, tesorosTotales, trampas);
        // Limpiar las celdas visitadas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillasVisitadas[i][j] = false;
            }
        }
        // Actualizar la tabla con la matriz reiniciada
        Modelo = new DefaultTableModel(matriz, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
        Mapa.setModel(Modelo);
        // Limpiar las imágenes de vida
        Vida1.setVisible(true);
        Vida2.setVisible(true);
        Vida3.setVisible(true);
        // Actualizar el puntaje y las vidas
        actualizarPuntaje();
        // Reestablecer la tabla para reflejar los cambios
        actualizarTableroRecursivo(Modelo, 0, 0, Mapa);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Modelo.setValueAt("", i, j); // Todas las casillas se inician como ocultas
            }
        }
        imprimirMatriz(matriz);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mapa;
    private javax.swing.JTextField Noti;
    private javax.swing.JButton Vida1;
    private javax.swing.JButton Vida2;
    private javax.swing.JButton Vida3;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
