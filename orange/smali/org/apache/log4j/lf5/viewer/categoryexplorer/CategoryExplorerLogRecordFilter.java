public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerLogRecordFilter implements org.apache.log4j.lf5.LogRecordFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerLogRecordFilter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).getRootCategoryNode ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).depthFirstEnumeration ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->depthFirstEnumeration()Ljava/util/Enumeration;
		 /* .line 2 */
	 v1 = 	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 /* check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).resetNumberOfContainedRecords ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->resetNumberOfContainedRecords()V
		 /* .line 5 */
		 v2 = this.a;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v2 ).nodeChanged ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
	 } // :cond_0
	 return;
} // .end method
public Boolean passes ( org.apache.log4j.lf5.LogRecord p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath; */
	 (( org.apache.log4j.lf5.LogRecord ) p1 ).getCategory ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getCategory()Ljava/lang/String;
	 /* invoke-direct {v0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V */
	 /* .line 2 */
	 p1 = this.a;
	 p1 = 	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p1 ).isCategoryPathActive ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->isCategoryPathActive(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Z
} // .end method
public void reset ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerLogRecordFilter ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerLogRecordFilter;->a()V
	 return;
} // .end method
