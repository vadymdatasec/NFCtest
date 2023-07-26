public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel extends javax.swing.tree.DefaultTreeModel {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public java.awt.event.ActionListener b;
	 public java.awt.event.ActionEvent c;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljavax/swing/tree/DefaultTreeModel;-><init>(Ljavax/swing/tree/TreeNode;)V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->a:Z */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 3 */
		 this.b = p1;
		 /* .line 4 */
		 /* new-instance p1, Ljava/awt/event/ActionEvent; */
		 /* const/16 v0, 0x3e9 */
		 final String v1 = "Nodes Selection changed"; // const-string v1, "Nodes Selection changed"
		 /* invoke-direct {p1, p0, v0, v1}, Ljava/awt/event/ActionEvent;-><init>(Ljava/lang/Object;ILjava/lang/String;)V */
		 this.c = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = this.c;
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* new-instance v0, Lm/a/b/j/b/k0/a; */
		 /* invoke-direct {v0, p0, p1}, Lm/a/b/j/b/k0/a;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)V */
		 javax.swing.SwingUtilities .invokeLater ( v0 );
		 return;
	 } // .end method
	 public synchronized void addActionListener ( java.awt.event.ActionListener p0 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.b;
			 java.awt.AWTEventMulticaster .add ( v0,p1 );
			 this.b = p1;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 2 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
		 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode addCategory ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath p0 ) {
			 /* .locals 8 */
			 /* .line 1 */
			 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getRoot ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRoot()Ljava/lang/Object;
			 /* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
			 int v1 = 0; // const/4 v1, 0x0
			 int v2 = 0; // const/4 v2, 0x0
			 /* .line 2 */
		 } // :goto_0
		 v3 = 		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p1 ).size ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->size()I
		 /* if-ge v2, v3, :cond_3 */
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p1 ).categoryElementAt ( v2 ); // invoke-virtual {p1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->categoryElementAt(I)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).children ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;
		 /* .line 5 */
	 v5 = 	 } // :cond_0
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* .line 6 */
		 /* check-cast v5, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 /* .line 7 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v5 ).getTitle ( ); // invoke-virtual {v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
		 (( java.lang.String ) v6 ).toLowerCase ( ); // invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 /* .line 8 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryElement ) v3 ).getTitle ( ); // invoke-virtual {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;->getTitle()Ljava/lang/String;
		 (( java.lang.String ) v7 ).toLowerCase ( ); // invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 /* .line 9 */
		 v6 = 		 (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v6 != null) { // if-eqz v6, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_1
		 /* move-object v5, v0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_1
	 /* if-nez v0, :cond_2 */
	 /* .line 10 */
	 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryElement ) v3 ).getTitle ( ); // invoke-virtual {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;->getTitle()Ljava/lang/String;
	 /* invoke-direct {v0, v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;-><init>(Ljava/lang/String;)V */
	 /* .line 11 */
	 v3 = 	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v5 ).getChildCount ( ); // invoke-virtual {v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getChildCount()I
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).insertNodeInto ( v0, v5, v3 ); // invoke-virtual {p0, v0, v5, v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->insertNodeInto(Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
	 /* .line 12 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->a(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;)V
} // :cond_2
/* move-object v0, v5 */
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public void addLogRecord ( org.apache.log4j.lf5.LogRecord p0 ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath; */
(( org.apache.log4j.lf5.LogRecord ) p1 ).getCategory ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->getCategory()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).addCategory ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->addCategory(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
/* .line 3 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getCategoryNode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getCategoryNode(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
/* .line 4 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).addRecord ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->addRecord()V
/* .line 5 */
/* iget-boolean v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
p1 = (( org.apache.log4j.lf5.LogRecord ) p1 ).isFatal ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogRecord;->isFatal()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getPathToRoot ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getPathToRoot(Ljavax/swing/tree/TreeNode;)[Ljavax/swing/tree/TreeNode;
/* .line 7 */
/* array-length v1, p1 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 1; // const/4 v3, 0x1
} // :goto_0
/* add-int/lit8 v4, v1, -0x1 */
/* if-ge v3, v4, :cond_0 */
/* .line 8 */
/* aget-object v4, p1, v3 */
/* check-cast v4, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 9 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v4 ).setHasFatalChildren ( v2 ); // invoke-virtual {v4, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setHasFatalChildren(Z)V
/* .line 10 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).nodeChanged ( v4 ); // invoke-virtual {p0, v4}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
/* add-int/lit8 v3, v3, 0x1 */
/* .line 11 */
} // :cond_0
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).setHasFatalRecords ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setHasFatalRecords(Z)V
/* .line 12 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).nodeChanged ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
} // :cond_1
return;
} // .end method
public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode getCategoryNode ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath; */
/* invoke-direct {v0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;-><init>(Ljava/lang/String;)V */
/* .line 2 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getCategoryNode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getCategoryNode(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
} // .end method
public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode getCategoryNode ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath p0 ) {
/* .locals 8 */
/* .line 3 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getRoot ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRoot()Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 4 */
} // :goto_0
v3 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p1 ).size ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->size()I
/* if-ge v2, v3, :cond_3 */
/* .line 5 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p1 ).categoryElementAt ( v2 ); // invoke-virtual {p1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->categoryElementAt(I)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;
/* .line 6 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).children ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;
/* .line 7 */
v5 = } // :cond_0
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 8 */
/* check-cast v5, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 9 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v5 ).getTitle ( ); // invoke-virtual {v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
(( java.lang.String ) v6 ).toLowerCase ( ); // invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 10 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryElement ) v3 ).getTitle ( ); // invoke-virtual {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;->getTitle()Ljava/lang/String;
(( java.lang.String ) v7 ).toLowerCase ( ); // invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 11 */
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* move-object v5, v0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* if-nez v0, :cond_2 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
/* move-object v0, v5 */
} // :cond_3
} // .end method
public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode getRootCategoryNode ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getRoot ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRoot()Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
} // .end method
public javax.swing.tree.TreePath getTreePathToRoot ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
/* new-instance v0, Ljavax/swing/tree/TreePath; */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getPathToRoot ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getPathToRoot(Ljavax/swing/tree/TreeNode;)[Ljavax/swing/tree/TreeNode;
/* invoke-direct {v0, p1}, Ljavax/swing/tree/TreePath;-><init>([Ljava/lang/Object;)V */
} // .end method
public Boolean isCategoryPathActive ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath p0 ) {
/* .locals 9 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getRoot ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRoot()Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 2 */
} // :goto_0
v4 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p1 ).size ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->size()I
/* if-ge v2, v4, :cond_5 */
/* .line 3 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath ) p1 ).categoryElementAt ( v2 ); // invoke-virtual {p1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryPath;->categoryElementAt(I)Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;
/* .line 4 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).children ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;
/* .line 5 */
v5 = } // :cond_0
int v6 = 1; // const/4 v6, 0x1
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 6 */
/* check-cast v5, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 7 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v5 ).getTitle ( ); // invoke-virtual {v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
(( java.lang.String ) v7 ).toLowerCase ( ); // invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 8 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryElement ) v3 ).getTitle ( ); // invoke-virtual {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryElement;->getTitle()Ljava/lang/String;
(( java.lang.String ) v8 ).toLowerCase ( ); // invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 9 */
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 10 */
v0 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v5 ).isSelected ( ); // invoke-virtual {v5}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* move-object v0, v5 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
/* move-object v0, v5 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_4
/* if-nez v6, :cond_3 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
} // :goto_2
} // :cond_5
} // .end method
public synchronized void removeActionListener ( java.awt.event.ActionListener p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
java.awt.AWTEventMulticaster .remove ( v0,p1 );
this.b = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void resetAllNodeCounts ( ) {
/* .locals 2 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getRootCategoryNode ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getRootCategoryNode()Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).depthFirstEnumeration ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->depthFirstEnumeration()Ljava/util/Enumeration;
/* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 4 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).resetNumberOfContainedRecords ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->resetNumberOfContainedRecords()V
/* .line 5 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).nodeChanged ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
} // :cond_0
return;
} // .end method
public void setDescendantSelection ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).depthFirstEnumeration ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->depthFirstEnumeration()Ljava/util/Enumeration;
/* .line 2 */
} // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 4 */
v1 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).isSelected ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z
/* if-eq v1, p2, :cond_0 */
/* .line 5 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).setSelected ( p2 ); // invoke-virtual {v0, p2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V
/* .line 6 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).nodeChanged ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
/* .line 7 */
} // :cond_1
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->a()V
return;
} // .end method
public void setParentSelection ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0, Boolean p1 ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).getPathToRoot ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->getPathToRoot(Ljavax/swing/tree/TreeNode;)[Ljavax/swing/tree/TreeNode;
/* .line 2 */
/* array-length v0, p1 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 3 */
/* aget-object v2, p1, v1 */
/* check-cast v2, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
/* .line 4 */
v3 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v2 ).isSelected ( ); // invoke-virtual {v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z
/* if-eq v3, p2, :cond_0 */
/* .line 5 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v2 ).setSelected ( p2 ); // invoke-virtual {v2, p2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V
/* .line 6 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).nodeChanged ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->nodeChanged(Ljavax/swing/tree/TreeNode;)V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 7 */
} // :cond_1
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->a()V
return;
} // .end method
public void update ( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).isSelected ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isSelected()Z
/* if-ne v0, p2, :cond_0 */
return;
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
int p2 = 1; // const/4 p2, 0x1
/* .line 2 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).setParentSelection ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->setParentSelection(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;Z)V
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
/* .line 3 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerModel ) p0 ).setDescendantSelection ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryExplorerModel;->setDescendantSelection(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;Z)V
} // :goto_0
return;
} // .end method
