public class m.a.b.j.b.l implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer b; //synthetic
	 public final org.apache.log4j.lf5.viewer.LogBrokerMonitor c; //synthetic
	 /* # direct methods */
	 public m.a.b.j.b.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* iput p2, p0, Lm/a/b/j/b/l;->b:I */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 java.lang.Thread .yield ( );
		 /* .line 2 */
		 v0 = this.c;
		 /* iget v1, p0, Lm/a/b/j/b/l;->b:I */
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->a(I)V
		 /* .line 3 */
		 v0 = this.c;
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( javax.swing.JFrame ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Ljavax/swing/JFrame;->setVisible(Z)V
		 return;
	 } // .end method
