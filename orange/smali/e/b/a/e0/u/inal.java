public class inal implements c.h.m.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Lc/h/m/d<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.e0.u.d a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/e0/u/d<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.e0.u.g b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/e0/u/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final c.h.m.d c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/h/m/d<", */
/* "TT;>;", */
/* "Le/b/a/e0/u/d<", */
/* "TT;>;", */
/* "Le/b/a/e0/u/g<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.c = p1;
/* .line 3 */
this.a = p2;
/* .line 4 */
this.b = p3;
return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
final String v2 = "FactoryPools"; // const-string v2, "FactoryPools"
/* .line 3 */
v1 = android.util.Log .isLoggable ( v2,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Created new "; // const-string v3, "Created new "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,v1 );
/* .line 5 */
} // :cond_0
/* instance-of v1, v0, Le/b/a/e0/u/f; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
/* move-object v1, v0 */
/* check-cast v1, Le/b/a/e0/u/f; */
int v2 = 0; // const/4 v2, 0x0
(( e.b.a.e0.u.l ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/b/a/e0/u/l;->a(Z)V
} // :cond_1
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
/* .line 7 */
/* instance-of v0, p1, Le/b/a/e0/u/f; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
/* move-object v0, p1 */
/* check-cast v0, Le/b/a/e0/u/f; */
int v1 = 1; // const/4 v1, 0x1
(( e.b.a.e0.u.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/e0/u/l;->a(Z)V
/* .line 9 */
} // :cond_0
v0 = this.b;
/* .line 10 */
p1 = v0 = this.c;
} // .end method
