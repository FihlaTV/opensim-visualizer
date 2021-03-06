/*
 * Copyright (c)  2005-2008, Stanford University
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed 
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer. 
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
/*
 * ErrorPanel.java
 *
 * Created on July 11, 2007, 7:29 PM
 */

package org.opensim.utils;

/**
 *
 * @author  erang
 *
 * TODO: made the details portion of the dialog hidden by default, with a "Show Details" button to access them (similar
 * to the way other apps do error reporting)
 */
public class ErrorPanel extends javax.swing.JPanel {
   
   /** Creates new form ErrorPanel */
   public ErrorPanel() {
      initComponents();
   }

   public void setText(String message, String details) {
      messageTextArea.setText(message);
      detailsTextArea.setText(details);
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      messageTextArea = new javax.swing.JTextArea();
      detailsTextArea = new javax.swing.JTextArea();
      jLabel1 = new javax.swing.JLabel();

      messageTextArea.setColumns(20);
      messageTextArea.setFont(new java.awt.Font("Tahoma", 0, 11));
      messageTextArea.setLineWrap(true);
      messageTextArea.setRows(5);
      messageTextArea.setText("Message");
      messageTextArea.setWrapStyleWord(true);
      messageTextArea.setMinimumSize(new java.awt.Dimension(20, 18));
      messageTextArea.setOpaque(false);

      detailsTextArea.setColumns(20);
      detailsTextArea.setFont(new java.awt.Font("Monospaced", 0, 11));
      detailsTextArea.setLineWrap(true);
      detailsTextArea.setRows(5);
      detailsTextArea.setText("Details");
      detailsTextArea.setWrapStyleWord(true);
      detailsTextArea.setMinimumSize(new java.awt.Dimension(20, 20));

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
      jLabel1.setText("Details:");

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
               .add(org.jdesktop.layout.GroupLayout.LEADING, detailsTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
               .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)
               .add(org.jdesktop.layout.GroupLayout.LEADING, messageTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(messageTextArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jLabel1)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(detailsTextArea, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
            .addContainerGap())
      );
   }// </editor-fold>//GEN-END:initComponents
   
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextArea detailsTextArea;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JTextArea messageTextArea;
   // End of variables declaration//GEN-END:variables
   
}
