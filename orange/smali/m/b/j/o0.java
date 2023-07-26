public abstract class m.b.j.o0 extends m.b.j.q0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String b;
	 public java.lang.String c;
	 public java.lang.String d;
	 public java.lang.StringBuilder e;
	 public java.lang.String f;
	 public Boolean g;
	 public Boolean h;
	 public Boolean i;
	 public m.b.i.b j;
	 /* # direct methods */
	 public m.b.j.o0 ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Lm/b/j/q0;-><init>(Lm/b/j/h0;)V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 this.e = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lm/b/j/o0;->g:Z */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lm/b/j/o0;->h:Z */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lm/b/j/o0;->i:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 java.lang.String .valueOf ( p1 );
		 (( m.b.j.o0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/o0;->a(Ljava/lang/String;)V
		 return;
	 } // .end method
	 public final void a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
		 /* if-nez v0, :cond_0 */
	 } // :cond_0
	 (( java.lang.String ) v0 ).concat ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :goto_0
this.d = p1;
return;
} // .end method
public final void a ( Integer[] p0 ) {
/* .locals 4 */
/* .line 3 */
(( m.b.j.o0 ) p0 ).n ( ); // invoke-virtual {p0}, Lm/b/j/o0;->n()V
/* .line 4 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget v2, p1, v1 */
/* .line 5 */
v3 = this.e;
(( java.lang.StringBuilder ) v3 ).appendCodePoint ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 1 */
/* .line 5 */
(( m.b.j.o0 ) p0 ).n ( ); // invoke-virtual {p0}, Lm/b/j/o0;->n()V
/* .line 6 */
v0 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
return;
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
(( m.b.j.o0 ) p0 ).n ( ); // invoke-virtual {p0}, Lm/b/j/o0;->n()V
/* .line 2 */
v0 = this.e;
v0 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-nez v0, :cond_0 */
/* .line 3 */
this.f = p1;
/* .line 4 */
} // :cond_0
v0 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_0
return;
} // .end method
public final void c ( Object p0 ) {
/* .locals 0 */
/* .line 3 */
java.lang.String .valueOf ( p1 );
(( m.b.j.o0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/o0;->c(Ljava/lang/String;)V
return;
} // .end method
public final void c ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
} // :cond_0
(( java.lang.String ) v0 ).concat ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :goto_0
this.b = p1;
/* .line 2 */
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
this.c = p1;
return;
} // .end method
public final m.b.j.o0 d ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* .line 2 */
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
this.c = p1;
} // .end method
public m.b.j.o0 l ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.b = v0;
/* .line 3 */
this.c = v0;
/* .line 4 */
this.d = v0;
/* .line 5 */
v1 = this.e;
m.b.j.q0 .a ( v1 );
/* .line 6 */
this.f = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
/* iput-boolean v1, p0, Lm/b/j/o0;->g:Z */
/* .line 8 */
/* iput-boolean v1, p0, Lm/b/j/o0;->h:Z */
/* .line 9 */
/* iput-boolean v1, p0, Lm/b/j/o0;->i:Z */
/* .line 10 */
this.j = v0;
} // .end method
public m.b.j.q0 l ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( m.b.j.o0 ) p0 ).l ( ); // invoke-virtual {p0}, Lm/b/j/o0;->l()Lm/b/j/o0;
} // .end method
public final void n ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Lm/b/j/o0;->h:Z */
/* .line 2 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v1 = this.e;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.f = v0;
} // :cond_0
return;
} // .end method
public final void o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( m.b.j.o0 ) p0 ).s ( ); // invoke-virtual {p0}, Lm/b/j/o0;->s()V
} // :cond_0
return;
} // .end method
public final m.b.i.b p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public final Boolean q ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lm/b/j/o0;->i:Z */
} // .end method
public final java.lang.String r ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
m.b.h.j .a ( v0 );
/* .line 2 */
v0 = this.b;
} // .end method
public final void s ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.j;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lm/b/i/b; */
/* invoke-direct {v0}, Lm/b/i/b;-><init>()V */
this.j = v0;
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 4 */
/* iget-boolean v0, p0, Lm/b/j/o0;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
/* new-instance v0, Lm/b/i/a; */
v1 = this.d;
v2 = this.e;
/* .line 6 */
v2 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* if-lez v2, :cond_1 */
v2 = this.e;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
v2 = this.f;
} // :goto_0
/* invoke-direct {v0, v1, v2}, Lm/b/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 7 */
} // :cond_2
/* iget-boolean v0, p0, Lm/b/j/o0;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
/* new-instance v0, Lm/b/i/a; */
v1 = this.d;
final String v2 = ""; // const-string v2, ""
/* invoke-direct {v0, v1, v2}, Lm/b/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 9 */
} // :cond_3
/* new-instance v0, Lm/b/i/c; */
v1 = this.d;
/* invoke-direct {v0, v1}, Lm/b/i/c;-><init>(Ljava/lang/String;)V */
/* .line 10 */
} // :goto_1
v1 = this.j;
(( m.b.i.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lm/b/i/b;->a(Lm/b/i/a;)V
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
this.d = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 12 */
/* iput-boolean v1, p0, Lm/b/j/o0;->g:Z */
/* .line 13 */
/* iput-boolean v1, p0, Lm/b/j/o0;->h:Z */
/* .line 14 */
v1 = this.e;
m.b.j.q0 .a ( v1 );
/* .line 15 */
this.f = v0;
return;
} // .end method
public final java.lang.String t ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public final void u ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Lm/b/j/o0;->g:Z */
return;
} // .end method
