public class e.a.a.c0.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.Comparator e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Comparator<", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final java.util.List a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "[B>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "[B>;" */
/* } */
} // .end annotation
} // .end field
public Integer c;
public final Integer d;
/* # direct methods */
public static e.a.a.c0.d ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/a/a/c0/c; */
/* invoke-direct {v0}, Le/a/a/c0/c;-><init>()V */
return;
} // .end method
public e.a.a.c0.d ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* const/16 v1, 0x40 */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Le/a/a/c0/d;->c:I */
/* .line 5 */
/* iput p1, p0, Le/a/a/c0/d;->d:I */
return;
} // .end method
/* # virtual methods */
public synchronized final void a ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 17 */
} // :goto_0
try { // :try_start_0
/* iget v0, p0, Le/a/a/c0/d;->c:I */
/* iget v1, p0, Le/a/a/c0/d;->d:I */
/* if-le v0, v1, :cond_0 */
/* .line 18 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, [B */
/* .line 19 */
v1 = this.b;
/* .line 20 */
/* iget v1, p0, Le/a/a/c0/d;->c:I */
/* array-length v0, v0 */
/* sub-int/2addr v1, v0 */
/* iput v1, p0, Le/a/a/c0/d;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 21 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( Object[] p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 9 */
try { // :try_start_0
/* array-length v0, p1 */
/* iget v1, p0, Le/a/a/c0/d;->d:I */
/* if-le v0, v1, :cond_0 */
/* .line 10 */
} // :cond_0
v0 = this.a;
/* .line 11 */
v0 = this.b;
v1 = e.a.a.c0.d.e;
v0 = java.util.Collections .binarySearch ( v0,p1,v1 );
/* if-gez v0, :cond_1 */
/* neg-int v0, v0 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 12 */
} // :cond_1
v1 = this.b;
/* .line 13 */
/* iget v0, p0, Le/a/a/c0/d;->c:I */
/* array-length p1, p1 */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Le/a/a/c0/d;->c:I */
/* .line 14 */
(( e.a.a.c0.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/a/a/c0/d;->a()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 15 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
/* .line 16 */
} // :cond_2
} // :goto_0
/* monitor-exit p0 */
return;
} // .end method
public synchronized a ( Integer p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
try { // :try_start_0
v1 = v1 = this.b;
/* if-ge v0, v1, :cond_1 */
/* .line 2 */
v1 = this.b;
/* check-cast v1, [B */
/* .line 3 */
/* array-length v2, v1 */
/* if-lt v2, p1, :cond_0 */
/* .line 4 */
/* iget p1, p0, Le/a/a/c0/d;->c:I */
/* array-length v2, v1 */
/* sub-int/2addr p1, v2 */
/* iput p1, p0, Le/a/a/c0/d;->c:I */
/* .line 5 */
p1 = this.b;
/* .line 6 */
p1 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
/* monitor-exit p0 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 8 */
} // :cond_1
try { // :try_start_1
/* new-array p1, p1, [B */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
