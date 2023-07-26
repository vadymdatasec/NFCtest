public abstract class e.f.b.b.u extends java.util.concurrent.locks.ReentrantLock {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* "E::", */
	 /* "Le/f/b/b/r<", */
	 /* "TK;TV;TE;>;S:", */
	 /* "Le/f/b/b/u<", */
	 /* "TK;TV;TE;TS;>;>", */
	 /* "Ljava/util/concurrent/locks/ReentrantLock;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.b.b.q b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/q<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
} // .end field
public volatile Integer c;
public Integer d;
public Integer e;
public volatile java.util.concurrent.atomic.AtomicReferenceArray f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/atomic/AtomicReferenceArray<", */
/* "TE;>;" */
/* } */
} // .end annotation
} // .end field
public final Integer g;
public final java.util.concurrent.atomic.AtomicInteger h;
/* # direct methods */
public e.f.b.b.u ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/b/b/q<", */
/* "TK;TV;TE;TS;>;II)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V */
this.h = v0;
/* .line 3 */
this.b = p1;
/* .line 4 */
/* iput p3, p0, Le/f/b/b/u;->g:I */
/* .line 5 */
(( e.f.b.b.u ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/f/b/b/u;->b(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;
(( e.f.b.b.u ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/u;->a(Ljava/util/concurrent/atomic/AtomicReferenceArray;)V
return;
} // .end method
public static Boolean b ( Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* "E::", */
/* "Le/f/b/b/r<", */
/* "TK;TV;TE;>;>(TE;)Z" */
/* } */
} // .end annotation
/* .line 58 */
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public e.f.b.b.r a ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TE;" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.f;
/* .line 9 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* add-int/lit8 v1, v1, -0x1 */
/* and-int/2addr p1, v1 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast p1, Le/f/b/b/r; */
} // .end method
public e.f.b.b.r a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;TE;)TE;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
v0 = this.g;
(( e.f.b.b.u ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/b/b/u;->i()Le/f/b/b/u;
} // .end method
public java.lang.Object a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;)TV;" */
/* } */
} // .end annotation
/* .line 128 */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 129 */
(( e.f.b.b.u ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/b/b/u;->j()V
/* .line 130 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 131 */
(( e.f.b.b.u ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/b/b/u;->j()V
} // :cond_1
} // .end method
public java.lang.Object a ( java.lang.Object p0, Integer p1, java.lang.Object p2, Boolean p3 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;ITV;Z)TV;" */
/* } */
} // .end annotation
/* .line 15 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 16 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/b/b/u;->f()V
/* .line 17 */
/* iget v0, p0, Le/f/b/b/u;->c:I */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 18 */
/* iget v1, p0, Le/f/b/b/u;->e:I */
/* if-le v0, v1, :cond_0 */
/* .line 19 */
(( e.f.b.b.u ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/b/b/u;->b()V
/* .line 20 */
/* iget v0, p0, Le/f/b/b/u;->c:I */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 21 */
} // :cond_0
v1 = this.f;
/* .line 22 */
v2 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* add-int/lit8 v2, v2, -0x1 */
/* and-int/2addr v2, p2 */
/* .line 23 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v3, Le/f/b/b/r; */
/* move-object v4, v3 */
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 24 */
v7 = /* .line 25 */
/* if-ne v7, p2, :cond_3 */
if ( v6 != null) { // if-eqz v6, :cond_3
v7 = this.b;
v7 = this.f;
/* .line 26 */
v6 = (( e.f.b.a.d ) v7 ).b ( p1, v6 ); // invoke-virtual {v7, p1, v6}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 27 */
/* if-nez p1, :cond_1 */
/* .line 28 */
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 29 */
(( e.f.b.b.u ) p0 ).a ( v4, p3 ); // invoke-virtual {p0, v4, p3}, Le/f/b/b/u;->a(Le/f/b/b/r;Ljava/lang/Object;)V
/* .line 30 */
/* iget p1, p0, Le/f/b/b/u;->c:I */
/* .line 31 */
/* iput p1, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 32 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
} // :cond_1
if ( p4 != null) { // if-eqz p4, :cond_2
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 33 */
} // :cond_2
try { // :try_start_1
/* iget p2, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 p2, p2, 0x1 */
/* iput p2, p0, Le/f/b/b/u;->d:I */
/* .line 34 */
(( e.f.b.b.u ) p0 ).a ( v4, p3 ); // invoke-virtual {p0, v4, p3}, Le/f/b/b/u;->a(Le/f/b/b/r;Ljava/lang/Object;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 35 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 36 */
} // :cond_3
try { // :try_start_2
/* .line 37 */
} // :cond_4
/* iget p4, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 p4, p4, 0x1 */
/* iput p4, p0, Le/f/b/b/u;->d:I */
/* .line 38 */
p4 = this.b;
p4 = this.g;
(( e.f.b.b.u ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/b/b/u;->i()Le/f/b/b/u;
/* .line 39 */
(( e.f.b.b.u ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/f/b/b/u;->a(Le/f/b/b/r;Ljava/lang/Object;)V
/* .line 40 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v1 ).set ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 41 */
/* iput v0, p0, Le/f/b/b/u;->c:I */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 42 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 43 */
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 4 */
/* .line 87 */
/* iget v0, p0, Le/f/b/b/u;->c:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 88 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 89 */
try { // :try_start_0
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 90 */
} // :goto_0
v3 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* if-ge v2, v3, :cond_0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 91 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* add-int/lit8 v2, v2, 0x1 */
/* .line 92 */
} // :cond_0
(( e.f.b.b.u ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/b/b/u;->c()V
/* .line 93 */
v0 = this.h;
(( java.util.concurrent.atomic.AtomicInteger ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
/* .line 94 */
/* iget v0, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Le/f/b/b/u;->d:I */
/* .line 95 */
/* iput v1, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 96 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception v0 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 97 */
/* throw v0 */
} // :cond_1
} // :goto_1
return;
} // .end method
public void a ( Object p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;TV;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = this.g;
(( e.f.b.b.u ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/b/b/u;->i()Le/f/b/b/u;
return;
} // .end method
public void a ( java.lang.ref.ReferenceQueue p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/ref/ReferenceQueue<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 7 */
} // :goto_0
(( java.lang.ref.ReferenceQueue ) p1 ).poll ( ); // invoke-virtual {p1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
return;
} // .end method
public void a ( java.util.concurrent.atomic.AtomicReferenceArray p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/atomic/AtomicReferenceArray<", */
/* "TE;>;)V" */
/* } */
} // .end annotation
/* .line 3 */
v0 = (( java.util.concurrent.atomic.AtomicReferenceArray ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* mul-int/lit8 v0, v0, 0x3 */
/* div-int/lit8 v0, v0, 0x4 */
/* iput v0, p0, Le/f/b/b/u;->e:I */
/* .line 4 */
/* iget v1, p0, Le/f/b/b/u;->g:I */
/* if-ne v0, v1, :cond_0 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 5 */
/* iput v0, p0, Le/f/b/b/u;->e:I */
/* .line 6 */
} // :cond_0
this.f = p1;
return;
} // .end method
public Boolean a ( Object p0, Integer p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;I)Z" */
/* } */
} // .end annotation
/* .line 98 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 99 */
try { // :try_start_0
v0 = this.f;
/* .line 100 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* and-int/2addr p2, v1 */
/* .line 101 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v1, Le/f/b/b/r; */
/* move-object v3, v1 */
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* if-ne v3, p1, :cond_0 */
/* .line 102 */
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/2addr p1, v2 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 103 */
(( e.f.b.b.u ) p0 ).b ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Le/f/b/b/u;->b(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
/* .line 104 */
/* iget v1, p0, Le/f/b/b/u;->c:I */
/* sub-int/2addr v1, v2 */
/* .line 105 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 106 */
/* iput v1, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 107 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 108 */
} // :cond_0
try { // :try_start_1
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 109 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 110 */
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, Integer p1 ) {
/* .locals 2 */
/* .line 10 */
try { // :try_start_0
/* iget v0, p0, Le/f/b/b/u;->c:I */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 11 */
(( e.f.b.b.u ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/b/u;->d(Ljava/lang/Object;I)Le/f/b/b/r;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 13 */
} // :cond_0
(( e.f.b.b.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/u;->e()V
} // :cond_1
(( e.f.b.b.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/u;->e()V
/* :catchall_0 */
/* move-exception p1 */
(( e.f.b.b.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/u;->e()V
/* .line 14 */
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, Integer p1, e.f.b.b.m0 p2 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;I", */
/* "Le/f/b/b/m0<", */
/* "TK;TV;TE;>;)Z" */
/* } */
} // .end annotation
/* .line 111 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 112 */
try { // :try_start_0
v0 = this.f;
/* .line 113 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* and-int/2addr v1, p2 */
/* .line 114 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v3, Le/f/b/b/r; */
/* move-object v4, v3 */
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 115 */
v7 = /* .line 116 */
/* if-ne v7, p2, :cond_1 */
if ( v6 != null) { // if-eqz v6, :cond_1
v7 = this.b;
v7 = this.f;
/* .line 117 */
v6 = (( e.f.b.a.d ) v7 ).b ( p1, v6 ); // invoke-virtual {v7, p1, v6}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 118 */
/* move-object p1, v4 */
/* check-cast p1, Le/f/b/b/l0; */
/* if-ne p1, p3, :cond_0 */
/* .line 119 */
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/2addr p1, v2 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 120 */
(( e.f.b.b.u ) p0 ).b ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Le/f/b/b/u;->b(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
/* .line 121 */
/* iget p2, p0, Le/f/b/b/u;->c:I */
/* sub-int/2addr p2, v2 */
/* .line 122 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 123 */
/* iput p2, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 124 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
} // :cond_0
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 125 */
} // :cond_1
try { // :try_start_1
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 126 */
} // :cond_2
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 127 */
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, Integer p1, java.lang.Object p2 ) {
/* .locals 8 */
/* .line 67 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 68 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/b/b/u;->f()V
/* .line 69 */
v0 = this.f;
/* .line 70 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* and-int/2addr v1, p2 */
/* .line 71 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v3, Le/f/b/b/r; */
/* move-object v4, v3 */
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 72 */
v7 = /* .line 73 */
/* if-ne v7, p2, :cond_2 */
if ( v6 != null) { // if-eqz v6, :cond_2
v7 = this.b;
v7 = this.f;
/* .line 74 */
v6 = (( e.f.b.a.d ) v7 ).b ( p1, v6 ); // invoke-virtual {v7, p1, v6}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 75 */
/* .line 76 */
p2 = this.b;
(( e.f.b.b.q ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/b/b/q;->a()Le/f/b/a/d;
p1 = (( e.f.b.a.d ) p2 ).b ( p3, p1 ); // invoke-virtual {p2, p3, p1}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int v5 = 1; // const/4 v5, 0x1
/* .line 77 */
} // :cond_0
p1 = e.f.b.b.u .b ( v4 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 78 */
} // :goto_1
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/2addr p1, v2 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 79 */
(( e.f.b.b.u ) p0 ).b ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Le/f/b/b/u;->b(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
/* .line 80 */
/* iget p2, p0, Le/f/b/b/u;->c:I */
/* sub-int/2addr p2, v2 */
/* .line 81 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 82 */
/* iput p2, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 83 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
} // :cond_1
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 84 */
} // :cond_2
try { // :try_start_1
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 85 */
} // :cond_3
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 86 */
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, Integer p1, java.lang.Object p2, java.lang.Object p3 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;ITV;TV;)Z" */
/* } */
} // .end annotation
/* .line 44 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 45 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/b/b/u;->f()V
/* .line 46 */
v0 = this.f;
/* .line 47 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* and-int/2addr v1, p2 */
/* .line 48 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v3, Le/f/b/b/r; */
/* move-object v4, v3 */
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 49 */
v7 = /* .line 50 */
/* if-ne v7, p2, :cond_3 */
if ( v6 != null) { // if-eqz v6, :cond_3
v7 = this.b;
v7 = this.f;
/* .line 51 */
v6 = (( e.f.b.a.d ) v7 ).b ( p1, v6 ); // invoke-virtual {v7, p1, v6}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 52 */
/* if-nez p1, :cond_1 */
/* .line 53 */
p1 = e.f.b.b.u .b ( v4 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 54 */
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/2addr p1, v2 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 55 */
(( e.f.b.b.u ) p0 ).b ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Le/f/b/b/u;->b(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
/* .line 56 */
/* iget p2, p0, Le/f/b/b/u;->c:I */
/* sub-int/2addr p2, v2 */
/* .line 57 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 58 */
/* iput p2, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 59 */
} // :cond_0
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 60 */
} // :cond_1
try { // :try_start_1
p2 = this.b;
(( e.f.b.b.q ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/b/b/q;->a()Le/f/b/a/d;
p1 = (( e.f.b.a.d ) p2 ).b ( p3, p1 ); // invoke-virtual {p2, p3, p1}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 61 */
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/2addr p1, v2 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 62 */
(( e.f.b.b.u ) p0 ).a ( v4, p4 ); // invoke-virtual {p0, v4, p4}, Le/f/b/b/u;->a(Le/f/b/b/r;Ljava/lang/Object;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 63 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
} // :cond_2
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 64 */
} // :cond_3
try { // :try_start_2
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 65 */
} // :cond_4
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 66 */
/* throw p1 */
} // .end method
public e.f.b.b.r b ( Object p0, Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;TE;)TE;" */
/* } */
} // .end annotation
/* .line 53 */
/* iget v0, p0, Le/f/b/b/u;->c:I */
/* .line 54 */
} // :goto_0
/* if-eq p1, p2, :cond_1 */
/* .line 55 */
(( e.f.b.b.u ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/f/b/b/u;->a(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
if ( v2 != null) { // if-eqz v2, :cond_0
/* move-object v1, v2 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
/* .line 56 */
} // :goto_1
/* .line 57 */
} // :cond_1
/* iput v0, p0, Le/f/b/b/u;->c:I */
} // .end method
public java.lang.Object b ( java.lang.Object p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "I)TV;" */
/* } */
} // .end annotation
/* .line 5 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/b/u;->d(Ljava/lang/Object;I)Le/f/b/b/r;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
(( e.f.b.b.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/u;->e()V
/* .line 7 */
} // :cond_0
try { // :try_start_1
/* if-nez p1, :cond_1 */
/* .line 8 */
(( e.f.b.b.u ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/b/b/u;->j()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 9 */
} // :cond_1
(( e.f.b.b.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/u;->e()V
/* :catchall_0 */
/* move-exception p1 */
(( e.f.b.b.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/u;->e()V
/* .line 10 */
/* throw p1 */
} // .end method
public java.lang.Object b ( java.lang.Object p0, Integer p1, java.lang.Object p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;ITV;)TV;" */
/* } */
} // .end annotation
/* .line 31 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 32 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/b/b/u;->f()V
/* .line 33 */
v0 = this.f;
/* .line 34 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* add-int/lit8 v1, v1, -0x1 */
/* and-int/2addr v1, p2 */
/* .line 35 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v2, Le/f/b/b/r; */
/* move-object v3, v2 */
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 36 */
v6 = /* .line 37 */
/* if-ne v6, p2, :cond_2 */
if ( v5 != null) { // if-eqz v5, :cond_2
v6 = this.b;
v6 = this.f;
/* .line 38 */
v5 = (( e.f.b.a.d ) v6 ).b ( p1, v5 ); // invoke-virtual {v6, p1, v5}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 39 */
/* if-nez p1, :cond_1 */
/* .line 40 */
p1 = e.f.b.b.u .b ( v3 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 41 */
/* iget p1, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Le/f/b/b/u;->d:I */
/* .line 42 */
(( e.f.b.b.u ) p0 ).b ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Le/f/b/b/u;->b(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
/* .line 43 */
/* iget p2, p0, Le/f/b/b/u;->c:I */
/* add-int/lit8 p2, p2, -0x1 */
/* .line 44 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 45 */
/* iput p2, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 46 */
} // :cond_0
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 47 */
} // :cond_1
try { // :try_start_1
/* iget p2, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 p2, p2, 0x1 */
/* iput p2, p0, Le/f/b/b/u;->d:I */
/* .line 48 */
(( e.f.b.b.u ) p0 ).a ( v3, p3 ); // invoke-virtual {p0, v3, p3}, Le/f/b/b/u;->a(Le/f/b/b/r;Ljava/lang/Object;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 49 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 50 */
} // :cond_2
try { // :try_start_2
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 51 */
} // :cond_3
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 52 */
/* throw p1 */
} // .end method
public java.util.concurrent.atomic.AtomicReferenceArray b ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)", */
/* "Ljava/util/concurrent/atomic/AtomicReferenceArray<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray; */
/* invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V */
} // .end method
public void b ( ) {
/* .locals 11 */
/* .line 11 */
v0 = this.f;
/* .line 12 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* const/high16 v2, 0x40000000 # 2.0f */
/* if-lt v1, v2, :cond_0 */
return;
/* .line 13 */
} // :cond_0
/* iget v2, p0, Le/f/b/b/u;->c:I */
/* shl-int/lit8 v3, v1, 0x1 */
/* .line 14 */
(( e.f.b.b.u ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/f/b/b/u;->b(I)Ljava/util/concurrent/atomic/AtomicReferenceArray;
/* .line 15 */
v4 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* mul-int/lit8 v4, v4, 0x3 */
/* div-int/lit8 v4, v4, 0x4 */
/* iput v4, p0, Le/f/b/b/u;->e:I */
/* .line 16 */
v4 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* add-int/lit8 v4, v4, -0x1 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v1, :cond_6 */
/* .line 17 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v6, Le/f/b/b/r; */
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 18 */
v8 = /* .line 19 */
/* and-int/2addr v8, v4 */
/* if-nez v7, :cond_1 */
/* .line 20 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v3 ).set ( v8, v6 ); // invoke-virtual {v3, v8, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
} // :cond_1
/* move-object v9, v6 */
} // :goto_1
if ( v7 != null) { // if-eqz v7, :cond_3
v10 = /* .line 21 */
/* and-int/2addr v10, v4 */
/* if-eq v10, v8, :cond_2 */
/* move-object v9, v7 */
/* move v8, v10 */
/* .line 22 */
} // :cond_2
/* .line 23 */
} // :cond_3
(( java.util.concurrent.atomic.AtomicReferenceArray ) v3 ).set ( v8, v9 ); // invoke-virtual {v3, v8, v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
} // :goto_2
/* if-eq v6, v9, :cond_5 */
v7 = /* .line 24 */
/* and-int/2addr v7, v4 */
/* .line 25 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v3 ).get ( v7 ); // invoke-virtual {v3, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v8, Le/f/b/b/r; */
/* .line 26 */
(( e.f.b.b.u ) p0 ).a ( v6, v8 ); // invoke-virtual {p0, v6, v8}, Le/f/b/b/u;->a(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 27 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v3 ).set ( v7, v8 ); // invoke-virtual {v3, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
} // :cond_4
/* add-int/lit8 v2, v2, -0x1 */
/* .line 28 */
} // :goto_3
} // :cond_5
} // :goto_4
/* add-int/lit8 v5, v5, 0x1 */
/* .line 29 */
} // :cond_6
this.f = v3;
/* .line 30 */
/* iput v2, p0, Le/f/b/b/u;->c:I */
return;
} // .end method
public void b ( java.lang.ref.ReferenceQueue p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/ref/ReferenceQueue<", */
/* "TK;>;)V" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( java.lang.ref.ReferenceQueue ) p1 ).poll ( ); // invoke-virtual {p1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
/* check-cast v1, Le/f/b/b/r; */
/* .line 4 */
v2 = this.b;
(( e.f.b.b.q ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Le/f/b/b/q;->b(Le/f/b/b/r;)V
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v1, 0x10 */
/* if-ne v0, v1, :cond_0 */
} // :cond_1
return;
} // .end method
public e.f.b.b.r c ( java.lang.Object p0, Integer p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "I)TE;" */
/* } */
} // .end annotation
/* .line 4 */
/* iget v0, p0, Le/f/b/b/u;->c:I */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 5 */
(( e.f.b.b.u ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/b/b/u;->a(I)Le/f/b/b/r;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
v1 = /* .line 6 */
/* if-eq v1, p2, :cond_0 */
/* .line 7 */
} // :cond_0
/* if-nez v1, :cond_1 */
/* .line 8 */
(( e.f.b.b.u ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/b/b/u;->j()V
/* .line 9 */
} // :cond_1
v2 = this.b;
v2 = this.f;
v1 = (( e.f.b.a.d ) v2 ).b ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 10 */
} // :cond_2
} // :goto_1
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void c ( ) {
/* .locals 0 */
return;
} // .end method
public void c ( java.lang.ref.ReferenceQueue p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/ref/ReferenceQueue<", */
/* "TV;>;)V" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :cond_0
(( java.lang.ref.ReferenceQueue ) p1 ).poll ( ); // invoke-virtual {p1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 2 */
/* check-cast v1, Le/f/b/b/m0; */
/* .line 3 */
v2 = this.b;
(( e.f.b.b.q ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/f/b/b/q;->a(Le/f/b/b/m0;)V
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v1, 0x10 */
/* if-ne v0, v1, :cond_0 */
} // :cond_1
return;
} // .end method
public e.f.b.b.r d ( java.lang.Object p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "I)TE;" */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.b.b.u ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/b/u;->c(Ljava/lang/Object;I)Le/f/b/b/r;
} // .end method
public void d ( ) {
/* .locals 0 */
return;
} // .end method
public java.lang.Object e ( java.lang.Object p0, Integer p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "I)TV;" */
/* } */
} // .end annotation
/* .line 1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
/* .line 2 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/b/b/u;->f()V
/* .line 3 */
v0 = this.f;
/* .line 4 */
v1 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* add-int/lit8 v1, v1, -0x1 */
/* and-int/2addr v1, p2 */
/* .line 5 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v2, Le/f/b/b/r; */
/* move-object v3, v2 */
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 6 */
v6 = /* .line 7 */
/* if-ne v6, p2, :cond_2 */
if ( v5 != null) { // if-eqz v5, :cond_2
v6 = this.b;
v6 = this.f;
/* .line 8 */
v5 = (( e.f.b.a.d ) v6 ).b ( p1, v5 ); // invoke-virtual {v6, p1, v5}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 9 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 10 */
} // :cond_0
p2 = e.f.b.b.u .b ( v3 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 11 */
} // :goto_1
/* iget p2, p0, Le/f/b/b/u;->d:I */
/* add-int/lit8 p2, p2, 0x1 */
/* iput p2, p0, Le/f/b/b/u;->d:I */
/* .line 12 */
(( e.f.b.b.u ) p0 ).b ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Le/f/b/b/u;->b(Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
/* .line 13 */
/* iget v2, p0, Le/f/b/b/u;->c:I */
/* add-int/lit8 v2, v2, -0x1 */
/* .line 14 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).set ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
/* .line 15 */
/* iput v2, p0, Le/f/b/b/u;->c:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 16 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
} // :cond_1
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 17 */
} // :cond_2
try { // :try_start_1
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 18 */
} // :cond_3
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception p1 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 19 */
/* throw p1 */
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 20 */
v0 = this.h;
v0 = (( java.util.concurrent.atomic.AtomicInteger ) v0 ).incrementAndGet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
/* and-int/lit8 v0, v0, 0x3f */
/* if-nez v0, :cond_0 */
/* .line 21 */
(( e.f.b.b.u ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/b/b/u;->g()V
} // :cond_0
return;
} // .end method
public void f ( ) {
/* .locals 0 */
/* .line 1 */
(( e.f.b.b.u ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/b/b/u;->h()V
return;
} // .end method
public void g ( ) {
/* .locals 0 */
/* .line 1 */
(( e.f.b.b.u ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/b/b/u;->h()V
return;
} // .end method
public void h ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( java.util.concurrent.locks.ReentrantLock ) p0 ).tryLock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/u;->d()V
/* .line 3 */
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
(( java.util.concurrent.atomic.AtomicInteger ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception v0 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 5 */
/* throw v0 */
} // :cond_0
} // :goto_0
return;
} // .end method
public abstract e.f.b.b.u i ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TS;" */
/* } */
} // .end annotation
} // .end method
public void j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( java.util.concurrent.locks.ReentrantLock ) p0 ).tryLock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
(( e.f.b.b.u ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/u;->d()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* :catchall_0 */
/* move-exception v0 */
(( java.util.concurrent.locks.ReentrantLock ) p0 ).unlock ( ); // invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
/* .line 4 */
/* throw v0 */
} // :cond_0
} // :goto_0
return;
} // .end method
