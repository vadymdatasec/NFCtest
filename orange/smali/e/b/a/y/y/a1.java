public class e.b.a.y.y.a1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.b.a.y.y.g1 a;
	 public final e.b.a.y.y.z0 b;
	 /* # direct methods */
	 public e.b.a.y.y.a1 ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lc/h/m/d<", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/Throwable;", */
		 /* ">;>;)V" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/y/y/g1; */
	 /* invoke-direct {v0, p1}, Le/b/a/y/y/g1;-><init>(Lc/h/m/d;)V */
	 /* invoke-direct {p0, v0}, Le/b/a/y/y/a1;-><init>(Le/b/a/y/y/g1;)V */
	 return;
} // .end method
public e.b.a.y.y.a1 ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 3 */
	 /* new-instance v0, Le/b/a/y/y/z0; */
	 /* invoke-direct {v0}, Le/b/a/y/y/z0;-><init>()V */
	 this.b = v0;
	 /* .line 4 */
	 this.a = p1;
	 return;
} // .end method
public static java.lang.Class b ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<A:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TA;)", */
	 /* "Ljava/lang/Class<", */
	 /* "TA;>;" */
	 /* } */
} // .end annotation
/* .line 5 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
} // .end method
/* # virtual methods */
public synchronized java.util.List a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Class<", */
/* "*>;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 15 */
try { // :try_start_0
v0 = this.a;
(( e.b.a.y.y.g1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/y/g1;->b(Ljava/lang/Class;)Ljava/util/List;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public java.util.List a ( java.lang.Object p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<A:", */
/* "Ljava/lang/Object;", */
/* ">(TA;)", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TA;*>;>;" */
/* } */
} // .end annotation
/* .line 4 */
e.b.a.y.y.a1 .b ( p1 );
(( e.b.a.y.y.a1 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/y/y/a1;->b(Ljava/lang/Class;)Ljava/util/List;
v1 = /* .line 5 */
/* if-nez v1, :cond_4 */
v1 = /* .line 6 */
/* .line 7 */
java.util.Collections .emptyList ( );
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v1, :cond_2 */
/* .line 8 */
/* check-cast v6, Le/b/a/y/y/w0; */
v7 = /* .line 9 */
if ( v7 != null) { // if-eqz v7, :cond_1
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 10 */
/* new-instance v2, Ljava/util/ArrayList; */
/* sub-int v4, v1, v5 */
/* invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V */
int v4 = 0; // const/4 v4, 0x0
/* .line 11 */
} // :cond_0
} // :cond_1
/* add-int/lit8 v5, v5, 0x1 */
/* .line 12 */
v1 = } // :cond_2
/* if-nez v1, :cond_3 */
/* .line 13 */
} // :cond_3
/* new-instance v1, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException; */
/* invoke-direct {v1, p1, v0}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Object;Ljava/util/List;)V */
/* throw v1 */
/* .line 14 */
} // :cond_4
/* new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException; */
/* invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Object;)V */
/* throw v0 */
} // .end method
public synchronized void a ( java.lang.Class p0, java.lang.Class p1, e.b.a.y.y.x0 p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Model:", */
/* "Ljava/lang/Object;", */
/* "Data:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TModel;>;", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Le/b/a/y/y/x0<", */
/* "+TModel;+TData;>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
(( e.b.a.y.y.g1 ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)V
/* .line 2 */
p1 = this.b;
(( e.b.a.y.y.z0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/b/a/y/y/z0;->a()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized final java.util.List b ( java.lang.Class p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<A:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TA;>;)", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TA;*>;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
(( e.b.a.y.y.z0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/y/z0;->a(Ljava/lang/Class;)Ljava/util/List;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.a;
(( e.b.a.y.y.g1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;)Ljava/util/List;
java.util.Collections .unmodifiableList ( v0 );
/* .line 3 */
v1 = this.b;
(( e.b.a.y.y.z0 ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Le/b/a/y/y/z0;->a(Ljava/lang/Class;Ljava/util/List;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
