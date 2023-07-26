public class inal implements k.h0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final k.t a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( java.util.List p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Lk/r;", */
		 /* ">;)", */
		 /* "Ljava/lang/String;" */
		 /* } */
	 } // .end annotation
	 /* .line 37 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 v1 = 	 /* .line 38 */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* if-lez v2, :cond_0 */
final String v3 = "; "; // const-string v3, "; "
/* .line 39 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 40 */
} // :cond_0
/* check-cast v3, Lk/r; */
/* .line 41 */
(( k.r ) v3 ).a ( ); // invoke-virtual {v3}, Lk/r;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v4, 0x3d */
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( k.r ) v3 ).b ( ); // invoke-virtual {v3}, Lk/r;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, v2, 0x1 */
/* .line 42 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public k.z0 a ( k.g0 p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* .line 2 */
(( k.u0 ) v0 ).f ( ); // invoke-virtual {v0}, Lk/u0;->f()Lk/t0;
/* .line 3 */
(( k.u0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/u0;->a()Lk/x0;
final String v3 = "Content-Type"; // const-string v3, "Content-Type"
/* const-wide/16 v4, -0x1 */
final String v6 = "Content-Length"; // const-string v6, "Content-Length"
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 4 */
(( k.x0 ) v2 ).b ( ); // invoke-virtual {v2}, Lk/x0;->b()Lk/i0;
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 5 */
(( k.i0 ) v7 ).toString ( ); // invoke-virtual {v7}, Lk/i0;->toString()Ljava/lang/String;
(( k.t0 ) v1 ).a ( v3, v7 ); // invoke-virtual {v1, v3, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
/* .line 6 */
} // :cond_0
(( k.x0 ) v2 ).a ( ); // invoke-virtual {v2}, Lk/x0;->a()J
/* move-result-wide v7 */
final String v2 = "Transfer-Encoding"; // const-string v2, "Transfer-Encoding"
/* cmp-long v9, v7, v4 */
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 7 */
java.lang.Long .toString ( v7,v8 );
(( k.t0 ) v1 ).a ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
/* .line 8 */
(( k.t0 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lk/t0;->a(Ljava/lang/String;)Lk/t0;
} // :cond_1
final String v7 = "chunked"; // const-string v7, "chunked"
/* .line 9 */
(( k.t0 ) v1 ).a ( v2, v7 ); // invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
/* .line 10 */
(( k.t0 ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lk/t0;->a(Ljava/lang/String;)Lk/t0;
} // :cond_2
} // :goto_0
final String v2 = "Host"; // const-string v2, "Host"
/* .line 11 */
(( k.u0 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
int v8 = 0; // const/4 v8, 0x0
/* if-nez v7, :cond_3 */
/* .line 12 */
(( k.u0 ) v0 ).g ( ); // invoke-virtual {v0}, Lk/u0;->g()Lk/f0;
k.e1.e .a ( v7,v8 );
(( k.t0 ) v1 ).a ( v2, v7 ); // invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
} // :cond_3
final String v2 = "Connection"; // const-string v2, "Connection"
/* .line 13 */
(( k.u0 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v7, :cond_4 */
final String v7 = "Keep-Alive"; // const-string v7, "Keep-Alive"
/* .line 14 */
(( k.t0 ) v1 ).a ( v2, v7 ); // invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
} // :cond_4
final String v2 = "Accept-Encoding"; // const-string v2, "Accept-Encoding"
/* .line 15 */
(( k.u0 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
final String v9 = "gzip"; // const-string v9, "gzip"
/* if-nez v7, :cond_5 */
final String v7 = "Range"; // const-string v7, "Range"
(( k.u0 ) v0 ).a ( v7 ); // invoke-virtual {v0, v7}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v7, :cond_5 */
int v8 = 1; // const/4 v8, 0x1
/* .line 16 */
(( k.t0 ) v1 ).a ( v2, v9 ); // invoke-virtual {v1, v2, v9}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
/* .line 17 */
} // :cond_5
v2 = this.a;
(( k.u0 ) v0 ).g ( ); // invoke-virtual {v0}, Lk/u0;->g()Lk/f0;
v7 = /* .line 18 */
/* if-nez v7, :cond_6 */
/* .line 19 */
(( k.e1.i.a ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lk/e1/i/a;->a(Ljava/util/List;)Ljava/lang/String;
final String v7 = "Cookie"; // const-string v7, "Cookie"
(( k.t0 ) v1 ).a ( v7, v2 ); // invoke-virtual {v1, v7, v2}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
} // :cond_6
final String v2 = "User-Agent"; // const-string v2, "User-Agent"
/* .line 20 */
(( k.u0 ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v7, :cond_7 */
/* .line 21 */
k.e1.f .a ( );
(( k.t0 ) v1 ).a ( v2, v7 ); // invoke-virtual {v1, v2, v7}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
/* .line 22 */
} // :cond_7
(( k.t0 ) v1 ).a ( ); // invoke-virtual {v1}, Lk/t0;->a()Lk/u0;
/* .line 23 */
v1 = this.a;
(( k.u0 ) v0 ).g ( ); // invoke-virtual {v0}, Lk/u0;->g()Lk/f0;
(( k.z0 ) p1 ).o ( ); // invoke-virtual {p1}, Lk/z0;->o()Lk/d0;
k.e1.i.g .a ( v1,v2,v7 );
/* .line 24 */
(( k.z0 ) p1 ).p ( ); // invoke-virtual {p1}, Lk/z0;->p()Lk/y0;
/* .line 25 */
(( k.y0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lk/y0;->a(Lk/u0;)Lk/y0;
if ( v8 != null) { // if-eqz v8, :cond_8
final String v0 = "Content-Encoding"; // const-string v0, "Content-Encoding"
/* .line 26 */
(( k.z0 ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;
v2 = (( java.lang.String ) v9 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 27 */
v2 = k.e1.i.g .b ( p1 );
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 28 */
/* new-instance v2, Ll/m; */
(( k.z0 ) p1 ).c ( ); // invoke-virtual {p1}, Lk/z0;->c()Lk/b1;
(( k.b1 ) v7 ).n ( ); // invoke-virtual {v7}, Lk/b1;->n()Ll/h;
/* invoke-direct {v2, v7}, Ll/m;-><init>(Ll/y;)V */
/* .line 29 */
(( k.z0 ) p1 ).o ( ); // invoke-virtual {p1}, Lk/z0;->o()Lk/d0;
(( k.d0 ) v7 ).a ( ); // invoke-virtual {v7}, Lk/d0;->a()Lk/c0;
/* .line 30 */
(( k.c0 ) v7 ).b ( v0 ); // invoke-virtual {v7, v0}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;
/* .line 31 */
(( k.c0 ) v7 ).b ( v6 ); // invoke-virtual {v7, v6}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;
/* .line 32 */
(( k.c0 ) v7 ).a ( ); // invoke-virtual {v7}, Lk/c0;->a()Lk/d0;
/* .line 33 */
(( k.y0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lk/y0;->a(Lk/d0;)Lk/y0;
/* .line 34 */
(( k.z0 ) p1 ).b ( v3 ); // invoke-virtual {p1, v3}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;
/* .line 35 */
/* new-instance v0, Lk/e1/i/j; */
l.r .a ( v2 );
/* invoke-direct {v0, p1, v4, v5, v2}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V */
(( k.y0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lk/y0;->a(Lk/b1;)Lk/y0;
/* .line 36 */
} // :cond_8
(( k.y0 ) v1 ).a ( ); // invoke-virtual {v1}, Lk/y0;->a()Lk/z0;
} // .end method
