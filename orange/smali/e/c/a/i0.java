public class e.c.a.i0 implements e.c.a.j0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/Byte;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/Float;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.c.a.i0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
this.b = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public void a ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
java.lang.Byte .valueOf ( v1 );
/* .line 3 */
v0 = this.b;
java.lang.Float .valueOf ( p1 );
/* .line 4 */
p1 = this.b;
java.lang.Float .valueOf ( p2 );
return;
} // .end method
public void a ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 2 */
/* .line 12 */
v0 = this.a;
int v1 = 3; // const/4 v1, 0x3
java.lang.Byte .valueOf ( v1 );
/* .line 13 */
v0 = this.b;
java.lang.Float .valueOf ( p1 );
/* .line 14 */
p1 = this.b;
java.lang.Float .valueOf ( p2 );
/* .line 15 */
p1 = this.b;
java.lang.Float .valueOf ( p3 );
/* .line 16 */
p1 = this.b;
java.lang.Float .valueOf ( p4 );
return;
} // .end method
public void a ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
java.lang.Byte .valueOf ( v1 );
/* .line 6 */
v0 = this.b;
java.lang.Float .valueOf ( p1 );
/* .line 7 */
p1 = this.b;
java.lang.Float .valueOf ( p2 );
/* .line 8 */
p1 = this.b;
java.lang.Float .valueOf ( p3 );
/* .line 9 */
p1 = this.b;
java.lang.Float .valueOf ( p4 );
/* .line 10 */
p1 = this.b;
java.lang.Float .valueOf ( p5 );
/* .line 11 */
p1 = this.b;
java.lang.Float .valueOf ( p6 );
return;
} // .end method
public void a ( Float p0, Float p1, Float p2, Boolean p3, Boolean p4, Float p5, Float p6 ) {
/* .locals 0 */
if ( p4 != null) { // if-eqz p4, :cond_0
int p4 = 2; // const/4 p4, 0x2
} // :cond_0
int p4 = 0; // const/4 p4, 0x0
} // :goto_0
/* or-int/lit8 p4, p4, 0x4 */
/* or-int/2addr p4, p5 */
/* .line 17 */
p5 = this.a;
/* int-to-byte p4, p4 */
java.lang.Byte .valueOf ( p4 );
/* .line 18 */
p4 = this.b;
java.lang.Float .valueOf ( p1 );
/* .line 19 */
p1 = this.b;
java.lang.Float .valueOf ( p2 );
/* .line 20 */
p1 = this.b;
java.lang.Float .valueOf ( p3 );
/* .line 21 */
p1 = this.b;
java.lang.Float .valueOf ( p6 );
/* .line 22 */
p1 = this.b;
java.lang.Float .valueOf ( p7 );
return;
} // .end method
public void a ( e.c.a.j0 p0 ) {
/* .locals 14 */
/* .line 23 */
v0 = this.b;
/* .line 24 */
v1 = this.a;
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
return;
} // :cond_0
/* check-cast v2, Ljava/lang/Byte; */
v2 = (( java.lang.Byte ) v2 ).byteValue ( ); // invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B
if ( v2 != null) { // if-eqz v2, :cond_7
int v3 = 1; // const/4 v3, 0x1
/* if-eq v2, v3, :cond_6 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v2, v4, :cond_5 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq v2, v4, :cond_4 */
/* const/16 v4, 0x8 */
/* if-eq v2, v4, :cond_3 */
/* and-int/lit8 v4, v2, 0x2 */
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_1
int v10 = 1; // const/4 v10, 0x1
} // :cond_1
int v10 = 0; // const/4 v10, 0x0
} // :goto_1
/* and-int/lit8 v2, v2, 0x1 */
if ( v2 != null) { // if-eqz v2, :cond_2
int v11 = 1; // const/4 v11, 0x1
} // :cond_2
int v11 = 0; // const/4 v11, 0x0
/* .line 25 */
} // :goto_2
/* check-cast v2, Ljava/lang/Float; */
v7 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v8 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v9 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v12 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v13 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* move-object v6, p1 */
/* invoke-interface/range {v6 ..v13}, Le/c/a/j0;->a(FFFZZFF)V */
/* .line 26 */
} // :cond_3
/* .line 27 */
} // :cond_4
/* check-cast v2, Ljava/lang/Float; */
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v3, Ljava/lang/Float; */
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* check-cast v4, Ljava/lang/Float; */
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* check-cast v5, Ljava/lang/Float; */
v5 = (( java.lang.Float ) v5 ).floatValue ( ); // invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F
/* goto/16 :goto_0 */
/* .line 28 */
} // :cond_5
/* check-cast v2, Ljava/lang/Float; */
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v5 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v6 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v7 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v8 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v2, Ljava/lang/Float; */
v9 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* move-object v3, p1 */
/* invoke-interface/range {v3 ..v9}, Le/c/a/j0;->a(FFFFFF)V */
/* goto/16 :goto_0 */
/* .line 29 */
} // :cond_6
/* check-cast v2, Ljava/lang/Float; */
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v3, Ljava/lang/Float; */
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* goto/16 :goto_0 */
/* .line 30 */
} // :cond_7
/* check-cast v2, Ljava/lang/Float; */
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* check-cast v3, Ljava/lang/Float; */
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* goto/16 :goto_0 */
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.a;
} // .end method
public void b ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
java.lang.Byte .valueOf ( v1 );
/* .line 2 */
v0 = this.b;
java.lang.Float .valueOf ( p1 );
/* .line 3 */
p1 = this.b;
java.lang.Float .valueOf ( p2 );
return;
} // .end method
public void close ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* const/16 v1, 0x8 */
java.lang.Byte .valueOf ( v1 );
return;
} // .end method
