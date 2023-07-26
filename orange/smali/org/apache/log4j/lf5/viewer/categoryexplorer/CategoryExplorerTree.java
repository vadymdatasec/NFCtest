public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree extends javax.swing.JTree {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel a;
	 public Boolean b;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ( ) {
		 /* .locals 2 */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljavax/swing/JTree;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z */
		 /* .line 7 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 final String v1 = "Categories"; // const-string v1, "Categories"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;-><init>(Ljava/lang/String;)V */
		 /* .line 8 */
		 /* new-instance v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel; */
		 /* invoke-direct {v1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)V */
		 this.a = v1;
		 /* .line 9 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).setModel ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setModel(Ljavax/swing/tree/TreeModel;)V
		 /* .line 10 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->c()V
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljavax/swing/JTree;-><init>(Ljavax/swing/tree/TreeModel;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->c()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 /* new-instance v1, Lm/a/b/j/b/k0/b; */
		 /* invoke-direct {v1, p0}, Lm/a/b/j/b/k0/b;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;)V */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v0 ).addTreeModelListener ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addTreeModelListener(Ljavax/swing/event/TreeModelListener;)V
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->b:Z */
		 /* .line 3 */
		 /* new-instance v0, Ljavax/swing/tree/TreePath; */
		 v1 = this.a;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) v1 ).getRootCategoryNode ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).getPath ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getPath()[Ljavax/swing/tree/TreeNode;
		 /* invoke-direct {v0, v1}, Ljavax/swing/tree/TreePath;-><init>([Ljava/lang/Object;)V */
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).expandPath ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->expandPath(Ljavax/swing/tree/TreePath;)V
		 return;
	 } // .end method
	 public void c ( ) {
		 /* .locals 4 */
		 final String v0 = "JTree.lineStyle"; // const-string v0, "JTree.lineStyle"
		 final String v1 = "Angled"; // const-string v1, "Angled"
		 /* .line 1 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).putClientProperty ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->putClientProperty(Ljava/lang/Object;Ljava/lang/Object;)V
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;-><init>()V */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).setEditable ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setEditable(Z)V
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).setCellRenderer ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setCellRenderer(Ljavax/swing/tree/TreeCellRenderer;)V
		 /* .line 5 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor; */
		 v2 = this.a;
		 /* invoke-direct {v0, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;)V */
		 /* .line 6 */
		 /* new-instance v2, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryImmediateEditor; */
		 /* new-instance v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer; */
		 /* invoke-direct {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;-><init>()V */
		 /* invoke-direct {v2, p0, v3, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryImmediateEditor;-><init>(Ljavax/swing/JTree;Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;)V */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).setCellEditor ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setCellEditor(Ljavax/swing/tree/TreeCellEditor;)V
		 /* .line 7 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).setShowsRootHandles ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setShowsRootHandles(Z)V
		 final String v0 = ""; // const-string v0, ""
		 /* .line 8 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).setToolTipText ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->setToolTipText(Ljava/lang/String;)V
		 /* .line 9 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerTree;->a()V
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel getExplorerModel ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public java.lang.String getToolTipText ( java.awt.event.MouseEvent p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* invoke-super {p0, p1}, Ljavax/swing/JTree;->getToolTipText(Ljava/awt/event/MouseEvent;)Ljava/lang/String; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 final String p1 = ""; // const-string p1, ""
		 } // .end method
