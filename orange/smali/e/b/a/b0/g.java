public class e.b.a.b0.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List<", */
/* "Le/b/a/b0/f<", */
/* "**>;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.b0.g ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public synchronized java.util.List a ( java.lang.Class p0, java.lang.Class p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* "R:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Ljava/lang/Class<", */
/* "TR;>;)", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/t<", */
/* "TT;TR;>;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 9 */
try { // :try_start_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 10 */
v1 = this.a;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Ljava/lang/String; */
/* .line 11 */
v3 = this.b;
/* check-cast v2, Ljava/util/List; */
/* if-nez v2, :cond_1 */
/* .line 12 */
} // :cond_1
} // :cond_2
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Le/b/a/b0/f; */
/* .line 13 */
v4 = (( e.b.a.b0.f ) v3 ).a ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Le/b/a/b0/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 14 */
v3 = this.c;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 15 */
} // :cond_3
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized final java.util.List a ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/b/a/b0/f<", */
/* "**>;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 18 */
try { // :try_start_0
v0 = v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 19 */
v0 = this.a;
/* .line 20 */
} // :cond_0
v0 = this.b;
/* check-cast v0, Ljava/util/List; */
/* if-nez v0, :cond_1 */
/* .line 21 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 22 */
v1 = this.b;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 23 */
} // :cond_1
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( java.lang.String p0, Object p1, java.lang.Class p2, java.lang.Class p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* "R:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "Le/b/a/y/t<", */
/* "TT;TR;>;", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Ljava/lang/Class<", */
/* "TR;>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 16 */
try { // :try_start_0
(( e.b.a.b0.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/b0/g;->a(Ljava/lang/String;)Ljava/util/List;
/* new-instance v0, Le/b/a/b0/f; */
/* invoke-direct {v0, p3, p4, p2}, Le/b/a/b0/f;-><init>(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 17 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.a;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 2 */
v1 = this.a;
/* .line 3 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Ljava/lang/String; */
/* .line 4 */
v3 = this.a;
/* .line 5 */
} // :cond_0
} // :cond_1
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Ljava/lang/String; */
v2 = /* .line 6 */
/* if-nez v2, :cond_1 */
/* .line 7 */
v2 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 8 */
} // :cond_2
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized java.util.List b ( java.lang.Class p0, java.lang.Class p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* "R:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Ljava/lang/Class<", */
/* "TR;>;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Class<", */
/* "TR;>;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
v1 = this.a;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Ljava/lang/String; */
/* .line 3 */
v3 = this.b;
/* check-cast v2, Ljava/util/List; */
/* if-nez v2, :cond_1 */
/* .line 4 */
} // :cond_1
} // :cond_2
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Le/b/a/b0/f; */
/* .line 5 */
v4 = (( e.b.a.b0.f ) v3 ).a ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Le/b/a/b0/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
v4 = this.b;
v4 = /* .line 6 */
/* if-nez v4, :cond_2 */
/* .line 7 */
v3 = this.b;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 8 */
} // :cond_3
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
