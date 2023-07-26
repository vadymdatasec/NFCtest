public class e.f.c.l.e.m.z0 implements java.util.concurrent.Callable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/concurrent/Callable<", */
	 /* "Ljava/lang/Boolean;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.c.l.e.m.b1 a; //synthetic
/* # direct methods */
public e.f.c.l.e.m.z0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Boolean call ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .line 2 */
try { // :try_start_0
	 v0 = this.a;
	 e.f.c.l.e.m.b1 .a ( v0 );
	 v0 = 	 (( e.f.c.l.e.m.c1 ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/c1;->d()Z
	 /* .line 3 */
	 e.f.c.l.e.b .a ( );
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Initialization marker file removed: "; // const-string v3, "Initialization marker file removed: "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 4 */
	 java.lang.Boolean .valueOf ( v0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 5 */
	 e.f.c.l.e.b .a ( );
	 final String v2 = "Problem encountered deleting Crashlytics initialization marker."; // const-string v2, "Problem encountered deleting Crashlytics initialization marker."
	 /* .line 6 */
	 (( e.f.c.l.e.b ) v1 ).b ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 7 */
	 java.lang.Boolean .valueOf ( v0 );
} // .end method
public java.lang.Object call ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.m.z0 ) p0 ).call ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/z0;->call()Ljava/lang/Boolean;
} // .end method
