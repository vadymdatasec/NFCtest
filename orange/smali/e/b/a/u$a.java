public class e.b.a.u$a implements e.b.a.z.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/b/a/u; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final e.b.a.z.x a;
public final e.b.a.u b; //synthetic
/* # direct methods */
public e.b.a.u$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p2;
return;
} // .end method
/* # virtual methods */
public void a ( Boolean p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 1 */
	 p1 = this.b;
	 /* monitor-enter p1 */
	 /* .line 2 */
	 try { // :try_start_0
		 v0 = this.a;
		 (( e.b.a.z.x ) v0 ).d ( ); // invoke-virtual {v0}, Le/b/a/z/x;->d()V
		 /* .line 3 */
		 /* monitor-exit p1 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v0 */
	 } // :cond_0
} // :goto_0
return;
} // .end method
