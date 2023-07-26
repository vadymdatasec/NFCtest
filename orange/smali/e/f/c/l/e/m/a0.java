public class e.f.c.l.e.m.a0 implements java.util.concurrent.Callable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/concurrent/Callable<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final Long a; //synthetic
public final e.f.c.l.e.m.v0 b; //synthetic
/* # direct methods */
public e.f.c.l.e.m.a0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p1;
	 /* iput-wide p2, p0, Le/f/c/l/e/m/a0;->a:J */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Object call ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.m.a0 ) p0 ).call ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a0;->call()Ljava/lang/Void;
} // .end method
public java.lang.Void call ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
final String v1 = "fatal"; // const-string v1, "fatal"
int v2 = 1; // const/4 v2, 0x1
/* .line 3 */
(( android.os.Bundle ) v0 ).putInt ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 4 */
/* iget-wide v1, p0, Le/f/c/l/e/m/a0;->a:J */
final String v3 = "timestamp"; // const-string v3, "timestamp"
(( android.os.Bundle ) v0 ).putLong ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
/* .line 5 */
v1 = this.b;
e.f.c.l.e.m.v0 .j ( v1 );
final String v2 = "_ae"; // const-string v2, "_ae"
int v0 = 0; // const/4 v0, 0x0
} // .end method
