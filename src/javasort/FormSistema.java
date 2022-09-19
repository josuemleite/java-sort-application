package javasort;

import java.io.*;
import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {

    ArrayList<Dados> lista = new ArrayList<>();
    Comparator<Dados> compareDate = (Dados a1, Dados a2) -> a1.getReleaseDate().compareTo(a2.getReleaseDate());
    Comparator<Dados> compareName = (Dados a1, Dados a2) -> a1.getEnglishName().compareToIgnoreCase(a2.getEnglishName());
    Comparator<Dados> compareCategory = (Dados a1, Dados a2) -> a1.getCategory() - a2.getCategory();
    Comparator<Dados> compareLevel = (Dados a1, Dados a2) -> a1.getLevel() - a2.getLevel();
    Comparator<Dados> compareAttack = (Dados a1, Dados a2) -> a1.getAttack() - a2.getAttack();
    Comparator<Dados> compareDefense = (Dados a1, Dados a2) -> a1.getDefense() - a2.getDefense();

    public FormSistema() {
        initComponents();
        carregaArquivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblProx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        opBin = new javax.swing.JRadioButton();
        opSeq = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ordenação - YuGiOh!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/duel-yugioh.gif"))); // NOI18N
        lblProx.setText("d");
        lblProx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/yu-gi-oh.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1200, 309));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list.png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cidade", "Condição", "Tendencia", "Mínima", "Máxima", "Vento Min", "Vento Max", "Direção Vento"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data", "Nome", "Categoria", "Nível", "Ataque", "Defesa", " " }));

        txtBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(opBin);
        opBin.setText("Binária");

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addComponent(cbOrdena, 0, 232, Short.MAX_VALUE)
                        .addComponent(txtBusca)
                        .addComponent(btnBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(opSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opBin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opBin)
                            .addComponent(opSeq))
                        .addGap(23, 23, 23)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 315, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo() {
        String csvFile = "rush_duel_japan_2021_monster.csv";
        String line = "";
        String[] leitura = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-d-yy", Locale.ENGLISH);
            while ((line = br.readLine()) != null) {
                Dados duel = new Dados();
                leitura = line.split(",");
                duel.setReleaseDate(LocalDate.parse(leitura[0], formatter));
                duel.setCardNumber(leitura[1]);
                duel.setEnglishName(leitura[2]);
                duel.setCategory(Integer.parseInt(leitura[3]));
                duel.setRarity(leitura[4]);
                duel.setLevel(Integer.parseInt(leitura[5]));
                duel.setAttribute(leitura[6]);
                duel.setType(leitura[7]);
                duel.setAttack(Integer.parseInt(leitura[8]));
                duel.setDefense(Integer.parseInt(leitura[9]));
                lista.add(duel);
            }
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void mostra() {
        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"Data", "Número da Carta", "Nome", "Categoria", "Raridade", "Nível", "Atributo", "Tipo", "Ataque", "Defesa"}));

        DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
        Object rowData[] = new Object[10];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy", Locale.ENGLISH);

        for (Dados d : lista) {
            rowData[0] = d.getReleaseDate().format(formatter);
            rowData[1] = d.getCardNumber();
            rowData[2] = d.getEnglishName();
            rowData[3] = d.getCategory();
            rowData[4] = d.getRarity();
            rowData[5] = d.getLevel();
            rowData[6] = d.getAttribute();
            rowData[7] = d.getType();
            rowData[8] = d.getAttack();
            rowData[9] = d.getDefense();
            model.addRow(rowData);
        }
    }

    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                lista.sort(compareDate);
                break;
            case 1:
                lista.sort(compareName);
                break;
            case 2:
                lista.sort(compareCategory);
                break;
            case 3:
                lista.sort(compareLevel);
                break;
            case 4:
                lista.sort(compareAttack);
                break;
            case 5:
                lista.sort(compareDefense);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Em construção!");
        }
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        int cont = 0;
        switch (cbOrdena.getSelectedIndex()) 
        {
            case 0:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getEnglishName().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Carta encontrada " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();
                    d.setEnglishName(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, compareDate); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Carta encontrada, posicao " + (pos + 1));
                }
                break;
            case 1:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getEnglishName().equalsIgnoreCase(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Carta encontrada " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();
                    d.setEnglishName(txtBusca.getText());
                    int pos = Collections.binarySearch(lista, d, compareName); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Carta encontrada, posicao " + (pos + 1));
                }
                break;
            case 2:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if ((Integer.parseInt(txtBusca.getText())) == d.getCategory()) {
                            JOptionPane.showMessageDialog(null, "A primeira carta desta categoria foi encontrada! " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();
                    d.setCategory(Integer.parseInt(txtBusca.getText()));
                    int pos = Collections.binarySearch(lista, d, compareCategory); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Há valores repetidos (cartas com a mesma categoria) para a busca binária...");
                }
                break;
            case 3:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if ((Integer.parseInt(txtBusca.getText())) == d.getLevel()) {
                            JOptionPane.showMessageDialog(null, "A primeira carta deste nível foi encontrada! " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();
                    d.setCategory(Integer.parseInt(txtBusca.getText()));
                    int pos = Collections.binarySearch(lista, d, compareLevel); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Há valores repetidos (cartas com o mesmo level) para a busca binária...");
                }
                break;
            case 4:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if ((Integer.parseInt(txtBusca.getText())) == d.getAttack()) {
                            JOptionPane.showMessageDialog(null, "A primeira carta com este poder de ataque foi encontrada! " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();
                    d.setCategory(Integer.parseInt(txtBusca.getText()));
                    int pos = Collections.binarySearch(lista, d, compareAttack); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Há valores repetidos (cartas com o mesmo poder de ataque) para a busca binária...");
                }
                break;
            case 5:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if ((Integer.parseInt(txtBusca.getText())) == d.getDefense()) {
                            JOptionPane.showMessageDialog(null, "A primeira carta com este poder de defesa foi encontrada! " + cont + " comparações");
                            break;
                        }
                    }
                } else {
                    Dados d = new Dados();
                    d.setCategory(Integer.parseInt(txtBusca.getText()));
                    int pos = Collections.binarySearch(lista, d, compareDefense); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Há valores repetidos (cartas com o mesmo poder de defesa) para a busca binária...");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Em construção!");
        }
    }//GEN-LAST:event_btnBuscaActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
