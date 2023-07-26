public class org.apache.log4j.lf5.viewer.LF5SwingUtils {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.LF5SwingUtils ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( Integer p0, java.awt.Adjustable p1 ) {
		 /* .locals 0 */
		 /* if-nez p1, :cond_0 */
		 return;
		 /* .line 3 */
	 } // :cond_0
	 return;
} // .end method
public static void a ( Integer p0, javax.swing.ListSelectionModel p1 ) {
	 /* .locals 0 */
	 /* if-nez p1, :cond_0 */
	 return;
	 /* .line 2 */
} // :cond_0
return;
} // .end method
public static void a ( javax.swing.JComponent p0 ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Lm/a/b/j/b/a; */
/* invoke-direct {v0, p0}, Lm/a/b/j/b/a;-><init>(Ljavax/swing/JComponent;)V */
javax.swing.SwingUtilities .invokeLater ( v0 );
return;
} // .end method
public static Boolean a ( Integer p0, javax.swing.table.TableModel p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
/* if-gez p0, :cond_1 */
/* .line 1 */
p1 = } // :cond_1
/* if-lt p0, p1, :cond_2 */
} // :cond_2
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static void makeScrollBarTrack ( java.awt.Adjustable p0 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
return;
/* .line 1 */
} // :cond_0
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener; */
/* invoke-direct {v0}, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;-><init>()V */
return;
} // .end method
public static void makeVerticalScrollBarTrack ( javax.swing.JScrollPane p0 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
return;
/* .line 1 */
} // :cond_0
(( javax.swing.JScrollPane ) p0 ).getVerticalScrollBar ( ); // invoke-virtual {p0}, Ljavax/swing/JScrollPane;->getVerticalScrollBar()Ljavax/swing/JScrollBar;
org.apache.log4j.lf5.viewer.LF5SwingUtils .makeScrollBarTrack ( p0 );
return;
} // .end method
public static void selectRow ( Integer p0, javax.swing.JTable p1, javax.swing.JScrollPane p2 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* if-nez p2, :cond_0 */
/* .line 1 */
} // :cond_0
(( javax.swing.JTable ) p1 ).getModel ( ); // invoke-virtual {p1}, Ljavax/swing/JTable;->getModel()Ljavax/swing/table/TableModel;
v0 = org.apache.log4j.lf5.viewer.LF5SwingUtils .a ( p0,v0 );
/* if-nez v0, :cond_1 */
return;
/* .line 2 */
} // :cond_1
v0 = (( javax.swing.JTable ) p1 ).getRowHeight ( ); // invoke-virtual {p1}, Ljavax/swing/JTable;->getRowHeight()I
/* mul-int v0, v0, p0 */
(( javax.swing.JScrollPane ) p2 ).getVerticalScrollBar ( ); // invoke-virtual {p2}, Ljavax/swing/JScrollPane;->getVerticalScrollBar()Ljavax/swing/JScrollBar;
org.apache.log4j.lf5.viewer.LF5SwingUtils .a ( v0,p2 );
/* .line 3 */
(( javax.swing.JTable ) p1 ).getSelectionModel ( ); // invoke-virtual {p1}, Ljavax/swing/JTable;->getSelectionModel()Ljavax/swing/ListSelectionModel;
org.apache.log4j.lf5.viewer.LF5SwingUtils .a ( p0,p2 );
/* .line 4 */
org.apache.log4j.lf5.viewer.LF5SwingUtils .a ( p1 );
} // :cond_2
} // :goto_0
return;
} // .end method
