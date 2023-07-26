public class m.a.b.j.b.a0 implements org.apache.log4j.lf5.LogRecordFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final org.apache.log4j.lf5.viewer.LogBrokerMonitor a; //synthetic
	 /* # direct methods */
	 public m.a.b.j.b.a0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean passes ( org.apache.log4j.lf5.LogRecord p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( org.apache.log4j.lf5.LogRecord ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getNDC()Ljava/lang/String;
		 /* .line 2 */
		 /* new-instance v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath; */
		 (( org.apache.log4j.lf5.LogRecord ) p1 ).getCategory ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getCategory()Ljava/lang/String;
		 /* invoke-direct {v1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V */
		 int v2 = 0; // const/4 v2, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 3 */
			 v3 = this.a;
			 v3 = this.f;
			 /* if-nez v3, :cond_0 */
			 /* .line 4 */
		 } // :cond_0
		 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 v3 = this.a;
		 v3 = this.f;
		 (( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 v0 = 		 (( java.lang.String ) v0 ).indexOf ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
		 int v3 = -1; // const/4 v3, -0x1
		 /* if-ne v0, v3, :cond_1 */
		 /* .line 5 */
	 } // :cond_1
	 v0 = this.a;
	 (( org.apache.log4j.lf5.LogRecord ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
	 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->c(Lorg/apache/log4j/lf5/LogLevel;)Ljavax/swing/JCheckBoxMenuItem;
	 p1 = 	 (( javax.swing.JCheckBoxMenuItem ) p1 ).isSelected ( ); // invoke-virtual {p1}, Ljavax/swing/JCheckBoxMenuItem;->isSelected()Z
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 p1 = this.a;
		 p1 = this.e;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p1 ).getExplorerModel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->getExplorerModel()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;
		 p1 = 		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p1 ).isCategoryPathActive ( v1 ); // invoke-virtual {p1, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->isCategoryPathActive(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 int v2 = 1; // const/4 v2, 0x1
		 } // :cond_2
	 } // :goto_0
} // .end method
