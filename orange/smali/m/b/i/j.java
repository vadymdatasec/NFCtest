public class m.b.i.j extends m.b.i.t {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.i.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p5}, Lm/b/i/t;-><init>(Ljava/lang/String;)V */
		 final String p5 = "name"; // const-string p5, "name"
		 /* .line 2 */
		 (( m.b.i.t ) p0 ).a ( p5, p1 ); // invoke-virtual {p0, p5, p1}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 final String p1 = "pubSysKey"; // const-string p1, "pubSysKey"
			 /* .line 3 */
			 (( m.b.i.t ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
		 } // :cond_0
		 final String p1 = "publicId"; // const-string p1, "publicId"
		 /* .line 4 */
		 (( m.b.i.t ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
		 final String p1 = "systemId"; // const-string p1, "systemId"
		 /* .line 5 */
		 (( m.b.i.t ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( java.lang.Appendable p0, Integer p1, Object p2 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( m.b.i.g ) p3 ).h ( ); // invoke-virtual {p3}, Lm/b/i/g;->h()Lm/b/i/f;
	 p3 = m.b.i.f.b;
	 final String v0 = "systemId"; // const-string v0, "systemId"
	 final String v1 = "publicId"; // const-string v1, "publicId"
	 /* if-ne p2, p3, :cond_0 */
	 p2 = 	 (( m.b.i.j ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lm/b/i/j;->e(Ljava/lang/String;)Z
	 /* if-nez p2, :cond_0 */
	 p2 = 	 (( m.b.i.j ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/j;->e(Ljava/lang/String;)Z
	 /* if-nez p2, :cond_0 */
	 final String p2 = "<!doctype"; // const-string p2, "<!doctype"
	 /* .line 2 */
} // :cond_0
final String p2 = "<!DOCTYPE"; // const-string p2, "<!DOCTYPE"
/* .line 3 */
} // :goto_0
final String p2 = "name"; // const-string p2, "name"
/* .line 4 */
p3 = (( m.b.i.j ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Lm/b/i/j;->e(Ljava/lang/String;)Z
final String v2 = " "; // const-string v2, " "
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 5 */
(( m.b.i.t ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
final String p2 = "pubSysKey"; // const-string p2, "pubSysKey"
/* .line 6 */
p3 = (( m.b.i.j ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Lm/b/i/j;->e(Ljava/lang/String;)Z
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 7 */
(( m.b.i.t ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
/* .line 8 */
} // :cond_2
p2 = (( m.b.i.j ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lm/b/i/j;->e(Ljava/lang/String;)Z
/* const/16 p3, 0x22 */
final String v2 = " \""; // const-string v2, " \""
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 9 */
(( m.b.i.t ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
/* .line 10 */
} // :cond_3
p2 = (( m.b.i.j ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/j;->e(Ljava/lang/String;)Z
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 11 */
(( m.b.i.t ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
} // :cond_4
/* const/16 p2, 0x3e */
/* .line 12 */
return;
} // .end method
public void c ( java.lang.Appendable p0, Integer p1, Object p2 ) {
/* .locals 0 */
return;
} // .end method
public final Boolean e ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
(( m.b.i.t ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;
p1 = m.b.h.i .a ( p1 );
/* xor-int/lit8 p1, p1, 0x1 */
} // .end method
public java.lang.String i ( ) {
/* .locals 1 */
final String v0 = "#doctype"; // const-string v0, "#doctype"
} // .end method
