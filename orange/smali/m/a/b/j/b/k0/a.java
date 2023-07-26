public class m.a.b.j.b.k0.a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode b; //synthetic
	 public final org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel c; //synthetic
	 /* # direct methods */
	 public m.a.b.j.b.k0.a ( ) {
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
		 v1 = this.b;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).nodeChanged ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
		 return;
	 } // .end method
