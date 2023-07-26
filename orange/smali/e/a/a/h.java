public class e.a.a.h implements e.a.a.w {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.concurrent.Executor a;
	 /* # direct methods */
	 public e.a.a.h ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/a/a/f; */
		 /* invoke-direct {v0, p0, p1}, Le/a/a/f;-><init>(Le/a/a/h;Landroid/os/Handler;)V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, com.android.volley.VolleyError p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/a/a/p<", */
		 /* "*>;", */
		 /* "Lcom/android/volley/VolleyError;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 final String v0 = "post-error"; // const-string v0, "post-error"
	 /* .line 5 */
	 (( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V
	 /* .line 6 */
	 e.a.a.v .a ( p2 );
	 /* .line 7 */
	 v0 = this.a;
	 /* new-instance v1, Le/a/a/g; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {v1, p1, p2, v2}, Le/a/a/g;-><init>(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V */
	 return;
} // .end method
public void a ( Object p0, Object p1 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/a/a/p<", */
	 /* "*>;", */
	 /* "Le/a/a/v<", */
	 /* "*>;)V" */
	 /* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.a.a.h ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/a/a/h;->a(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V
return;
} // .end method
public void a ( Object p0, Object p1, java.lang.Runnable p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;", */
/* "Le/a/a/v<", */
/* "*>;", */
/* "Ljava/lang/Runnable;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
(( e.a.a.p ) p1 ).s ( ); // invoke-virtual {p1}, Le/a/a/p;->s()V
final String v0 = "post-response"; // const-string v0, "post-response"
/* .line 3 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 4 */
v0 = this.a;
/* new-instance v1, Le/a/a/g; */
/* invoke-direct {v1, p1, p2, p3}, Le/a/a/g;-><init>(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V */
return;
} // .end method
