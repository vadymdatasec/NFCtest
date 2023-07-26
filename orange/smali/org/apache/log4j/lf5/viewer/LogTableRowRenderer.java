public class org.apache.log4j.lf5.viewer.LogTableRowRenderer extends javax.swing.table.DefaultTableCellRenderer {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.awt.Color a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.LogTableRowRenderer ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljavax/swing/table/DefaultTableCellRenderer;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/awt/Color; */
		 /* const/16 v1, 0xe6 */
		 /* invoke-direct {v0, v1, v1, v1}, Ljava/awt/Color;-><init>(III)V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.awt.Color a ( org.apache.log4j.lf5.LogLevel p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.lf5.LogLevel .getLogLevelColorMap ( );
		 /* check-cast p1, Ljava/awt/Color; */
	 } // .end method
	 public java.awt.Component getTableCellRendererComponent ( javax.swing.JTable p0, java.lang.Object p1, Boolean p2, Boolean p3, Integer p4, Integer p5 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* rem-int/lit8 v0, p5, 0x2 */
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.a;
		 (( org.apache.log4j.lf5.viewer.LogTableRowRenderer ) p0 ).setBackground ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->setBackground(Ljava/awt/Color;)V
		 /* .line 3 */
	 } // :cond_0
	 v0 = java.awt.Color.white;
	 (( org.apache.log4j.lf5.viewer.LogTableRowRenderer ) p0 ).setBackground ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->setBackground(Ljava/awt/Color;)V
	 /* .line 4 */
} // :goto_0
(( javax.swing.JTable ) p1 ).getModel ( ); // invoke-virtual {p1}, Ljavax/swing/JTable;->getModel()Ljavax/swing/table/TableModel;
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel; */
/* .line 5 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).a ( p5 ); // invoke-virtual {v0, p5}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->a(I)Lorg/apache/log4j/lf5/LogRecord;
/* .line 6 */
(( org.apache.log4j.lf5.LogRecord ) v0 ).getLevel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
(( org.apache.log4j.lf5.viewer.LogTableRowRenderer ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->a(Lorg/apache/log4j/lf5/LogLevel;)Ljava/awt/Color;
(( org.apache.log4j.lf5.viewer.LogTableRowRenderer ) p0 ).setForeground ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;->setForeground(Ljava/awt/Color;)V
/* .line 7 */
/* invoke-super/range {p0 ..p6}, Ljavax/swing/table/DefaultTableCellRenderer;->getTableCellRendererComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component; */
} // .end method
