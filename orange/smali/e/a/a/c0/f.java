public class e.a.a.c0.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 public final Long d;
	 public final Long e;
	 public final Long f;
	 public final Long g;
	 public final java.util.List h;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/a/a/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.a.a.c0.f ( ) {
/* .locals 12 */
/* .line 9 */
v2 = this.b;
/* iget-wide v3, p2, Le/a/a/a;->c:J */
/* iget-wide v5, p2, Le/a/a/a;->d:J */
/* iget-wide v7, p2, Le/a/a/a;->e:J */
/* iget-wide v9, p2, Le/a/a/a;->f:J */
/* .line 10 */
e.a.a.c0.f .a ( p2 );
/* move-object v0, p0 */
/* move-object v1, p1 */
/* .line 11 */
/* invoke-direct/range {v0 ..v11}, Le/a/a/c0/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V */
return;
} // .end method
public e.a.a.c0.f ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "JJJJ", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
final String p1 = ""; // const-string p1, ""
/* .line 3 */
p1 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
this.c = p2;
/* .line 4 */
/* iput-wide p3, p0, Le/a/a/c0/f;->d:J */
/* .line 5 */
/* iput-wide p5, p0, Le/a/a/c0/f;->e:J */
/* .line 6 */
/* iput-wide p7, p0, Le/a/a/c0/f;->f:J */
/* .line 7 */
/* iput-wide p9, p0, Le/a/a/c0/f;->g:J */
/* .line 8 */
this.h = p11;
return;
} // .end method
public static e.a.a.c0.f a ( Object p0 ) {
/* .locals 14 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = e.a.a.c0.i .b ( p0 );
/* const v1, 0x20150306 */
/* if-ne v0, v1, :cond_0 */
/* .line 4 */
e.a.a.c0.i .b ( p0 );
/* .line 5 */
e.a.a.c0.i .b ( p0 );
/* .line 6 */
e.a.a.c0.i .c ( p0 );
/* move-result-wide v5 */
/* .line 7 */
e.a.a.c0.i .c ( p0 );
/* move-result-wide v7 */
/* .line 8 */
e.a.a.c0.i .c ( p0 );
/* move-result-wide v9 */
/* .line 9 */
e.a.a.c0.i .c ( p0 );
/* move-result-wide v11 */
/* .line 10 */
e.a.a.c0.i .a ( p0 );
/* .line 11 */
/* new-instance p0, Le/a/a/c0/f; */
/* move-object v2, p0 */
/* invoke-direct/range {v2 ..v13}, Le/a/a/c0/f;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V */
/* .line 12 */
} // :cond_0
/* new-instance p0, Ljava/io/IOException; */
/* invoke-direct {p0}, Ljava/io/IOException;-><init>()V */
/* throw p0 */
} // .end method
public static java.util.List a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/a;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
p0 = this.g;
e.a.a.c0.j .b ( p0 );
} // .end method
/* # virtual methods */
public e.a.a.a a ( Object[] p0 ) {
/* .locals 3 */
/* .line 13 */
/* new-instance v0, Le/a/a/a; */
/* invoke-direct {v0}, Le/a/a/a;-><init>()V */
/* .line 14 */
this.a = p1;
/* .line 15 */
p1 = this.c;
this.b = p1;
/* .line 16 */
/* iget-wide v1, p0, Le/a/a/c0/f;->d:J */
/* iput-wide v1, v0, Le/a/a/a;->c:J */
/* .line 17 */
/* iget-wide v1, p0, Le/a/a/c0/f;->e:J */
/* iput-wide v1, v0, Le/a/a/a;->d:J */
/* .line 18 */
/* iget-wide v1, p0, Le/a/a/c0/f;->f:J */
/* iput-wide v1, v0, Le/a/a/a;->e:J */
/* .line 19 */
/* iget-wide v1, p0, Le/a/a/c0/f;->g:J */
/* iput-wide v1, v0, Le/a/a/a;->f:J */
/* .line 20 */
p1 = this.h;
e.a.a.c0.j .a ( p1 );
this.g = p1;
/* .line 21 */
p1 = this.h;
java.util.Collections .unmodifiableList ( p1 );
this.h = p1;
} // .end method
public Boolean a ( java.io.OutputStream p0 ) {
/* .locals 2 */
/* const v0, 0x20150306 */
/* .line 22 */
try { // :try_start_0
e.a.a.c0.i .a ( p1,v0 );
/* .line 23 */
v0 = this.b;
e.a.a.c0.i .a ( p1,v0 );
/* .line 24 */
v0 = this.c;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
} // :cond_0
v0 = this.c;
} // :goto_0
e.a.a.c0.i .a ( p1,v0 );
/* .line 25 */
/* iget-wide v0, p0, Le/a/a/c0/f;->d:J */
e.a.a.c0.i .a ( p1,v0,v1 );
/* .line 26 */
/* iget-wide v0, p0, Le/a/a/c0/f;->e:J */
e.a.a.c0.i .a ( p1,v0,v1 );
/* .line 27 */
/* iget-wide v0, p0, Le/a/a/c0/f;->f:J */
e.a.a.c0.i .a ( p1,v0,v1 );
/* .line 28 */
/* iget-wide v0, p0, Le/a/a/c0/f;->g:J */
e.a.a.c0.i .a ( p1,v0,v1 );
/* .line 29 */
v0 = this.h;
e.a.a.c0.i .a ( v0,p1 );
/* .line 30 */
(( java.io.OutputStream ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
int p1 = 1; // const/4 p1, 0x1
/* :catch_0 */
/* move-exception p1 */
/* .line 31 */
(( java.io.IOException ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;
int p1 = 0; // const/4 p1, 0x0
} // .end method
