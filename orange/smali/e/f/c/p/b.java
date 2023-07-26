public class e.f.c.p.b implements e.f.c.p.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public e.f.c.p.e a;
	 /* # direct methods */
	 public e.f.c.p.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.f.c.p.e .a ( p1 );
		 this.a = p1;
		 return;
	 } // .end method
	 public static e.f.c.k.e a ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "()", */
		 /* "Le/f/c/k/e<", */
		 /* "Le/f/c/p/d;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 8 */
	 /* const-class v0, Le/f/c/p/d; */
	 e.f.c.k.e .a ( v0 );
	 /* const-class v1, Landroid/content/Context; */
	 /* .line 9 */
	 e.f.c.k.u .c ( v1 );
	 (( e.f.c.k.e$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
	 e.f.c.p.a .a ( );
	 /* .line 10 */
	 (( e.f.c.k.e$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;
	 /* .line 11 */
	 (( e.f.c.k.e$a ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/k/e$a;->b()Le/f/c/k/e;
} // .end method
public static e.f.c.p.d a ( Object p0 ) { //synthethic
	 /* .locals 2 */
	 /* .line 12 */
	 /* new-instance v0, Le/f/c/p/b; */
	 /* const-class v1, Landroid/content/Context; */
	 /* check-cast p0, Landroid/content/Context; */
	 /* invoke-direct {v0, p0}, Le/f/c/p/b;-><init>(Landroid/content/Context;)V */
} // .end method
/* # virtual methods */
public e.f.c.p.c a ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 /* .line 2 */
	 v2 = this.a;
	 p1 = 	 (( e.f.c.p.e ) v2 ).a ( p1, v0, v1 ); // invoke-virtual {v2, p1, v0, v1}, Le/f/c/p/e;->a(Ljava/lang/String;J)Z
	 /* .line 3 */
	 v2 = this.a;
	 v0 = 	 (( e.f.c.p.e ) v2 ).a ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Le/f/c/p/e;->a(J)Z
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 p1 = e.f.c.p.c.f;
		 } // :cond_0
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 5 */
			 p1 = e.f.c.p.c.e;
		 } // :cond_1
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 6 */
			 p1 = e.f.c.p.c.d;
			 /* .line 7 */
		 } // :cond_2
		 p1 = e.f.c.p.c.c;
	 } // .end method
