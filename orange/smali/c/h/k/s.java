public class c.h.k.s implements java.util.concurrent.ThreadFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String a;
	 public Integer b;
	 /* # direct methods */
	 public c.h.k.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 /* iput p2, p0, Lc/h/k/s;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Thread newThread ( java.lang.Runnable p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Lc/h/k/r; */
		 v1 = this.a;
		 /* iget v2, p0, Lc/h/k/s;->b:I */
		 /* invoke-direct {v0, p1, v1, v2}, Lc/h/k/r;-><init>(Ljava/lang/Runnable;Ljava/lang/String;I)V */
	 } // .end method
