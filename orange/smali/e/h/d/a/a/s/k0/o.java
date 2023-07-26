public abstract class e.h.d.a.a.s.k0.o extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/h/d/a/a/s/k0/d;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.String a;
public final java.lang.String b;
public final java.lang.String c;
public final java.lang.String d;
public final java.lang.String e;
/* # direct methods */
public e.h.d.a.a.s.k0.o ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 /* .line 3 */
	 this.b = p2;
	 /* .line 4 */
	 this.c = p3;
	 /* .line 5 */
	 this.d = p4;
	 /* .line 6 */
	 this.e = p5;
	 return;
} // .end method
/* # virtual methods */
public abstract java.lang.Object a ( android.database.Cursor p0 ) {
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/database/Cursor;", */
	 /* ")TT;" */
	 /* } */
} // .end annotation
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
} // .end method
public java.util.List a ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/database/sqlite/SQLiteDatabase;", */
/* ")", */
/* "Ljava/util/List<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 2 */
v1 = this.a;
v3 = this.c;
v4 = this.d;
v7 = this.b;
v8 = this.e;
int v2 = 0; // const/4 v2, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 3 */
try { // :try_start_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
v1 = /* .line 4 */
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 5 */
} // :cond_0
(( e.h.d.a.a.s.k0.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/Cursor;)Ljava/lang/Object;
v1 = /* .line 6 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v1, :cond_0 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 7 */
} // :cond_2
/* :catchall_0 */
/* move-exception v0 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 8 */
try { // :try_start_1
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
	 /* :catchall_1 */
	 /* move-exception p1 */
	 (( java.lang.Throwable ) v0 ).addSuppressed ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
} // :cond_3
} // :goto_0
/* throw v0 */
} // .end method
