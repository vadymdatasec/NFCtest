public class org.apache.log4j.lf5.viewer.LogBrokerMonitor {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String DETAILED_VIEW;
/* # instance fields */
public javax.swing.JFrame a;
public Integer b;
public Integer c;
public org.apache.log4j.lf5.viewer.LogTable d;
public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree e;
public java.lang.String f;
public javax.swing.JScrollPane g;
public javax.swing.JLabel h;
public javax.swing.JComboBox i;
public Integer j;
public java.lang.String k;
public java.lang.String l;
public Boolean m;
public Boolean n;
public Boolean o;
public java.util.List p;
public java.util.Map q;
public java.util.Map r;
public java.util.List s;
public java.util.List t;
public Boolean u;
public org.apache.log4j.lf5.viewer.configure.MRUFileManager v;
/* # direct methods */
public org.apache.log4j.lf5.viewer.LogBrokerMonitor ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* const/16 v0, 0x226 */
	 /* .line 2 */
	 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b:I */
	 /* const/16 v0, 0x1f4 */
	 /* .line 3 */
	 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c:I */
	 final String v0 = ""; // const-string v0, ""
	 /* .line 4 */
	 this.f = v0;
	 /* .line 5 */
	 v0 = org.apache.log4j.lf5.LogLevel.DEBUG;
	 /* const/16 v0, 0xa */
	 /* .line 6 */
	 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j:I */
	 final String v0 = "Dialog"; // const-string v0, "Dialog"
	 /* .line 7 */
	 this.k = v0;
	 final String v0 = "Detailed"; // const-string v0, "Detailed"
	 /* .line 8 */
	 this.l = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 9 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->m:Z */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 10 */
	 /* iput-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->n:Z */
	 /* .line 11 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z */
	 /* .line 12 */
	 /* new-instance v2, Ljava/util/Vector; */
	 /* invoke-direct {v2}, Ljava/util/Vector;-><init>()V */
	 this.p = v2;
	 /* .line 13 */
	 /* new-instance v2, Ljava/util/HashMap; */
	 /* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
	 this.q = v2;
	 /* .line 14 */
	 /* new-instance v2, Ljava/util/HashMap; */
	 /* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
	 this.r = v2;
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 15 */
	 this.s = v2;
	 /* .line 16 */
	 this.t = v2;
	 /* .line 17 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u:Z */
	 /* .line 18 */
	 this.v = v2;
	 /* .line 19 */
	 this.s = p1;
	 /* .line 20 */
	 org.apache.log4j.lf5.viewer.LogTableColumn .getLogTableColumns ( );
	 this.t = p1;
	 final String p1 = "monitor.exit"; // const-string p1, "monitor.exit"
	 /* .line 21 */
	 java.lang.System .getProperty ( p1 );
	 /* if-nez p1, :cond_0 */
	 final String p1 = "false"; // const-string p1, "false"
	 /* .line 22 */
} // :cond_0
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v0 = "true"; // const-string v0, "true"
/* .line 23 */
p1 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 24 */
	 /* iput-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z */
	 /* .line 25 */
} // :cond_1
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).H ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->H()V
/* .line 26 */
p1 = this.a;
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor$a; */
/* invoke-direct {v0, p0, p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor$a;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JFrame ) p1 ).addWindowListener ( v0 ); // invoke-virtual {p1, v0}, Ljavax/swing/JFrame;->addWindowListener(Ljava/awt/event/WindowListener;)V
return;
} // .end method
/* # virtual methods */
public javax.swing.JMenuItem A ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Reset LogLevel Colors"; // const-string v1, "Reset LogLevel Colors"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x72 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/b; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/b;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JPanel B ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JPanel; */
/* invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V */
/* .line 2 */
/* new-instance v1, Ljavax/swing/JLabel; */
final String v2 = "No log records to display."; // const-string v2, "No log records to display."
/* invoke-direct {v1, v2}, Ljavax/swing/JLabel;-><init>(Ljava/lang/String;)V */
/* .line 3 */
this.h = v1;
int v2 = 2; // const/4 v2, 0x2
/* .line 4 */
(( javax.swing.JLabel ) v1 ).setHorizontalAlignment ( v2 ); // invoke-virtual {v1, v2}, Ljavax/swing/JLabel;->setHorizontalAlignment(I)V
/* .line 5 */
javax.swing.BorderFactory .createEtchedBorder ( );
(( javax.swing.JPanel ) v0 ).setBorder ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JPanel;->setBorder(Ljavax/swing/border/Border;)V
/* .line 6 */
/* new-instance v2, Ljava/awt/FlowLayout; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v3, v3, v3}, Ljava/awt/FlowLayout;-><init>(III)V */
(( javax.swing.JPanel ) v0 ).setLayout ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
/* .line 7 */
(( javax.swing.JPanel ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
} // .end method
public javax.swing.JToolBar C ( ) {
/* .locals 7 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JToolBar; */
/* invoke-direct {v0}, Ljavax/swing/JToolBar;-><init>()V */
/* .line 2 */
v1 = java.lang.Boolean.TRUE;
final String v2 = "JToolBar.isRollover"; // const-string v2, "JToolBar.isRollover"
(( javax.swing.JToolBar ) v0 ).putClientProperty ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/swing/JToolBar;->putClientProperty(Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 3 */
/* new-instance v1, Ljavax/swing/JComboBox; */
/* invoke-direct {v1}, Ljavax/swing/JComboBox;-><init>()V */
/* .line 4 */
/* new-instance v2, Ljavax/swing/JComboBox; */
/* invoke-direct {v2}, Ljavax/swing/JComboBox;-><init>()V */
/* .line 5 */
this.i = v2;
/* .line 6 */
/* const-class v3, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor; */
(( java.lang.Class ) v3 ).getClassLoader ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
/* if-nez v3, :cond_0 */
/* .line 7 */
java.lang.ClassLoader .getSystemClassLoader ( );
} // :cond_0
final String v4 = "org/apache/log4j/lf5/viewer/images/channelexplorer_new.gif"; // const-string v4, "org/apache/log4j/lf5/viewer/images/channelexplorer_new.gif"
/* .line 8 */
(( java.lang.ClassLoader ) v3 ).getResource ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;
int v4 = 0; // const/4 v4, 0x0
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 9 */
/* new-instance v4, Ljavax/swing/ImageIcon; */
/* invoke-direct {v4, v3}, Ljavax/swing/ImageIcon;-><init>(Ljava/net/URL;)V */
/* .line 10 */
} // :cond_1
/* new-instance v3, Ljavax/swing/JButton; */
final String v5 = "Clear Log Table"; // const-string v5, "Clear Log Table"
/* invoke-direct {v3, v5}, Ljavax/swing/JButton;-><init>(Ljava/lang/String;)V */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 11 */
(( javax.swing.JButton ) v3 ).setIcon ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setIcon(Ljavax/swing/Icon;)V
} // :cond_2
final String v4 = "Clear Log Table."; // const-string v4, "Clear Log Table."
/* .line 12 */
(( javax.swing.JButton ) v3 ).setToolTipText ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setToolTipText(Ljava/lang/String;)V
/* .line 13 */
/* new-instance v4, Lm/a/b/j/b/v; */
/* invoke-direct {v4, p0}, Lm/a/b/j/b/v;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JButton ) v3 ).addActionListener ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JButton;->addActionListener(Ljava/awt/event/ActionListener;)V
/* .line 14 */
java.awt.Toolkit .getDefaultToolkit ( );
/* .line 15 */
/* iget-boolean v5, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->m:Z */
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 16 */
java.awt.GraphicsEnvironment .getLocalGraphicsEnvironment ( );
(( java.awt.GraphicsEnvironment ) v4 ).getAvailableFontFamilyNames ( ); // invoke-virtual {v4}, Ljava/awt/GraphicsEnvironment;->getAvailableFontFamilyNames()[Ljava/lang/String;
/* .line 17 */
} // :cond_3
(( java.awt.Toolkit ) v4 ).getFontList ( ); // invoke-virtual {v4}, Ljava/awt/Toolkit;->getFontList()[Ljava/lang/String;
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
/* .line 18 */
} // :goto_1
/* array-length v6, v4 */
/* if-ge v5, v6, :cond_4 */
/* .line 19 */
/* aget-object v6, v4, v5 */
(( javax.swing.JComboBox ) v1 ).addItem ( v6 ); // invoke-virtual {v1, v6}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
/* add-int/lit8 v5, v5, 0x1 */
/* .line 20 */
} // :cond_4
v4 = this.k;
(( javax.swing.JComboBox ) v1 ).setSelectedItem ( v4 ); // invoke-virtual {v1, v4}, Ljavax/swing/JComboBox;->setSelectedItem(Ljava/lang/Object;)V
/* .line 21 */
/* new-instance v4, Lm/a/b/j/b/x; */
/* invoke-direct {v4, p0}, Lm/a/b/j/b/x;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JComboBox ) v1 ).addActionListener ( v4 ); // invoke-virtual {v1, v4}, Ljavax/swing/JComboBox;->addActionListener(Ljava/awt/event/ActionListener;)V
final String v4 = "8"; // const-string v4, "8"
/* .line 22 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "9"; // const-string v4, "9"
/* .line 23 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "10"; // const-string v4, "10"
/* .line 24 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "12"; // const-string v4, "12"
/* .line 25 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "14"; // const-string v4, "14"
/* .line 26 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "16"; // const-string v4, "16"
/* .line 27 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "18"; // const-string v4, "18"
/* .line 28 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
final String v4 = "24"; // const-string v4, "24"
/* .line 29 */
(( javax.swing.JComboBox ) v2 ).addItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addItem(Ljava/lang/Object;)V
/* .line 30 */
/* iget v4, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j:I */
java.lang.String .valueOf ( v4 );
(( javax.swing.JComboBox ) v2 ).setSelectedItem ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->setSelectedItem(Ljava/lang/Object;)V
/* .line 31 */
/* new-instance v4, Lm/a/b/j/b/y; */
/* invoke-direct {v4, p0}, Lm/a/b/j/b/y;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JComboBox ) v2 ).addActionListener ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JComboBox;->addActionListener(Ljava/awt/event/ActionListener;)V
/* .line 32 */
/* new-instance v4, Ljavax/swing/JLabel; */
final String v5 = " Font: "; // const-string v5, " Font: "
/* invoke-direct {v4, v5}, Ljavax/swing/JLabel;-><init>(Ljava/lang/String;)V */
(( javax.swing.JToolBar ) v0 ).add ( v4 ); // invoke-virtual {v0, v4}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;
/* .line 33 */
(( javax.swing.JToolBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;
/* .line 34 */
(( javax.swing.JToolBar ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;
/* .line 35 */
(( javax.swing.JToolBar ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JToolBar;->addSeparator()V
/* .line 36 */
(( javax.swing.JToolBar ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JToolBar;->addSeparator()V
/* .line 37 */
(( javax.swing.JToolBar ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljavax/swing/JToolBar;->add(Ljava/awt/Component;)Ljava/awt/Component;
/* const/high16 v4, 0x3f000000 # 0.5f */
/* .line 38 */
(( javax.swing.JButton ) v3 ).setAlignmentY ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setAlignmentY(F)V
/* .line 39 */
(( javax.swing.JButton ) v3 ).setAlignmentX ( v4 ); // invoke-virtual {v3, v4}, Ljavax/swing/JButton;->setAlignmentX(F)V
/* .line 40 */
(( javax.swing.JComboBox ) v1 ).getPreferredSize ( ); // invoke-virtual {v1}, Ljavax/swing/JComboBox;->getPreferredSize()Ljava/awt/Dimension;
(( javax.swing.JComboBox ) v1 ).setMaximumSize ( v3 ); // invoke-virtual {v1, v3}, Ljavax/swing/JComboBox;->setMaximumSize(Ljava/awt/Dimension;)V
/* .line 41 */
(( javax.swing.JComboBox ) v2 ).getPreferredSize ( ); // invoke-virtual {v2}, Ljavax/swing/JComboBox;->getPreferredSize()Ljava/awt/Dimension;
(( javax.swing.JComboBox ) v2 ).setMaximumSize ( v1 ); // invoke-virtual {v2, v1}, Ljavax/swing/JComboBox;->setMaximumSize(Ljava/awt/Dimension;)V
} // .end method
public javax.swing.JMenu D ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "View"; // const-string v1, "View"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x76 */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).F ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->F()Ljava/util/Iterator;
/* .line 4 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
/* check-cast v2, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 6 */
} // :cond_0
(( javax.swing.JMenu ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V
/* .line 7 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 8 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).x ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->x()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // .end method
public java.util.Iterator E ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.s;
} // .end method
public java.util.Iterator F ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
} // .end method
public java.lang.String G ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).getFilteredLogTableModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
/* .line 2 */
v1 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).getRowCount ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->getRowCount()I
v0 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).getTotalRowCount ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->getTotalRowCount()I
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(II)Ljava/lang/String;
} // .end method
public void H ( ) {
/* .locals 6 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JFrame; */
final String v1 = "LogFactor5"; // const-string v1, "LogFactor5"
/* invoke-direct {v0, v1}, Ljavax/swing/JFrame;-><init>(Ljava/lang/String;)V */
this.a = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( javax.swing.JFrame ) v0 ).setDefaultCloseOperation ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JFrame;->setDefaultCloseOperation(I)V
/* .line 3 */
/* const-class v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor; */
final String v2 = "/org/apache/log4j/lf5/viewer/images/lf5_small_icon.gif"; // const-string v2, "/org/apache/log4j/lf5/viewer/images/lf5_small_icon.gif"
(( java.lang.Class ) v0 ).getResource ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v2 = this.a;
/* new-instance v3, Ljavax/swing/ImageIcon; */
/* invoke-direct {v3, v0}, Ljavax/swing/ImageIcon;-><init>(Ljava/net/URL;)V */
(( javax.swing.ImageIcon ) v3 ).getImage ( ); // invoke-virtual {v3}, Ljavax/swing/ImageIcon;->getImage()Ljava/awt/Image;
(( javax.swing.JFrame ) v2 ).setIconImage ( v0 ); // invoke-virtual {v2, v0}, Ljavax/swing/JFrame;->setIconImage(Ljava/awt/Image;)V
/* .line 5 */
} // :cond_0
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).J ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->J()V
/* .line 6 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).i ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->i()Ljavax/swing/JTextArea;
/* .line 7 */
/* new-instance v2, Ljavax/swing/JScrollPane; */
/* invoke-direct {v2, v0}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V */
/* .line 8 */
/* new-instance v3, Lorg/apache/log4j/lf5/viewer/LogTable; */
/* invoke-direct {v3, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;-><init>(Ljavax/swing/JTextArea;)V */
this.d = v3;
/* .line 9 */
v0 = this.l;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljava/lang/String;Lorg/apache/log4j/lf5/viewer/LogTable;)V
/* .line 10 */
v0 = this.d;
/* new-instance v3, Ljava/awt/Font; */
v4 = this.k;
/* iget v5, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j:I */
/* invoke-direct {v3, v4, v1, v5}, Ljava/awt/Font;-><init>(Ljava/lang/String;II)V */
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).setFont ( v3 ); // invoke-virtual {v0, v3}, Lorg/apache/log4j/lf5/viewer/LogTable;->setFont(Ljava/awt/Font;)V
/* .line 11 */
/* new-instance v0, Ljavax/swing/JScrollPane; */
v3 = this.d;
/* invoke-direct {v0, v3}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V */
this.g = v0;
/* .line 12 */
/* iget-boolean v3, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->n:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 13 */
(( javax.swing.JScrollPane ) v0 ).getVerticalScrollBar ( ); // invoke-virtual {v0}, Ljavax/swing/JScrollPane;->getVerticalScrollBar()Ljavax/swing/JScrollBar;
/* new-instance v3, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener; */
/* invoke-direct {v3}, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;-><init>()V */
(( javax.swing.JScrollBar ) v0 ).addAdjustmentListener ( v3 ); // invoke-virtual {v0, v3}, Ljavax/swing/JScrollBar;->addAdjustmentListener(Ljava/awt/event/AdjustmentListener;)V
/* .line 14 */
} // :cond_1
/* new-instance v0, Ljavax/swing/JSplitPane; */
/* invoke-direct {v0}, Ljavax/swing/JSplitPane;-><init>()V */
int v3 = 1; // const/4 v3, 0x1
/* .line 15 */
(( javax.swing.JSplitPane ) v0 ).setOneTouchExpandable ( v3 ); // invoke-virtual {v0, v3}, Ljavax/swing/JSplitPane;->setOneTouchExpandable(Z)V
/* .line 16 */
(( javax.swing.JSplitPane ) v0 ).setOrientation ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JSplitPane;->setOrientation(I)V
/* .line 17 */
v1 = this.g;
(( javax.swing.JSplitPane ) v0 ).setLeftComponent ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JSplitPane;->setLeftComponent(Ljava/awt/Component;)V
/* .line 18 */
(( javax.swing.JSplitPane ) v0 ).setRightComponent ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JSplitPane;->setRightComponent(Ljava/awt/Component;)V
/* const/16 v1, 0x15e */
/* .line 19 */
(( javax.swing.JSplitPane ) v0 ).setDividerLocation ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JSplitPane;->setDividerLocation(I)V
/* .line 20 */
/* new-instance v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree; */
/* invoke-direct {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;-><init>()V */
this.e = v1;
/* .line 21 */
v1 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v1 ).getFilteredLogTableModel ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).u ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u()Lorg/apache/log4j/lf5/LogRecordFilter;
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v1 ).setLogRecordFilter ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->setLogRecordFilter(Lorg/apache/log4j/lf5/LogRecordFilter;)V
/* .line 22 */
/* new-instance v1, Ljavax/swing/JScrollPane; */
v2 = this.e;
/* invoke-direct {v1, v2}, Ljavax/swing/JScrollPane;-><init>(Ljava/awt/Component;)V */
/* .line 23 */
/* new-instance v2, Ljava/awt/Dimension; */
/* const/16 v4, 0x190 */
/* const/16 v5, 0x82 */
/* invoke-direct {v2, v5, v4}, Ljava/awt/Dimension;-><init>(II)V */
(( javax.swing.JScrollPane ) v1 ).setPreferredSize ( v2 ); // invoke-virtual {v1, v2}, Ljavax/swing/JScrollPane;->setPreferredSize(Ljava/awt/Dimension;)V
/* .line 24 */
/* new-instance v2, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager; */
/* invoke-direct {v2}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;-><init>()V */
this.v = v2;
/* .line 25 */
/* new-instance v2, Ljavax/swing/JSplitPane; */
/* invoke-direct {v2}, Ljavax/swing/JSplitPane;-><init>()V */
/* .line 26 */
(( javax.swing.JSplitPane ) v2 ).setOneTouchExpandable ( v3 ); // invoke-virtual {v2, v3}, Ljavax/swing/JSplitPane;->setOneTouchExpandable(Z)V
/* .line 27 */
(( javax.swing.JSplitPane ) v2 ).setRightComponent ( v0 ); // invoke-virtual {v2, v0}, Ljavax/swing/JSplitPane;->setRightComponent(Ljava/awt/Component;)V
/* .line 28 */
(( javax.swing.JSplitPane ) v2 ).setLeftComponent ( v1 ); // invoke-virtual {v2, v1}, Ljavax/swing/JSplitPane;->setLeftComponent(Ljava/awt/Component;)V
/* .line 29 */
(( javax.swing.JSplitPane ) v2 ).setDividerLocation ( v5 ); // invoke-virtual {v2, v5}, Ljavax/swing/JSplitPane;->setDividerLocation(I)V
/* .line 30 */
v0 = this.a;
(( javax.swing.JFrame ) v0 ).getRootPane ( ); // invoke-virtual {v0}, Ljavax/swing/JFrame;->getRootPane()Ljavax/swing/JRootPane;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).v ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->v()Ljavax/swing/JMenuBar;
(( javax.swing.JRootPane ) v0 ).setJMenuBar ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JRootPane;->setJMenuBar(Ljavax/swing/JMenuBar;)V
/* .line 31 */
v0 = this.a;
(( javax.swing.JFrame ) v0 ).getContentPane ( ); // invoke-virtual {v0}, Ljavax/swing/JFrame;->getContentPane()Ljava/awt/Container;
final String v1 = "Center"; // const-string v1, "Center"
(( java.awt.Container ) v0 ).add ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
/* .line 32 */
v0 = this.a;
(( javax.swing.JFrame ) v0 ).getContentPane ( ); // invoke-virtual {v0}, Ljavax/swing/JFrame;->getContentPane()Ljava/awt/Container;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).C ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->C()Ljavax/swing/JToolBar;
final String v2 = "North"; // const-string v2, "North"
(( java.awt.Container ) v0 ).add ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
/* .line 33 */
v0 = this.a;
(( javax.swing.JFrame ) v0 ).getContentPane ( ); // invoke-virtual {v0}, Ljavax/swing/JFrame;->getContentPane()Ljava/awt/Container;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).B ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->B()Ljavax/swing/JPanel;
final String v2 = "South"; // const-string v2, "South"
(( java.awt.Container ) v0 ).add ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/awt/Container;->add(Ljava/awt/Component;Ljava/lang/Object;)V
/* .line 34 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).I ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->I()V
/* .line 35 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a()V
/* .line 36 */
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager; */
v1 = this.d;
/* invoke-direct {v0, p0, v1}, Lorg/apache/log4j/lf5/viewer/configure/ConfigurationManager;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/LogTable;)V */
return;
} // .end method
public void I ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lm/a/b/j/b/d0; */
/* invoke-direct {v0, p0}, Lm/a/b/j/b/d0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
/* .line 2 */
v1 = this.e;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v1 ).getExplorerModel ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v1 ).addActionListener ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addActionListener(Ljava/awt/event/ActionListener;)V
return;
} // .end method
public void J ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
/* iget v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b:I */
/* iget v2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c:I */
(( javax.swing.JFrame ) v0 ).setSize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljavax/swing/JFrame;->setSize(II)V
/* .line 2 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljavax/swing/JFrame;)V
return;
} // .end method
public void K ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.h;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).G ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->G()Ljava/lang/String;
(( javax.swing.JLabel ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JLabel;->setText(Ljava/lang/String;)V
return;
} // .end method
public Integer a ( javax.swing.JComboBox p0, Integer p1 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( javax.swing.JComboBox ) p1 ).getItemCount ( ); // invoke-virtual {p1}, Ljavax/swing/JComboBox;->getItemCount()I
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( javax.swing.JComboBox ) p1 ).getItemAt ( v1 ); // invoke-virtual {p1, v1}, Ljavax/swing/JComboBox;->getItemAt(I)Ljava/lang/Object;
/* .line 3 */
java.lang.String .valueOf ( v2 );
v3 = java.lang.Integer .parseInt ( v3 );
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 4 */
(( javax.swing.JComboBox ) p1 ).getItemAt ( v1 ); // invoke-virtual {p1, v1}, Ljavax/swing/JComboBox;->getItemAt(I)Ljava/lang/Object;
/* .line 5 */
java.lang.String .valueOf ( v4 );
v5 = java.lang.Integer .parseInt ( v5 );
/* if-ge v3, v5, :cond_0 */
/* if-gt v5, p2, :cond_0 */
/* move-object v2, v4 */
/* move v3, v5 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
} // :cond_1
(( javax.swing.JComboBox ) p1 ).setSelectedItem ( v2 ); // invoke-virtual {p1, v2}, Ljavax/swing/JComboBox;->setSelectedItem(Ljava/lang/Object;)V
} // .end method
public java.lang.String a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 13 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Displaying: "; // const-string v1, "Displaying: "
/* .line 14 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 15 */
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String p1 = " records out of a total of: "; // const-string p1, " records out of a total of: "
/* .line 16 */
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 17 */
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String p1 = " records."; // const-string p1, " records."
/* .line 18 */
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 19 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public javax.swing.JCheckBoxMenuItem a ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 2 */
/* .line 20 */
/* new-instance v0, Ljavax/swing/JCheckBoxMenuItem; */
(( org.apache.log4j.lf5.LogLevel ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;-><init>(Ljava/lang/String;)V */
int v1 = 1; // const/4 v1, 0x1
/* .line 21 */
(( javax.swing.JCheckBoxMenuItem ) v0 ).setSelected ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;->setSelected(Z)V
/* .line 22 */
(( org.apache.log4j.lf5.LogLevel ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
p1 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
(( javax.swing.JCheckBoxMenuItem ) v0 ).setMnemonic ( p1 ); // invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->setMnemonic(C)V
/* .line 23 */
/* new-instance p1, Lm/a/b/j/b/d; */
/* invoke-direct {p1, p0}, Lm/a/b/j/b/d;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JCheckBoxMenuItem ) v0 ).addActionListener ( p1 ); // invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JCheckBoxMenuItem a ( org.apache.log4j.lf5.viewer.LogTableColumn p0 ) {
/* .locals 2 */
/* .line 24 */
/* new-instance v0, Ljavax/swing/JCheckBoxMenuItem; */
(( org.apache.log4j.lf5.viewer.LogTableColumn ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;-><init>(Ljava/lang/String;)V */
int v1 = 1; // const/4 v1, 0x1
/* .line 25 */
(( javax.swing.JCheckBoxMenuItem ) v0 ).setSelected ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JCheckBoxMenuItem;->setSelected(Z)V
/* .line 26 */
(( org.apache.log4j.lf5.viewer.LogTableColumn ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
p1 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
(( javax.swing.JCheckBoxMenuItem ) v0 ).setMnemonic ( p1 ); // invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->setMnemonic(C)V
/* .line 27 */
/* new-instance p1, Lm/a/b/j/b/e; */
/* invoke-direct {p1, p0}, Lm/a/b/j/b/e;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JCheckBoxMenuItem ) v0 ).addActionListener ( p1 ); // invoke-virtual {v0, p1}, Ljavax/swing/JCheckBoxMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public org.apache.log4j.lf5.LogRecordFilter a ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 8 */
this.f = p1;
/* .line 9 */
/* new-instance p1, Lm/a/b/j/b/a0; */
/* invoke-direct {p1, p0}, Lm/a/b/j/b/a0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 10 */
v0 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).getFilteredLogTableModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
/* .line 11 */
/* new-instance v1, Lm/a/b/j/b/b0; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/b0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).addDisplayedProperty ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addDisplayedProperty(Ljava/lang/Object;)V
/* .line 12 */
/* new-instance v1, Lm/a/b/j/b/c0; */
/* invoke-direct {v1, p0, v0}, Lm/a/b/j/b/c0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;)V */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).addDisplayedProperty ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addDisplayedProperty(Ljava/lang/Object;)V
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 2 */
/* int-to-long v0, p1 */
/* .line 7 */
try { // :try_start_0
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
return;
} // .end method
public void a ( java.lang.String p0, org.apache.log4j.lf5.viewer.LogTable p1 ) {
/* .locals 1 */
final String v0 = "Detailed"; // const-string v0, "Detailed"
/* .line 35 */
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
(( org.apache.log4j.lf5.viewer.LogTable ) p2 ).setDetailedView ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/viewer/LogTable;->setDetailedView()V
/* .line 37 */
this.l = p1;
return;
/* .line 38 */
} // :cond_0
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "does not match a supported view."; // const-string p1, "does not match a supported view."
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 39 */
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public void a ( javax.swing.JFrame p0 ) {
/* .locals 4 */
/* .line 40 */
java.awt.Toolkit .getDefaultToolkit ( );
(( java.awt.Toolkit ) v0 ).getScreenSize ( ); // invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;
/* .line 41 */
(( javax.swing.JFrame ) p1 ).getSize ( ); // invoke-virtual {p1}, Ljavax/swing/JFrame;->getSize()Ljava/awt/Dimension;
/* .line 42 */
/* iget v2, v0, Ljava/awt/Dimension;->width:I */
/* iget v3, v1, Ljava/awt/Dimension;->width:I */
/* sub-int/2addr v2, v3 */
/* div-int/lit8 v2, v2, 0x2 */
/* iget v0, v0, Ljava/awt/Dimension;->height:I */
/* iget v1, v1, Ljava/awt/Dimension;->height:I */
/* sub-int/2addr v0, v1 */
/* div-int/lit8 v0, v0, 0x2 */
(( javax.swing.JFrame ) p1 ).setLocation ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljavax/swing/JFrame;->setLocation(II)V
return;
} // .end method
public void a ( javax.swing.JMenu p0 ) {
/* .locals 6 */
/* .line 28 */
v0 = this.v;
(( org.apache.log4j.lf5.viewer.configure.MRUFileManager ) v0 ).getMRUFileList ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/configure/MRUFileManager;->getMRUFileList()[Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 29 */
(( javax.swing.JMenu ) p1 ).addSeparator ( ); // invoke-virtual {p1}, Ljavax/swing/JMenu;->addSeparator()V
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
} // :goto_0
/* array-length v2, v0 */
/* if-ge v1, v2, :cond_0 */
/* .line 31 */
/* new-instance v2, Ljavax/swing/JMenuItem; */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
/* add-int/lit8 v4, v1, 0x1 */
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String v5 = " "; // const-string v5, " "
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* aget-object v1, v0, v1 */
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v2, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* .line 32 */
(( javax.swing.JMenuItem ) v2 ).setMnemonic ( v4 ); // invoke-virtual {v2, v4}, Ljavax/swing/JMenuItem;->setMnemonic(I)V
/* .line 33 */
/* new-instance v1, Lm/a/b/j/b/k; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/k;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v2 ).addActionListener ( v1 ); // invoke-virtual {v2, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
/* .line 34 */
(( javax.swing.JMenu ) p1 ).add ( v2 ); // invoke-virtual {p1, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* move v1, v4 */
} // :cond_0
return;
} // .end method
public void addDisplayedProperty ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
return;
} // .end method
public void addMessage ( org.apache.log4j.lf5.LogRecord p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u:Z */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* new-instance v0, Lm/a/b/j/b/w; */
/* invoke-direct {v0, p0, p1}, Lm/a/b/j/b/w;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Lorg/apache/log4j/lf5/LogRecord;)V */
javax.swing.SwingUtilities .invokeLater ( v0 );
return;
} // .end method
public javax.swing.JCheckBoxMenuItem b ( org.apache.log4j.lf5.viewer.LogTableColumn p0 ) {
/* .locals 2 */
/* .line 7 */
v0 = this.r;
/* check-cast v0, Ljavax/swing/JCheckBoxMenuItem; */
/* check-cast v0, Ljavax/swing/JCheckBoxMenuItem; */
/* if-nez v0, :cond_0 */
/* .line 8 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
/* .line 9 */
v1 = this.r;
} // :cond_0
} // .end method
public javax.swing.JMenuItem b ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Show all LogLevels"; // const-string v1, "Show all LogLevels"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x73 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/e0; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/e0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem b ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 3 */
/* .line 4 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
(( org.apache.log4j.lf5.LogLevel ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* .line 5 */
(( org.apache.log4j.lf5.LogLevel ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->toString()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
v1 = (( java.lang.String ) v1 ).charAt ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 6 */
/* new-instance v1, Lm/a/b/j/b/c; */
/* invoke-direct {v1, p0, v0, p1}, Lm/a/b/j/b/c;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;Ljavax/swing/JMenuItem;Lorg/apache/log4j/lf5/LogLevel;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JCheckBoxMenuItem c ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.q;
/* check-cast v0, Ljavax/swing/JCheckBoxMenuItem; */
/* check-cast v0, Ljavax/swing/JCheckBoxMenuItem; */
/* if-nez v0, :cond_0 */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;
/* .line 3 */
v1 = this.q;
} // :cond_0
} // .end method
public javax.swing.JMenuItem c ( ) {
/* .locals 2 */
/* .line 4 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Show all Columns"; // const-string v1, "Show all Columns"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x73 */
/* .line 5 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 6 */
/* new-instance v1, Lm/a/b/j/b/f; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/f;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem d ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Close"; // const-string v1, "Close"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x63 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
final String v1 = "control Q"; // const-string v1, "control Q"
/* .line 3 */
javax.swing.KeyStroke .getKeyStroke ( v1 );
(( javax.swing.JMenuItem ) v0 ).setAccelerator ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setAccelerator(Ljavax/swing/KeyStroke;)V
/* .line 4 */
/* new-instance v1, Lm/a/b/j/b/j; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/j;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public void dispose ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( javax.swing.JFrame ) v0 ).dispose ( ); // invoke-virtual {v0}, Ljavax/swing/JFrame;->dispose()V
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->u:Z */
/* .line 3 */
/* iget-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z */
/* if-ne v1, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
java.lang.System .exit ( v0 );
} // :cond_0
return;
} // .end method
public javax.swing.JMenuItem e ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Set Max Number of Records"; // const-string v1, "Set Max Number of Records"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x6d */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/p; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/p;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenu f ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "Configure"; // const-string v1, "Configure"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x63 */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).h ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->h()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 4 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).g ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->g()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 5 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).e ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->e()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // .end method
public javax.swing.JMenuItem g ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Reset"; // const-string v1, "Reset"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x72 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/o; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/o;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JFrame getBaseFrame ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean getCallSystemExitOnClose ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z */
} // .end method
public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree getCategoryExplorerTree ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public org.apache.log4j.lf5.util.DateFormatManager getDateFormatManager ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).getDateFormatManager ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getDateFormatManager()Lorg/apache/log4j/lf5/util/DateFormatManager;
} // .end method
public java.util.Map getLogLevelMenuItems ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
} // .end method
public java.util.Map getLogTableColumnMenuItems ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.r;
} // .end method
public java.lang.String getNDCTextFilter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public javax.swing.JCheckBoxMenuItem getTableColumnMenuItem ( org.apache.log4j.lf5.viewer.LogTableColumn p0 ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b(Lorg/apache/log4j/lf5/viewer/LogTableColumn;)Ljavax/swing/JCheckBoxMenuItem;
} // .end method
public javax.swing.JMenuItem h ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Save"; // const-string v1, "Save"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x73 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/n; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/n;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public void hide ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( javax.swing.JFrame ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JFrame;->setVisible(Z)V
return;
} // .end method
public javax.swing.JTextArea i ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JTextArea; */
/* invoke-direct {v0}, Ljavax/swing/JTextArea;-><init>()V */
/* .line 2 */
/* new-instance v1, Ljava/awt/Font; */
int v2 = 0; // const/4 v2, 0x0
final String v3 = "Monospaced"; // const-string v3, "Monospaced"
/* const/16 v4, 0xe */
/* invoke-direct {v1, v3, v2, v4}, Ljava/awt/Font;-><init>(Ljava/lang/String;II)V */
(( javax.swing.JTextArea ) v0 ).setFont ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->setFont(Ljava/awt/Font;)V
int v1 = 3; // const/4 v1, 0x3
/* .line 3 */
(( javax.swing.JTextArea ) v0 ).setTabSize ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->setTabSize(I)V
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( javax.swing.JTextArea ) v0 ).setLineWrap ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JTextArea;->setLineWrap(Z)V
/* .line 5 */
(( javax.swing.JTextArea ) v0 ).setWrapStyleWord ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JTextArea;->setWrapStyleWord(Z)V
} // .end method
public javax.swing.JMenuItem j ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Find"; // const-string v1, "Find"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x66 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
final String v1 = "control F"; // const-string v1, "control F"
/* .line 3 */
javax.swing.KeyStroke .getKeyStroke ( v1 );
(( javax.swing.JMenuItem ) v0 ).setAccelerator ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setAccelerator(Ljavax/swing/KeyStroke;)V
/* .line 4 */
/* new-instance v1, Lm/a/b/j/b/s; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/s;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem k ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Find Next"; // const-string v1, "Find Next"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x6e */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
final String v1 = "F3"; // const-string v1, "F3"
/* .line 3 */
javax.swing.KeyStroke .getKeyStroke ( v1 );
(( javax.swing.JMenuItem ) v0 ).setAccelerator ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setAccelerator(Ljavax/swing/KeyStroke;)V
/* .line 4 */
/* new-instance v1, Lm/a/b/j/b/r; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/r;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenu l ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "Edit"; // const-string v1, "Edit"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x65 */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).j ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->j()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 4 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).k ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->k()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 5 */
(( javax.swing.JMenu ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V
/* .line 6 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).n ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->n()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 7 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).m ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->m()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // .end method
public javax.swing.JMenuItem m ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Restore all NDCs"; // const-string v1, "Restore all NDCs"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x72 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/u; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/u;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem n ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Sort by NDC"; // const-string v1, "Sort by NDC"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x73 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/t; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/t;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem o ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Exit"; // const-string v1, "Exit"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x78 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/m; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/m;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenu p ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "File"; // const-string v1, "File"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x66 */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).y ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->y()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 4 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).z ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->z()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 5 */
(( javax.swing.JMenu ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V
/* .line 6 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).d ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->d()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 7 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljavax/swing/JMenu;)V
/* .line 8 */
(( javax.swing.JMenu ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V
/* .line 9 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).o ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // .end method
public javax.swing.JMenu q ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "Help"; // const-string v1, "Help"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x68 */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).r ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->r()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // .end method
public javax.swing.JMenuItem r ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "LogFactor5 Properties"; // const-string v1, "LogFactor5 Properties"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x6c */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/q; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/q;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenu s ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "Configure LogLevel Colors"; // const-string v1, "Configure LogLevel Colors"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x63 */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).E ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->E()Ljava/util/Iterator;
/* .line 4 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
/* check-cast v2, Lorg/apache/log4j/lf5/LogLevel; */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // :cond_0
} // .end method
public void setCallSystemExitOnClose ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->o:Z */
return;
} // .end method
public void setDateFormatManager ( org.apache.log4j.lf5.util.DateFormatManager p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).setDateFormatManager ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setDateFormatManager(Lorg/apache/log4j/lf5/util/DateFormatManager;)V
return;
} // .end method
public void setFontSize ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljavax/swing/JComboBox;I)I
return;
} // .end method
public void setFrameSize ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
java.awt.Toolkit .getDefaultToolkit ( );
(( java.awt.Toolkit ) v0 ).getScreenSize ( ); // invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;
/* if-lez p1, :cond_0 */
/* .line 2 */
/* iget v1, v0, Ljava/awt/Dimension;->width:I */
/* if-ge p1, v1, :cond_0 */
/* .line 3 */
/* iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b:I */
} // :cond_0
/* if-lez p2, :cond_1 */
/* .line 4 */
/* iget p1, v0, Ljava/awt/Dimension;->height:I */
/* if-ge p2, p1, :cond_1 */
/* .line 5 */
/* iput p2, p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c:I */
/* .line 6 */
} // :cond_1
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).J ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->J()V
return;
} // .end method
public void setMaxNumberOfLogRecords ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).getFilteredLogTableModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).setMaxNumberOfLogRecords ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->setMaxNumberOfLogRecords(I)V
return;
} // .end method
public void setNDCLogRecordFilter ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( org.apache.log4j.lf5.viewer.LogTable ) v0 ).getFilteredLogTableModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecordFilter;
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).setLogRecordFilter ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->setLogRecordFilter(Lorg/apache/log4j/lf5/LogRecordFilter;)V
return;
} // .end method
public void setTitle ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " - LogFactor5"; // const-string p1, " - LogFactor5"
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( javax.swing.JFrame ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Ljavax/swing/JFrame;->setTitle(Ljava/lang/String;)V
return;
} // .end method
public void show ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).show ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->show(I)V
return;
} // .end method
public void show ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( javax.swing.JFrame ) v0 ).isVisible ( ); // invoke-virtual {v0}, Ljavax/swing/JFrame;->isVisible()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance v0, Lm/a/b/j/b/l; */
/* invoke-direct {v0, p0, p1}, Lm/a/b/j/b/l;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;I)V */
javax.swing.SwingUtilities .invokeLater ( v0 );
return;
} // .end method
public javax.swing.JMenu t ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenu; */
final String v1 = "Log Level"; // const-string v1, "Log Level"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenu;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x6c */
/* .line 2 */
(( javax.swing.JMenu ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->setMnemonic(C)V
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).E ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->E()Ljava/util/Iterator;
/* .line 4 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
/* check-cast v2, Lorg/apache/log4j/lf5/LogLevel; */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 6 */
} // :cond_0
(( javax.swing.JMenu ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V
/* .line 7 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->b()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 8 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).w ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->w()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 9 */
(( javax.swing.JMenu ) v0 ).addSeparator ( ); // invoke-virtual {v0}, Ljavax/swing/JMenu;->addSeparator()V
/* .line 10 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).s ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->s()Ljavax/swing/JMenu;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
/* .line 11 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).A ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->A()Ljavax/swing/JMenuItem;
(( javax.swing.JMenu ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenu;->add(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
} // .end method
public org.apache.log4j.lf5.LogRecordFilter u ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lm/a/b/j/b/z; */
/* invoke-direct {v0, p0}, Lm/a/b/j/b/z;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
} // .end method
public javax.swing.JMenuBar v ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuBar; */
/* invoke-direct {v0}, Ljavax/swing/JMenuBar;-><init>()V */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).p ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->p()Ljavax/swing/JMenu;
(( javax.swing.JMenuBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
/* .line 3 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).l ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->l()Ljavax/swing/JMenu;
(( javax.swing.JMenuBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
/* .line 4 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).t ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->t()Ljavax/swing/JMenu;
(( javax.swing.JMenuBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
/* .line 5 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).D ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->D()Ljavax/swing/JMenu;
(( javax.swing.JMenuBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
/* .line 6 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).f ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->f()Ljavax/swing/JMenu;
(( javax.swing.JMenuBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
/* .line 7 */
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).q ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->q()Ljavax/swing/JMenu;
(( javax.swing.JMenuBar ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuBar;->add(Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
} // .end method
public javax.swing.JMenuItem w ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Hide all LogLevels"; // const-string v1, "Hide all LogLevels"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x68 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/f0; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/f0;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem x ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Hide all Columns"; // const-string v1, "Hide all Columns"
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x68 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/g; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/g;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem y ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Open..."; // const-string v1, "Open..."
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x6f */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/h; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/h;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
public javax.swing.JMenuItem z ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljavax/swing/JMenuItem; */
final String v1 = "Open URL..."; // const-string v1, "Open URL..."
/* invoke-direct {v0, v1}, Ljavax/swing/JMenuItem;-><init>(Ljava/lang/String;)V */
/* const/16 v1, 0x75 */
/* .line 2 */
(( javax.swing.JMenuItem ) v0 ).setMnemonic ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->setMnemonic(C)V
/* .line 3 */
/* new-instance v1, Lm/a/b/j/b/i; */
/* invoke-direct {v1, p0}, Lm/a/b/j/b/i;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
(( javax.swing.JMenuItem ) v0 ).addActionListener ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JMenuItem;->addActionListener(Ljava/awt/event/ActionListener;)V
} // .end method
