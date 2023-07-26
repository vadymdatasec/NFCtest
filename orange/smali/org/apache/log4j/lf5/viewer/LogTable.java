public class org.apache.log4j.lf5.viewer.LogTable extends javax.swing.JTable {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/lf5/viewer/LogTable$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
public javax.swing.table.TableColumn c;
public d;
public org.apache.log4j.lf5.viewer.LogTableColumn e;
public org.apache.log4j.lf5.util.DateFormatManager f;
/* # direct methods */
public org.apache.log4j.lf5.viewer.LogTable ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljavax/swing/JTable;-><init>()V */
	 /* const/16 p1, 0x1e */
	 /* .line 2 */
	 /* iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->a:I */
	 /* const/16 p1, 0x9 */
	 /* .line 3 */
	 /* iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I */
	 /* new-array v0, p1, [Ljavax/swing/table/TableColumn; */
	 /* .line 4 */
	 this.c = v0;
	 /* new-array p1, p1, [I */
	 /* .line 5 */
	 /* fill-array-data p1, :array_0 */
	 this.d = p1;
	 /* .line 6 */
	 org.apache.log4j.lf5.viewer.LogTableColumn .getLogTableColumnArray ( );
	 this.e = p1;
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 7 */
	 this.f = p1;
	 /* .line 8 */
	 (( org.apache.log4j.lf5.viewer.LogTable ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->b()V
	 /* .line 9 */
	 /* new-instance p1, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel; */
	 /* invoke-direct {p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;-><init>()V */
	 (( org.apache.log4j.lf5.viewer.LogTable ) p0 ).setModel ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setModel(Ljavax/swing/table/TableModel;)V
	 /* .line 10 */
	 (( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getColumnModel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getColumnModel()Ljavax/swing/table/TableColumnModel;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 11 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 12 */
	 /* check-cast v1, Ljavax/swing/table/TableColumn; */
	 /* .line 13 */
	 /* new-instance v2, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer; */
	 /* invoke-direct {v2}, Lorg/apache/log4j/lf5/viewer/LogTableRowRenderer;-><init>()V */
	 (( javax.swing.table.TableColumn ) v1 ).setCellRenderer ( v2 ); // invoke-virtual {v1, v2}, Ljavax/swing/table/TableColumn;->setCellRenderer(Ljavax/swing/table/TableCellRenderer;)V
	 /* .line 14 */
	 v2 = this.d;
	 /* aget v2, v2, v0 */
	 (( javax.swing.table.TableColumn ) v1 ).setPreferredWidth ( v2 ); // invoke-virtual {v1, v2}, Ljavax/swing/table/TableColumn;->setPreferredWidth(I)V
	 /* .line 15 */
	 v2 = this.c;
	 /* aput-object v1, v2, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* .line 16 */
} // :cond_0
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getSelectionModel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getSelectionModel()Ljavax/swing/ListSelectionModel;
/* .line 17 */
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTable$a; */
/* invoke-direct {v0, p0, p0}, Lorg/apache/log4j/lf5/viewer/LogTable$a;-><init>(Lorg/apache/log4j/lf5/viewer/LogTable;Ljavax/swing/JTable;)V */
return;
/* :array_0 */
/* .array-data 4 */
/* 0x28 */
/* 0x28 */
/* 0x28 */
/* 0x46 */
/* 0x46 */
/* 0x168 */
/* 0x1b8 */
/* 0xc8 */
/* 0x3c */
} // .end array-data
} // .end method
/* # virtual methods */
public java.util.Vector a ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
v2 = this.e;
/* array-length v3, v2 */
/* if-ge v1, v3, :cond_0 */
/* .line 3 */
/* aget-object v2, v2, v1 */
(( java.util.Vector ) v0 ).add ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Vector;->add(ILjava/lang/Object;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->a:I */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).setRowHeight ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->setRowHeight(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).setSelectionMode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->setSelectionMode(I)V
return;
} // .end method
public synchronized void clearLogRecords ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getFilteredLogTableModel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->clear()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public org.apache.log4j.lf5.util.DateFormatManager getDateFormatManager ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public org.apache.log4j.lf5.viewer.FilteredLogTableModel getFilteredLogTableModel ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getModel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getModel()Ljavax/swing/table/TableModel;
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel; */
} // .end method
public void setDateFormatManager ( org.apache.log4j.lf5.util.DateFormatManager p0 ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
return;
} // .end method
public void setDetailedView ( ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getColumnModel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getColumnModel()Ljavax/swing/table/TableColumnModel;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
} // :goto_0
/* iget v3, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I */
/* if-ge v2, v3, :cond_0 */
/* .line 3 */
v3 = this.c;
/* aget-object v3, v3, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 4 */
} // :cond_0
} // :goto_1
/* iget v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I */
/* if-ge v1, v2, :cond_1 */
/* .line 5 */
v2 = this.c;
/* aget-object v2, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
/* .line 6 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).sizeColumnsToFit ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->sizeColumnsToFit(I)V
return;
} // .end method
public void setFont ( java.awt.Font p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Ljavax/swing/JTable;->setFont(Ljava/awt/Font;)V */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getGraphics ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getGraphics()Ljava/awt/Graphics;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( java.awt.Graphics ) v0 ).getFontMetrics ( p1 ); // invoke-virtual {v0, p1}, Ljava/awt/Graphics;->getFontMetrics(Ljava/awt/Font;)Ljava/awt/FontMetrics;
/* .line 4 */
p1 = (( java.awt.FontMetrics ) p1 ).getHeight ( ); // invoke-virtual {p1}, Ljava/awt/FontMetrics;->getHeight()I
/* .line 5 */
/* div-int/lit8 v0, p1, 0x3 */
/* add-int/2addr p1, v0 */
/* iput p1, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->a:I */
/* .line 6 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).setRowHeight ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->setRowHeight(I)V
} // :cond_0
return;
} // .end method
public void setView ( java.util.List p0 ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).getColumnModel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getColumnModel()Ljavax/swing/table/TableColumnModel;
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
/* iget v2, p0, Lorg/apache/log4j/lf5/viewer/LogTable;->b:I */
/* if-ge v1, v2, :cond_0 */
/* .line 3 */
v2 = this.c;
/* aget-object v2, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 4 */
} // :cond_0
/* .line 5 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTable;->a()Ljava/util/Vector;
/* .line 6 */
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
v2 = this.c;
v3 = (( java.util.Vector ) v1 ).indexOf ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/Vector;->indexOf(Ljava/lang/Object;)I
/* aget-object v2, v2, v3 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
/* .line 8 */
(( org.apache.log4j.lf5.viewer.LogTable ) p0 ).sizeColumnsToFit ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/LogTable;->sizeColumnsToFit(I)V
return;
} // .end method
