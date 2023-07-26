public class e.f.a.b.c.p.l.a implements java.util.concurrent.ThreadFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.util.concurrent.ThreadFactory b;
	 /* # direct methods */
	 public e.f.a.b.c.p.l.a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 public e.f.a.b.c.p.l.a ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 java.util.concurrent.Executors .defaultThreadFactory ( );
		 this.b = p2;
		 final String p2 = "Name must not be null"; // const-string p2, "Name must not be null"
		 /* .line 4 */
		 e.f.a.b.c.m.h .a ( p1,p2 );
		 /* check-cast p1, Ljava/lang/String; */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Thread newThread ( java.lang.Runnable p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 /* new-instance v1, Le/f/a/b/c/p/l/b; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {v1, p1, v2}, Le/f/a/b/c/p/l/b;-><init>(Ljava/lang/Runnable;I)V */
		 /* .line 2 */
		 v0 = this.a;
		 (( java.lang.Thread ) p1 ).setName ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
	 } // .end method
