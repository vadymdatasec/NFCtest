public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryImmediateEditor extends javax.swing.tree.DefaultTreeCellEditor {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryImmediateEditor ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Ljavax/swing/tree/DefaultTreeCellEditor;-><init>(Ljavax/swing/JTree;Ljavax/swing/tree/DefaultTreeCellRenderer;Ljavax/swing/tree/TreeCellEditor;)V */
		 /* .line 2 */
		 this.a = p2;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p2 ).setIcon ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setIcon(Ljavax/swing/Icon;)V
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p2 ).setLeafIcon ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setLeafIcon(Ljavax/swing/Icon;)V
		 /* .line 5 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p2 ).setOpenIcon ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setOpenIcon(Ljavax/swing/Icon;)V
		 /* .line 6 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) p2 ).setClosedIcon ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->setClosedIcon(Ljavax/swing/Icon;)V
		 /* .line 7 */
		 this.editingIcon = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean inCheckBoxHitRegion ( java.awt.event.MouseEvent p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.tree;
		 v1 = 		 (( java.awt.event.MouseEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getX()I
		 v2 = 		 (( java.awt.event.MouseEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getY()I
		 (( javax.swing.JTree ) v0 ).getPathForLocation ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljavax/swing/JTree;->getPathForLocation(II)Ljavax/swing/tree/TreePath;
		 /* if-nez v0, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
	 } // :cond_0
	 (( javax.swing.tree.TreePath ) v0 ).getLastPathComponent ( ); // invoke-virtual {v0}, Ljavax/swing/tree/TreePath;->getLastPathComponent()Ljava/lang/Object;
	 /* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
	 /* .line 3 */
	 v0 = this.tree;
	 /* iget v1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryImmediateEditor;->lastRow:I */
	 (( javax.swing.JTree ) v0 ).getRowBounds ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JTree;->getRowBounds(I)Ljava/awt/Rectangle;
	 /* .line 4 */
	 v1 = this.a;
	 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeRenderer ) v1 ).getCheckBoxOffset ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeRenderer;->getCheckBoxOffset()Ljava/awt/Dimension;
	 /* .line 5 */
	 /* iget v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryImmediateEditor;->offset:I */
	 /* iget v3, v1, Ljava/awt/Dimension;->width:I */
	 /* add-int/2addr v2, v3 */
	 /* iget v1, v1, Ljava/awt/Dimension;->height:I */
	 (( java.awt.Rectangle ) v0 ).translate ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/awt/Rectangle;->translate(II)V
	 /* .line 6 */
	 (( java.awt.event.MouseEvent ) p1 ).getPoint ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getPoint()Ljava/awt/Point;
	 (( java.awt.Rectangle ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/awt/Rectangle;->contains(Ljava/awt/Point;)Z
	 int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean shouldSelectCell ( java.util.EventObject p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* instance-of v0, p1, Ljava/awt/event/MouseEvent; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* check-cast p1, Ljava/awt/event/MouseEvent; */
		 /* .line 3 */
		 v0 = this.tree;
		 v1 = 		 (( java.awt.event.MouseEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getX()I
		 p1 = 		 (( java.awt.event.MouseEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getY()I
		 (( javax.swing.JTree ) v0 ).getPathForLocation ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljavax/swing/JTree;->getPathForLocation(II)Ljavax/swing/tree/TreePath;
		 /* .line 4 */
		 (( javax.swing.tree.TreePath ) p1 ).getLastPathComponent ( ); // invoke-virtual {p1}, Ljavax/swing/tree/TreePath;->getLastPathComponent()Ljava/lang/Object;
		 /* check-cast p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 /* .line 5 */
		 p1 = 		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) p1 ).isLeaf ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->isLeaf()Z
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
