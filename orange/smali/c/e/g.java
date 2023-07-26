public class c.e.g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.LinkedHashMap a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashMap<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
public Integer b;
public Integer c;
public Integer d;
public Integer e;
public Integer f;
public Integer g;
public Integer h;
/* # direct methods */
public c.e.g ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* if-lez p1, :cond_0 */
/* .line 2 */
/* iput p1, p0, Lc/e/g;->c:I */
/* .line 3 */
/* new-instance p1, Ljava/util/LinkedHashMap; */
int v0 = 0; // const/4 v0, 0x0
/* const/high16 v1, 0x3f400000 # 0.75f */
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {p1, v0, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V */
this.a = p1;
return;
/* .line 4 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "maxSize <= 0"; // const-string v0, "maxSize <= 0"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_2
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
/* iget v0, p0, Lc/e/g;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/e/g;->d:I */
/* .line 3 */
/* iget v0, p0, Lc/e/g;->b:I */
v1 = (( c.e.g ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/e/g;->b(Ljava/lang/Object;Ljava/lang/Object;)I
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lc/e/g;->b:I */
/* .line 4 */
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* iget v1, p0, Lc/e/g;->b:I */
v2 = (( c.e.g ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/e/g;->b(Ljava/lang/Object;Ljava/lang/Object;)I
/* sub-int/2addr v1, v2 */
/* iput v1, p0, Lc/e/g;->b:I */
/* .line 6 */
} // :cond_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
(( c.e.g ) p0 ).a ( v1, p1, v0, p2 ); // invoke-virtual {p0, v1, p1, v0, p2}, Lc/e/g;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 8 */
} // :cond_1
/* iget p1, p0, Lc/e/g;->c:I */
(( c.e.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/g;->a(I)V
/* :catchall_0 */
/* move-exception p1 */
/* .line 9 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
/* .line 10 */
} // :cond_2
/* new-instance p1, Ljava/lang/NullPointerException; */
final String p2 = "key == null || value == null"; // const-string p2, "key == null || value == null"
/* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( Integer p0 ) {
/* .locals 4 */
/* .line 11 */
} // :goto_0
/* monitor-enter p0 */
/* .line 12 */
try { // :try_start_0
/* iget v0, p0, Lc/e/g;->b:I */
/* if-ltz v0, :cond_3 */
v0 = this.a;
v0 = (( java.util.LinkedHashMap ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lc/e/g;->b:I */
/* if-nez v0, :cond_3 */
/* .line 13 */
} // :cond_0
/* iget v0, p0, Lc/e/g;->b:I */
/* if-le v0, p1, :cond_2 */
v0 = this.a;
v0 = (( java.util.LinkedHashMap ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 14 */
} // :cond_1
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).entrySet ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 15 */
/* .line 16 */
/* .line 17 */
v2 = this.a;
(( java.util.LinkedHashMap ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 18 */
/* iget v2, p0, Lc/e/g;->b:I */
v3 = (( c.e.g ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lc/e/g;->b(Ljava/lang/Object;Ljava/lang/Object;)I
/* sub-int/2addr v2, v3 */
/* iput v2, p0, Lc/e/g;->b:I */
/* .line 19 */
/* iget v2, p0, Lc/e/g;->f:I */
int v3 = 1; // const/4 v3, 0x1
/* add-int/2addr v2, v3 */
/* iput v2, p0, Lc/e/g;->f:I */
/* .line 20 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 21 */
(( c.e.g ) p0 ).a ( v3, v1, v0, v2 ); // invoke-virtual {p0, v3, v1, v0, v2}, Lc/e/g;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 22 */
} // :cond_2
} // :goto_1
try { // :try_start_1
/* monitor-exit p0 */
return;
/* .line 23 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ".sizeOf() is reporting inconsistent results!"; // const-string v1, ".sizeOf() is reporting inconsistent results!"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 24 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( Boolean p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(ZTK;TV;TV;)V" */
/* } */
} // .end annotation
return;
} // .end method
public final Integer b ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)I" */
/* } */
} // .end annotation
/* .line 19 */
v0 = (( c.e.g ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/e/g;->c(Ljava/lang/Object;Ljava/lang/Object;)I
/* if-ltz v0, :cond_0 */
/* .line 20 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Negative size: "; // const-string v2, "Negative size: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = "="; // const-string p1, "="
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final java.lang.Object b ( java.lang.Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = this.a;
(( java.util.LinkedHashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* iget p1, p0, Lc/e/g;->g:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lc/e/g;->g:I */
/* .line 4 */
/* monitor-exit p0 */
/* .line 5 */
} // :cond_0
/* iget v0, p0, Lc/e/g;->h:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/e/g;->h:I */
/* .line 6 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 7 */
(( c.e.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v0, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
} // :cond_1
/* monitor-enter p0 */
/* .line 9 */
try { // :try_start_1
/* iget v1, p0, Lc/e/g;->e:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lc/e/g;->e:I */
/* .line 10 */
v1 = this.a;
(( java.util.LinkedHashMap ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 11 */
v2 = this.a;
(( java.util.LinkedHashMap ) v2 ).put ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 12 */
} // :cond_2
/* iget v2, p0, Lc/e/g;->b:I */
v3 = (( c.e.g ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/e/g;->b(Ljava/lang/Object;Ljava/lang/Object;)I
/* add-int/2addr v2, v3 */
/* iput v2, p0, Lc/e/g;->b:I */
/* .line 13 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 0; // const/4 v2, 0x0
/* .line 14 */
(( c.e.g ) p0 ).a ( v2, p1, v0, v1 ); // invoke-virtual {p0, v2, p1, v0, v1}, Lc/e/g;->a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 15 */
} // :cond_3
/* iget p1, p0, Lc/e/g;->c:I */
(( c.e.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/g;->a(I)V
/* :catchall_0 */
/* move-exception p1 */
/* .line 16 */
try { // :try_start_2
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw p1 */
/* :catchall_1 */
/* move-exception p1 */
/* .line 17 */
try { // :try_start_3
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* throw p1 */
/* .line 18 */
} // :cond_4
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "key == null"; // const-string v0, "key == null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Integer c ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)I" */
/* } */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
} // .end method
public synchronized final java.lang.String toString ( ) {
/* .locals 6 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget v0, p0, Lc/e/g;->g:I */
/* iget v1, p0, Lc/e/g;->h:I */
/* add-int/2addr v0, v1 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v2, p0, Lc/e/g;->g:I */
/* mul-int/lit8 v2, v2, 0x64 */
/* div-int/2addr v2, v0 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
} // :goto_0
v0 = java.util.Locale.US;
final String v3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"; // const-string v3, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
int v4 = 4; // const/4 v4, 0x4
/* new-array v4, v4, [Ljava/lang/Object; */
/* iget v5, p0, Lc/e/g;->c:I */
/* .line 4 */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v4, v1 */
int v1 = 1; // const/4 v1, 0x1
/* iget v5, p0, Lc/e/g;->g:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v4, v1 */
int v1 = 2; // const/4 v1, 0x2
/* iget v5, p0, Lc/e/g;->h:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v4, v1 */
int v1 = 3; // const/4 v1, 0x3
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v4, v1 */
/* .line 5 */
java.lang.String .format ( v0,v3,v4 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
