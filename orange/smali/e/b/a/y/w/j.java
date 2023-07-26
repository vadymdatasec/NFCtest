public class e.b.a.y.w.j {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.b.a.y.w.f b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/w/f<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Le/b/a/y/w/f<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.w.j ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/y/w/h; */
/* invoke-direct {v0}, Le/b/a/y/w/h;-><init>()V */
return;
} // .end method
public e.b.a.y.w.j ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public synchronized e.b.a.y.w.g a ( java.lang.Object p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;)", */
/* "Le/b/a/y/w/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
e.b.a.e0.r .a ( p1 );
/* .line 4 */
v0 = this.a;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* check-cast v0, Le/b/a/y/w/f; */
/* if-nez v0, :cond_1 */
/* .line 5 */
v1 = this.a;
v2 = } // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/b/a/y/w/f; */
/* .line 6 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v3 = (( java.lang.Class ) v3 ).isAssignableFrom ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* move-object v0, v2 */
} // :cond_1
/* if-nez v0, :cond_2 */
/* .line 7 */
v0 = e.b.a.y.w.j.b;
/* .line 8 */
} // :cond_2
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/w/f<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
