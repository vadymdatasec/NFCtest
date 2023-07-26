public class c.f.a.l.g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/f/a/l/g$a;, */
	 /* Lc/f/a/l/g$b; */
	 /* } */
} // .end annotation
/* # instance fields */
public c.f.a.l.q a;
public final c.f.a.l.i b;
public final c.f.a.l.g$b c;
public c.f.a.l.g d;
public Integer e;
public Integer f;
public c.f.a.l.g$a g;
public Integer h;
public c.f.a.k i;
/* # direct methods */
public c.f.a.l.g ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Lc/f/a/l/q; */
	 /* invoke-direct {v0, p0}, Lc/f/a/l/q;-><init>(Lc/f/a/l/g;)V */
	 this.a = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 3 */
	 /* iput v0, p0, Lc/f/a/l/g;->e:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 4 */
	 /* iput v1, p0, Lc/f/a/l/g;->f:I */
	 /* .line 5 */
	 v1 = c.f.a.l.g$a.b;
	 this.g = v1;
	 /* .line 6 */
	 v1 = c.f.a.l.f.b;
	 /* .line 7 */
	 /* iput v0, p0, Lc/f/a/l/g;->h:I */
	 /* .line 8 */
	 this.b = p1;
	 /* .line 9 */
	 this.c = p2;
	 return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
	 /* .locals 1 */
	 /* .line 4 */
	 /* iget v0, p0, Lc/f/a/l/g;->h:I */
} // .end method
public void a ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 p1 = this.i;
	 /* if-nez p1, :cond_0 */
	 /* .line 2 */
	 /* new-instance p1, Lc/f/a/k; */
	 v0 = c.f.a.j.b;
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p1, v0, v1}, Lc/f/a/k;-><init>(Lc/f/a/j;Ljava/lang/String;)V */
	 this.i = p1;
	 /* .line 3 */
} // :cond_0
(( c.f.a.k ) p1 ).a ( ); // invoke-virtual {p1}, Lc/f/a/k;->a()V
} // :goto_0
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 18 */
} // :cond_0
(( c.f.a.l.g ) p1 ).h ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->h()Lc/f/a/l/g$b;
/* .line 19 */
v2 = this.c;
int v3 = 1; // const/4 v3, 0x1
/* if-ne v1, v2, :cond_3 */
/* .line 20 */
v1 = c.f.a.l.g$b.g;
/* if-ne v2, v1, :cond_2 */
/* .line 21 */
(( c.f.a.l.g ) p1 ).c ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->c()Lc/f/a/l/i;
p1 = (( c.f.a.l.i ) p1 ).y ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->y()Z
if ( p1 != null) { // if-eqz p1, :cond_1
(( c.f.a.l.g ) p0 ).c ( ); // invoke-virtual {p0}, Lc/f/a/l/g;->c()Lc/f/a/l/i;
p1 = (( c.f.a.l.i ) p1 ).y ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->y()Z
/* if-nez p1, :cond_2 */
} // :cond_1
} // :cond_2
/* .line 22 */
} // :cond_3
v4 = c.f.a.l.e.a;
v2 = (( java.lang.Enum ) v2 ).ordinal ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I
/* aget v2, v4, v2 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 23 */
/* new-instance p1, Ljava/lang/AssertionError; */
v0 = this.c;
(( java.lang.Enum ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw p1 */
/* :pswitch_0 */
/* .line 24 */
/* :pswitch_1 */
v2 = c.f.a.l.g$b.d;
/* if-eq v1, v2, :cond_5 */
v2 = c.f.a.l.g$b.f;
/* if-ne v1, v2, :cond_4 */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
} // :cond_5
} // :goto_0
int v2 = 1; // const/4 v2, 0x1
/* .line 25 */
} // :goto_1
(( c.f.a.l.g ) p1 ).c ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->c()Lc/f/a/l/i;
/* instance-of p1, p1, Lc/f/a/l/m; */
if ( p1 != null) { // if-eqz p1, :cond_8
/* if-nez v2, :cond_6 */
/* .line 26 */
p1 = c.f.a.l.g$b.j;
/* if-ne v1, p1, :cond_7 */
} // :cond_6
int v0 = 1; // const/4 v0, 0x1
} // :cond_7
/* move v2, v0 */
} // :cond_8
/* .line 27 */
/* :pswitch_2 */
v2 = c.f.a.l.g$b.c;
/* if-eq v1, v2, :cond_a */
v2 = c.f.a.l.g$b.e;
/* if-ne v1, v2, :cond_9 */
} // :cond_9
int v2 = 0; // const/4 v2, 0x0
} // :cond_a
} // :goto_2
int v2 = 1; // const/4 v2, 0x1
/* .line 28 */
} // :goto_3
(( c.f.a.l.g ) p1 ).c ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->c()Lc/f/a/l/i;
/* instance-of p1, p1, Lc/f/a/l/m; */
if ( p1 != null) { // if-eqz p1, :cond_d
/* if-nez v2, :cond_b */
/* .line 29 */
p1 = c.f.a.l.g$b.i;
/* if-ne v1, p1, :cond_c */
} // :cond_b
int v0 = 1; // const/4 v0, 0x1
} // :cond_c
/* move v2, v0 */
} // :cond_d
/* .line 30 */
/* :pswitch_3 */
p1 = c.f.a.l.g$b.g;
/* if-eq v1, p1, :cond_e */
p1 = c.f.a.l.g$b.i;
/* if-eq v1, p1, :cond_e */
p1 = c.f.a.l.g$b.j;
/* if-eq v1, p1, :cond_e */
int v0 = 1; // const/4 v0, 0x1
} // :cond_e
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean a ( Object p0, Integer p1, Integer p2, c.f.a.l.g$a p3, Integer p4, Boolean p5 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
this.d = p1;
/* .line 7 */
/* iput v1, p0, Lc/f/a/l/g;->e:I */
int p1 = -1; // const/4 p1, -0x1
/* .line 8 */
/* iput p1, p0, Lc/f/a/l/g;->f:I */
/* .line 9 */
p1 = c.f.a.l.g$a.b;
this.g = p1;
int p1 = 2; // const/4 p1, 0x2
/* .line 10 */
/* iput p1, p0, Lc/f/a/l/g;->h:I */
} // :cond_0
/* if-nez p6, :cond_1 */
/* .line 11 */
p6 = (( c.f.a.l.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/f/a/l/g;->a(Lc/f/a/l/g;)Z
/* if-nez p6, :cond_1 */
/* .line 12 */
} // :cond_1
this.d = p1;
/* if-lez p2, :cond_2 */
/* .line 13 */
/* iput p2, p0, Lc/f/a/l/g;->e:I */
/* .line 14 */
} // :cond_2
/* iput v1, p0, Lc/f/a/l/g;->e:I */
/* .line 15 */
} // :goto_0
/* iput p3, p0, Lc/f/a/l/g;->f:I */
/* .line 16 */
this.g = p4;
/* .line 17 */
/* iput p5, p0, Lc/f/a/l/g;->h:I */
} // .end method
public Boolean a ( Object p0, Integer p1, c.f.a.l.g$a p2, Integer p3 ) {
/* .locals 7 */
int v3 = -1; // const/4 v3, -0x1
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* .line 5 */
p1 = /* invoke-virtual/range {v0 ..v6}, Lc/f/a/l/g;->a(Lc/f/a/l/g;IILc/f/a/l/g$a;IZ)Z */
} // .end method
public Integer b ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
v0 = (( c.f.a.l.i ) v0 ).s ( ); // invoke-virtual {v0}, Lc/f/a/l/i;->s()I
/* const/16 v1, 0x8 */
/* if-ne v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
/* iget v0, p0, Lc/f/a/l/g;->f:I */
int v2 = -1; // const/4 v2, -0x1
/* if-le v0, v2, :cond_1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
/* .line 3 */
v0 = (( c.f.a.l.i ) v0 ).s ( ); // invoke-virtual {v0}, Lc/f/a/l/i;->s()I
/* if-ne v0, v1, :cond_1 */
/* .line 4 */
/* iget v0, p0, Lc/f/a/l/g;->f:I */
/* .line 5 */
} // :cond_1
/* iget v0, p0, Lc/f/a/l/g;->e:I */
} // .end method
public c.f.a.l.i c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public c.f.a.l.q d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public c.f.a.k e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public c.f.a.l.g$a f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public c.f.a.l.g g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public c.f.a.l.g$b h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public Boolean i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void j ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.d = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lc/f/a/l/g;->e:I */
int v1 = -1; // const/4 v1, -0x1
/* .line 3 */
/* iput v1, p0, Lc/f/a/l/g;->f:I */
/* .line 4 */
v1 = c.f.a.l.g$a.c;
this.g = v1;
/* .line 5 */
/* iput v0, p0, Lc/f/a/l/g;->h:I */
/* .line 6 */
v0 = c.f.a.l.f.b;
/* .line 7 */
v0 = this.a;
(( c.f.a.l.q ) v0 ).d ( ); // invoke-virtual {v0}, Lc/f/a/l/q;->d()V
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.b;
(( c.f.a.l.i ) v1 ).g ( ); // invoke-virtual {v1}, Lc/f/a/l/i;->g()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ":"; // const-string v1, ":"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.Enum ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
