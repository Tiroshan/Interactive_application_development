/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_driven;

import java.awt.event.MouseEvent;

/**
 *
 * @author tyron
 */
public class MouseEventsSample extends javax.swing.JFrame {

    /**
     * Creates new form EventsSample
     */
    public MouseEventsSample() {
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

        lblMouseEventDemo = new javax.swing.JLabel();
        separatorMouseEventDemo = new javax.swing.JSeparator();
        jPanelMouseEvent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMouseEvent = new javax.swing.JLabel();
        lblDetectedMouseEvent = new javax.swing.JLabel();
        lblEventInformation = new javax.swing.JLabel();
        lblButton = new javax.swing.JLabel();
        lblButtonInfo = new javax.swing.JLabel();
        lblClickCount = new javax.swing.JLabel();
        lblClickCountInfo = new javax.swing.JLabel();
        lblPositionX = new javax.swing.JLabel();
        lblPositionXInfo = new javax.swing.JLabel();
        lblPositionY = new javax.swing.JLabel();
        lblPositionYInfo = new javax.swing.JLabel();
        jPanelmouseMotionEvent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblWheelRotation = new javax.swing.JLabel();
        lblWheelRotationInfo = new javax.swing.JLabel();
        lblPreciseWheelRotation = new javax.swing.JLabel();
        lblScrollAmount = new javax.swing.JLabel();
        lblScrollType = new javax.swing.JLabel();
        lblPreciseWheelRotationInfo = new javax.swing.JLabel();
        lblScrollTypeInfo = new javax.swing.JLabel();
        lblScrollAmountInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMouseEventDemo.setText("Mouse Event Demo");

        jPanelMouseEvent.setBackground(new java.awt.Color(193, 181, 181));
        jPanelMouseEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelMouseEventMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelMouseEventMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMouseEventMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMouseEventMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelMouseEventMouseEntered(evt);
            }
        });

        jLabel2.setText("Mouse Event");

        javax.swing.GroupLayout jPanelMouseEventLayout = new javax.swing.GroupLayout(jPanelMouseEvent);
        jPanelMouseEvent.setLayout(jPanelMouseEventLayout);
        jPanelMouseEventLayout.setHorizontalGroup(
            jPanelMouseEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMouseEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMouseEventLayout.setVerticalGroup(
            jPanelMouseEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMouseEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        lblMouseEvent.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblMouseEvent.setForeground(new java.awt.Color(14, 202, 90));
        lblMouseEvent.setText("None");

        lblDetectedMouseEvent.setText("Detected Mouse Event");

        lblEventInformation.setText("Event Information");

        lblButton.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblButton.setText("Button:");

        lblButtonInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblClickCount.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblClickCount.setText("Click count:");

        lblClickCountInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblPositionX.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblPositionX.setText("Position X:");

        lblPositionXInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblPositionY.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblPositionY.setText("Position Y:");

        lblPositionYInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jPanelmouseMotionEvent.setBackground(new java.awt.Color(175, 142, 142));
        jPanelmouseMotionEvent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelmouseMotionEventMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelmouseMotionEventMouseDragged(evt);
            }
        });

        jLabel1.setText("Mouse Motion Event");

        javax.swing.GroupLayout jPanelmouseMotionEventLayout = new javax.swing.GroupLayout(jPanelmouseMotionEvent);
        jPanelmouseMotionEvent.setLayout(jPanelmouseMotionEventLayout);
        jPanelmouseMotionEventLayout.setHorizontalGroup(
            jPanelmouseMotionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelmouseMotionEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelmouseMotionEventLayout.setVerticalGroup(
            jPanelmouseMotionEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelmouseMotionEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(233, 186, 186));
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });

        jLabel3.setText("Mouse Wheel Event");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        lblWheelRotation.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblWheelRotation.setText("Wheel Rotation");

        lblWheelRotationInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblPreciseWheelRotation.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblPreciseWheelRotation.setText("Precise Wheel Rotation");

        lblScrollAmount.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblScrollAmount.setText("Scroll Amount");

        lblScrollType.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblScrollType.setText("Scroll Type");

        lblPreciseWheelRotationInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblScrollTypeInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblScrollAmountInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMouseEventDemo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorMouseEventDemo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelMouseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanelmouseMotionEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEventInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDetectedMouseEvent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(lblMouseEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblScrollType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblScrollAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPreciseWheelRotation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(lblPositionY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPositionX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblClickCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWheelRotation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblButtonInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblClickCountInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPositionXInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPositionYInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWheelRotationInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPreciseWheelRotationInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblScrollTypeInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblScrollAmountInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(separatorMouseEventDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMouseEventDemo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblDetectedMouseEvent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMouseEvent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEventInformation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblButton)
                                    .addComponent(lblButtonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblClickCount)
                                    .addComponent(lblClickCountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPositionX)
                                    .addComponent(lblPositionXInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPositionY)
                                    .addComponent(lblPositionYInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelmouseMotionEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelMouseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWheelRotation))
                    .addComponent(lblWheelRotationInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPreciseWheelRotation)
                            .addComponent(lblPreciseWheelRotationInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblScrollAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblScrollType))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblScrollAmountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblScrollTypeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelMouseEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseEventMouseClicked
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse clicked");
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));        
    }//GEN-LAST:event_jPanelMouseEventMouseClicked

    private void jPanelMouseEventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseEventMouseEntered
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse entered");
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));  
    }//GEN-LAST:event_jPanelMouseEventMouseEntered

    private void jPanelMouseEventMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseEventMouseExited
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse exited");        
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));  
    }//GEN-LAST:event_jPanelMouseEventMouseExited

    private void jPanelMouseEventMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseEventMousePressed
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse pressed");        
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));   
    }//GEN-LAST:event_jPanelMouseEventMousePressed

    private void jPanelMouseEventMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseEventMouseReleased
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse released");        
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));   
    }//GEN-LAST:event_jPanelMouseEventMouseReleased

    private void jPanelmouseMotionEventMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelmouseMotionEventMouseDragged
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse dragged");
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));  
    }//GEN-LAST:event_jPanelmouseMotionEventMouseDragged

    private void jPanelmouseMotionEventMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelmouseMotionEventMouseMoved
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse moved");
        int button = evt.getButton();
        int clickCount = evt.getClickCount();
        int relative_x = evt.getX();
        int relative_y = evt.getY();
        
        lblButtonInfo.setText(this.returnMouseButton(button, evt));
        lblClickCountInfo.setText(Integer.toString(clickCount));
        lblPositionXInfo.setText(Integer.toString(relative_x));
        lblPositionYInfo.setText(Integer.toString(relative_y));
    }//GEN-LAST:event_jPanelmouseMotionEventMouseMoved

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        this.clearEventMouseProperties();
        lblMouseEvent.setText("mouse wheel moved");
        double preciseWheelRotation = evt.getPreciseWheelRotation();
        int scrollAmount = evt.getScrollAmount();
        int scrollType = evt.getScrollType();
        int wheelRotation = evt.getWheelRotation();
        
        
        lblPreciseWheelRotationInfo.setText(Double.toString(preciseWheelRotation));
        lblScrollAmountInfo.setText(Integer.toString(scrollAmount));
        lblScrollTypeInfo.setText(Integer.toString(scrollType));
        lblWheelRotationInfo.setText(this.returnMouseWheelMove(wheelRotation));
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private String returnMouseButton(int btn, java.awt.event.MouseEvent evt){
        if (btn == MouseEvent.BUTTON1)
            return "Left button";
        else if (btn == MouseEvent.BUTTON2)
            return "BUTTON 2";
        else if (btn == MouseEvent.BUTTON3)
            return "Right button";
        else
            return "None";
    }
    
    private String returnMouseWheelMove(int type){
        switch (type) {
            case -1:
                return "scroll up";
            case 1:
                return "scroll down";
            default:
                return "None";
        }
    }
    
    private void clearEventMouseProperties(){
        lblMouseEvent.setText("None");
        lblButtonInfo.setText("");
        lblClickCountInfo.setText("");
        lblPositionXInfo.setText("");
        lblPositionYInfo.setText("");
        lblPreciseWheelRotationInfo.setText("");
        lblScrollAmountInfo.setText("");
        lblScrollTypeInfo.setText("");
        lblWheelRotationInfo.setText("");
    }
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
            java.util.logging.Logger.getLogger(MouseEventsSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MouseEventsSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MouseEventsSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MouseEventsSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MouseEventsSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMouseEvent;
    private javax.swing.JPanel jPanelmouseMotionEvent;
    private javax.swing.JLabel lblButton;
    private javax.swing.JLabel lblButtonInfo;
    private javax.swing.JLabel lblClickCount;
    private javax.swing.JLabel lblClickCountInfo;
    private javax.swing.JLabel lblDetectedMouseEvent;
    private javax.swing.JLabel lblEventInformation;
    private javax.swing.JLabel lblMouseEvent;
    private javax.swing.JLabel lblMouseEventDemo;
    private javax.swing.JLabel lblPositionX;
    private javax.swing.JLabel lblPositionXInfo;
    private javax.swing.JLabel lblPositionY;
    private javax.swing.JLabel lblPositionYInfo;
    private javax.swing.JLabel lblPreciseWheelRotation;
    private javax.swing.JLabel lblPreciseWheelRotationInfo;
    private javax.swing.JLabel lblScrollAmount;
    private javax.swing.JLabel lblScrollAmountInfo;
    private javax.swing.JLabel lblScrollType;
    private javax.swing.JLabel lblScrollTypeInfo;
    private javax.swing.JLabel lblWheelRotation;
    private javax.swing.JLabel lblWheelRotationInfo;
    private javax.swing.JSeparator separatorMouseEventDemo;
    // End of variables declaration//GEN-END:variables
}
