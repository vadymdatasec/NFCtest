public class e.f.c.v.c implements e.f.c.v.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final e.f.c.v.d b;
	 /* # direct methods */
	 public e.f.c.v.c ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Set<", */
		 /* "Le/f/c/v/f;", */
		 /* ">;", */
		 /* "Le/f/c/v/d;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 e.f.c.v.c .a ( p1 );
	 this.a = p1;
	 /* .line 3 */
	 this.b = p2;
	 return;
} // .end method
public static e.f.c.v.h a ( Object p0 ) { //synthethic
	 /* .locals 2 */
	 /* .line 12 */
	 /* new-instance v0, Le/f/c/v/c; */
	 /* const-class v1, Le/f/c/v/f; */
	 /* .line 13 */
	 e.f.c.v.d .b ( );
	 /* invoke-direct {v0, p0, v1}, Le/f/c/v/c;-><init>(Ljava/util/Set;Le/f/c/v/d;)V */
} // .end method
public static java.lang.String a ( java.util.Set p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/Set<", */
	 /* "Le/f/c/v/f;", */
	 /* ">;)", */
	 /* "Ljava/lang/String;" */
	 /* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 5 */
/* .line 6 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
/* check-cast v1, Le/f/c/v/f; */
/* .line 8 */
(( e.f.c.v.f ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/v/f;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x2f */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( e.f.c.v.f ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/v/f;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = /* .line 9 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v1, 0x20 */
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 11 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static e.f.c.k.e b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/c/k/e<", */
/* "Le/f/c/v/h;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* const-class v0, Le/f/c/v/h; */
e.f.c.k.e .a ( v0 );
/* const-class v1, Le/f/c/v/f; */
/* .line 2 */
e.f.c.k.u .d ( v1 );
(( e.f.c.k.e$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
e.f.c.v.b .a ( );
/* .line 3 */
(( e.f.c.k.e$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;
/* .line 4 */
(( e.f.c.k.e$a ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/k/e$a;->b()Le/f/c/k/e;
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = (( e.f.c.v.d ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/v/d;->a()Ljava/util/Set;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.a;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x20 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v1 = this.b;
(( e.f.c.v.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/v/d;->a()Ljava/util/Set;
e.f.c.v.c .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
