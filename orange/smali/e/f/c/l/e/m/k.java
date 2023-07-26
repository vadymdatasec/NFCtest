public class e.f.c.l.e.m.k implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.c.l.e.m.o b; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.m.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 e.f.c.l.e.m.o .a ( v0 );
		 int v1 = 1; // const/4 v1, 0x1
		 java.lang.Boolean .valueOf ( v1 );
		 (( java.lang.ThreadLocal ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
		 return;
	 } // .end method
