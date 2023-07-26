public class inal extends e.f.d.a0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/d/a0<", */
	 /* "Ljava/lang/Number;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public inal ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Le/f/d/a0;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Number a ( Object p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 3 */
(( e.f.d.f0.c ) p1 ).F ( ); // invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;
v1 = e.f.d.f0.e.j;
/* if-ne v0, v1, :cond_0 */
/* .line 4 */
(( e.f.d.f0.c ) p1 ).B ( ); // invoke-virtual {p1}, Le/f/d/f0/c;->B()V
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_0
try { // :try_start_0
p1 = (( e.f.d.f0.c ) p1 ).y ( ); // invoke-virtual {p1}, Le/f/d/f0/c;->y()I
/* int-to-byte p1, p1 */
/* .line 6 */
java.lang.Byte .valueOf ( p1 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
/* new-instance v0, Lcom/google/gson/JsonSyntaxException; */
/* invoke-direct {v0, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public java.lang.Object a ( Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.d0.g0.x0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/d0/g0/x0;->a(Le/f/d/f0/c;)Ljava/lang/Number;
} // .end method
public void a ( Object p0, java.lang.Number p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 8 */
(( e.f.d.f0.g ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/d/f0/g;->a(Ljava/lang/Number;)Le/f/d/f0/g;
return;
} // .end method
public void a ( Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p2, Ljava/lang/Number; */
(( e.f.d.d0.g0.x0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/x0;->a(Le/f/d/f0/g;Ljava/lang/Number;)V
return;
} // .end method
