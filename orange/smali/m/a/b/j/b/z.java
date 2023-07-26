public class m.a.b.j.b.z implements org.apache.log4j.lf5.LogRecordFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final org.apache.log4j.lf5.viewer.LogBrokerMonitor a; //synthetic
	 /* # direct methods */
	 public m.a.b.j.b.z ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean passes ( org.apache.log4j.lf5.LogRecord p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath; */
		 (( org.apache.log4j.lf5.LogRecord ) p1 ).getCategory ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getCategory()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 v1 = this.a;
		 (( org.apache.log4j.lf5.LogRecord ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;
		 p1 = 		 (( javax.swing.JCheckBoxMenuItem ) p1 ).isSelected ( ); // invoke-virtual {p1}, Ljavax/swing/JCheckBoxMenuItem;->isSelected()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 p1 = this.a;
			 p1 = this.e;
			 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p1 ).getExplorerModel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
			 p1 = 			 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p1 ).isCategoryPathActive ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->isCategoryPathActive(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int p1 = 1; // const/4 p1, 0x1
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :goto_0
	 } // .end method
