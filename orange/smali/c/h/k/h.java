public class c.h.k.h implements java.util.concurrent.Callable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/concurrent/Callable<", */
	 /* "Lc/h/k/l;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.String a; //synthetic
public final android.content.Context b; //synthetic
public final c.h.k.g c; //synthetic
public final Integer d; //synthetic
/* # direct methods */
public c.h.k.h ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 this.b = p2;
	 this.c = p3;
	 /* iput p4, p0, Lc/h/k/h;->d:I */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public c.h.k.l call ( ) {
	 /* .locals 4 */
	 /* .line 2 */
	 v0 = this.a;
	 v1 = this.b;
	 v2 = this.c;
	 /* iget v3, p0, Lc/h/k/h;->d:I */
	 c.h.k.m .a ( v0,v1,v2,v3 );
} // .end method
public java.lang.Object call ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .line 1 */
(( c.h.k.h ) p0 ).call ( ); // invoke-virtual {p0}, Lc/h/k/h;->call()Lc/h/k/l;
} // .end method
