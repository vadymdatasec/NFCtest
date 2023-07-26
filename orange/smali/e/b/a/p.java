public class e.b.a.p implements e.b.a.e0.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/e0/k<", */
	 /* "Lcom/bumptech/glide/Registry;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public Boolean a;
public final e.b.a.d b; //synthetic
public final java.util.List c; //synthetic
public final e.b.a.a0.a d; //synthetic
/* # direct methods */
public e.b.a.p ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p1;
	 this.c = p2;
	 this.d = p3;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public com.bumptech.glide.Registry get ( ) {
	 /* .locals 4 */
	 /* .line 2 */
	 /* iget-boolean v0, p0, Le/b/a/p;->a:Z */
	 /* if-nez v0, :cond_0 */
	 final String v0 = "Glide registry"; // const-string v0, "Glide registry"
	 /* .line 3 */
	 c.u.a .a ( v0 );
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 4 */
	 /* iput-boolean v0, p0, Le/b/a/p;->a:Z */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 5 */
	 try { // :try_start_0
		 v1 = this.b;
		 v2 = this.c;
		 v3 = this.d;
		 e.b.a.q .a ( v1,v2,v3 );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 6 */
		 /* iput-boolean v0, p0, Le/b/a/p;->a:Z */
		 /* .line 7 */
		 c.u.a .a ( );
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* .line 8 */
		 /* iput-boolean v0, p0, Le/b/a/p;->a:Z */
		 /* .line 9 */
		 c.u.a .a ( );
		 /* .line 10 */
		 /* throw v1 */
		 /* .line 11 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"; // const-string v1, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public java.lang.Object get ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 (( e.b.a.p ) p0 ).get ( ); // invoke-virtual {p0}, Le/b/a/p;->get()Lcom/bumptech/glide/Registry;
} // .end method
