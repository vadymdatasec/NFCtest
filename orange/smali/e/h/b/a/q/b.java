public class e.h.b.a.q.b extends java.util.TimerTask {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.h.b.a.m.d b; //synthetic
	 public final e.h.b.a.q.c c; //synthetic
	 /* # direct methods */
	 public e.h.b.a.q.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = e.h.b.a.m.i.d;
		 (( e.h.b.a.m.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V
		 /* .line 2 */
		 v0 = this.c;
		 v0 = this.a;
		 com.orange.hce.proto.widget.PackIdWidgetService$b .a ( v0 );
		 (( android.content.Context ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 e.h.b.a.q.d .c ( v0 );
		 return;
	 } // .end method
