public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode extends javax.swing.tree.DefaultMutableTreeNode {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public Integer b;
	 public Integer c;
	 public Boolean d;
	 public Boolean e;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljavax/swing/tree/DefaultMutableTreeNode;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I */
		 /* .line 4 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z */
		 /* .line 6 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z */
		 /* .line 7 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).setUserObject ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setUserObject(Ljava/lang/Object;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I */
		 /* .line 2 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b()V
		 return;
	 } // .end method
	 public void addRecord ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I */
		 /* .line 2 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b()V
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).getParent ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getParent()Ljavax/swing/tree/TreeNode;
		 /* if-nez v0, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 /* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).a ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a()V
	 return;
} // .end method
public Integer c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I */
} // .end method
public Integer d ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = 	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c()I
	 v1 = 	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).getNumberOfContainedRecords ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getNumberOfContainedRecords()I
	 /* add-int/2addr v0, v1 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* instance-of v0, p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* check-cast p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).getTitle ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
		 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).getTitle ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
		 (( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 /* .line 5 */
		 p1 = 		 (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public Integer getNumberOfContainedRecords ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I */
	 } // .end method
	 public java.lang.String getTitle ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).getUserObject ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getUserObject()Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/String; */
	 } // .end method
	 public Boolean hasFatalChildren ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z */
	 } // .end method
	 public Boolean hasFatalRecords ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z */
	 } // .end method
	 public Integer hashCode ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).getTitle ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
		 v0 = 		 (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
	 } // .end method
	 public Boolean isSelected ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z */
	 } // .end method
	 public void resetNumberOfContainedRecords ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->b:I */
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->c:I */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z */
		 return;
	 } // .end method
	 public void setAllDescendantsDeSelected ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).children ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;
		 /* .line 2 */
	 v1 = 	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 /* check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).setSelected ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V
		 /* .line 5 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).setAllDescendantsDeSelected ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setAllDescendantsDeSelected()V
	 } // :cond_0
	 return;
} // .end method
public void setAllDescendantsSelected ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).children ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->children()Ljava/util/Enumeration;
	 /* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 3 */
	 /* check-cast v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 4 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).setSelected ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setSelected(Z)V
	 /* .line 5 */
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v1 ).setAllDescendantsSelected ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->setAllDescendantsSelected()V
} // :cond_0
return;
} // .end method
public void setHasFatalChildren ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->d:Z */
return;
} // .end method
public void setHasFatalRecords ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->e:Z */
return;
} // .end method
public void setSelected ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->a:Z */
} // :cond_0
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p0 ).getTitle ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getTitle()Ljava/lang/String;
} // .end method
