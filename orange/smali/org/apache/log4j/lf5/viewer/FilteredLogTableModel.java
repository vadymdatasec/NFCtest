public class org.apache.log4j.lf5.viewer.FilteredLogTableModel extends javax.swing.table.AbstractTableModel {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.lf5.LogRecordFilter a;
	 public java.util.List b;
	 public java.util.List c;
	 public Integer d;
	 public java.lang.String e;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.FilteredLogTableModel ( ) {
		 /* .locals 10 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljavax/swing/table/AbstractTableModel;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/PassingLogRecordFilter; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/lf5/PassingLogRecordFilter;-><init>()V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.b = v0;
		 /* const/16 v0, 0x1388 */
		 /* .line 4 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d:I */
		 final String v1 = "Date"; // const-string v1, "Date"
		 final String v2 = "Thread"; // const-string v2, "Thread"
		 final String v3 = "Message #"; // const-string v3, "Message #"
		 final String v4 = "Level"; // const-string v4, "Level"
		 final String v5 = "NDC"; // const-string v5, "NDC"
		 final String v6 = "Category"; // const-string v6, "Category"
		 final String v7 = "Message"; // const-string v7, "Message"
		 final String v8 = "Location"; // const-string v8, "Location"
		 final String v9 = "Thrown"; // const-string v9, "Thrown"
		 /* .line 5 */
		 /* filled-new-array/range {v1 ..v9}, [Ljava/lang/String; */
		 this.e = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( Integer p0, org.apache.log4j.lf5.LogRecord p1 ) {
		 /* .locals 3 */
		 /* if-nez p2, :cond_0 */
		 final String p1 = "NULL Column"; // const-string p1, "NULL Column"
		 /* .line 11 */
	 } // :cond_0
	 /* new-instance v0, Ljava/util/Date; */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getMillis ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getMillis()J
	 /* move-result-wide v1 */
	 /* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
	 (( java.util.Date ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;
	 /* packed-switch p1, :pswitch_data_0 */
	 /* .line 12 */
	 /* new-instance p2, Ljava/lang/StringBuffer; */
	 /* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v0 = "The column number "; // const-string v0, "The column number "
	 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 final String p1 = "must be between 0 and 8"; // const-string p1, "must be between 0 and 8"
	 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* .line 13 */
	 /* new-instance p2, Ljava/lang/IllegalArgumentException; */
	 /* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p2 */
	 /* .line 14 */
	 /* :pswitch_0 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getThrownStackTrace ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getThrownStackTrace()Ljava/lang/String;
	 /* .line 15 */
	 /* :pswitch_1 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getLocation ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getLocation()Ljava/lang/String;
	 /* .line 16 */
	 /* :pswitch_2 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getMessage ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getMessage()Ljava/lang/String;
	 /* .line 17 */
	 /* :pswitch_3 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getCategory ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getCategory()Ljava/lang/String;
	 /* .line 18 */
	 /* :pswitch_4 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getNDC ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getNDC()Ljava/lang/String;
	 /* .line 19 */
	 /* :pswitch_5 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getLevel ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
	 /* .line 20 */
	 /* :pswitch_6 */
	 /* new-instance p1, Ljava/lang/Long; */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getSequenceNumber ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getSequenceNumber()J
	 /* move-result-wide v0 */
	 /* invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V */
	 /* .line 21 */
	 /* :pswitch_7 */
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getThreadDescription ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getThreadDescription()Ljava/lang/String;
	 /* .line 22 */
	 /* :pswitch_8 */
	 /* new-instance p1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v0 = " ("; // const-string v0, " ("
	 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( org.apache.log4j.lf5.LogRecord ) p2 ).getMillis ( ); // invoke-virtual {p2}, Lorg/apache/log4j/lf5/LogRecord;->getMillis()J
	 /* move-result-wide v0 */
	 (( java.lang.StringBuffer ) p1 ).append ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
	 final String p2 = ")"; // const-string p2, ")"
	 (( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_8 */
	 /* :pswitch_7 */
	 /* :pswitch_6 */
	 /* :pswitch_5 */
	 /* :pswitch_4 */
	 /* :pswitch_3 */
	 /* :pswitch_2 */
	 /* :pswitch_1 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
public java.util.List a ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
v1 = this.b;
/* .line 3 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 4 */
/* check-cast v2, Lorg/apache/log4j/lf5/LogRecord; */
/* .line 5 */
v3 = v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
} // :cond_1
} // .end method
public org.apache.log4j.lf5.LogRecord a ( Integer p0 ) {
/* .locals 2 */
/* .line 7 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->b()Ljava/util/List;
v1 = /* .line 8 */
/* if-ge p1, v1, :cond_0 */
/* .line 9 */
/* check-cast p1, Lorg/apache/log4j/lf5/LogRecord; */
} // :cond_0
/* add-int/lit8 v1, v1, -0x1 */
/* .line 10 */
/* check-cast p1, Lorg/apache/log4j/lf5/LogRecord; */
} // .end method
public synchronized Boolean addLogRecord ( org.apache.log4j.lf5.LogRecord p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
/* .line 2 */
v0 = v0 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* monitor-exit p0 */
/* .line 4 */
} // :cond_0
try { // :try_start_1
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->b()Ljava/util/List;
/* .line 5 */
p1 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).getRowCount ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->getRowCount()I
v0 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).getRowCount ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->getRowCount()I
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).fireTableRowsInserted ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->fireTableRowsInserted(II)V
/* .line 6 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).f ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->f()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 7 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public java.util.List b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).refresh ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->refresh()V
/* .line 3 */
} // :cond_0
v0 = this.c;
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.b;
/* iget v1, p0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d:I */
/* if-le v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public synchronized void clear ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
/* .line 2 */
v0 = this.c;
/* .line 3 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).fireTableDataChanged ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->fireTableDataChanged()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final Integer d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.b;
/* iget v1, p0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d:I */
/* sub-int/2addr v0, v1 */
} // .end method
public void e ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).d ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d()I
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-le v1, v2, :cond_0 */
/* .line 3 */
v2 = this.b;
/* .line 4 */
/* .line 5 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).refresh ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->refresh()V
/* .line 6 */
} // :cond_0
v1 = this.b;
/* .line 7 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).fastRefresh ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->fastRefresh()V
/* .line 8 */
} // :goto_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).e ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->e()V
} // :cond_0
return;
} // .end method
public synchronized void fastRefresh ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).fireTableRowsDeleted ( v1, v1 ); // invoke-virtual {p0, v1, v1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->fireTableRowsDeleted(II)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public Integer getColumnCount ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* array-length v0, v0 */
} // .end method
public java.lang.String getColumnName ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* aget-object p1, v0, p1 */
} // .end method
public org.apache.log4j.lf5.LogRecordFilter getLogRecordFilter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Integer getRowCount ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->b()Ljava/util/List;
} // .end method
public Integer getTotalRowCount ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.b;
} // .end method
public java.lang.Object getValueAt ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->a(I)Lorg/apache/log4j/lf5/LogRecord;
/* .line 2 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->a(ILorg/apache/log4j/lf5/LogRecord;)Ljava/lang/Object;
} // .end method
public synchronized void refresh ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->a()Ljava/util/List;
this.c = v0;
/* .line 2 */
(( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) p0 ).fireTableDataChanged ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->fireTableDataChanged()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void setLogRecordFilter ( org.apache.log4j.lf5.LogRecordFilter p0 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
return;
} // .end method
public void setMaxNumberOfLogRecords ( Integer p0 ) {
/* .locals 0 */
/* if-lez p1, :cond_0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d:I */
} // :cond_0
return;
} // .end method
