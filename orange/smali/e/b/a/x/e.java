public class e.b.a.x.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final a;
	 public java.nio.ByteBuffer b;
	 public e.b.a.x.d c;
	 public Integer d;
	 /* # direct methods */
	 public e.b.a.x.e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [B */
		 /* .line 2 */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Le/b/a/x/e;->d:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.x.e a ( java.nio.ByteBuffer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( e.b.a.x.e ) p0 ).m ( ); // invoke-virtual {p0}, Le/b/a/x/e;->m()V
		 /* .line 2 */
		 (( java.nio.ByteBuffer ) p1 ).asReadOnlyBuffer ( ); // invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;
		 this.b = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 (( java.nio.ByteBuffer ) p1 ).position ( v0 ); // invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
		 /* .line 4 */
		 p1 = this.b;
		 v0 = java.nio.ByteOrder.LITTLE_ENDIAN;
		 (( java.nio.ByteBuffer ) p1 ).order ( v0 ); // invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
	 } // .end method
	 public void a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 this.b = v0;
		 /* .line 6 */
		 this.c = v0;
		 return;
	 } // .end method
	 public final a ( Integer p0 ) {
		 /* .locals 9 */
		 /* mul-int/lit8 v0, p1, 0x3 */
		 /* .line 7 */
		 /* new-array v0, v0, [B */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 8 */
		 try { // :try_start_0
			 v2 = this.b;
			 (( java.nio.ByteBuffer ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
			 /* const/16 v2, 0x100 */
			 /* new-array v1, v2, [I */
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 0; // const/4 v3, 0x0
		 } // :goto_0
		 /* if-ge v2, p1, :cond_1 */
		 /* add-int/lit8 v4, v3, 0x1 */
		 /* .line 9 */
		 /* aget-byte v3, v0, v3 */
		 /* and-int/lit16 v3, v3, 0xff */
		 /* add-int/lit8 v5, v4, 0x1 */
		 /* .line 10 */
		 /* aget-byte v4, v0, v4 */
		 /* and-int/lit16 v4, v4, 0xff */
		 /* add-int/lit8 v6, v5, 0x1 */
		 /* .line 11 */
		 /* aget-byte v5, v0, v5 */
		 /* and-int/lit16 v5, v5, 0xff */
		 /* add-int/lit8 v7, v2, 0x1 */
		 /* const/high16 v8, -0x1000000 */
		 /* shl-int/lit8 v3, v3, 0x10 */
		 /* or-int/2addr v3, v8 */
		 /* shl-int/lit8 v4, v4, 0x8 */
		 /* or-int/2addr v3, v4 */
		 /* or-int/2addr v3, v5 */
		 /* .line 12 */
		 /* aput v3, v1, v2 */
		 /* :try_end_0 */
		 /* .catch Ljava/nio/BufferUnderflowException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* move v3, v6 */
		 /* move v2, v7 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 final String v0 = "GifHeaderParser"; // const-string v0, "GifHeaderParser"
		 int v2 = 3; // const/4 v2, 0x3
		 /* .line 13 */
		 v2 = 		 android.util.Log .isLoggable ( v0,v2 );
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 final String v2 = "Format Error Reading Color Table"; // const-string v2, "Format Error Reading Color Table"
			 /* .line 14 */
			 android.util.Log .d ( v0,v2,p1 );
			 /* .line 15 */
		 } // :cond_0
		 p1 = this.c;
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p1, Le/b/a/x/d;->b:I */
	 } // :cond_1
} // .end method
public final void b ( Integer p0 ) {
	 /* .locals 5 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-nez v1, :cond_a */
/* .line 1 */
v2 = (( e.b.a.x.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/x/e;->b()Z
/* if-nez v2, :cond_a */
v2 = this.c;
/* iget v2, v2, Le/b/a/x/d;->c:I */
/* if-gt v2, p1, :cond_a */
/* .line 2 */
v2 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* const/16 v3, 0x21 */
int v4 = 1; // const/4 v4, 0x1
/* if-eq v2, v3, :cond_3 */
/* const/16 v3, 0x2c */
/* if-eq v2, v3, :cond_1 */
/* const/16 v3, 0x3b */
/* if-eq v2, v3, :cond_0 */
/* .line 3 */
v2 = this.c;
/* iput v4, v2, Le/b/a/x/d;->b:I */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
} // :cond_1
v2 = this.c;
v3 = this.d;
/* if-nez v3, :cond_2 */
/* .line 5 */
/* new-instance v3, Le/b/a/x/c; */
/* invoke-direct {v3}, Le/b/a/x/c;-><init>()V */
this.d = v3;
/* .line 6 */
} // :cond_2
(( e.b.a.x.e ) p0 ).e ( ); // invoke-virtual {p0}, Le/b/a/x/e;->e()V
/* .line 7 */
} // :cond_3
v2 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* if-eq v2, v4, :cond_9 */
/* const/16 v3, 0xf9 */
/* if-eq v2, v3, :cond_8 */
/* const/16 v3, 0xfe */
/* if-eq v2, v3, :cond_7 */
/* const/16 v3, 0xff */
/* if-eq v2, v3, :cond_4 */
/* .line 8 */
(( e.b.a.x.e ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/x/e;->n()V
/* .line 9 */
} // :cond_4
(( e.b.a.x.e ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/x/e;->f()V
/* .line 10 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* const/16 v4, 0xb */
/* if-ge v3, v4, :cond_5 */
/* .line 11 */
v4 = this.a;
/* aget-byte v4, v4, v3 */
/* int-to-char v4, v4 */
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 12 */
} // :cond_5
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "NETSCAPE2.0"; // const-string v3, "NETSCAPE2.0"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 13 */
(( e.b.a.x.e ) p0 ).k ( ); // invoke-virtual {p0}, Le/b/a/x/e;->k()V
/* .line 14 */
} // :cond_6
(( e.b.a.x.e ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/x/e;->n()V
/* .line 15 */
} // :cond_7
(( e.b.a.x.e ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/x/e;->n()V
/* .line 16 */
} // :cond_8
v2 = this.c;
/* new-instance v3, Le/b/a/x/c; */
/* invoke-direct {v3}, Le/b/a/x/c;-><init>()V */
this.d = v3;
/* .line 17 */
(( e.b.a.x.e ) p0 ).h ( ); // invoke-virtual {p0}, Le/b/a/x/e;->h()V
/* goto/16 :goto_0 */
/* .line 18 */
} // :cond_9
(( e.b.a.x.e ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/x/e;->n()V
/* goto/16 :goto_0 */
} // :cond_a
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
/* .line 19 */
v0 = this.c;
/* iget v0, v0, Le/b/a/x/d;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public e.b.a.x.d c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v0 = (( e.b.a.x.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/x/e;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.c;
/* .line 4 */
} // :cond_0
(( e.b.a.x.e ) p0 ).i ( ); // invoke-virtual {p0}, Le/b/a/x/e;->i()V
/* .line 5 */
v0 = (( e.b.a.x.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/x/e;->b()Z
/* if-nez v0, :cond_1 */
/* .line 6 */
(( e.b.a.x.e ) p0 ).g ( ); // invoke-virtual {p0}, Le/b/a/x/e;->g()V
/* .line 7 */
v0 = this.c;
/* iget v1, v0, Le/b/a/x/d;->c:I */
/* if-gez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
/* .line 8 */
/* iput v1, v0, Le/b/a/x/d;->b:I */
/* .line 9 */
} // :cond_1
v0 = this.c;
/* .line 10 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "You must call setData() before parseHeader()"; // const-string v1, "You must call setData() before parseHeader()"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final Integer d ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
v0 = (( java.nio.ByteBuffer ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 2 */
/* :catch_0 */
v0 = this.c;
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Le/b/a/x/d;->b:I */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void e ( ) {
/* .locals 8 */
/* .line 1 */
v0 = this.c;
v0 = this.d;
v1 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* iput v1, v0, Le/b/a/x/c;->a:I */
/* .line 2 */
v0 = this.c;
v0 = this.d;
v1 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* iput v1, v0, Le/b/a/x/c;->b:I */
/* .line 3 */
v0 = this.c;
v0 = this.d;
v1 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* iput v1, v0, Le/b/a/x/c;->c:I */
/* .line 4 */
v0 = this.c;
v0 = this.d;
v1 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* iput v1, v0, Le/b/a/x/c;->d:I */
/* .line 5 */
v0 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* and-int/lit16 v1, v0, 0x80 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* const-wide/high16 v4, 0x4000000000000000L # 2.0 */
/* and-int/lit8 v6, v0, 0x7 */
/* add-int/2addr v6, v3 */
/* int-to-double v6, v6 */
/* .line 6 */
java.lang.Math .pow ( v4,v5,v6,v7 );
/* move-result-wide v4 */
/* double-to-int v4, v4 */
/* .line 7 */
v5 = this.c;
v5 = this.d;
/* and-int/lit8 v0, v0, 0x40 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
/* iput-boolean v2, v5, Le/b/a/x/c;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
v0 = this.c;
v0 = this.d;
(( e.b.a.x.e ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Le/b/a/x/e;->a(I)[I
this.k = v1;
/* .line 9 */
} // :cond_2
v0 = this.c;
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
this.k = v1;
/* .line 10 */
} // :goto_1
v0 = this.c;
v0 = this.d;
v1 = this.b;
v1 = (( java.nio.ByteBuffer ) v1 ).position ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I
/* iput v1, v0, Le/b/a/x/c;->j:I */
/* .line 11 */
(( e.b.a.x.e ) p0 ).o ( ); // invoke-virtual {p0}, Le/b/a/x/e;->o()V
/* .line 12 */
v0 = (( e.b.a.x.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/x/e;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_3
return;
/* .line 13 */
} // :cond_3
v0 = this.c;
/* iget v1, v0, Le/b/a/x/d;->c:I */
/* add-int/2addr v1, v3 */
/* iput v1, v0, Le/b/a/x/d;->c:I */
/* .line 14 */
v1 = this.e;
v0 = this.d;
return;
} // .end method
public final void f ( ) {
/* .locals 6 */
/* .line 1 */
v0 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* iput v0, p0, Le/b/a/x/e;->d:I */
/* if-lez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
try { // :try_start_0
/* iget v2, p0, Le/b/a/x/e;->d:I */
/* if-ge v0, v2, :cond_1 */
/* .line 3 */
/* iget v1, p0, Le/b/a/x/e;->d:I */
/* sub-int/2addr v1, v0 */
/* .line 4 */
v2 = this.b;
v3 = this.a;
(( java.nio.ByteBuffer ) v2 ).get ( v3, v0, v1 ); // invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* add-int/2addr v0, v1 */
/* :catch_0 */
/* move-exception v2 */
int v3 = 3; // const/4 v3, 0x3
final String v4 = "GifHeaderParser"; // const-string v4, "GifHeaderParser"
/* .line 5 */
v3 = android.util.Log .isLoggable ( v4,v3 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Error Reading Block n: "; // const-string v5, "Error Reading Block n: "
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " count: "; // const-string v0, " count: "
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " blockSize: "; // const-string v0, " blockSize: "
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Le/b/a/x/e;->d:I */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v0,v2 );
/* .line 7 */
} // :cond_0
v0 = this.c;
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Le/b/a/x/d;->b:I */
} // :cond_1
return;
} // .end method
public final void g ( ) {
/* .locals 1 */
/* const v0, 0x7fffffff */
/* .line 1 */
(( e.b.a.x.e ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/x/e;->b(I)V
return;
} // .end method
public final void h ( ) {
/* .locals 5 */
/* .line 1 */
(( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* .line 2 */
v0 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* .line 3 */
v1 = this.c;
v1 = this.d;
/* and-int/lit8 v2, v0, 0x1c */
int v3 = 2; // const/4 v3, 0x2
/* shr-int/2addr v2, v3 */
/* iput v2, v1, Le/b/a/x/c;->g:I */
int v4 = 1; // const/4 v4, 0x1
/* if-nez v2, :cond_0 */
/* .line 4 */
/* iput v4, v1, Le/b/a/x/c;->g:I */
/* .line 5 */
} // :cond_0
v1 = this.c;
v1 = this.d;
/* and-int/2addr v0, v4 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* iput-boolean v4, v1, Le/b/a/x/c;->f:Z */
/* .line 6 */
v0 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* const/16 v1, 0xa */
/* if-ge v0, v3, :cond_2 */
/* const/16 v0, 0xa */
/* .line 7 */
} // :cond_2
v2 = this.c;
v2 = this.d;
/* mul-int/lit8 v0, v0, 0xa */
/* iput v0, v2, Le/b/a/x/c;->i:I */
/* .line 8 */
v0 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* iput v0, v2, Le/b/a/x/c;->h:I */
/* .line 9 */
(( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
return;
} // .end method
public final void i ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = 6; // const/4 v2, 0x6
/* if-ge v1, v2, :cond_0 */
/* .line 2 */
v2 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* int-to-char v2, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
/* .line 3 */
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "GIF"; // const-string v1, "GIF"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
/* .line 4 */
v0 = this.c;
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Le/b/a/x/d;->b:I */
return;
/* .line 5 */
} // :cond_1
(( e.b.a.x.e ) p0 ).j ( ); // invoke-virtual {p0}, Le/b/a/x/e;->j()V
/* .line 6 */
v0 = this.c;
/* iget-boolean v0, v0, Le/b/a/x/d;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( e.b.a.x.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/x/e;->b()Z
/* if-nez v0, :cond_2 */
/* .line 7 */
v0 = this.c;
/* iget v1, v0, Le/b/a/x/d;->i:I */
(( e.b.a.x.e ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/b/a/x/e;->a(I)[I
this.a = v1;
/* .line 8 */
v0 = this.c;
v1 = this.a;
/* iget v2, v0, Le/b/a/x/d;->j:I */
/* aget v1, v1, v2 */
/* iput v1, v0, Le/b/a/x/d;->l:I */
} // :cond_2
return;
} // .end method
public final void j ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.c;
v1 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* iput v1, v0, Le/b/a/x/d;->f:I */
/* .line 2 */
v0 = this.c;
v1 = (( e.b.a.x.e ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/x/e;->l()I
/* iput v1, v0, Le/b/a/x/d;->g:I */
/* .line 3 */
v0 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* .line 4 */
v1 = this.c;
/* and-int/lit16 v2, v0, 0x80 */
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* iput-boolean v2, v1, Le/b/a/x/d;->h:Z */
/* .line 5 */
v1 = this.c;
/* const-wide/high16 v4, 0x4000000000000000L # 2.0 */
/* and-int/lit8 v0, v0, 0x7 */
/* add-int/2addr v0, v3 */
/* int-to-double v2, v0 */
java.lang.Math .pow ( v4,v5,v2,v3 );
/* move-result-wide v2 */
/* double-to-int v0, v2 */
/* iput v0, v1, Le/b/a/x/d;->i:I */
/* .line 6 */
v0 = this.c;
v1 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* iput v1, v0, Le/b/a/x/d;->j:I */
/* .line 7 */
v0 = this.c;
v1 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* iput v1, v0, Le/b/a/x/d;->k:I */
return;
} // .end method
public final void k ( ) {
/* .locals 3 */
/* .line 1 */
} // :cond_0
(( e.b.a.x.e ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/x/e;->f()V
/* .line 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* aget-byte v1, v0, v1 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
/* .line 3 */
/* aget-byte v1, v0, v2 */
/* and-int/lit16 v1, v1, 0xff */
int v2 = 2; // const/4 v2, 0x2
/* .line 4 */
/* aget-byte v0, v0, v2 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 5 */
v2 = this.c;
/* shl-int/lit8 v0, v0, 0x8 */
/* or-int/2addr v0, v1 */
/* iput v0, v2, Le/b/a/x/d;->m:I */
/* .line 6 */
} // :cond_1
/* iget v0, p0, Le/b/a/x/e;->d:I */
/* if-lez v0, :cond_2 */
v0 = (( e.b.a.x.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/x/e;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_2
return;
} // .end method
public final Integer l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( java.nio.ByteBuffer ) v0 ).getShort ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S
} // .end method
public final void m ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.b = v0;
/* .line 2 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
java.util.Arrays .fill ( v0,v1 );
/* .line 3 */
/* new-instance v0, Le/b/a/x/d; */
/* invoke-direct {v0}, Le/b/a/x/d;-><init>()V */
this.c = v0;
/* .line 4 */
/* iput v1, p0, Le/b/a/x/e;->d:I */
return;
} // .end method
public final void n ( ) {
/* .locals 3 */
/* .line 1 */
} // :cond_0
v0 = (( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* .line 2 */
v1 = this.b;
v1 = (( java.nio.ByteBuffer ) v1 ).position ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I
/* add-int/2addr v1, v0 */
v2 = this.b;
v2 = (( java.nio.ByteBuffer ) v2 ).limit ( ); // invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I
v1 = java.lang.Math .min ( v1,v2 );
/* .line 3 */
v2 = this.b;
(( java.nio.ByteBuffer ) v2 ).position ( v1 ); // invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
/* if-gtz v0, :cond_0 */
return;
} // .end method
public final void o ( ) {
/* .locals 0 */
/* .line 1 */
(( e.b.a.x.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/e;->d()I
/* .line 2 */
(( e.b.a.x.e ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/x/e;->n()V
return;
} // .end method
