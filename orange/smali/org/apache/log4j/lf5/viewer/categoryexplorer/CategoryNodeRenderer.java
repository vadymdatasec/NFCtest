public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer extends javax.swing.tree.DefaultTreeCellRenderer {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.awt.Color FATAL_CHILDREN;
	 public static javax.swing.ImageIcon c;
	 /* # instance fields */
	 public javax.swing.JCheckBox a;
	 public javax.swing.JPanel b;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/awt/Color; */
		 /* const/16 v1, 0xbd */
		 /* const/16 v2, 0x71 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* invoke-direct {v0, v1, v2, v3}, Ljava/awt/Color;-><init>(III)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljavax/swing/tree/DefaultTreeCellRenderer;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljavax/swing/JCheckBox; */
		 /* invoke-direct {v0}, Ljavax/swing/JCheckBox;-><init>()V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Ljavax/swing/JPanel; */
		 /* invoke-direct {v0}, Ljavax/swing/JPanel;-><init>()V */
		 this.b = v0;
		 final String v1 = "Tree.textBackground"; // const-string v1, "Tree.textBackground"
		 /* .line 4 */
		 javax.swing.UIManager .getColor ( v1 );
		 (( javax.swing.JPanel ) v0 ).setBackground ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->setBackground(Ljava/awt/Color;)V
		 /* .line 5 */
		 v0 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer.c;
		 /* if-nez v0, :cond_0 */
		 /* .line 6 */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 final String v1 = "/org/apache/log4j/lf5/viewer/images/channelexplorer_satellite.gif"; // const-string v1, "/org/apache/log4j/lf5/viewer/images/channelexplorer_satellite.gif"
		 (( java.lang.Class ) v0 ).getResource ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;
		 /* .line 7 */
		 /* new-instance v1, Ljavax/swing/ImageIcon; */
		 /* invoke-direct {v1, v0}, Ljavax/swing/ImageIcon;-><init>(Ljava/net/URL;)V */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 8 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).setOpaque ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setOpaque(Z)V
	 /* .line 9 */
	 v1 = this.a;
	 (( javax.swing.JCheckBox ) v1 ).setOpaque ( v0 ); // invoke-virtual {v1, v0}, Ljavax/swing/JCheckBox;->setOpaque(Z)V
	 /* .line 10 */
	 v1 = this.b;
	 (( javax.swing.JPanel ) v1 ).setOpaque ( v0 ); // invoke-virtual {v1, v0}, Ljavax/swing/JPanel;->setOpaque(Z)V
	 /* .line 11 */
	 v1 = this.b;
	 /* new-instance v2, Ljava/awt/FlowLayout; */
	 /* invoke-direct {v2, v0, v0, v0}, Ljava/awt/FlowLayout;-><init>(III)V */
	 (( javax.swing.JPanel ) v1 ).setLayout ( v2 ); // invoke-virtual {v1, v2}, Ljavax/swing/JPanel;->setLayout(Ljava/awt/LayoutManager;)V
	 /* .line 12 */
	 v0 = this.b;
	 v1 = this.a;
	 (( javax.swing.JPanel ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
	 /* .line 13 */
	 v0 = this.b;
	 (( javax.swing.JPanel ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljavax/swing/JPanel;->add(Ljava/awt/Component;)Ljava/awt/Component;
	 /* .line 14 */
	 v0 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer.c;
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).setOpenIcon ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setOpenIcon(Ljavax/swing/Icon;)V
	 /* .line 15 */
	 v0 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer.c;
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).setClosedIcon ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setClosedIcon(Ljavax/swing/Icon;)V
	 /* .line 16 */
	 v0 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer.c;
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).setLeafIcon ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setLeafIcon(Ljavax/swing/Icon;)V
	 return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 /* .line 2 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).getTitle ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = " contains a total of "; // const-string v1, " contains a total of "
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 3 */
	 p1 = 	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).d ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d()I
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 final String p1 = " LogRecords."; // const-string p1, " LogRecords."
	 /* .line 4 */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p1 = " Right-click for more info."; // const-string p1, " Right-click for more info."
	 /* .line 5 */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 6 */
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.awt.Dimension getCheckBoxOffset ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/awt/Dimension; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, v1, v1}, Ljava/awt/Dimension;-><init>(II)V */
} // .end method
public java.awt.Component getTreeCellRendererComponent ( javax.swing.JTree p0, java.lang.Object p1, Boolean p2, Boolean p3, Boolean p4, Integer p5, Boolean p6 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* move-object v0, p2 */
	 /* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 /* .line 2 */
	 /* invoke-super/range {p0 ..p7}, Ljavax/swing/tree/DefaultTreeCellRenderer;->getTreeCellRendererComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component; */
	 /* if-nez p6, :cond_0 */
	 /* .line 3 */
	 p1 = this.a;
	 int p2 = 0; // const/4 p2, 0x0
	 (( javax.swing.JCheckBox ) p1 ).setVisible ( p2 ); // invoke-virtual {p1, p2}, Ljavax/swing/JCheckBox;->setVisible(Z)V
	 /* .line 4 */
} // :cond_0
p1 = this.a;
int p2 = 1; // const/4 p2, 0x1
(( javax.swing.JCheckBox ) p1 ).setVisible ( p2 ); // invoke-virtual {p1, p2}, Ljavax/swing/JCheckBox;->setVisible(Z)V
/* .line 5 */
p1 = this.a;
p2 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).isSelected ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z
(( javax.swing.JCheckBox ) p1 ).setSelected ( p2 ); // invoke-virtual {p1, p2}, Ljavax/swing/JCheckBox;->setSelected(Z)V
/* .line 6 */
} // :goto_0
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->a(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)Ljava/lang/String;
/* .line 7 */
p2 = this.b;
(( javax.swing.JPanel ) p2 ).setToolTipText ( p1 ); // invoke-virtual {p2, p1}, Ljavax/swing/JPanel;->setToolTipText(Ljava/lang/String;)V
/* .line 8 */
p1 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).hasFatalChildren ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->hasFatalChildren()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 9 */
p1 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer.FATAL_CHILDREN;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).setForeground ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setForeground(Ljava/awt/Color;)V
/* .line 10 */
} // :cond_1
p1 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).hasFatalRecords ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->hasFatalRecords()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 11 */
p1 = java.awt.Color.red;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p0 ).setForeground ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setForeground(Ljava/awt/Color;)V
/* .line 12 */
} // :cond_2
p1 = this.b;
} // .end method
