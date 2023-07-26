public class e.a.a.l {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final b;
	 public final java.util.Map c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final Boolean e;
/* # direct methods */
public e.a.a.l ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I[B", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;ZJ)V" */
/* } */
} // .end annotation
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 5 */
/* iput p1, p0, Le/a/a/l;->a:I */
/* .line 6 */
this.b = p2;
/* .line 7 */
this.c = p3;
/* if-nez p4, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
this.d = p1;
/* .line 9 */
} // :cond_0
java.util.Collections .unmodifiableList ( p4 );
this.d = p1;
/* .line 10 */
} // :goto_0
/* iput-boolean p5, p0, Le/a/a/l;->e:Z */
return;
} // .end method
public e.a.a.l ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I[B", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;ZJ)V" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
e.a.a.l .a ( p3 );
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move v5, p4 */
/* move-wide v6, p5 */
/* invoke-direct/range {v0 ..v7}, Le/a/a/l;-><init>(I[BLjava/util/Map;Ljava/util/List;ZJ)V */
return;
} // .end method
public e.a.a.l ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I[BZJ", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
e.a.a.l .a ( p6 );
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p6 */
/* move v5, p3 */
/* move-wide v6, p4 */
/* invoke-direct/range {v0 ..v7}, Le/a/a/l;-><init>(I[BLjava/util/Map;Ljava/util/List;ZJ)V */
return;
} // .end method
public e.a.a.l ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([B", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* const/16 v1, 0xc8 */
int v4 = 0; // const/4 v4, 0x0
/* const-wide/16 v5, 0x0 */
/* move-object v0, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* .line 3 */
/* invoke-direct/range {v0 ..v6}, Le/a/a/l;-><init>(I[BLjava/util/Map;ZJ)V */
return;
} // .end method
public static java.util.List a ( java.util.Map p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 6 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
java.util.Collections .emptyList ( );
/* .line 8 */
} // :cond_1
v1 = /* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 9 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 10 */
/* new-instance v2, Le/a/a/i; */
/* check-cast v3, Ljava/lang/String; */
/* check-cast v1, Ljava/lang/String; */
/* invoke-direct {v2, v3, v1}, Le/a/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_2
} // .end method
public static java.util.Map a ( java.util.List p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;)", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 1 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
java.util.Collections .emptyMap ( );
/* .line 3 */
} // :cond_1
/* new-instance v0, Ljava/util/TreeMap; */
v1 = java.lang.String.CASE_INSENSITIVE_ORDER;
/* invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V */
/* .line 4 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Le/a/a/i; */
/* .line 5 */
(( e.a.a.i ) v1 ).a ( ); // invoke-virtual {v1}, Le/a/a/i;->a()Ljava/lang/String;
(( e.a.a.i ) v1 ).b ( ); // invoke-virtual {v1}, Le/a/a/i;->b()Ljava/lang/String;
} // :cond_2
} // .end method
