public class m.a.b.h.i extends javax.swing.JPanel implements javax.swing.event.ListSelectionListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.Class b; //synthetic
	 /* # instance fields */
	 public final javax.swing.JEditorPane a;
	 /* # direct methods */
	 public static m.a.b.h.i ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = m.a.b.h.i.b;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.chainsaw.DetailPanel"; // const-string v0, "org.apache.log4j.chainsaw.DetailPanel"
		 m.a.b.h.i .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 /* .line 2 */
	 /* new-instance v0, Ljava/text/MessageFormat; */
	 final String v1 = "<b>Time:</b> <code>{0,time,medium}</code>&nbsp;&nbsp;<b>Priority:</b> <code>{1}</code>&nbsp;&nbsp;<b>Thread:</b> <code>{2}</code>&nbsp;&nbsp;<b>NDC:</b> <code>{3}</code><br><b>Logger:</b> <code>{4}</code><br><b>Location:</b> <code>{5}</code><br><b>Message:</b><pre>{6}</pre><b>Throwable:</b><pre>{7}</pre>"; // const-string v1, "<b>Time:</b> <code>{0,time,medium}</code>&nbsp;&nbsp;<b>Priority:</b> <code>{1}</code>&nbsp;&nbsp;<b>Thread:</b> <code>{2}</code>&nbsp;&nbsp;<b>NDC:</b> <code>{3}</code><br><b>Logger:</b> <code>{4}</code><br><b>Location:</b> <code>{5}</code><br><b>Message:</b><pre>{6}</pre><b>Throwable:</b><pre>{7}</pre>"
	 /* invoke-direct {v0, v1}, Ljava/text/MessageFormat;-><init>(Ljava/lang/String;)V */
	 return;
} // .end method
public m.a.b.h.i ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljavax/swing/JPanel;-><init>()V */
	 /* .line 2 */
	 /* new-instance p2, Ljava/awt/BorderLayout; */
	 /* invoke-direct {p2}, Ljava/awt/BorderLayout;-><init>()V */
	 (( m.a.b.h.i ) p0 ).setLayout ( p2 ); // invoke-virtual {p0, p2}, Lm/a/b/h/i;->setLayout(Ljava/awt/LayoutManager;)V
	 final String p2 = "Details: "; // const-string p2, "Details: "
	 /* .line 3 */
	 javax.swing.BorderFactory .createTitledBorder ( p2 );
	 (( m.a.b.h.i ) p0 ).setBorder ( p2 ); // invoke-virtual {p0, p2}, Lm/a/b/h/i;->setBorder(Ljavax/swing/border/Border;)V
	 /* .line 4 */
	 /* new-instance p2, Ljavax/swing/JEditorPane; */
	 /* invoke-direct {p2}, Ljavax/swing/JEditorPane;-><init>()V */
	 this.a = p2;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 5 */
	 (( javax.swing.JEditorPane ) p2 ).setEditable ( v0 ); // invoke-virtual {p2, v0}, Ljavax/swing/JEditorPane;->setEditable(Z)V
	 /* .line 6 */
	 p2 = this.a;
	 final String v0 = "text/html"; // const-string v0, "text/html"
	 (( javax.swing.JEditorPane ) p2 ).setContentType ( v0 ); // invoke-virtual {p2, v0}, Ljavax/swing/JEditorPane;->setContentType(Ljava/lang/String;)V
	 /* .line 7 */
	 /* new-instance p2, Ljavax/swing/JScrollPane; */
	 v0 = this.a;
	 /* invoke-direct {p2, v0}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V */
	 final String v0 = "Center"; // const-string v0, "Center"
	 (( m.a.b.h.i ) p0 ).add ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lm/a/b/h/i;->add(Ljava/awt/Component;Ljava/lang/Object;)V
	 /* .line 8 */
	 (( javax.swing.JTable ) p1 ).getSelectionModel ( ); // invoke-virtual {p1}, Ljavax/swing/JTable;->getSelectionModel()Ljavax/swing/ListSelectionModel;
	 /* .line 9 */
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 try { // :try_start_0
		 java.lang.Class .forName ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
		 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
		 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
		 /* throw p0 */
	 } // .end method
