public class inal implements e.f.e.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final e.f.e.l b;
	 /* # instance fields */
	 public final e.f.e.q.b.c a;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Le/f/e/l; */
		 /* .line 1 */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/f/e/q/b/c; */
		 /* invoke-direct {v0}, Le/f/e/q/b/c;-><init>()V */
		 this.a = v0;
		 return;
	 } // .end method
	 public static e.f.e.o.b a ( Object p0 ) {
		 /* .locals 14 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 8 */
	 (( e.f.e.o.b ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/e/o/b;->b()[I
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 9 */
		 /* aget v2, v0, v1 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* .line 10 */
		 /* aget v3, v0, v3 */
		 int v4 = 2; // const/4 v4, 0x2
		 /* .line 11 */
		 /* aget v5, v0, v4 */
		 int v6 = 3; // const/4 v6, 0x3
		 /* .line 12 */
		 /* aget v0, v0, v6 */
		 /* .line 13 */
		 /* new-instance v6, Le/f/e/o/b; */
		 /* const/16 v7, 0x21 */
		 /* const/16 v8, 0x1e */
		 /* invoke-direct {v6, v8, v7}, Le/f/e/o/b;-><init>(II)V */
		 int v9 = 0; // const/4 v9, 0x0
	 } // :goto_0
	 /* if-ge v9, v7, :cond_2 */
	 /* mul-int v10, v9, v0 */
	 /* .line 14 */
	 /* div-int/lit8 v11, v0, 0x2 */
	 /* add-int/2addr v10, v11 */
	 /* div-int/2addr v10, v7 */
	 /* add-int/2addr v10, v3 */
	 int v11 = 0; // const/4 v11, 0x0
} // :goto_1
/* if-ge v11, v8, :cond_1 */
/* mul-int v12, v11, v5 */
/* .line 15 */
/* div-int/lit8 v13, v5, 0x2 */
/* add-int/2addr v12, v13 */
/* and-int/lit8 v13, v9, 0x1 */
/* mul-int v13, v13, v5 */
/* div-int/2addr v13, v4 */
/* add-int/2addr v12, v13 */
/* div-int/2addr v12, v8 */
/* add-int/2addr v12, v2 */
/* .line 16 */
v12 = (( e.f.e.o.b ) p0 ).b ( v12, v10 ); // invoke-virtual {p0, v12, v10}, Le/f/e/o/b;->b(II)Z
if ( v12 != null) { // if-eqz v12, :cond_0
	 /* .line 17 */
	 (( e.f.e.o.b ) v6 ).c ( v11, v9 ); // invoke-virtual {v6, v11, v9}, Le/f/e/o/b;->c(II)V
} // :cond_0
/* add-int/lit8 v11, v11, 0x1 */
} // :cond_1
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_2
/* .line 18 */
} // :cond_3
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // .end method
/* # virtual methods */
public e.f.e.j a ( Object p0, java.util.Map p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/e/c;", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/j;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException;, */
/* Lcom/google/zxing/ChecksumException;, */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 1 */
v0 = v0 = e.f.e.d.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( e.f.e.c ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/c;->a()Le/f/e/o/b;
e.f.e.q.a .a ( p1 );
/* .line 3 */
v0 = this.a;
(( e.f.e.q.b.c ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/e/q/b/c;->a(Le/f/e/o/b;Ljava/util/Map;)Le/f/e/o/e;
/* .line 4 */
/* new-instance p2, Le/f/e/j; */
(( e.f.e.o.e ) p1 ).h ( ); // invoke-virtual {p1}, Le/f/e/o/e;->h()Ljava/lang/String;
(( e.f.e.o.e ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/e/o/e;->e()[B
v2 = e.f.e.q.a.b;
v3 = e.f.e.a.k;
/* invoke-direct {p2, v0, v1, v2, v3}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V */
/* .line 5 */
(( e.f.e.o.e ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/o/e;->b()Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
v0 = e.f.e.k.e;
(( e.f.e.j ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V
} // :cond_0
/* .line 7 */
} // :cond_1
com.google.zxing.NotFoundException .a ( );
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 0 */
return;
} // .end method
