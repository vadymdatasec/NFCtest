public class org.apache.log4j.lf5.viewer.LogFactor5InputDialog extends org.apache.log4j.lf5.viewer.LogFactor5Dialog {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer SIZE;
	 /* # instance fields */
	 public javax.swing.JTextField b;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.LogFactor5InputDialog ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x1e */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.LogFactor5InputDialog ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;Z)V */
		 /* .line 3 */
		 /* new-instance p1, Ljavax/swing/JPanel; */
		 /* invoke-direct {p1}, Ljavax/swing/JPanel;-><init>()V */
		 /* .line 4 */
		 /* new-instance p2, Ljava/awt/FlowLayout; */
		 /* invoke-direct {p2}, Ljava/awt/FlowLayout;-><init>()V */
		 (( javax.swing.JPanel ) p1 ).setLayout ( p2 ); // invoke-virtual {p1, p2}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
		 /* .line 5 */
		 /* new-instance p2, Ljavax/swing/JPanel; */
		 /* invoke-direct {p2}, Ljavax/swing/JPanel;-><init>()V */
		 /* .line 6 */
		 /* new-instance v0, Ljava/awt/FlowLayout; */
		 /* invoke-direct {v0}, Ljava/awt/FlowLayout;-><init>()V */
		 (( javax.swing.JPanel ) p2 ).setLayout ( v0 ); // invoke-virtual {p2, v0}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
		 /* .line 7 */
		 /* new-instance v0, Ljavax/swing/JLabel; */
		 /* invoke-direct {v0, p3}, Ljavax/swing/JLabel;-><init>(Ljava/lang/String;)V */
		 (( javax.swing.JPanel ) p2 ).add ( v0 ); // invoke-virtual {p2, v0}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
		 /* .line 8 */
		 /* new-instance p3, Ljavax/swing/JTextField; */
		 /* invoke-direct {p3, p4}, Ljavax/swing/JTextField;-><init>(I)V */
		 this.b = p3;
		 /* .line 9 */
		 (( javax.swing.JPanel ) p2 ).add ( p3 ); // invoke-virtual {p2, p3}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
		 /* .line 10 */
		 /* new-instance p3, Lm/a/b/j/b/h0; */
		 /* invoke-direct {p3, p0}, Lm/a/b/j/b/h0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;)V */
		 (( org.apache.log4j.lf5.viewer.LogFactor5InputDialog ) p0 ).addKeyListener ( p3 ); // invoke-virtual {p0, p3}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->addKeyListener(Ljava/awt/event/KeyListener;)V
		 /* .line 11 */
		 /* new-instance p3, Ljavax/swing/JButton; */
		 final String p4 = "Ok"; // const-string p4, "Ok"
		 /* invoke-direct {p3, p4}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V */
		 /* .line 12 */
		 /* new-instance p4, Lm/a/b/j/b/i0; */
		 /* invoke-direct {p4, p0}, Lm/a/b/j/b/i0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;)V */
		 (( javax.swing.JButton ) p3 ).addActionListener ( p4 ); // invoke-virtual {p3, p4}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V
		 /* .line 13 */
		 /* new-instance p4, Ljavax/swing/JButton; */
		 final String v0 = "Cancel"; // const-string v0, "Cancel"
		 /* invoke-direct {p4, v0}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V */
		 /* .line 14 */
		 /* new-instance v0, Lm/a/b/j/b/j0; */
		 /* invoke-direct {v0, p0}, Lm/a/b/j/b/j0;-><init>(Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;)V */
		 (( javax.swing.JButton ) p4 ).addActionListener ( v0 ); // invoke-virtual {p4, v0}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V
		 /* .line 15 */
		 (( javax.swing.JPanel ) p1 ).add ( p3 ); // invoke-virtual {p1, p3}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
		 /* .line 16 */
		 (( javax.swing.JPanel ) p1 ).add ( p4 ); // invoke-virtual {p1, p4}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
		 /* .line 17 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5InputDialog ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->getContentPane()Ljava/awt/Container;
		 final String p4 = "Center"; // const-string p4, "Center"
		 (( java.awt.Container ) p3 ).add ( p2, p4 ); // invoke-virtual {p3, p2, p4}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
		 /* .line 18 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5InputDialog ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->getContentPane()Ljava/awt/Container;
		 final String p3 = "South"; // const-string p3, "South"
		 (( java.awt.Container ) p2 ).add ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
		 /* .line 19 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5InputDialog ) p0 ).pack ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5InputDialog;->pack()V
		 /* .line 20 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).a ( p0 ); // invoke-virtual {p0, p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->a(Ljava/awt/Window;)V
		 /* .line 21 */
		 (( org.apache.log4j.lf5.viewer.LogFactor5Dialog ) p0 ).show ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogFactor5Dialog;->show()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getText ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 (( javax.swing.JTextField ) v0 ).getText ( ); // invoke-virtual {v0}, Ljavax/swing/JTextField;->getText()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
			 v1 = 			 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
			 /* if-nez v1, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :cond_0
	 } // .end method
