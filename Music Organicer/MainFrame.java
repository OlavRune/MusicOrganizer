import java.lang.Integer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

/**
 *
 * @author Olav Rune
 */
public class MainFrame extends javax.swing.JFrame {

    private TrackOrganizer trackOrganizer;
    private Integer integer;
    
    /**
     * Creates new form MainFrame
     *     
     */
    //*******CD Variables***********
    private String cdTitleVar;
    private String cdAristVar;
    private int cdReleaseYearVar;
    private String cdRecordLabelVar;
    private int cdArchiveNumberVar;
    //*******************************
    //*********Tape Variables********
    private String tapeTitleVar;
    private boolean tapeDigitalBtnVar;
    private boolean tapeAnalogBtnVar;
    private int tapeArchiveNumberVar;
    //*******************************
    
    
    
    public MainFrame() {
        initComponents();
        mediumPanel.setVisible(false);
        cdPanel.setVisible(false);
        trackOrganizer = new TrackOrganizer();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cdFrame = new javax.swing.JFrame();
        cdPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cdTitle = new javax.swing.JTextField();
        cdArtist = new javax.swing.JTextField();
        cdReleaseYear = new javax.swing.JTextField();
        cdRecordLabel = new javax.swing.JTextField();
        cdArchiveNumber = new javax.swing.JTextField();
        addCdBtn = new javax.swing.JButton();
        cdError = new javax.swing.JLabel();
        tapeFrame = new javax.swing.JFrame();
        tapePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addTape = new javax.swing.JButton();
        tapeArchiveNumber = new javax.swing.JTextField();
        tapeTitle = new javax.swing.JTextField();
        tapeAnalogBtn = new javax.swing.JRadioButton();
        tapeDigitalBtn = new javax.swing.JRadioButton();
        tapeError = new javax.swing.JLabel();
        mediumFrame = new javax.swing.JFrame();
        mediumPanel = new javax.swing.JPanel();
        addMediumCdBtn = new javax.swing.JToggleButton();
        addTapeBtn = new javax.swing.JToggleButton();
        addLpBtn = new javax.swing.JToggleButton();
        addHdBtn = new javax.swing.JToggleButton();
        mediumBtn = new javax.swing.JToggleButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Title:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Artist:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Release Year:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Record Label:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Archive Number:");

        cdTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdTitleActionPerformed(evt);
            }
        });

        cdArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdArtistActionPerformed(evt);
            }
        });

        cdReleaseYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdReleaseYearActionPerformed(evt);
            }
        });

        cdRecordLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRecordLabelActionPerformed(evt);
            }
        });

        cdArchiveNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdArchiveNumberActionPerformed(evt);
            }
        });

        addCdBtn.setText("Add CD");
        addCdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cdPanelLayout = new javax.swing.GroupLayout(cdPanel);
        cdPanel.setLayout(cdPanelLayout);
        cdPanelLayout.setHorizontalGroup(
            cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdPanelLayout.createSequentialGroup()
                .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cdPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addCdBtn)
                            .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cdPanelLayout.createSequentialGroup()
                                    .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(104, 104, 104))))
                        .addGap(18, 18, 18)
                        .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cdTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(cdArtist)
                            .addComponent(cdReleaseYear)
                            .addComponent(cdRecordLabel)
                            .addComponent(cdArchiveNumber))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cdError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cdPanelLayout.setVerticalGroup(
            cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cdPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cdArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cdReleaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cdRecordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cdArchiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCdBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(cdError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout cdFrameLayout = new javax.swing.GroupLayout(cdFrame.getContentPane());
        cdFrame.getContentPane().setLayout(cdFrameLayout);
        cdFrameLayout.setHorizontalGroup(
            cdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
            .addGroup(cdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cdFrameLayout.setVerticalGroup(
            cdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
            .addGroup(cdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cdFrameLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(cdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setText("Title:");

        jLabel7.setText("Archive Number:");

        addTape.setText("Add Tape");
        addTape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTapeActionPerformed(evt);
            }
        });

        tapeArchiveNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapeArchiveNumberActionPerformed(evt);
            }
        });

        tapeTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapeTitleActionPerformed(evt);
            }
        });

        tapeAnalogBtn.setText("Analog");
        tapeAnalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapeAnalogBtnActionPerformed(evt);
            }
        });

        tapeDigitalBtn.setText("Digital");
        tapeDigitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapeDigitalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tapePanelLayout = new javax.swing.GroupLayout(tapePanel);
        tapePanel.setLayout(tapePanelLayout);
        tapePanelLayout.setHorizontalGroup(
            tapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tapePanelLayout.createSequentialGroup()
                .addGroup(tapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tapePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tapeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tapePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(addTape))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tapePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tapeArchiveNumber))
                    .addGroup(tapePanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(tapeTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tapePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tapeDigitalBtn)
                        .addGap(29, 29, 29)
                        .addComponent(tapeAnalogBtn)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        tapePanelLayout.setVerticalGroup(
            tapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tapePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tapeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(tapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tapeDigitalBtn)
                    .addComponent(tapeAnalogBtn))
                .addGap(18, 18, 18)
                .addGroup(tapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tapeArchiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addTape)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tapeError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tapeFrameLayout = new javax.swing.GroupLayout(tapeFrame.getContentPane());
        tapeFrame.getContentPane().setLayout(tapeFrameLayout);
        tapeFrameLayout.setHorizontalGroup(
            tapeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tapePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        tapeFrameLayout.setVerticalGroup(
            tapeFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tapePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        addMediumCdBtn.setText("Add CD");
        addMediumCdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMediumCdBtnActionPerformed(evt);
            }
        });

        addTapeBtn.setText("Add Tape");
        addTapeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTapeBtnActionPerformed(evt);
            }
        });

        addLpBtn.setText("Add LP");

        addHdBtn.setText("Add HD");

        javax.swing.GroupLayout mediumPanelLayout = new javax.swing.GroupLayout(mediumPanel);
        mediumPanel.setLayout(mediumPanelLayout);
        mediumPanelLayout.setHorizontalGroup(
            mediumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediumPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(mediumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTapeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addLpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addHdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMediumCdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        mediumPanelLayout.setVerticalGroup(
            mediumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediumPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addMediumCdBtn)
                .addGap(18, 18, 18)
                .addComponent(addTapeBtn)
                .addGap(18, 18, 18)
                .addComponent(addLpBtn)
                .addGap(18, 18, 18)
                .addComponent(addHdBtn)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mediumFrameLayout = new javax.swing.GroupLayout(mediumFrame.getContentPane());
        mediumFrame.getContentPane().setLayout(mediumFrameLayout);
        mediumFrameLayout.setHorizontalGroup(
            mediumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
            .addGroup(mediumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mediumFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mediumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        mediumFrameLayout.setVerticalGroup(
            mediumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
            .addGroup(mediumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mediumFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mediumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mediumBtn.setText("Click to create medium");
        mediumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mediumBtn)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(mediumBtn)
                .addGap(260, 307, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mediumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumBtnActionPerformed
        mediumBtn.setSelected(false);
        mediumFrame.setSize(200, 300);
        mediumFrame.setVisible(true);
        mediumPanel.setVisible(true);
    }//GEN-LAST:event_mediumBtnActionPerformed

    private void addMediumCdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMediumCdBtnActionPerformed
        addMediumCdBtn.setSelected(false);
        cdFrame.setSize(350, 425);
        cdFrame.setVisible(true);
        cdPanel.setVisible(true);
//cdFrame.setVisible(true);
        //cdPanel.setVisible(true);
    }//GEN-LAST:event_addMediumCdBtnActionPerformed

    private void cdReleaseYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdReleaseYearActionPerformed
        String tempString = cdReleaseYear.getText();
        this.cdReleaseYearVar = integer.parseInt(tempString);
    }//GEN-LAST:event_cdReleaseYearActionPerformed

    private void cdArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdArtistActionPerformed
        this.cdAristVar = cdArtist.getText();
    }//GEN-LAST:event_cdArtistActionPerformed

    private void cdTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdTitleActionPerformed
        cdTitleVar = cdTitle.getText();
    }//GEN-LAST:event_cdTitleActionPerformed

    private void cdRecordLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRecordLabelActionPerformed
        this.cdRecordLabelVar = cdRecordLabel.getText();
    }//GEN-LAST:event_cdRecordLabelActionPerformed

    private void cdArchiveNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdArchiveNumberActionPerformed
        String tempString = cdArchiveNumber.getText();
        this.cdArchiveNumberVar = integer.parseInt(tempString);
    }//GEN-LAST:event_cdArchiveNumberActionPerformed

    private void addCdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCdBtnActionPerformed
        addCdBtn.setSelected(false);
        
        
        boolean cdTitleReady = false;
        if(cdTitle.getText().isEmpty())
        {
            cdTitleReady = true;
        }
        boolean cdArtistReady = false;
        if(cdArtist.getText() != null)
        {
            cdArtistReady = true;           
        }
        boolean cdReleaseYearReady = false;
        if(cdReleaseYear.getText() != null)
        {
            cdReleaseYearReady = true;
        }
        boolean cdRecordLabelReady = false;
        if(cdRecordLabel.getText().isEmpty())
        {
            cdRecordLabelReady = true;
            System.out.println("fdslkjfkl"
                    + "");
        }
        boolean cdArchiveNumberReady = false;
        if(cdArchiveNumber.getText().equalsIgnoreCase("kake"))
        {
            cdArchiveNumberReady = true;
            System.out.println("olav");
        }
        
        
        
        if((cdTitleReady == true)&&(cdArtistReady == true)&&(cdReleaseYearReady == true)
                &&(cdRecordLabelReady == true)&&(cdArchiveNumberReady == true))
        
        
        
        trackOrganizer.addCD(cdTitleVar, cdAristVar, cdReleaseYearVar, cdRecordLabelVar, cdArchiveNumberVar);
        cdError.setText("Cd added! " + "Title: " + cdTitle.getText() + " Artist: "+ cdArtist.getText());
        cdTitle.setText(null);
        cdArtist.setText(null);
        cdArchiveNumber.setText(null);
        cdRecordLabel.setText(null);
        cdReleaseYear.setText(null);
            System.out.println("homopung");
        
        
        
        
        
        
        

    }//GEN-LAST:event_addCdBtnActionPerformed

    private void addTapeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTapeBtnActionPerformed
        tapeFrame.setSize(250,300);
        tapePanel.setVisible(true);
        tapeFrame.setVisible(true);
    }//GEN-LAST:event_addTapeBtnActionPerformed

    private void tapeAnalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapeAnalogBtnActionPerformed
        tapeAnalogBtnVar = true;
        tapeDigitalBtnVar = false;
        tapeAnalogBtn.setSelected(true);
        tapeDigitalBtn.setSelected(false);
    }//GEN-LAST:event_tapeAnalogBtnActionPerformed

    private void tapeTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapeTitleActionPerformed
        this.tapeTitleVar = tapeTitle.getText();
    }//GEN-LAST:event_tapeTitleActionPerformed

    private void tapeArchiveNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapeArchiveNumberActionPerformed
        String tempString = tapeArchiveNumber.getText();
        this.tapeArchiveNumberVar = integer.parseInt(tempString);
    }//GEN-LAST:event_tapeArchiveNumberActionPerformed

    private void tapeDigitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapeDigitalBtnActionPerformed
        tapeAnalogBtnVar = false;
        tapeDigitalBtnVar = true;
        tapeAnalogBtn.setSelected(false);
        tapeDigitalBtn.setSelected(true);
    }//GEN-LAST:event_tapeDigitalBtnActionPerformed

    private void addTapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTapeActionPerformed
        String digitalOrAnalog = "";
        if((tapeAnalogBtnVar == true)&&(tapeDigitalBtnVar == false))
        {
            digitalOrAnalog = "Analog";
        }
        if((tapeAnalogBtnVar == false)&&(tapeDigitalBtnVar == true))
        {
            digitalOrAnalog = "Digital";
        }
        trackOrganizer.addTape(tapeTitleVar, digitalOrAnalog, tapeArchiveNumberVar);
        tapeError.setText("Tape Added! " + "Title: " + tapeTitle.getText() + "  Type: " + digitalOrAnalog);
        
        tapeTitle.setText("");
        tapeDigitalBtn.setSelected(false);
        tapeAnalogBtn.setSelected(false);
        tapeArchiveNumber.setText("");
    }//GEN-LAST:event_addTapeActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
    
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

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCdBtn;
    private javax.swing.JToggleButton addHdBtn;
    private javax.swing.JToggleButton addLpBtn;
    private javax.swing.JToggleButton addMediumCdBtn;
    private javax.swing.JButton addTape;
    private javax.swing.JToggleButton addTapeBtn;
    private javax.swing.JTextField cdArchiveNumber;
    private javax.swing.JTextField cdArtist;
    private javax.swing.JLabel cdError;
    private javax.swing.JFrame cdFrame;
    private javax.swing.JPanel cdPanel;
    private javax.swing.JTextField cdRecordLabel;
    private javax.swing.JTextField cdReleaseYear;
    private javax.swing.JTextField cdTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton mediumBtn;
    private javax.swing.JFrame mediumFrame;
    private javax.swing.JPanel mediumPanel;
    private javax.swing.JRadioButton tapeAnalogBtn;
    private javax.swing.JTextField tapeArchiveNumber;
    private javax.swing.JRadioButton tapeDigitalBtn;
    private javax.swing.JLabel tapeError;
    private javax.swing.JFrame tapeFrame;
    private javax.swing.JPanel tapePanel;
    private javax.swing.JTextField tapeTitle;
    // End of variables declaration//GEN-END:variables
}
