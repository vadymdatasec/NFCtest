public class org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor implements javax.swing.table.TableCellEditor implements javax.swing.tree.TreeCellEditor {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.Class e; //synthetic
	 /* # instance fields */
	 public javax.swing.event.EventListenerList a;
	 public java.lang.Object b;
	 public javax.swing.event.ChangeEvent c;
	 public Integer d;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljavax/swing/event/EventListenerList; */
		 /* invoke-direct {v0}, Ljavax/swing/event/EventListenerList;-><init>()V */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 this.c = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 4 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I */
		 return;
	 } // .end method
	 public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
		 /* .locals 1 */
		 /* .line 1 */
		 try { // :try_start_0
			 java.lang.Class .forName ( p0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
			 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
			 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
			 /* throw p0 */
		 } // .end method
		 /* # virtual methods */
		 public void a ( ) {
			 /* .locals 4 */
			 /* .line 2 */
			 v0 = this.a;
			 (( javax.swing.event.EventListenerList ) v0 ).getListenerList ( ); // invoke-virtual {v0}, Ljavax/swing/event/EventListenerList;->getListenerList()[Ljava/lang/Object;
			 /* .line 3 */
			 /* array-length v1, v0 */
			 /* add-int/lit8 v1, v1, -0x2 */
		 } // :goto_0
		 /* if-ltz v1, :cond_3 */
		 /* .line 4 */
		 /* aget-object v2, v0, v1 */
		 v3 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor.e;
		 /* if-nez v3, :cond_0 */
		 final String v3 = "javax.swing.event.CellEditorListener"; // const-string v3, "javax.swing.event.CellEditorListener"
		 org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor .a ( v3 );
	 } // :cond_0
	 /* if-ne v2, v3, :cond_2 */
	 /* .line 5 */
	 v2 = this.c;
	 /* if-nez v2, :cond_1 */
	 /* .line 6 */
	 /* new-instance v2, Ljavax/swing/event/ChangeEvent; */
	 /* invoke-direct {v2, p0}, Ljavax/swing/event/ChangeEvent;-><init>(Ljava/lang/Object;)V */
	 this.c = v2;
} // :cond_1
/* add-int/lit8 v2, v1, 0x1 */
/* .line 7 */
/* aget-object v2, v0, v2 */
/* check-cast v2, Ljavax/swing/event/CellEditorListener; */
v3 = this.c;
} // :cond_2
/* add-int/lit8 v1, v1, -0x2 */
} // :cond_3
return;
} // .end method
public void addCellEditorListener ( javax.swing.event.CellEditorListener p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v1 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor.e;
/* if-nez v1, :cond_0 */
final String v1 = "javax.swing.event.CellEditorListener"; // const-string v1, "javax.swing.event.CellEditorListener"
org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor .a ( v1 );
} // :cond_0
(( javax.swing.event.EventListenerList ) v0 ).add ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljavax/swing/event/EventListenerList;->add(Ljava/lang/Class;Ljava/util/EventListener;)V
return;
} // .end method
public void b ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
(( javax.swing.event.EventListenerList ) v0 ).getListenerList ( ); // invoke-virtual {v0}, Ljavax/swing/event/EventListenerList;->getListenerList()[Ljava/lang/Object;
/* .line 2 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x2 */
} // :goto_0
/* if-ltz v1, :cond_3 */
/* .line 3 */
/* aget-object v2, v0, v1 */
v3 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor.e;
/* if-nez v3, :cond_0 */
final String v3 = "javax.swing.event.CellEditorListener"; // const-string v3, "javax.swing.event.CellEditorListener"
org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor .a ( v3 );
} // :cond_0
/* if-ne v2, v3, :cond_2 */
/* .line 4 */
v2 = this.c;
/* if-nez v2, :cond_1 */
/* .line 5 */
/* new-instance v2, Ljavax/swing/event/ChangeEvent; */
/* invoke-direct {v2, p0}, Ljavax/swing/event/ChangeEvent;-><init>(Ljava/lang/Object;)V */
this.c = v2;
} // :cond_1
/* add-int/lit8 v2, v1, 0x1 */
/* .line 6 */
/* aget-object v2, v0, v2 */
/* check-cast v2, Ljavax/swing/event/CellEditorListener; */
v3 = this.c;
} // :cond_2
/* add-int/lit8 v1, v1, -0x2 */
} // :cond_3
return;
} // .end method
public void cancelCellEditing ( ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a()V
return;
} // .end method
public java.lang.Object getCellEditorValue ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer getClickCountToStart ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I */
} // .end method
public java.awt.Component getTableCellEditorComponent ( javax.swing.JTable p0, java.lang.Object p1, Boolean p2, Integer p3, Integer p4 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.awt.Component getTreeCellEditorComponent ( javax.swing.JTree p0, java.lang.Object p1, Boolean p2, Boolean p3, Boolean p4, Integer p5 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean isCellEditable ( java.util.EventObject p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Ljava/awt/event/MouseEvent; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Ljava/awt/event/MouseEvent; */
p1 = (( java.awt.event.MouseEvent ) p1 ).getClickCount ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getClickCount()I
/* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I */
/* if-ge p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void removeCellEditorListener ( javax.swing.event.CellEditorListener p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v1 = org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor.e;
/* if-nez v1, :cond_0 */
final String v1 = "javax.swing.event.CellEditorListener"; // const-string v1, "javax.swing.event.CellEditorListener"
org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor .a ( v1 );
} // :cond_0
(( javax.swing.event.EventListenerList ) v0 ).remove ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljavax/swing/event/EventListenerList;->remove(Ljava/lang/Class;Ljava/util/EventListener;)V
return;
} // .end method
public void setCellEditorValue ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public void setClickCountToStart ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I */
return;
} // .end method
public Boolean shouldSelectCell ( java.util.EventObject p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor ) p0 ).isCellEditable ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->isCellEditable(Ljava/util/EventObject;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
/* check-cast p1, Ljava/awt/event/MouseEvent; */
p1 = (( java.awt.event.MouseEvent ) p1 ).getClickCount ( ); // invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getClickCount()I
/* iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I */
/* if-lt p1, v0, :cond_1 */
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean stopCellEditing ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.lf5.viewer.categoryexplorer.CategoryAbstractCellEditor ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->b()V
int v0 = 1; // const/4 v0, 0x1
} // .end method
