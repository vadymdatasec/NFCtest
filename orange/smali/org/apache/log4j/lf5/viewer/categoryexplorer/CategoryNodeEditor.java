public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor extends org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditorRenderer f;
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode g;
	 public javax.swing.JCheckBox h;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditor ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;-><init>()V */
		 /* .line 2 */
		 /* new-instance p1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer; */
		 /* invoke-direct {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;-><init>()V */
		 this.f = p1;
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditorRenderer ) p1 ).getCheckBox ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;->getCheckBox()Ljavax/swing/JCheckBox;
		 this.h = p1;
		 /* .line 4 */
		 /* new-instance v0, Lm/a/b/j/b/k0/c; */
		 /* invoke-direct {v0, p0}, Lm/a/b/j/b/k0/c;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;)V */
		 (( javax.swing.JCheckBox ) p1 ).addActionListener ( v0 ); // invoke-virtual {p1, v0}, Ljavax/swing/JCheckBox;->addActionListener(Ljava/awt/event/ActionListener;)V
		 /* .line 5 */
		 p1 = this.f;
		 /* new-instance v0, Lm/a/b/j/b/k0/d; */
		 /* invoke-direct {v0, p0}, Lm/a/b/j/b/k0/d;-><init>(Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditor;)V */
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNodeEditorRenderer ) p1 ).addMouseListener ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;->addMouseListener(Ljava/awt/event/MouseListener;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object getCellEditorValue ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.g;
		 (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryNode ) v0 ).getUserObject ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode;->getUserObject()Ljava/lang/Object;
	 } // .end method
	 public java.awt.Component getTreeCellEditorComponent ( javax.swing.JTree p0, java.lang.Object p1, Boolean p2, Boolean p3, Boolean p4, Integer p5 ) {
		 /* .locals 9 */
		 /* .line 1 */
		 /* move-object v0, p2 */
		 /* check-cast v0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNode; */
		 this.g = v0;
		 /* .line 2 */
		 v1 = this.f;
		 int v8 = 1; // const/4 v8, 0x1
		 /* move-object v2, p1 */
		 /* move-object v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* move v7, p6 */
		 /* invoke-virtual/range {v1 ..v8}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryNodeEditorRenderer;->getTreeCellRendererComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZIZ)Ljava/awt/Component; */
	 } // .end method
