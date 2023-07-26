public class e.f.c.q.d0 extends android.os.Binder {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.c.q.c0 a;
	 /* # direct methods */
	 public e.f.c.q.d0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static final void a ( e.f.c.q.g0 p0, Object p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 8 */
		 (( e.f.c.q.g0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/g0;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( e.f.c.q.g0 p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 android.os.Binder .getCallingUid ( );
		 v1 = 		 android.os.Process .myUid ( );
		 /* if-ne v0, v1, :cond_1 */
		 int v0 = 3; // const/4 v0, 0x3
		 final String v1 = "FirebaseInstanceId"; // const-string v1, "FirebaseInstanceId"
		 /* .line 2 */
		 v0 = 		 android.util.Log .isLoggable ( v1,v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "service received new intent via bind strategy"; // const-string v0, "service received new intent via bind strategy"
			 /* .line 3 */
			 android.util.Log .d ( v1,v0 );
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.a;
		 v1 = this.a;
		 /* .line 5 */
		 /* .line 6 */
		 e.f.c.q.h .a ( );
		 /* new-instance v2, Le/f/c/q/b0; */
		 /* invoke-direct {v2, p1}, Le/f/c/q/b0;-><init>(Le/f/c/q/g0;)V */
		 (( e.f.a.b.h.g ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;
		 return;
		 /* .line 7 */
	 } // :cond_1
	 /* new-instance p1, Ljava/lang/SecurityException; */
	 final String v0 = "Binding only allowed within app"; // const-string v0, "Binding only allowed within app"
	 /* invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
