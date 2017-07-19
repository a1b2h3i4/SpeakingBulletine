
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class SecondChoices extends javax.swing.JFrame {
    public SecondChoices() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        REDDOT = new javax.swing.JButton();
        MTV_NEWS = new javax.swing.JButton();
        National_Geographic = new javax.swing.JButton();
        RECODE = new javax.swing.JButton();
        NEWS_GEEK = new javax.swing.JButton();
        NEWS_Scientist = new javax.swing.JButton();
        POLYGON = new javax.swing.JButton();
        SpeigalONLINE = new javax.swing.JButton();
        THE_HINDU = new javax.swing.JButton();
        The_GUARDIEN = new javax.swing.JButton();
        TECH_CHRUNCH = new javax.swing.JButton();
        THE_NEWYORK_TIMES = new javax.swing.JButton();
        THE_NEXT_WEB = new javax.swing.JButton();
        THE_TIMES_OF_INDIA = new javax.swing.JButton();
        THE_TELEGRAPH = new javax.swing.JButton();
        THE_ECONOMIST = new javax.swing.JButton();
        TALKSPORT = new javax.swing.JButton();
        THE_SPORT_BIBLE = new javax.swing.JButton();
        TIME = new javax.swing.JButton();
        WALL_STREAT_JOURNAL = new javax.swing.JButton();
        MTV_NEWS1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All you need To Choose any single news source options");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        REDDOT.setBackground(new java.awt.Color(255, 255, 255));
        REDDOT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        REDDOT.setForeground(new java.awt.Color(0, 102, 255));
        REDDOT.setText("REDDIt");
        REDDOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REDDOTMouseEntered(evt);
            }
        });
        REDDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDDOTActionPerformed(evt);
            }
        });

        MTV_NEWS.setBackground(new java.awt.Color(255, 255, 255));
        MTV_NEWS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MTV_NEWS.setForeground(new java.awt.Color(0, 102, 255));
        MTV_NEWS.setText("MTV NEWS");
        MTV_NEWS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MTV_NEWSMouseEntered(evt);
            }
        });
        MTV_NEWS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTV_NEWSActionPerformed(evt);
            }
        });

        National_Geographic.setBackground(new java.awt.Color(255, 255, 255));
        National_Geographic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        National_Geographic.setForeground(new java.awt.Color(0, 102, 255));
        National_Geographic.setText("National Geographic");
        National_Geographic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                National_GeographicMouseEntered(evt);
            }
        });
        National_Geographic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                National_GeographicActionPerformed(evt);
            }
        });

        RECODE.setBackground(new java.awt.Color(255, 255, 255));
        RECODE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RECODE.setForeground(new java.awt.Color(0, 102, 255));
        RECODE.setText("RECODE");
        RECODE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RECODEMouseEntered(evt);
            }
        });
        RECODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECODEActionPerformed(evt);
            }
        });

        NEWS_GEEK.setBackground(new java.awt.Color(255, 255, 255));
        NEWS_GEEK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NEWS_GEEK.setForeground(new java.awt.Color(0, 102, 255));
        NEWS_GEEK.setText("NEWS Week");
        NEWS_GEEK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NEWS_GEEKMouseEntered(evt);
            }
        });
        NEWS_GEEK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWS_GEEKActionPerformed(evt);
            }
        });

        NEWS_Scientist.setBackground(new java.awt.Color(255, 255, 255));
        NEWS_Scientist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NEWS_Scientist.setForeground(new java.awt.Color(0, 102, 255));
        NEWS_Scientist.setText("NEW Scientist");
        NEWS_Scientist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NEWS_ScientistMouseEntered(evt);
            }
        });
        NEWS_Scientist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWS_ScientistActionPerformed(evt);
            }
        });

        POLYGON.setBackground(new java.awt.Color(255, 255, 255));
        POLYGON.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        POLYGON.setForeground(new java.awt.Color(0, 102, 255));
        POLYGON.setText("POLYGON");
        POLYGON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                POLYGONMouseEntered(evt);
            }
        });
        POLYGON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POLYGONActionPerformed(evt);
            }
        });

        SpeigalONLINE.setBackground(new java.awt.Color(255, 255, 255));
        SpeigalONLINE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SpeigalONLINE.setForeground(new java.awt.Color(0, 102, 255));
        SpeigalONLINE.setText("speigal Online");
        SpeigalONLINE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SpeigalONLINEMouseEntered(evt);
            }
        });
        SpeigalONLINE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeigalONLINEActionPerformed(evt);
            }
        });

        THE_HINDU.setBackground(new java.awt.Color(255, 255, 255));
        THE_HINDU.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_HINDU.setForeground(new java.awt.Color(0, 102, 255));
        THE_HINDU.setText("THE HINDU");
        THE_HINDU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_HINDUMouseEntered(evt);
            }
        });
        THE_HINDU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_HINDUActionPerformed(evt);
            }
        });

        The_GUARDIEN.setBackground(new java.awt.Color(255, 255, 255));
        The_GUARDIEN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        The_GUARDIEN.setForeground(new java.awt.Color(0, 102, 255));
        The_GUARDIEN.setText("THE GUARDIEN");
        The_GUARDIEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                The_GUARDIENMouseEntered(evt);
            }
        });
        The_GUARDIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                The_GUARDIENActionPerformed(evt);
            }
        });

        TECH_CHRUNCH.setBackground(new java.awt.Color(255, 255, 255));
        TECH_CHRUNCH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TECH_CHRUNCH.setForeground(new java.awt.Color(0, 102, 255));
        TECH_CHRUNCH.setText("TECHCHRUNCH");
        TECH_CHRUNCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TECH_CHRUNCHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TECH_CHRUNCHMouseExited(evt);
            }
        });
        TECH_CHRUNCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TECH_CHRUNCHActionPerformed(evt);
            }
        });

        THE_NEWYORK_TIMES.setBackground(new java.awt.Color(255, 255, 255));
        THE_NEWYORK_TIMES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_NEWYORK_TIMES.setForeground(new java.awt.Color(0, 102, 255));
        THE_NEWYORK_TIMES.setText("THE NEWYORK Times");
        THE_NEWYORK_TIMES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_NEWYORK_TIMESMouseEntered(evt);
            }
        });
        THE_NEWYORK_TIMES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_NEWYORK_TIMESActionPerformed(evt);
            }
        });

        THE_NEXT_WEB.setBackground(new java.awt.Color(255, 255, 255));
        THE_NEXT_WEB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_NEXT_WEB.setForeground(new java.awt.Color(0, 102, 255));
        THE_NEXT_WEB.setText("THE NEXT WEB");
        THE_NEXT_WEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_NEXT_WEBMouseEntered(evt);
            }
        });
        THE_NEXT_WEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_NEXT_WEBActionPerformed(evt);
            }
        });

        THE_TIMES_OF_INDIA.setBackground(new java.awt.Color(255, 255, 255));
        THE_TIMES_OF_INDIA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_TIMES_OF_INDIA.setForeground(new java.awt.Color(0, 102, 255));
        THE_TIMES_OF_INDIA.setText("THE TIMES OF INDIA");
        THE_TIMES_OF_INDIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_TIMES_OF_INDIAMouseEntered(evt);
            }
        });
        THE_TIMES_OF_INDIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_TIMES_OF_INDIAActionPerformed(evt);
            }
        });

        THE_TELEGRAPH.setBackground(new java.awt.Color(255, 255, 255));
        THE_TELEGRAPH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_TELEGRAPH.setForeground(new java.awt.Color(0, 102, 255));
        THE_TELEGRAPH.setText("The TELEGRAPH");
        THE_TELEGRAPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_TELEGRAPHMouseEntered(evt);
            }
        });
        THE_TELEGRAPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_TELEGRAPHActionPerformed(evt);
            }
        });

        THE_ECONOMIST.setBackground(new java.awt.Color(255, 255, 255));
        THE_ECONOMIST.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_ECONOMIST.setForeground(new java.awt.Color(0, 102, 255));
        THE_ECONOMIST.setText("THE ECONOmist");
        THE_ECONOMIST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_ECONOMISTMouseEntered(evt);
            }
        });
        THE_ECONOMIST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_ECONOMISTActionPerformed(evt);
            }
        });

        TALKSPORT.setBackground(new java.awt.Color(255, 255, 255));
        TALKSPORT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TALKSPORT.setForeground(new java.awt.Color(0, 102, 255));
        TALKSPORT.setText("TALKSPORT");
        TALKSPORT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TALKSPORTMouseEntered(evt);
            }
        });
        TALKSPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TALKSPORTActionPerformed(evt);
            }
        });

        THE_SPORT_BIBLE.setBackground(new java.awt.Color(255, 255, 255));
        THE_SPORT_BIBLE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        THE_SPORT_BIBLE.setForeground(new java.awt.Color(0, 102, 255));
        THE_SPORT_BIBLE.setText("THE SPORT Bible");
        THE_SPORT_BIBLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THE_SPORT_BIBLEMouseEntered(evt);
            }
        });
        THE_SPORT_BIBLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THE_SPORT_BIBLEActionPerformed(evt);
            }
        });

        TIME.setBackground(new java.awt.Color(255, 255, 255));
        TIME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TIME.setForeground(new java.awt.Color(0, 102, 255));
        TIME.setText("Time");
        TIME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TIMEMouseEntered(evt);
            }
        });
        TIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIMEActionPerformed(evt);
            }
        });

        WALL_STREAT_JOURNAL.setBackground(new java.awt.Color(255, 255, 255));
        WALL_STREAT_JOURNAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WALL_STREAT_JOURNAL.setForeground(new java.awt.Color(0, 102, 255));
        WALL_STREAT_JOURNAL.setText("WALL STREAT JOURNAL");
        WALL_STREAT_JOURNAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WALL_STREAT_JOURNALMouseEntered(evt);
            }
        });
        WALL_STREAT_JOURNAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WALL_STREAT_JOURNALActionPerformed(evt);
            }
        });

        MTV_NEWS1.setBackground(new java.awt.Color(255, 255, 255));
        MTV_NEWS1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MTV_NEWS1.setForeground(new java.awt.Color(255, 0, 51));
        MTV_NEWS1.setText("BACK To PREVIOUS");
        MTV_NEWS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MTV_NEWS1MouseEntered(evt);
            }
        });
        MTV_NEWS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTV_NEWS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(POLYGON, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(REDDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(TALKSPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TECH_CHRUNCH, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MTV_NEWS)
                                .addGap(35, 35, 35)
                                .addComponent(National_Geographic))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(THE_TELEGRAPH)
                                .addGap(18, 18, 18)
                                .addComponent(THE_TIMES_OF_INDIA, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NEWS_GEEK)
                                    .addComponent(RECODE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NEWS_Scientist)
                                    .addComponent(SpeigalONLINE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(THE_NEXT_WEB, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(WALL_STREAT_JOURNAL))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, 0)
                                                .addComponent(THE_SPORT_BIBLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(THE_ECONOMIST)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(The_GUARDIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(MTV_NEWS1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(THE_HINDU, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(THE_NEWYORK_TIMES, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MTV_NEWS1))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(National_Geographic, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MTV_NEWS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEWS_Scientist, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEWS_GEEK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(POLYGON, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REDDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RECODE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpeigalONLINE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(THE_NEXT_WEB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THE_HINDU, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THE_NEWYORK_TIMES, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THE_SPORT_BIBLE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TALKSPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THE_ECONOMIST, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(The_GUARDIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TECH_CHRUNCH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WALL_STREAT_JOURNAL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(THE_TELEGRAPH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(THE_TIMES_OF_INDIA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void REDDOTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REDDOTMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("REDDIT NEWS",1.5f, false, false);

    }//GEN-LAST:event_REDDOTMouseEntered

    private void REDDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDDOTActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=reddit-r-all&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
        // TODO add your handling code here:
    }//GEN-LAST:event_REDDOTActionPerformed

    private void MTV_NEWSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTV_NEWSMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("MTV NEWS",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_MTV_NEWSMouseEntered

    private void MTV_NEWSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTV_NEWSActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=mtv-news&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_MTV_NEWSActionPerformed

    private void National_GeographicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_National_GeographicMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("NATIONAL GEOGRAPHIC",1.5f, false, false);

    }//GEN-LAST:event_National_GeographicMouseEntered

    private void National_GeographicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_National_GeographicActionPerformed
        // TODO add your handling code here:
        try {
            String s="https://newsapi.org/v1/articles?source=national-geographic&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

    }//GEN-LAST:event_National_GeographicActionPerformed

    private void RECODEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECODEMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("RECODE news",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_RECODEMouseEntered

    private void RECODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECODEActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=recode&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

        // TODO add your handling code here:
    }//GEN-LAST:event_RECODEActionPerformed

    private void NEWS_GEEKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEWS_GEEKMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("NEW WEEK NEWS",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWS_GEEKMouseEntered

    private void NEWS_GEEKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWS_GEEKActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=newsweek&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

        // TODO add your handling code here:
    }//GEN-LAST:event_NEWS_GEEKActionPerformed

    private void NEWS_ScientistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEWS_ScientistMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("NEW SCIENTIST",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWS_ScientistMouseEntered

    private void NEWS_ScientistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWS_ScientistActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=new-scientist&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

        // TODO add your handling code here:
    }//GEN-LAST:event_NEWS_ScientistActionPerformed

    private void POLYGONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POLYGONMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("POLYGON NEWS",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_POLYGONMouseEntered

    private void POLYGONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POLYGONActionPerformed
        // TODO add your handling code here:
        try {
            String s="https://newsapi.org/v1/articles?source=polygon&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

    }//GEN-LAST:event_POLYGONActionPerformed

    private void SpeigalONLINEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SpeigalONLINEMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("SPEIGAL",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeigalONLINEMouseEntered

    private void SpeigalONLINEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeigalONLINEActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=spiegel-online&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
    }//GEN-LAST:event_SpeigalONLINEActionPerformed

    private void THE_HINDUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_HINDUMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE HINDU",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_HINDUMouseEntered

    private void THE_HINDUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_HINDUActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-hindu&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);       }
    }//GEN-LAST:event_THE_HINDUActionPerformed

    private void The_GUARDIENMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_The_GUARDIENMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE GUARDIEN INFO",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_The_GUARDIENMouseEntered

    private void The_GUARDIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_The_GUARDIENActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-guardian-au&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_The_GUARDIENActionPerformed

    private void TECH_CHRUNCHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TECH_CHRUNCHMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("TECH CHRUNCH news",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_TECH_CHRUNCHMouseEntered

    private void TECH_CHRUNCHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TECH_CHRUNCHMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TECH_CHRUNCHMouseExited

    private void TECH_CHRUNCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TECH_CHRUNCHActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=techcrunch&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

        // TODO add your handling code here:
    }//GEN-LAST:event_TECH_CHRUNCHActionPerformed

    private void THE_NEWYORK_TIMESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_NEWYORK_TIMESMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE NEW YORK TIMES",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_NEWYORK_TIMESMouseEntered

    private void THE_NEWYORK_TIMESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_NEWYORK_TIMESActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-new-york-times&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }

        // TODO add your handling code here:
    }//GEN-LAST:event_THE_NEWYORK_TIMESActionPerformed

    private void THE_NEXT_WEBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_NEXT_WEBMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE NEXT WEB NEWS",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_NEXT_WEBMouseEntered

    private void THE_NEXT_WEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_NEXT_WEBActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
    }//GEN-LAST:event_THE_NEXT_WEBActionPerformed

    private void THE_TIMES_OF_INDIAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_TIMES_OF_INDIAMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE TIMES OF INDIA NEWS",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_TIMES_OF_INDIAMouseEntered

    private void THE_TIMES_OF_INDIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_TIMES_OF_INDIAActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-times-of-india&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_TIMES_OF_INDIAActionPerformed

    private void THE_TELEGRAPHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_TELEGRAPHMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE TELEGRAPH News",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_TELEGRAPHMouseEntered

    private void THE_TELEGRAPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_TELEGRAPHActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-telegraph&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_TELEGRAPHActionPerformed

    private void THE_ECONOMISTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_ECONOMISTMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE ECONOMIST",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_ECONOMISTMouseEntered

    private void THE_ECONOMISTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_ECONOMISTActionPerformed
        try {
            String s=" https://newsapi.org/v1/articles?source=the-economist&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_ECONOMISTActionPerformed

    private void TALKSPORTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TALKSPORTMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("TALK SPORT News",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_TALKSPORTMouseEntered

    private void TALKSPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TALKSPORTActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=talksport&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TALKSPORTActionPerformed

    private void THE_SPORT_BIBLEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THE_SPORT_BIBLEMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE SPORT BIBLLE NEWS",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_THE_SPORT_BIBLEMouseEntered
TextToSpeech tts;
File f;
FileOutputStream fout;
DataOutputStream dout;

    private void THE_SPORT_BIBLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THE_SPORT_BIBLEActionPerformed
        try {
            String s="https://newsapi.org/v1/articles?source=the-sport-bible&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (Exception ex) {
            System.out.println(ex);    }
    }//GEN-LAST:event_THE_SPORT_BIBLEActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
tts=new TextToSpeech();
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("Choose any source and go to its stop ten trending news",1.5f, false, false);
 f=new File(new File(".").getAbsolutePath().toString()+"\\tmpfile.txt");
    try{         fout=new FileOutputStream(f);
      dout=new DataOutputStream(fout);
        dout.writeBytes(null);}catch(Exception e){}
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void TIMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIMEMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("TIME NEWS",1.5f, false, false);
        // TODO add your handling code here:
        
// TODO add your handling code here:
    }//GEN-LAST:event_TIMEMouseEntered

    private void TIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIMEActionPerformed
  try {
            String s="https://newsapi.org/v1/articles?source=time&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }        // TODO add your handling code here:
    }//GEN-LAST:event_TIMEActionPerformed

    private void WALL_STREAT_JOURNALMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WALL_STREAT_JOURNALMouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("THE WALL STREAT JOURNAL NEWS",1.5f, false, false);
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_WALL_STREAT_JOURNALMouseEntered

    private void WALL_STREAT_JOURNALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WALL_STREAT_JOURNALActionPerformed
  try {
            String s="https://newsapi.org/v1/articles?source=the-wall-street-journal&sortBy=top&apiKey=5c21e514f48c4216a83d99bab827804e";
            dout.writeBytes(s);
            dout.close();fout.close();
            this.dispose();
            new MainPage().show();
        } catch (IOException ex) {
            System.out.println(ex);        }        // TODO add your handling code here:
    }//GEN-LAST:event_WALL_STREAT_JOURNALActionPerformed

    private void MTV_NEWS1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTV_NEWS1MouseEntered
        tts.stopSpeaking();
        tts.setVoice("dfki-poppy-hsmm");
        tts.speak("BACK To PREVIOUS CHOICES",1.5f, false, false);
        // TODO add your handling code here:
    }//GEN-LAST:event_MTV_NEWS1MouseEntered

    private void MTV_NEWS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTV_NEWS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MTV_NEWS1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecondChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondChoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondChoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MTV_NEWS;
    private javax.swing.JButton MTV_NEWS1;
    private javax.swing.JButton NEWS_GEEK;
    private javax.swing.JButton NEWS_Scientist;
    private javax.swing.JButton National_Geographic;
    private javax.swing.JButton POLYGON;
    private javax.swing.JButton RECODE;
    private javax.swing.JButton REDDOT;
    private javax.swing.JButton SpeigalONLINE;
    private javax.swing.JButton TALKSPORT;
    private javax.swing.JButton TECH_CHRUNCH;
    private javax.swing.JButton THE_ECONOMIST;
    private javax.swing.JButton THE_HINDU;
    private javax.swing.JButton THE_NEWYORK_TIMES;
    private javax.swing.JButton THE_NEXT_WEB;
    private javax.swing.JButton THE_SPORT_BIBLE;
    private javax.swing.JButton THE_TELEGRAPH;
    private javax.swing.JButton THE_TIMES_OF_INDIA;
    private javax.swing.JButton TIME;
    private javax.swing.JButton The_GUARDIEN;
    private javax.swing.JButton WALL_STREAT_JOURNAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
