public class inal implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final javax.swing.JComponent b; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( javax.swing.JComponent ) v0 ).repaint ( ); // invoke-virtual {v0}, Ljavax/swing/JComponent;->repaint()V
		 return;
	 } // .end method
