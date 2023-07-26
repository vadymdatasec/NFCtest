public class m.a.b.j.b.w implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final org.apache.log4j.lf5.LogRecord b; //synthetic
	 public final org.apache.log4j.lf5.viewer.LogBrokerMonitor c; //synthetic
	 /* # direct methods */
	 public m.a.b.j.b.w ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = this.e;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) v0 ).getExplorerModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
		 v1 = this.b;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).addLogRecord ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addLogRecord(Lorg/apache/log4j/lf5/LogRecord;)V
		 /* .line 2 */
		 v0 = this.c;
		 v0 = this.d;
		 (( org.apache.log4j.lf5.viewer.LogTable ) v0 ).getFilteredLogTableModel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTable;->getFilteredLogTableModel()Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;
		 v1 = this.b;
		 (( org.apache.log4j.lf5.viewer.FilteredLogTableModel ) v0 ).addLogRecord ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->addLogRecord(Lorg/apache/log4j/lf5/LogRecord;)Z
		 /* .line 3 */
		 v0 = this.c;
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).K ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->K()V
		 return;
	 } // .end method
