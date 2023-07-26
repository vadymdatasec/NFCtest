public class org.apache.log4j.lf5.viewer.LogFactor5ErrorDialog extends org.apache.log4j.lf5.viewer.LogFactor5Dialog {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.LogFactor5ErrorDialog ( ) {
		 /* .locals 2 */
		 final String v0 = "Error"; // const-string v0, "Error"
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0, v1}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Z)V */
		 /* .line 2 */
		 /* new-instance p1, Ljavax/swing/JButton; */
		 final String v0 = "Ok"; // const-string v0, "Ok"
		 /* invoke-direct {p1, v0}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V */
		 /* .line 3 */
		 /* new-instance v0, Lm/a/b/j/b/g0; */
		 /* invoke-direct {v0, p0}, Lm/a/b/j/b/g0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;)V */
		 (( javax.swing.JButton ) p1 ).addActionListener ( v0 ); // invoke-virtual {p1, v0}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V
		 /* .line 4 */
		 /* new-instance v0, Ljavax/swing/JPanel; */
		 /* invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V */
		 /* .line 5 */
		 /* new-instance v1, Ljava/awt/FlowLayout; */
		 /* invoke-direct {v1}, Ljava/awt/FlowLayout;-><init>()V */
		 (( javax.swing.JPanel ) v0 ).setLayout ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
		 /* .line 6 */
		 (( javax.swing.JPanel ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
		 /* .line 7 */
		 /* new-instance p1, Ljavax/swing/JPanel; */
		 /* invoke-direct {p1}, Ljavax/swing/JPanel;-><init>()V */
		 /* .line 8 */
		 /* new-instance v1, Ljava/awt/GridBagLayout; */
		 /* invoke-direct {v1}, Ljava/awt/GridBagLayout;-><init>()V */
		 (( javax.swing.JPanel ) p1 ).setLayout ( v1 ); // invoke-virtual {p1, v1}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
		 /* .line 9 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/lang/String;Ljava/awt/Container;)V
		 /* .line 10 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5ErrorDialog ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;->getContentPane()Ljava/awt/Container;
		 final String v1 = "Center"; // const-string v1, "Center"
		 (( java.awt.Container ) p2 ).add ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
		 /* .line 11 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5ErrorDialog ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;->getContentPane()Ljava/awt/Container;
		 final String p2 = "South"; // const-string p2, "South"
		 (( java.awt.Container ) p1 ).add ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
		 /* .line 12 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).show ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->show()V
		 return;
	 } // .end method
