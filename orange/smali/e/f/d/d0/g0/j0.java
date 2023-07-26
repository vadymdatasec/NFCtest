public class e.f.d.d0.g0.j0 extends e.f.d.a0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/d/a0<", */
	 /* "Ljava/sql/Timestamp;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.d.a0 a; //synthetic
/* # direct methods */
public e.f.d.d0.g0.j0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p2;
	 /* invoke-direct {p0}, Le/f/d/a0;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
(( e.f.d.d0.g0.j0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/d0/g0/j0;->a(Le/f/d/f0/c;)Ljava/sql/Timestamp;
} // .end method
public java.sql.Timestamp a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.a;
(( e.f.d.a0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;
/* check-cast p1, Ljava/util/Date; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
/* new-instance v0, Ljava/sql/Timestamp; */
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void a ( Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p2, Ljava/sql/Timestamp; */
(( e.f.d.d0.g0.j0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/j0;->a(Le/f/d/f0/g;Ljava/sql/Timestamp;)V
return;
} // .end method
public void a ( Object p0, java.sql.Timestamp p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 5 */
v0 = this.a;
(( e.f.d.a0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V
return;
} // .end method
