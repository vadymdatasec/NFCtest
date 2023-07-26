public class e.f.c.q.g0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Intent a;
	 public final e.f.a.b.h.h b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/a/b/h/h<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.q.g0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
public static final void a ( java.util.concurrent.ScheduledFuture p0, Object p1 ) { //synthethic
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 5 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( e.f.a.b.h.h ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
return;
} // .end method
public void a ( java.util.concurrent.ScheduledExecutorService p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Le/f/c/q/e0; */
/* invoke-direct {v0, p0}, Le/f/c/q/e0;-><init>(Le/f/c/q/g0;)V */
v1 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* const-wide/16 v2, 0x2328 */
/* .line 2 */
/* .line 3 */
(( e.f.c.q.g0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/q/g0;->b()Le/f/a/b/h/g;
/* new-instance v2, Le/f/c/q/f0; */
/* invoke-direct {v2, v0}, Le/f/c/q/f0;-><init>(Ljava/util/concurrent/ScheduledFuture;)V */
/* .line 4 */
(( e.f.a.b.h.g ) v1 ).a ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;
return;
} // .end method
public e.f.a.b.h.g b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public final void c ( ) { //synthethic
/* .locals 3 */
/* .line 1 */
v0 = this.a;
/* .line 2 */
(( android.content.Intent ) v0 ).getAction ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x3d */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Service took too long to process intent: "; // const-string v1, "Service took too long to process intent: "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " App may get closed."; // const-string v0, " App may get closed."
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FirebaseInstanceId"; // const-string v1, "FirebaseInstanceId"
/* .line 3 */
android.util.Log .w ( v1,v0 );
/* .line 4 */
(( e.f.c.q.g0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/g0;->a()V
return;
} // .end method
