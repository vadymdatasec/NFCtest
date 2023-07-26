public class e.f.b.c.d extends com.google.common.io.BaseEncoding {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.b.c.a c;
	 public final java.lang.Character d;
	 /* # direct methods */
	 public e.f.b.c.d ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Lcom/google/common/io/BaseEncoding;-><init>()V */
		 /* .line 3 */
		 e.f.b.a.p .a ( p1 );
		 /* move-object v0, p1 */
		 /* check-cast v0, Le/f/b/c/a; */
		 this.c = v0;
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 /* .line 4 */
			 v0 = 			 (( java.lang.Character ) p2 ).charValue ( ); // invoke-virtual {p2}, Ljava/lang/Character;->charValue()C
			 p1 = 			 (( e.f.b.c.a ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/f/b/c/a;->b(C)Z
			 /* if-nez p1, :cond_0 */
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
final String v0 = "Padding character %s was already in alphabet"; // const-string v0, "Padding character %s was already in alphabet"
/* .line 5 */
e.f.b.a.p .a ( p1,v0,p2 );
/* .line 6 */
this.d = p2;
return;
} // .end method
public e.f.b.c.d ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/b/c/a; */
(( java.lang.String ) p2 ).toCharArray ( ); // invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C
/* invoke-direct {v0, p1, p2}, Le/f/b/c/a;-><init>(Ljava/lang/String;[C)V */
/* invoke-direct {p0, v0, p3}, Le/f/b/c/d;-><init>(Le/f/b/c/a;Ljava/lang/Character;)V */
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 4 */
/* .line 5 */
v0 = this.c;
/* iget v0, v0, Le/f/b/c/a;->d:I */
/* int-to-long v0, v0 */
/* int-to-long v2, p1 */
/* mul-long v0, v0, v2 */
/* const-wide/16 v2, 0x7 */
/* add-long/2addr v0, v2 */
/* const-wide/16 v2, 0x8 */
/* div-long/2addr v0, v2 */
/* long-to-int p1, v0 */
} // .end method
public Integer a ( Object[] p0, java.lang.CharSequence p1 ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/common/io/BaseEncoding$DecodingException; */
/* } */
} // .end annotation
/* .line 6 */
e.f.b.a.p .a ( p1 );
/* .line 7 */
(( e.f.b.c.d ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/f/b/c/d;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/* .line 8 */
v1 = v0 = this.c;
v0 = (( e.f.b.c.a ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/b/c/a;->b(I)Z
if ( v0 != null) { // if-eqz v0, :cond_4
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 9 */
v3 = } // :goto_0
/* if-ge v1, v3, :cond_3 */
/* const-wide/16 v3, 0x0 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 10 */
} // :goto_1
v7 = this.c;
/* iget v8, v7, Le/f/b/c/a;->e:I */
/* if-ge v5, v8, :cond_1 */
/* .line 11 */
/* iget v7, v7, Le/f/b/c/a;->d:I */
/* shl-long/2addr v3, v7 */
/* add-int v7, v1, v5 */
v8 = /* .line 12 */
/* if-ge v7, v8, :cond_0 */
/* .line 13 */
v7 = this.c;
/* add-int/lit8 v8, v6, 0x1 */
v6 = /* add-int/2addr v6, v1 */
v6 = (( e.f.b.c.a ) v7 ).a ( v6 ); // invoke-virtual {v7, v6}, Le/f/b/c/a;->a(C)I
/* int-to-long v6, v6 */
/* or-long/2addr v3, v6 */
/* move v6, v8 */
} // :cond_0
/* add-int/lit8 v5, v5, 0x1 */
/* .line 14 */
} // :cond_1
/* iget v5, v7, Le/f/b/c/a;->f:I */
/* mul-int/lit8 v8, v5, 0x8 */
/* iget v7, v7, Le/f/b/c/a;->d:I */
/* mul-int v6, v6, v7 */
/* sub-int/2addr v8, v6 */
/* add-int/lit8 v5, v5, -0x1 */
/* mul-int/lit8 v5, v5, 0x8 */
} // :goto_2
/* if-lt v5, v8, :cond_2 */
/* add-int/lit8 v6, v2, 0x1 */
/* ushr-long v9, v3, v5 */
/* const-wide/16 v11, 0xff */
/* and-long/2addr v9, v11 */
/* long-to-int v7, v9 */
/* int-to-byte v7, v7 */
/* .line 15 */
/* aput-byte v7, p1, v2 */
/* add-int/lit8 v5, v5, -0x8 */
/* move v2, v6 */
/* .line 16 */
} // :cond_2
v3 = this.c;
/* iget v3, v3, Le/f/b/c/a;->e:I */
/* add-int/2addr v1, v3 */
} // :cond_3
/* .line 17 */
} // :cond_4
p2 = /* new-instance p1, Lcom/google/common/io/BaseEncoding$DecodingException; */
/* const/16 v0, 0x20 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v0 = "Invalid input length "; // const-string v0, "Invalid input length "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lcom/google/common/io/BaseEncoding$DecodingException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public com.google.common.io.BaseEncoding a ( ) {
/* .locals 2 */
/* .line 18 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* move-object v0, p0 */
} // :cond_0
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
(( e.f.b.c.d ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/b/c/d;->a(Le/f/b/c/a;Ljava/lang/Character;)Lcom/google/common/io/BaseEncoding;
} // :goto_0
} // .end method
public com.google.common.io.BaseEncoding a ( Object p0, java.lang.Character p1 ) {
/* .locals 1 */
/* .line 19 */
/* new-instance v0, Le/f/b/c/d; */
/* invoke-direct {v0, p1, p2}, Le/f/b/c/d;-><init>(Le/f/b/c/a;Ljava/lang/Character;)V */
} // .end method
public void a ( java.lang.Appendable p0, Object[] p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.a.p .a ( p1 );
/* add-int v0, p3, p4 */
/* .line 2 */
/* array-length v1, p2 */
e.f.b.a.p .b ( p3,v0,v1 );
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, p4, :cond_0 */
/* add-int v1, p3, v0 */
/* .line 3 */
v2 = this.c;
/* iget v2, v2, Le/f/b/c/a;->f:I */
/* sub-int v3, p4, v0 */
v2 = java.lang.Math .min ( v2,v3 );
(( e.f.b.c.d ) p0 ).b ( p1, p2, v1, v2 ); // invoke-virtual {p0, p1, p2, v1, v2}, Le/f/b/c/d;->b(Ljava/lang/Appendable;[BII)V
/* .line 4 */
v1 = this.c;
/* iget v1, v1, Le/f/b/c/a;->f:I */
/* add-int/2addr v0, v1 */
} // :cond_0
return;
} // .end method
public Integer b ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
/* iget v1, v0, Le/f/b/c/a;->e:I */
/* iget v0, v0, Le/f/b/c/a;->f:I */
v2 = java.math.RoundingMode.CEILING;
p1 = e.f.b.d.b .a ( p1,v0,v2 );
/* mul-int v1, v1, p1 */
} // .end method
public void b ( java.lang.Appendable p0, Object[] p1, Integer p2, Integer p3 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
e.f.b.a.p .a ( p1 );
/* add-int v0, p3, p4 */
/* .line 3 */
/* array-length v1, p2 */
e.f.b.a.p .b ( p3,v0,v1 );
/* .line 4 */
v0 = this.c;
/* iget v0, v0, Le/f/b/c/a;->f:I */
int v1 = 0; // const/4 v1, 0x0
/* if-gt p4, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
e.f.b.a.p .a ( v0 );
/* const-wide/16 v2, 0x0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* const/16 v4, 0x8 */
/* if-ge v0, p4, :cond_1 */
/* add-int v5, p3, v0 */
/* .line 5 */
/* aget-byte v5, p2, v5 */
/* and-int/lit16 v5, v5, 0xff */
/* int-to-long v5, v5 */
/* or-long/2addr v2, v5 */
/* shl-long/2addr v2, v4 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* add-int/lit8 p2, p4, 0x1 */
/* mul-int/lit8 p2, p2, 0x8 */
/* .line 6 */
p3 = this.c;
/* iget p3, p3, Le/f/b/c/a;->d:I */
/* sub-int/2addr p2, p3 */
} // :goto_2
/* mul-int/lit8 p3, p4, 0x8 */
/* if-ge v1, p3, :cond_2 */
/* sub-int p3, p2, v1 */
/* ushr-long v5, v2, p3 */
/* long-to-int p3, v5 */
/* .line 7 */
v0 = this.c;
/* iget v5, v0, Le/f/b/c/a;->c:I */
/* and-int/2addr p3, v5 */
/* .line 8 */
p3 = (( e.f.b.c.a ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Le/f/b/c/a;->a(I)C
/* .line 9 */
p3 = this.c;
/* iget p3, p3, Le/f/b/c/a;->d:I */
/* add-int/2addr v1, p3 */
/* .line 10 */
} // :cond_2
p2 = this.d;
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 11 */
} // :goto_3
p2 = this.c;
/* iget p2, p2, Le/f/b/c/a;->f:I */
/* mul-int/lit8 p2, p2, 0x8 */
/* if-ge v1, p2, :cond_3 */
/* .line 12 */
p2 = this.d;
p2 = (( java.lang.Character ) p2 ).charValue ( ); // invoke-virtual {p2}, Ljava/lang/Character;->charValue()C
/* .line 13 */
p2 = this.c;
/* iget p2, p2, Le/f/b/c/a;->d:I */
/* add-int/2addr v1, p2 */
} // :cond_3
return;
} // .end method
public java.lang.CharSequence c ( java.lang.CharSequence p0 ) {
/* .locals 3 */
/* .line 1 */
e.f.b.a.p .a ( p1 );
/* .line 2 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
v0 = (( java.lang.Character ) v0 ).charValue ( ); // invoke-virtual {v0}, Ljava/lang/Character;->charValue()C
v1 = /* .line 4 */
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
/* if-ltz v1, :cond_2 */
v2 = /* .line 5 */
/* if-eq v2, v0, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_2
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Le/f/b/c/d; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/f/b/c/d; */
/* .line 3 */
v0 = this.c;
v2 = this.c;
v0 = (( e.f.b.c.a ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Le/f/b/c/a;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
p1 = this.d;
/* .line 4 */
p1 = e.f.b.a.k .a ( v0,p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public Integer hashCode ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.c;
v0 = (( e.f.b.c.a ) v0 ).hashCode ( ); // invoke-virtual {v0}, Le/f/b/c/a;->hashCode()I
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
v2 = this.d;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
v1 = e.f.b.a.k .a ( v1 );
/* xor-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "BaseEncoding."; // const-string v1, "BaseEncoding."
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 2 */
v1 = this.c;
(( e.f.b.c.a ) v1 ).toString ( ); // invoke-virtual {v1}, Le/f/b/c/a;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
v1 = this.c;
/* iget v1, v1, Le/f/b/c/a;->d:I */
/* const/16 v2, 0x8 */
/* rem-int/2addr v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 4 */
v1 = this.d;
/* if-nez v1, :cond_0 */
final String v1 = ".omitPadding()"; // const-string v1, ".omitPadding()"
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
final String v1 = ".withPadChar(\'"; // const-string v1, ".withPadChar(\'"
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "\')"; // const-string v1, "\')"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
} // :cond_1
} // :goto_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
