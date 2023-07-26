public class org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog extends org.apache.log4j.lf5.viewer.LogFactor5Dialog {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog ( ) {
		 /* .locals 2 */
		 final String v0 = "LogFactor5"; // const-string v0, "LogFactor5"
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0, v1}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Z)V */
		 /* .line 2 */
		 /* new-instance p1, Ljavax/swing/JPanel; */
		 /* invoke-direct {p1}, Ljavax/swing/JPanel;-><init>()V */
		 /* .line 3 */
		 /* new-instance v0, Ljava/awt/FlowLayout; */
		 /* invoke-direct {v0}, Ljava/awt/FlowLayout;-><init>()V */
		 (( javax.swing.JPanel ) p1 ).setLayout ( v0 ); // invoke-virtual {p1, v0}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
		 /* .line 4 */
		 /* new-instance v0, Ljavax/swing/JPanel; */
		 /* invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V */
		 /* .line 5 */
		 /* new-instance v1, Ljava/awt/GridBagLayout; */
		 /* invoke-direct {v1}, Ljava/awt/GridBagLayout;-><init>()V */
		 (( javax.swing.JPanel ) v0 ).setLayout ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
		 /* .line 6 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/lang/String;Ljava/awt/Container;)V
		 /* .line 7 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;->getContentPane()Ljava/awt/Container;
		 final String v1 = "Center"; // const-string v1, "Center"
		 (( java.awt.Container ) p2 ).add ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
		 /* .line 8 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;->getContentPane()Ljava/awt/Container;
		 final String v0 = "South"; // const-string v0, "South"
		 (( java.awt.Container ) p2 ).add ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
		 /* .line 9 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).show ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->show()V
		 return;
	 } // .end method
