public class e.b.a.y.y.c1 implements e.b.a.y.y.w0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Model:", */
	 /* "Ljava/lang/Object;", */
	 /* "Data:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/w0<", */
	 /* "TModel;TData;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.List a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TModel;TData;>;>;" */
/* } */
} // .end annotation
} // .end field
public final c.h.m.d b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.y.c1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TModel;TData;>;>;", */
/* "Lc/h/m/d<", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Throwable;", */
/* ">;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TModel;II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/y/v0<", */
/* "TData;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = v0 = this.a;
/* .line 2 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move-object v4, v2 */
} // :goto_0
/* if-ge v3, v0, :cond_1 */
/* .line 3 */
v5 = this.a;
/* check-cast v5, Le/b/a/y/y/w0; */
v6 = /* .line 4 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 5 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 6 */
v4 = this.a;
/* .line 7 */
v5 = this.c;
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
/* .line 8 */
p1 = } // :cond_1
/* if-nez p1, :cond_2 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 9 */
/* new-instance v2, Le/b/a/y/y/v0; */
/* new-instance p1, Le/b/a/y/y/b1; */
p2 = this.b;
/* invoke-direct {p1, v1, p2}, Le/b/a/y/y/b1;-><init>(Ljava/util/List;Lc/h/m/d;)V */
/* invoke-direct {v2, v4, p1}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V */
} // :cond_2
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TModel;)Z" */
/* } */
} // .end annotation
/* .line 10 */
v0 = this.a;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/b/a/y/y/w0; */
v1 = /* .line 11 */
if ( v1 != null) { // if-eqz v1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "MultiModelLoader{modelLoaders="; // const-string v1, "MultiModelLoader{modelLoaders="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
java.util.Arrays .toString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
