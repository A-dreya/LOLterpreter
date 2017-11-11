
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jira
 */
public class MainFrame extends javax.swing.JFrame {
    private String[] result;
    private String[] word;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFile = new javax.swing.JPanel();
        importFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        filenameTitle = new javax.swing.JLabel();
        lexemePanel = new javax.swing.JPanel();
        lexicalanalyzer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lexemeTable = new javax.swing.JTable();
        executePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        symbolTablePanel = new javax.swing.JPanel();
        symbolTableTable = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        symbolTable = new javax.swing.JTable();
        executeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        importFile.setText("...");
        importFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importFileMouseClicked(evt);
            }
        });

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        jScrollPane1.setViewportView(inputTextArea);

        javax.swing.GroupLayout mainFileLayout = new javax.swing.GroupLayout(mainFile);
        mainFile.setLayout(mainFileLayout);
        mainFileLayout.setHorizontalGroup(
            mainFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFileLayout.createSequentialGroup()
                .addGroup(mainFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFileLayout.createSequentialGroup()
                        .addComponent(filenameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(importFile))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        mainFileLayout.setVerticalGroup(
            mainFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFileLayout.createSequentialGroup()
                .addGroup(mainFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(importFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filenameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        lexicalanalyzer.setBackground(new java.awt.Color(254, 254, 254));
        lexicalanalyzer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lexicalanalyzer.setText("Lexical Analyzer");
        lexicalanalyzer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lexemeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexemes", "Classification"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(lexemeTable);

        javax.swing.GroupLayout lexemePanelLayout = new javax.swing.GroupLayout(lexemePanel);
        lexemePanel.setLayout(lexemePanelLayout);
        lexemePanelLayout.setHorizontalGroup(
            lexemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lexicalanalyzer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lexemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lexemePanelLayout.setVerticalGroup(
            lexemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lexemePanelLayout.createSequentialGroup()
                .addComponent(lexicalanalyzer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout executePanelLayout = new javax.swing.GroupLayout(executePanel);
        executePanel.setLayout(executePanelLayout);
        executePanelLayout.setHorizontalGroup(
            executePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(executePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
        );
        executePanelLayout.setVerticalGroup(
            executePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        symbolTableTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbolTableTable.setText("Symbol Table");
        symbolTableTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        symbolTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variable", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(symbolTable);

        javax.swing.GroupLayout symbolTablePanelLayout = new javax.swing.GroupLayout(symbolTablePanel);
        symbolTablePanel.setLayout(symbolTablePanelLayout);
        symbolTablePanelLayout.setHorizontalGroup(
            symbolTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(symbolTableTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(symbolTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, symbolTablePanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        symbolTablePanelLayout.setVerticalGroup(
            symbolTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(symbolTablePanelLayout.createSequentialGroup()
                .addComponent(symbolTableTable)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(symbolTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, symbolTablePanelLayout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        executeButton.setText("Execute");
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lexemePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(symbolTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(executePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(executeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lexemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(symbolTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(executeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(executePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mainFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Lexical Analyzer
    //Loop through the lexemes and scan
    private void lexicalAnalysis(){
      //Once the execute button was pressed, the program will search for lexemes
      //TODO add your handling code here:
      if (inputTextArea.getText().equals("")){//check first if there is a code
        inputTextArea.setText("Input text here");
      }else{//split the code into tokens
        this.result = inputTextArea.getText().split("\\n");
        DefaultTableModel model = (DefaultTableModel) lexemeTable.getModel();

      model.setRowCount(0);
      for(int y=0; y<result.length; y++){//compare
        if (result[y].contains("OBTW")){
            model.addRow(new Object[]{"OBTW","Comment Delimiter"});
            int z = 0;
            while (!result[z].matches("^TLDR$")){
                z++;
                y++;
            }
            model.addRow(new Object[]{result[y],"Comment Delimiter"});
            continue;
        }
	      this.word=result[y].split("\\t| ");
        for(int x=0; x<word.length;x++){
          try{
            if(word[x].matches("^HAI$")){
              model.addRow(new Object[]{word[x], "Code Delimiter"+"\n"});
            }else if((word[x].matches("^ITZ$"))){
              model.addRow(new Object[]{word[x], "Variable Assignment"+"\n"});
            }else if(word[x].matches("(\\-?\\d+)")){
              model.addRow(new Object[]{word[x], "Integer Literal"+"\n"});
            }else if(word[x].matches("(\\-?\\d*\\.?\\d+)")){
              model.addRow(new Object[]{word[x], "Float Literal"+"\n"});
            }else if(word[x].matches("^(WIN|FAIL)$")){
              model.addRow(new Object[]{word[x], "Boolean Literal"+"\n"});
            }else if(word[x].matches("^(NOOB|NUMBR|NAMBAR|TROOF|BUKKIT|YARN)$")){
              model.addRow(new Object[]{word[x], "Data Type"+"\n"});
            }else if(word[x].matches("^KTHXBYE$")){
              model.addRow(new Object[]{word[x], "Code Delimiter"+"\n"});
            }else if(word[x].matches("^BTW$")){
              model.addRow(new Object[]{word[x], "Comment Delimiter"+"\n"});
              break;
            }else if((word[x].matches("^R$"))){
              model.addRow(new Object[]{word[x], "Variable Assignment"+"\n"});
            }else if(word[x].matches("^NOT$")){
                model.addRow(new Object[]{word[x] + "\n", "Boolean Operator"+"\n"});
            }else if(word[x].matches("^DIFFRINT$")){
                model.addRow(new Object[]{word[x], "Comparison Operator"+"\n"});
            }else if(word[x].matches("^SMOOSH$")){
                model.addRow(new Object[]{word[x], "String Operator"+"\n"});
            }else if(word[x].matches("^MAEK$")){
                model.addRow(new Object[]{word[x], "Parser"+"\n"});
            }else if(word[x].matches("^A$")){
                model.addRow(new Object[]{word[x], "Parser"+"\n"});
            }else if(word[x].matches("^VISIBLE$")){
                model.addRow(new Object[]{word[x], "Output Keyword"+"\n"});
            }else if(word[x].matches("^GIMMEH$")){
                model.addRow(new Object[]{word[x], "Scan Keyword"+"\n"});
            }else if(word[x].matches("^MEBBE$")){
                model.addRow(new Object[]{word[x] + "\n", "If-else"+"\n"});
            }else if(word[x].matches("^OIC$")){
                model.addRow(new Object[]{word[x] + "\n", "Delimiter"+"\n"});
            }else if(word[x].matches("^WTF\\?$")){
                model.addRow(new Object[]{word[x] + "\n", "Switch Case"+"\n"});
            }else if(word[x].matches("^OMG$")){
                model.addRow(new Object[]{word[x] + "\n", "Switch Case"+"\n"});
            }else if(word[x].matches("^OMGWTF$")){
                model.addRow(new Object[]{word[x] + "\n", "Switch Case"+"\n"});
            }else if(word[x].matches("^UPPIN$")){
                model.addRow(new Object[]{word[x] + "\n", "Increment"+"\n"});
            }else if(word[x].matches("^NERFIN$")){
                model.addRow(new Object[]{word[x] + "\n", "Decrement"+"\n"});
            }else if(word[x].matches("^YR$")){
                model.addRow(new Object[]{word[x] + "\n", "Variable Declaration"+"\n"});
            }else if(word[x].matches("^YR$")){
                model.addRow(new Object[]{word[x] + "\n", "Declaration"+"\n"});
            }else if(word[x].matches("^TIL$")){
                model.addRow(new Object[]{word[x] + "\n", "Keyword"+"\n"});
            }else if(word[x].matches("^WILE$")){
                model.addRow(new Object[]{word[x] + "\n", "Keyword"+"\n"});
            }else if(word[x].matches("^AN$")){
                model.addRow(new Object[]{word[x] + "\n", "Keyword"+"\n"});
            }else if((word[x]+" "+word[x+1]).matches("^NO\\sWAI$")){
                model.addRow(new Object[]{word[x]+" "+word[x+1]+"\n", "If-else"+"\n"});
                x = x + 1;
            }else if((word[x]+" "+word[x+1]).matches("^O\\sRLY\\?$")){
                model.addRow(new Object[]{word[x]+" "+word[x+1] + "\n", "If-else"+"\n"});
                x = x+ 1;
            }else if((word[x]+" "+word[x+1]).matches("^YA\\sRLY$")){
                 model.addRow(new Object[]{word[x]+" "+word[x+1] + "\n", "If-else"+"\n"});
                 x = x+1;
            }else if((word[x]+" "+word[x+1]).matches("^ANY\\sOF$")){
                model.addRow(new Object[]{word[x] + " " + word[x+1] + "\n", "Operation"+"\n"});
                x=x+1;
            }else if((word[x]+" "+word[x+1]).matches("^ALL\\sOF$")){
                model.addRow(new Object[]{word[x] + " " + word[x+1] + "\n", "Operation"+"\n"});
                x = x+1;
            }else if((word[x]+" "+word[x+1]).matches("^BOTH\\sSAEM$")){
                model.addRow(new Object[]{word[x] + " " + word[x+1] + "\n", "Comparison Operator"+"\n"});
                x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^SUM\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Addition Operation"+"\n"});
              x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^DIFF\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Subtraction Operation"+"\n"});
              x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^PRODUKT\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Multiplication Operation"+"\n"});
              x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^QUOSHUNT\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Division Operation"+"\n"});
              x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^MOD\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Modulo Operation"+"\n"});
              x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^BIGGR\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Max Operation"+"\n"});
              x = x+1;
            }else if(((word[x]+" "+word[x+1]).matches("^SMALLR\\sOF$"))){
              model.addRow(new Object[]{word[x] +" " + word[x+1], "Min Operation"+"\n"});
              x = x+1;
            }else if((word[x]+" "+word[x+1]).matches("^BOTH\\sOF$")){ //dannah starts hereee
              model.addRow(new Object[]{word[x] + " " + word[x+1] + "\n", "Boolean Operator"+"\n"});
              x = x+1;
            }else if((word[x]+" "+word[x+1]).matches("^EITHER\\sOF$")){
                model.addRow(new Object[]{word[x] + " " + word[x+1] + "\n", "Boolean Operator"+"\n"});
                x = x+1;
            }else if((word[x]+" "+word[x+1]).matches("^WON\\sOF$")){
                model.addRow(new Object[]{word[x] + " " + word[x+1] + "\n", "Boolean"+"\n"});
                x = x+1;
            }else if((word[x]+" "+word[x+1]).matches("^FOUND\\sYR$")){
              model.addRow(new Object[]{word[x] +" "+ word[x+1], "Return Value"+"\n"});
              x = x+2;
            }else if((word[x]+" "+ word[x+1]+" "+word[x+2]).matches("^I\\sHAS\\sA$")){
              model.addRow(new Object[]{word[x] +" " + word[x+1]+" " + word[x+2], "Variable Declaration"+"\n"});
              x = x+2;
            }else if((word[x]+" "+word[x+1]+" "+word[x+2]).matches("^IM\\sIN\\sYR$")){
                model.addRow(new Object[]{word[x]+" "+word[x+1]+" "+word[x+2] + "\n", "Loop Declaration"+"\n"});
                x = x+2;
            }else if((word[x]+" "+word[x+1]+" "+word[x+2]).matches("^IS\\sNOW\\sA$")){
                model.addRow(new Object[]{word[x]+" "+word[x+1]+" "+word[x+2] + "\n", "Parser"+"\n"});
                x = x+2;
            }else if((word[x]+" "+word[x+1]+" "+word[x+2]).matches("^IM\\sOUTTA\\sYR$")){
                model.addRow(new Object[]{word[x]+" "+word[x+1]+" "+word[x+2], "Delimiter"+"\n"});
               x = x+2;
            }else if((word[x]+" "+word[x+1]+" "+word[x+2]).matches("^HOW\\sIZ\\sI$")){
                model.addRow(new Object[]{word[x]+" "+word[x+1]+" "+word[x+2], "Function Declaration"+"\n"});
               x = x+2;
            }else if(word[x].matches("^IF$")){
                if((word[x]+" "+word[x+1]+" "+word[x+2]+" "+word[x+3]).matches("^IF\\sU\\sSAY\\sSO$")){
                  model.addRow(new Object[]{word[x]+" "+word[x+1]+" "+word[x+2]+" "+word[x+3], "Function Delimiter"+"\n"});
                  x = x+3;
                }
            }else if(word[x].matches("((^[A-Za-z])(\\w*_*)*\\s?$)")){
              if (((word[x-3]+" "+word[x-2]+" "+word[x-1]).equals("IM IN YR"))|((word[x-3]+" "+word[x-2]+" "+word[x-1]).equals("IM OUTTA YR"))){
                  model.addRow(new Object[]{word[x],"Loop Identifier"});
              }else if(((word[x-3]+" "+word[x-2]+" "+word[x-1]).equals("HOW IZ I"))){
                  model.addRow(new Object[]{word[x],"Function Identifier"});
              }else{
                  model.addRow(new Object[]{word[x] + "\n", "Variable Identifier\n"});
              }
            }
          }catch(Exception e){
            if(word[x].matches("((^[A-Za-z])(\\w*_*)*\\s?$)")){
                model.addRow(new Object[]{word[x] + "\n", "Variable Identifier\n"});
            }else if(word[x].matches("^\".*\"$")){
                model.addRow(new Object[]{"\"", "String Delimiter"+"\n"});
                model.addRow(new Object[]{word[x].substring(1,word[x].length()-1), "String Literal"+"\n"});
                model.addRow(new Object[]{"\"", "String Delimiter"+"\n"});
            }else if(word[x].charAt(0) == '"'){
                int i = 1;
                while (word[x+i].charAt(word[x+i].length()-1) != '"'){
                    word[x] = word[x]  + " " + word[x+i];
                    i++;
                }
                word[x] = word[x]  + " " + word[x+i];
                if (word[x].matches("^\".*\"$")){
                    model.addRow(new Object[]{"\"", "String Delimiter"+"\n"});
                    model.addRow(new Object[]{word[x].substring(1,word[x].length()-1), "String Literal"+"\n"});
                    model.addRow(new Object[]{"\"", "String Delimiter"+"\n"});
                }
                x = x+i;
        //this will not work xD unless one word lang ung string
            }
          }
        }
      }
    }
  }

  private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        // TODO add your handling code here:
        this.lexicalAnalysis();
  }//GEN-LAST:event_executeButtonActionPerformed

  private void importFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importFileMouseClicked
      // TODO add your handling code here:
      JFileChooser fileChooser = new JFileChooser();
      FileNameExtensionFilter filter = new FileNameExtensionFilter("LOLCODE","lol");
      fileChooser.setFileFilter(filter);
      int returnVal = fileChooser.showOpenDialog(null);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
          try{
              File file = fileChooser.getSelectedFile();
              //This is where a real application would open the file.
                filenameTitle.setText(file.getName());
                byte[] data;

              try (FileInputStream fis = new FileInputStream(file)) {
                  data = new byte[(int) file.length()];
                  fis.read(data);
              }

                String str = new String(data, "UTF-8");

                inputTextArea.setText(str);
          }catch(IOException e){
              inputTextArea.setText("There was an error in importing the file.");
          }
      } else {
          System.out.println("Open command cancelled by user.");
      }
  }//GEN-LAST:event_importFileMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton executeButton;
    private javax.swing.JPanel executePanel;
    private javax.swing.JLabel filenameTitle;
    private javax.swing.JButton importFile;
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel lexemePanel;
    private javax.swing.JTable lexemeTable;
    private javax.swing.JLabel lexicalanalyzer;
    private javax.swing.JPanel mainFile;
    private javax.swing.JTable symbolTable;
    private javax.swing.JPanel symbolTablePanel;
    private javax.swing.JLabel symbolTableTable;
    // End of variables declaration//GEN-END:variables
}
