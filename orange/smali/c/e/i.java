public class c.e.i {
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
/* # static fields */
public static java.lang.Object e;
public static Integer f;
public static java.lang.Object g;
public static Integer h;
/* # instance fields */
public b;
public java.lang.Object c;
public Integer d;
/* # direct methods */
public c.e.i ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 v0 = c.e.e.a;
	 this.b = v0;
	 /* .line 3 */
	 v0 = c.e.e.c;
	 this.c = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
	 /* iput v0, p0, Lc/e/i;->d:I */
	 return;
} // .end method
public c.e.i ( ) {
	 /* .locals 0 */
	 /* .line 5 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* if-nez p1, :cond_0 */
	 /* .line 6 */
	 p1 = c.e.e.a;
	 this.b = p1;
	 /* .line 7 */
	 p1 = c.e.e.c;
	 this.c = p1;
	 /* .line 8 */
} // :cond_0
(( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(I)V
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
/* iput p1, p0, Lc/e/i;->d:I */
return;
} // .end method
public c.e.i ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/e/i<", */
/* "TK;TV;>;)V" */
/* } */
} // .end annotation
/* .line 10 */
/* invoke-direct {p0}, Lc/e/i;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 11 */
(( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Lc/e/i;)V
} // :cond_0
return;
} // .end method
public static Integer a ( Integer[] p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 1 */
try { // :try_start_0
p0 = c.e.e .a ( p0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2 */
/* :catch_0 */
/* new-instance p0, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p0 */
} // .end method
public static void a ( Integer[] p0, java.lang.Object[] p1, Integer p2 ) {
/* .locals 8 */
/* .line 40 */
/* const-class v0, Lc/e/i; */
/* array-length v1, p0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 2; // const/4 v3, 0x2
int v4 = 0; // const/4 v4, 0x0
/* const/16 v5, 0xa */
int v6 = 1; // const/4 v6, 0x1
/* const/16 v7, 0x8 */
/* if-ne v1, v7, :cond_2 */
/* .line 41 */
/* monitor-enter v0 */
/* .line 42 */
try { // :try_start_0
/* if-ge v1, v5, :cond_1 */
/* .line 43 */
v1 = c.e.i.g;
/* aput-object v1, p1, v4 */
/* .line 44 */
/* aput-object p0, p1, v6 */
/* shl-int/lit8 p0, p2, 0x1 */
/* sub-int/2addr p0, v6 */
} // :goto_0
/* if-lt p0, v3, :cond_0 */
/* .line 45 */
/* aput-object v2, p1, p0 */
/* add-int/lit8 p0, p0, -0x1 */
/* .line 46 */
} // :cond_0
/* .line 47 */
/* add-int/2addr p0, v6 */
/* .line 48 */
} // :cond_1
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
/* .line 49 */
} // :cond_2
/* array-length v1, p0 */
int v7 = 4; // const/4 v7, 0x4
/* if-ne v1, v7, :cond_5 */
/* .line 50 */
/* monitor-enter v0 */
/* .line 51 */
try { // :try_start_1
/* if-ge v1, v5, :cond_4 */
/* .line 52 */
v1 = c.e.i.e;
/* aput-object v1, p1, v4 */
/* .line 53 */
/* aput-object p0, p1, v6 */
/* shl-int/lit8 p0, p2, 0x1 */
/* sub-int/2addr p0, v6 */
} // :goto_1
/* if-lt p0, v3, :cond_3 */
/* .line 54 */
/* aput-object v2, p1, p0 */
/* add-int/lit8 p0, p0, -0x1 */
/* .line 55 */
} // :cond_3
/* .line 56 */
/* add-int/2addr p0, v6 */
/* .line 57 */
} // :cond_4
/* monitor-exit v0 */
/* :catchall_1 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* throw p0 */
} // :cond_5
} // :goto_2
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 5 */
/* .line 10 */
/* iget v0, p0, Lc/e/i;->d:I */
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* .line 11 */
} // :cond_0
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
v1 = c.e.i .a ( v1,v0,v2 );
/* if-gez v1, :cond_1 */
/* .line 12 */
} // :cond_1
v2 = this.c;
/* shl-int/lit8 v3, v1, 0x1 */
/* aget-object v2, v2, v3 */
/* if-nez v2, :cond_2 */
} // :cond_2
/* add-int/lit8 v2, v1, 0x1 */
} // :goto_0
/* if-ge v2, v0, :cond_4 */
/* .line 13 */
v3 = this.b;
/* aget v3, v3, v2 */
/* if-nez v3, :cond_4 */
/* .line 14 */
v3 = this.c;
/* shl-int/lit8 v4, v2, 0x1 */
/* aget-object v3, v3, v4 */
/* if-nez v3, :cond_3 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_1
/* if-ltz v1, :cond_6 */
/* .line 15 */
v0 = this.b;
/* aget v0, v0, v1 */
/* if-nez v0, :cond_6 */
/* .line 16 */
v0 = this.c;
/* shl-int/lit8 v3, v1, 0x1 */
/* aget-object v0, v0, v3 */
/* if-nez v0, :cond_5 */
} // :cond_5
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_6
/* not-int v0, v2 */
} // .end method
public Integer a ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* .line 58 */
p1 = (( c.e.i ) p0 ).a ( ); // invoke-virtual {p0}, Lc/e/i;->a()I
} // :cond_0
v0 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
p1 = (( c.e.i ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/e/i;->a(Ljava/lang/Object;I)I
} // :goto_0
} // .end method
public Integer a ( java.lang.Object p0, Integer p1 ) {
/* .locals 5 */
/* .line 3 */
/* iget v0, p0, Lc/e/i;->d:I */
/* if-nez v0, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 4 */
} // :cond_0
v1 = this.b;
v1 = c.e.i .a ( v1,v0,p2 );
/* if-gez v1, :cond_1 */
/* .line 5 */
} // :cond_1
v2 = this.c;
/* shl-int/lit8 v3, v1, 0x1 */
/* aget-object v2, v2, v3 */
v2 = (( java.lang.Object ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_2
/* add-int/lit8 v2, v1, 0x1 */
} // :goto_0
/* if-ge v2, v0, :cond_4 */
/* .line 6 */
v3 = this.b;
/* aget v3, v3, v2 */
/* if-ne v3, p2, :cond_4 */
/* .line 7 */
v3 = this.c;
/* shl-int/lit8 v4, v2, 0x1 */
/* aget-object v3, v3, v4 */
v3 = (( java.lang.Object ) p1 ).equals ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_1
/* if-ltz v1, :cond_6 */
/* .line 8 */
v0 = this.b;
/* aget v0, v0, v1 */
/* if-ne v0, p2, :cond_6 */
/* .line 9 */
v0 = this.c;
/* shl-int/lit8 v3, v1, 0x1 */
/* aget-object v0, v0, v3 */
v0 = (( java.lang.Object ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_5
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_6
/* not-int p1, v2 */
} // .end method
public java.lang.Object a ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(ITV;)TV;" */
/* } */
} // .end annotation
/* shl-int/lit8 p1, p1, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 59 */
v0 = this.c;
/* aget-object v1, v0, p1 */
/* .line 60 */
/* aput-object p2, v0, p1 */
} // .end method
public final void a ( Integer p0 ) {
/* .locals 5 */
/* .line 17 */
/* const-class v0, Lc/e/i; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const/16 v4, 0x8 */
/* if-ne p1, v4, :cond_1 */
/* .line 18 */
/* monitor-enter v0 */
/* .line 19 */
try { // :try_start_0
v4 = c.e.i.g;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 20 */
p1 = c.e.i.g;
/* .line 21 */
this.c = p1;
/* .line 22 */
/* aget-object v4, p1, v2 */
/* check-cast v4, [Ljava/lang/Object; */
/* .line 23 */
/* aget-object v4, p1, v3 */
/* check-cast v4, [I */
this.b = v4;
/* .line 24 */
/* aput-object v1, p1, v3 */
/* aput-object v1, p1, v2 */
/* .line 25 */
/* sub-int/2addr p1, v3 */
/* .line 26 */
/* monitor-exit v0 */
return;
/* .line 27 */
} // :cond_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_1
int v4 = 4; // const/4 v4, 0x4
/* if-ne p1, v4, :cond_3 */
/* .line 28 */
/* monitor-enter v0 */
/* .line 29 */
try { // :try_start_1
v4 = c.e.i.e;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 30 */
p1 = c.e.i.e;
/* .line 31 */
this.c = p1;
/* .line 32 */
/* aget-object v4, p1, v2 */
/* check-cast v4, [Ljava/lang/Object; */
/* .line 33 */
/* aget-object v4, p1, v3 */
/* check-cast v4, [I */
this.b = v4;
/* .line 34 */
/* aput-object v1, p1, v3 */
/* aput-object v1, p1, v2 */
/* .line 35 */
/* sub-int/2addr p1, v3 */
/* .line 36 */
/* monitor-exit v0 */
return;
/* .line 37 */
} // :cond_2
/* monitor-exit v0 */
/* :catchall_1 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* throw p1 */
/* .line 38 */
} // :cond_3
} // :goto_0
/* new-array v0, p1, [I */
this.b = v0;
/* shl-int/2addr p1, v3 */
/* .line 39 */
/* new-array p1, p1, [Ljava/lang/Object; */
this.c = p1;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/e/i<", */
/* "+TK;+TV;>;)V" */
/* } */
} // .end annotation
/* .line 61 */
/* iget v0, p1, Lc/e/i;->d:I */
/* .line 62 */
/* iget v1, p0, Lc/e/i;->d:I */
/* add-int/2addr v1, v0 */
(( c.e.i ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->b(I)V
/* .line 63 */
/* iget v1, p0, Lc/e/i;->d:I */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* if-lez v0, :cond_1 */
/* .line 64 */
v1 = this.b;
v3 = this.b;
java.lang.System .arraycopy ( v1,v2,v3,v2,v0 );
/* .line 65 */
p1 = this.c;
v1 = this.c;
/* shl-int/lit8 v3, v0, 0x1 */
java.lang.System .arraycopy ( p1,v2,v1,v2,v3 );
/* .line 66 */
/* iput v0, p0, Lc/e/i;->d:I */
} // :cond_0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 67 */
(( c.e.i ) p1 ).c ( v2 ); // invoke-virtual {p1, v2}, Lc/e/i;->c(I)Ljava/lang/Object;
(( c.e.i ) p1 ).e ( v2 ); // invoke-virtual {p1, v2}, Lc/e/i;->e(I)Ljava/lang/Object;
(( c.e.i ) p0 ).put ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // :goto_1
return;
} // .end method
public Integer b ( java.lang.Object p0 ) {
/* .locals 5 */
/* .line 11 */
/* iget v0, p0, Lc/e/i;->d:I */
/* mul-int/lit8 v0, v0, 0x2 */
/* .line 12 */
v1 = this.c;
int v2 = 1; // const/4 v2, 0x1
/* if-nez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :goto_0
/* if-ge p1, v0, :cond_3 */
/* .line 13 */
/* aget-object v3, v1, p1 */
/* if-nez v3, :cond_0 */
/* shr-int/2addr p1, v2 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x2 */
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :goto_1
/* if-ge v3, v0, :cond_3 */
/* .line 14 */
/* aget-object v4, v1, v3 */
v4 = (( java.lang.Object ) p1 ).equals ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* shr-int/lit8 p1, v3, 0x1 */
} // :cond_2
/* add-int/lit8 v3, v3, 0x2 */
} // :cond_3
int p1 = -1; // const/4 p1, -0x1
} // .end method
public void b ( Integer p0 ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lc/e/i;->d:I */
/* .line 2 */
v1 = this.b;
/* array-length v2, v1 */
/* if-ge v2, p1, :cond_1 */
/* .line 3 */
v2 = this.c;
/* .line 4 */
(( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(I)V
/* .line 5 */
/* iget p1, p0, Lc/e/i;->d:I */
/* if-lez p1, :cond_0 */
/* .line 6 */
p1 = this.b;
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( v1,v3,p1,v3,v0 );
/* .line 7 */
p1 = this.c;
/* shl-int/lit8 v4, v0, 0x1 */
java.lang.System .arraycopy ( v2,v3,p1,v3,v4 );
/* .line 8 */
} // :cond_0
c.e.i .a ( v1,v2,v0 );
/* .line 9 */
} // :cond_1
/* iget p1, p0, Lc/e/i;->d:I */
/* if-ne p1, v0, :cond_2 */
return;
/* .line 10 */
} // :cond_2
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // .end method
public java.lang.Object c ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TK;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* shl-int/lit8 p1, p1, 0x1 */
/* aget-object p1, v0, p1 */
} // .end method
public void clear ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lc/e/i;->d:I */
/* if-lez v0, :cond_0 */
/* .line 2 */
v1 = this.b;
/* .line 3 */
v2 = this.c;
/* .line 4 */
v3 = c.e.e.a;
this.b = v3;
/* .line 5 */
v3 = c.e.e.c;
this.c = v3;
int v3 = 0; // const/4 v3, 0x0
/* .line 6 */
/* iput v3, p0, Lc/e/i;->d:I */
/* .line 7 */
c.e.i .a ( v1,v2,v0 );
/* .line 8 */
} // :cond_0
/* iget v0, p0, Lc/e/i;->d:I */
/* if-gtz v0, :cond_1 */
return;
/* .line 9 */
} // :cond_1
/* new-instance v0, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw v0 */
} // .end method
public Boolean containsKey ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean containsValue ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( c.e.i ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->b(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.Object d ( Integer p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TV;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* shl-int/lit8 v1, p1, 0x1 */
/* add-int/lit8 v2, v1, 0x1 */
/* aget-object v2, v0, v2 */
/* .line 2 */
/* iget v3, p0, Lc/e/i;->d:I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* if-gt v3, v5, :cond_0 */
/* .line 3 */
p1 = this.b;
c.e.i .a ( p1,v0,v3 );
/* .line 4 */
p1 = c.e.e.a;
this.b = p1;
/* .line 5 */
p1 = c.e.e.c;
this.c = p1;
} // :cond_0
/* add-int/lit8 v0, v3, -0x1 */
/* .line 6 */
v6 = this.b;
/* array-length v7, v6 */
/* const/16 v8, 0x8 */
/* if-le v7, v8, :cond_4 */
/* array-length v6, v6 */
/* div-int/lit8 v6, v6, 0x3 */
/* if-ge v3, v6, :cond_4 */
/* if-le v3, v8, :cond_1 */
/* shr-int/lit8 v6, v3, 0x1 */
/* add-int v8, v3, v6 */
/* .line 7 */
} // :cond_1
v6 = this.b;
/* .line 8 */
v7 = this.c;
/* .line 9 */
(( c.e.i ) p0 ).a ( v8 ); // invoke-virtual {p0, v8}, Lc/e/i;->a(I)V
/* .line 10 */
/* iget v8, p0, Lc/e/i;->d:I */
/* if-ne v3, v8, :cond_3 */
/* if-lez p1, :cond_2 */
/* .line 11 */
v8 = this.b;
java.lang.System .arraycopy ( v6,v4,v8,v4,p1 );
/* .line 12 */
v8 = this.c;
java.lang.System .arraycopy ( v7,v4,v8,v4,v1 );
} // :cond_2
/* if-ge p1, v0, :cond_6 */
/* add-int/lit8 v4, p1, 0x1 */
/* .line 13 */
v8 = this.b;
/* sub-int v9, v0, p1 */
java.lang.System .arraycopy ( v6,v4,v8,p1,v9 );
/* shl-int/lit8 p1, v4, 0x1 */
/* .line 14 */
v4 = this.c;
/* shl-int/lit8 v5, v9, 0x1 */
java.lang.System .arraycopy ( v7,p1,v4,v1,v5 );
/* .line 15 */
} // :cond_3
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // :cond_4
/* if-ge p1, v0, :cond_5 */
/* .line 16 */
v4 = this.b;
/* add-int/lit8 v6, p1, 0x1 */
/* sub-int v7, v0, p1 */
java.lang.System .arraycopy ( v4,v6,v4,p1,v7 );
/* .line 17 */
p1 = this.c;
/* shl-int/lit8 v4, v6, 0x1 */
/* shl-int/lit8 v6, v7, 0x1 */
java.lang.System .arraycopy ( p1,v4,p1,v1,v6 );
/* .line 18 */
} // :cond_5
p1 = this.c;
/* shl-int/lit8 v1, v0, 0x1 */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v4, p1, v1 */
/* add-int/2addr v1, v5 */
/* .line 19 */
/* aput-object v4, p1, v1 */
} // :cond_6
} // :goto_0
/* move v4, v0 */
/* .line 20 */
} // :goto_1
/* iget p1, p0, Lc/e/i;->d:I */
/* if-ne v3, p1, :cond_7 */
/* .line 21 */
/* iput v4, p0, Lc/e/i;->d:I */
/* .line 22 */
} // :cond_7
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // .end method
public java.lang.Object e ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TV;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* shl-int/lit8 p1, p1, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
/* aget-object p1, v0, p1 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lc/e/i; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 2 */
/* check-cast p1, Lc/e/i; */
/* .line 3 */
v1 = (( c.e.i ) p0 ).size ( ); // invoke-virtual {p0}, Lc/e/i;->size()I
v3 = (( c.e.i ) p1 ).size ( ); // invoke-virtual {p1}, Lc/e/i;->size()I
/* if-eq v1, v3, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
try { // :try_start_0
/* iget v3, p0, Lc/e/i;->d:I */
/* if-ge v1, v3, :cond_5 */
/* .line 5 */
(( c.e.i ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->c(I)Ljava/lang/Object;
/* .line 6 */
(( c.e.i ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* .line 7 */
(( c.e.i ) p1 ).get ( v3 ); // invoke-virtual {p1, v3}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v4, :cond_3 */
/* if-nez v5, :cond_2 */
/* .line 8 */
v3 = (( c.e.i ) p1 ).containsKey ( v3 ); // invoke-virtual {p1, v3}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z
/* if-nez v3, :cond_4 */
} // :cond_2
/* .line 9 */
} // :cond_3
v3 = (( java.lang.Object ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v3, :cond_4 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_5
/* :catch_0 */
/* .line 10 */
} // :cond_6
/* instance-of v1, p1, Ljava/util/Map; */
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 11 */
/* check-cast p1, Ljava/util/Map; */
/* .line 12 */
v3 = v1 = (( c.e.i ) p0 ).size ( ); // invoke-virtual {p0}, Lc/e/i;->size()I
/* if-eq v1, v3, :cond_7 */
} // :cond_7
int v1 = 0; // const/4 v1, 0x0
/* .line 13 */
} // :goto_1
try { // :try_start_1
/* iget v3, p0, Lc/e/i;->d:I */
/* if-ge v1, v3, :cond_b */
/* .line 14 */
(( c.e.i ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->c(I)Ljava/lang/Object;
/* .line 15 */
(( c.e.i ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* .line 16 */
/* if-nez v4, :cond_9 */
/* if-nez v5, :cond_8 */
v3 = /* .line 17 */
/* if-nez v3, :cond_a */
} // :cond_8
/* .line 18 */
} // :cond_9
v3 = (( java.lang.Object ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catch Ljava/lang/NullPointerException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/ClassCastException; {:try_start_1 ..:try_end_1} :catch_1 */
/* if-nez v3, :cond_a */
} // :cond_a
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_b
/* :catch_1 */
} // :cond_c
} // .end method
public java.lang.Object get ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")TV;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( c.e.i ) p0 ).getOrDefault ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/e/i;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.Object getOrDefault ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
p1 = (( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
/* .line 2 */
p2 = this.c;
/* shl-int/lit8 p1, p1, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
/* aget-object p2, p2, p1 */
} // :cond_0
} // .end method
public Integer hashCode ( ) {
/* .locals 9 */
/* .line 1 */
v0 = this.b;
/* .line 2 */
v1 = this.c;
/* .line 3 */
/* iget v2, p0, Lc/e/i;->d:I */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v5, v2, :cond_1 */
/* .line 4 */
/* aget-object v7, v1, v3 */
/* .line 5 */
/* aget v8, v0, v5 */
/* if-nez v7, :cond_0 */
int v7 = 0; // const/4 v7, 0x0
} // :cond_0
v7 = (( java.lang.Object ) v7 ).hashCode ( ); // invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I
} // :goto_1
/* xor-int/2addr v7, v8 */
/* add-int/2addr v6, v7 */
/* add-int/lit8 v5, v5, 0x1 */
/* add-int/lit8 v3, v3, 0x2 */
} // :cond_1
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/e/i;->d:I */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.Object put ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/e/i;->d:I */
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
v2 = (( c.e.i ) p0 ).a ( ); // invoke-virtual {p0}, Lc/e/i;->a()I
int v3 = 0; // const/4 v3, 0x0
/* .line 3 */
} // :cond_0
v2 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
/* .line 4 */
v3 = (( c.e.i ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lc/e/i;->a(Ljava/lang/Object;I)I
/* move v8, v3 */
/* move v3, v2 */
/* move v2, v8 */
} // :goto_0
/* if-ltz v2, :cond_1 */
/* shl-int/lit8 p1, v2, 0x1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 5 */
v0 = this.c;
/* aget-object v1, v0, p1 */
/* .line 6 */
/* aput-object p2, v0, p1 */
} // :cond_1
/* not-int v2, v2 */
/* .line 7 */
v4 = this.b;
/* array-length v4, v4 */
/* if-lt v0, v4, :cond_6 */
int v4 = 4; // const/4 v4, 0x4
/* const/16 v5, 0x8 */
/* if-lt v0, v5, :cond_2 */
/* shr-int/lit8 v4, v0, 0x1 */
/* add-int/2addr v4, v0 */
} // :cond_2
/* if-lt v0, v4, :cond_3 */
/* const/16 v4, 0x8 */
/* .line 8 */
} // :cond_3
} // :goto_1
v5 = this.b;
/* .line 9 */
v6 = this.c;
/* .line 10 */
(( c.e.i ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Lc/e/i;->a(I)V
/* .line 11 */
/* iget v4, p0, Lc/e/i;->d:I */
/* if-ne v0, v4, :cond_5 */
/* .line 12 */
v4 = this.b;
/* array-length v7, v4 */
/* if-lez v7, :cond_4 */
/* .line 13 */
/* array-length v7, v5 */
java.lang.System .arraycopy ( v5,v1,v4,v1,v7 );
/* .line 14 */
v4 = this.c;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v1,v4,v1,v7 );
/* .line 15 */
} // :cond_4
c.e.i .a ( v5,v6,v0 );
/* .line 16 */
} // :cond_5
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // :cond_6
} // :goto_2
/* if-ge v2, v0, :cond_7 */
/* .line 17 */
v1 = this.b;
/* add-int/lit8 v4, v2, 0x1 */
/* sub-int v5, v0, v2 */
java.lang.System .arraycopy ( v1,v2,v1,v4,v5 );
/* .line 18 */
v1 = this.c;
/* shl-int/lit8 v5, v2, 0x1 */
/* shl-int/lit8 v4, v4, 0x1 */
/* iget v6, p0, Lc/e/i;->d:I */
/* sub-int/2addr v6, v2 */
/* shl-int/lit8 v6, v6, 0x1 */
java.lang.System .arraycopy ( v1,v5,v1,v4,v6 );
/* .line 19 */
} // :cond_7
/* iget v1, p0, Lc/e/i;->d:I */
/* if-ne v0, v1, :cond_8 */
v0 = this.b;
/* array-length v4, v0 */
/* if-ge v2, v4, :cond_8 */
/* .line 20 */
/* aput v3, v0, v2 */
/* .line 21 */
v0 = this.c;
/* shl-int/lit8 v2, v2, 0x1 */
/* aput-object p1, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 22 */
/* aput-object p2, v0, v2 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 23 */
/* iput v1, p0, Lc/e/i;->d:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 24 */
} // :cond_8
/* new-instance p1, Ljava/util/ConcurrentModificationException; */
/* invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V */
/* throw p1 */
} // .end method
public java.lang.Object putIfAbsent ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.e.i ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v0, :cond_0 */
/* .line 2 */
(( c.e.i ) p0 ).put ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // .end method
public java.lang.Object remove ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")TV;" */
/* } */
} // .end annotation
/* .line 1 */
p1 = (( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
/* .line 2 */
(( c.e.i ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->d(I)Ljava/lang/Object;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean remove ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .line 3 */
p1 = (( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_1 */
/* .line 4 */
(( c.e.i ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* if-eq p2, v0, :cond_0 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
p2 = (( java.lang.Object ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 6 */
} // :cond_0
(( c.e.i ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->d(I)Ljava/lang/Object;
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.Object replace ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
p1 = (( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
/* .line 2 */
(( c.e.i ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/e/i;->a(ILjava/lang/Object;)Ljava/lang/Object;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean replace ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;TV;)Z" */
/* } */
} // .end annotation
/* .line 3 */
p1 = (( c.e.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
/* if-ltz p1, :cond_1 */
/* .line 4 */
(( c.e.i ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* if-eq v0, p2, :cond_0 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
p2 = (( java.lang.Object ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 6 */
} // :cond_0
(( c.e.i ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lc/e/i;->a(ILjava/lang/Object;)Ljava/lang/Object;
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/e/i;->d:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( c.e.i ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lc/e/i;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "{}"; // const-string v0, "{}"
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* iget v1, p0, Lc/e/i;->d:I */
/* mul-int/lit8 v1, v1, 0x1c */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* const/16 v1, 0x7b */
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
/* iget v2, p0, Lc/e/i;->d:I */
/* if-ge v1, v2, :cond_4 */
/* if-lez v1, :cond_1 */
final String v2 = ", "; // const-string v2, ", "
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
} // :cond_1
(( c.e.i ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->c(I)Ljava/lang/Object;
final String v3 = "(this Map)"; // const-string v3, "(this Map)"
/* if-eq v2, p0, :cond_2 */
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 8 */
} // :cond_2
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_1
/* const/16 v2, 0x3d */
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 10 */
(( c.e.i ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* if-eq v2, p0, :cond_3 */
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 12 */
} // :cond_3
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
/* const/16 v1, 0x7d */
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 14 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
