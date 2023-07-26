public class org.apache.log4j.chainsaw.Main extends javax.swing.JFrame {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String PORT_PROP_NAME;
	 public static final org.apache.log4j.Logger a;
	 public static java.lang.Class b; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.chainsaw.Main ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.chainsaw.Main.b;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.chainsaw.Main"; // const-string v0, "org.apache.log4j.chainsaw.Main"
		 org.apache.log4j.chainsaw.Main .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.chainsaw.Main ( ) {
	 /* .locals 7 */
	 final String v0 = "CHAINSAW"; // const-string v0, "CHAINSAW"
	 final String v1 = "CHAINSAW - Log4J Log Viewer"; // const-string v1, "CHAINSAW - Log4J Log Viewer"
	 /* .line 1 */
	 /* invoke-direct {p0, v1}, Ljavax/swing/JFrame;-><init>(Ljava/lang/String;)V */
	 /* .line 2 */
	 /* new-instance v1, Lm/a/b/h/r; */
	 /* invoke-direct {v1}, Lm/a/b/h/r;-><init>()V */
	 /* .line 3 */
	 /* new-instance v2, Ljavax/swing/JMenuBar; */
	 /* invoke-direct {v2}, Ljavax/swing/JMenuBar;-><init>()V */
	 /* .line 4 */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).setJMenuBar ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/chainsaw/Main;->setJMenuBar(Ljavax/swing/JMenuBar;)V
	 /* .line 5 */
	 /* new-instance v3, Ljavax/swing/JMenu; */
	 final String v4 = "File"; // const-string v4, "File"
	 /* invoke-direct {v3, v4}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
	 /* .line 6 */
	 (( javax.swing.JMenuBar ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 7 */
	 try { // :try_start_0
		 /* new-instance v4, Lm/a/b/h/l; */
		 /* invoke-direct {v4, p0, v1}, Lm/a/b/h/l;-><init>(Ljavax/swing/JFrame;Lm/a/b/h/r;)V */
		 /* .line 8 */
		 /* new-instance v5, Ljavax/swing/JMenuItem; */
		 final String v6 = "Load file..."; // const-string v6, "Load file..."
		 /* invoke-direct {v5, v6}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
		 /* .line 9 */
		 (( javax.swing.JMenu ) v3 ).add ( v5 ); // invoke-virtual {v3, v5}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
		 /* .line 10 */
		 (( javax.swing.JMenuItem ) v5 ).addActionListener ( v4 ); // invoke-virtual {v5, v4}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v4 */
		 /* .line 11 */
		 v5 = org.apache.log4j.chainsaw.Main.a;
		 final String v6 = "Unable to create the action to load XML files"; // const-string v6, "Unable to create the action to load XML files"
		 (( org.apache.log4j.Category ) v5 ).info ( v6, v4 ); // invoke-virtual {v5, v6, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 final String v4 = "Unable to create a XML parser - unable to load XML events."; // const-string v4, "Unable to create a XML parser - unable to load XML events."
		 /* .line 12 */
		 javax.swing.JOptionPane .showMessageDialog ( p0,v4,v0,v2 );
		 /* :catch_1 */
		 /* move-exception v4 */
		 /* .line 13 */
		 v5 = org.apache.log4j.chainsaw.Main.a;
		 final String v6 = "Missing classes for XML parser"; // const-string v6, "Missing classes for XML parser"
		 (( org.apache.log4j.Category ) v5 ).info ( v6, v4 ); // invoke-virtual {v5, v6, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 final String v4 = "XML parser not in classpath - unable to load XML events."; // const-string v4, "XML parser not in classpath - unable to load XML events."
		 /* .line 14 */
		 javax.swing.JOptionPane .showMessageDialog ( p0,v4,v0,v2 );
		 /* .line 15 */
	 } // :goto_0
	 /* new-instance v0, Ljavax/swing/JMenuItem; */
	 final String v4 = "Exit"; // const-string v4, "Exit"
	 /* invoke-direct {v0, v4}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
	 /* .line 16 */
	 (( javax.swing.JMenu ) v3 ).add ( v0 ); // invoke-virtual {v3, v0}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
	 /* .line 17 */
	 v3 = m.a.b.h.k.a;
	 (( javax.swing.JMenuItem ) v0 ).addActionListener ( v3 ); // invoke-virtual {v0, v3}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
	 /* .line 18 */
	 /* new-instance v0, Lm/a/b/h/h; */
	 /* invoke-direct {v0, v1}, Lm/a/b/h/h;-><init>(Lm/a/b/h/r;)V */
	 /* .line 19 */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/chainsaw/Main;->getContentPane()Ljava/awt/Container;
	 final String v4 = "North"; // const-string v4, "North"
	 (( java.awt.Container ) v3 ).add ( v0, v4 ); // invoke-virtual {v3, v0, v4}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
	 /* .line 20 */
	 /* new-instance v0, Ljavax/swing/JTable; */
	 /* invoke-direct {v0, v1}, Ljavax/swing/JTable;-><init>(Ljavax/swing/table/TableModel;)V */
	 /* .line 21 */
	 (( javax.swing.JTable ) v0 ).setSelectionMode ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JTable;->setSelectionMode(I)V
	 /* .line 22 */
	 /* new-instance v3, Ljavax/swing/JScrollPane; */
	 /* invoke-direct {v3, v0}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V */
	 final String v4 = "Events: "; // const-string v4, "Events: "
	 /* .line 23 */
	 javax.swing.BorderFactory .createTitledBorder ( v4 );
	 (( javax.swing.JScrollPane ) v3 ).setBorder ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JScrollPane;->setBorder(Ljavax/swing/border/Border;)V
	 /* .line 24 */
	 /* new-instance v4, Ljava/awt/Dimension; */
	 /* const/16 v5, 0x12c */
	 /* const/16 v6, 0x384 */
	 /* invoke-direct {v4, v6, v5}, Ljava/awt/Dimension;-><init>(II)V */
	 (( javax.swing.JScrollPane ) v3 ).setPreferredSize ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JScrollPane;->setPreferredSize(Ljava/awt/Dimension;)V
	 /* .line 25 */
	 /* new-instance v4, Lm/a/b/h/i; */
	 /* invoke-direct {v4, v0, v1}, Lm/a/b/h/i;-><init>(Ljavax/swing/JTable;Lm/a/b/h/r;)V */
	 /* .line 26 */
	 /* new-instance v0, Ljava/awt/Dimension; */
	 /* invoke-direct {v0, v6, v5}, Ljava/awt/Dimension;-><init>(II)V */
	 (( javax.swing.JPanel ) v4 ).setPreferredSize ( v0 ); // invoke-virtual {v4, v0}, Ljavax/swing/JPanel;->setPreferredSize(Ljava/awt/Dimension;)V
	 /* .line 27 */
	 /* new-instance v0, Ljavax/swing/JSplitPane; */
	 /* invoke-direct {v0, v2, v3, v4}, Ljavax/swing/JSplitPane;-><init>(ILjava/awt/Component;Ljava/awt/Component;)V */
	 /* .line 28 */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).getContentPane ( ); // invoke-virtual {p0}, Lorg/apache/log4j/chainsaw/Main;->getContentPane()Ljava/awt/Container;
	 final String v3 = "Center"; // const-string v3, "Center"
	 (( java.awt.Container ) v2 ).add ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
	 /* .line 29 */
	 /* new-instance v0, Lm/a/b/h/o; */
	 /* invoke-direct {v0, p0}, Lm/a/b/h/o;-><init>(Lorg/apache/log4j/chainsaw/Main;)V */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).addWindowListener ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/chainsaw/Main;->addWindowListener(Ljava/awt/event/WindowListener;)V
	 /* .line 30 */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).pack ( ); // invoke-virtual {p0}, Lorg/apache/log4j/chainsaw/Main;->pack()V
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 31 */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).setVisible ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/chainsaw/Main;->setVisible(Z)V
	 /* .line 32 */
	 (( org.apache.log4j.chainsaw.Main ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/chainsaw/Main;->a(Lm/a/b/h/r;)V
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
	 public static void a ( ) {
		 /* .locals 3 */
		 /* .line 12 */
		 /* new-instance v0, Ljava/util/Properties; */
		 /* invoke-direct {v0}, Ljava/util/Properties;-><init>()V */
		 final String v1 = "log4j.rootLogger"; // const-string v1, "log4j.rootLogger"
		 final String v2 = "DEBUG, A1"; // const-string v2, "DEBUG, A1"
		 /* .line 13 */
		 (( java.util.Properties ) v0 ).setProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
		 final String v1 = "log4j.appender.A1"; // const-string v1, "log4j.appender.A1"
		 final String v2 = "org.apache.log4j.ConsoleAppender"; // const-string v2, "org.apache.log4j.ConsoleAppender"
		 /* .line 14 */
		 (( java.util.Properties ) v0 ).setProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
		 final String v1 = "log4j.appender.A1.layout"; // const-string v1, "log4j.appender.A1.layout"
		 final String v2 = "org.apache.log4j.TTCCLayout"; // const-string v2, "org.apache.log4j.TTCCLayout"
		 /* .line 15 */
		 (( java.util.Properties ) v0 ).setProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
		 /* .line 16 */
		 org.apache.log4j.PropertyConfigurator .configure ( v0 );
		 return;
	 } // .end method
	 public static void main ( java.lang.String[] p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.chainsaw.Main .a ( );
		 /* .line 2 */
		 /* new-instance p0, Lorg/apache/log4j/chainsaw/Main; */
		 /* invoke-direct {p0}, Lorg/apache/log4j/chainsaw/Main;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0 ) {
		 /* .locals 7 */
		 final String v0 = "chainsaw.port"; // const-string v0, "chainsaw.port"
		 /* .line 2 */
		 java.lang.System .getProperty ( v0 );
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 final String v3 = "CHAINSAW"; // const-string v3, "CHAINSAW"
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 try { // :try_start_0
				 v0 = 				 java.lang.Integer .parseInt ( v0 );
				 /* :try_end_0 */
				 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 4 */
				 /* :catch_0 */
				 v4 = org.apache.log4j.chainsaw.Main.a;
				 /* new-instance v5, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v6 = "Unable to parse chainsaw.port property with value "; // const-string v6, "Unable to parse chainsaw.port property with value "
				 (( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v6 = "."; // const-string v6, "."
				 (( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 (( org.apache.log4j.Category ) v4 ).fatal ( v5 ); // invoke-virtual {v4, v5}, Lorg/apache/log4j/Category;->fatal(Ljava/lang/Object;)V
				 /* .line 5 */
				 /* new-instance v4, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v5 = "Unable to parse port number from \'"; // const-string v5, "Unable to parse port number from \'"
				 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v0 = "\', quitting."; // const-string v0, "\', quitting."
				 (( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 javax.swing.JOptionPane .showMessageDialog ( p0,v0,v3,v2 );
				 /* .line 6 */
				 java.lang.System .exit ( v1 );
			 } // :cond_0
			 /* const/16 v0, 0x115d */
			 /* .line 7 */
		 } // :goto_0
		 try { // :try_start_1
			 /* new-instance v4, Lm/a/b/h/n; */
			 /* invoke-direct {v4, p1, v0}, Lm/a/b/h/n;-><init>(Lm/a/b/h/r;I)V */
			 /* .line 8 */
			 (( java.lang.Thread ) v4 ).start ( ); // invoke-virtual {v4}, Ljava/lang/Thread;->start()V
			 /* :try_end_1 */
			 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
			 /* move-exception p1 */
			 /* .line 9 */
			 v4 = org.apache.log4j.chainsaw.Main.a;
			 final String v5 = "Unable to connect to socket server, quiting"; // const-string v5, "Unable to connect to socket server, quiting"
			 (( org.apache.log4j.Category ) v4 ).fatal ( v5, p1 ); // invoke-virtual {v4, v5, p1}, Lorg/apache/log4j/Category;->fatal(Ljava/lang/Object;Ljava/lang/Throwable;)V
			 /* .line 10 */
			 /* new-instance p1, Ljava/lang/StringBuffer; */
			 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v4 = "Unable to create socket on port "; // const-string v4, "Unable to create socket on port "
			 (( java.lang.StringBuffer ) p1 ).append ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
			 final String v0 = ", quitting."; // const-string v0, ", quitting."
			 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 javax.swing.JOptionPane .showMessageDialog ( p0,p1,v3,v2 );
			 /* .line 11 */
			 java.lang.System .exit ( v1 );
		 } // :goto_1
		 return;
	 } // .end method
