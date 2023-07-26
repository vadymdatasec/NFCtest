public class m.b.j.r0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 public Integer b;
	 /* # direct methods */
	 public m.b.j.r0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lm/b/j/r0;->b:I */
		 /* .line 3 */
		 m.b.h.j .a ( p1 );
		 /* .line 4 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static java.lang.String f ( java.lang.String p0 ) {
		 /* .locals 6 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 3 */
		 (( java.lang.String ) p0 ).toCharArray ( ); // invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
		 /* array-length v1, p0 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
	 } // :goto_0
	 /* if-ge v2, v1, :cond_2 */
	 /* aget-char v4, p0, v2 */
	 /* const/16 v5, 0x5c */
	 /* if-ne v4, v5, :cond_0 */
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* if-ne v3, v5, :cond_1 */
		 /* .line 4 */
		 (( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* .line 5 */
	 } // :cond_0
	 (( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_1
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
/* move v3, v4 */
/* .line 6 */
} // :cond_2
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public Object a ( ) {
/* .locals 3 */
/* .line 4 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lm/b/j/r0;->b:I */
v0 = (( java.lang.String ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
} // .end method
public java.lang.String a ( Object p0, Object p1 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = -1; // const/4 v4, -0x1
int v5 = -1; // const/4 v5, -0x1
/* .line 11 */
} // :cond_0
v6 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 12 */
} // :cond_1
v6 = (( m.b.j.r0 ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/j/r0;->a()C
java.lang.Character .valueOf ( v6 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* const/16 v7, 0x5c */
/* if-eq v0, v7, :cond_7 */
} // :cond_2
/* const/16 v7, 0x27 */
/* .line 13 */
java.lang.Character .valueOf ( v7 );
v7 = (( java.lang.Character ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_3 */
/* const/16 v7, 0x22 */
java.lang.Character .valueOf ( v7 );
v7 = (( java.lang.Character ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_4
} // :cond_3
v7 = (( java.lang.Character ) v6 ).charValue ( ); // invoke-virtual {v6}, Ljava/lang/Character;->charValue()C
/* if-eq v7, p1, :cond_4 */
/* xor-int/lit8 v2, v2, 0x1 */
} // :cond_4
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 14 */
} // :cond_5
java.lang.Character .valueOf ( p1 );
v7 = (( java.lang.Character ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_6
/* add-int/lit8 v3, v3, 0x1 */
/* if-ne v4, v1, :cond_7 */
/* .line 15 */
/* iget v4, p0, Lm/b/j/r0;->b:I */
/* .line 16 */
} // :cond_6
java.lang.Character .valueOf ( p2 );
v7 = (( java.lang.Character ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Character;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_7
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_7
} // :goto_0
/* if-lez v3, :cond_8 */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 17 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
/* move v5, v0 */
/* .line 18 */
} // :cond_8
v0 = (( java.lang.Character ) v6 ).charValue ( ); // invoke-virtual {v6}, Ljava/lang/Character;->charValue()C
} // :goto_1
/* if-gtz v3, :cond_0 */
} // :goto_2
/* if-ltz v5, :cond_9 */
/* .line 19 */
p1 = this.a;
(( java.lang.String ) p1 ).substring ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_9
final String p1 = ""; // const-string p1, ""
} // :goto_3
} // .end method
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 9 */
(( m.b.j.r0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/r0;->c(Ljava/lang/String;)Ljava/lang/String;
/* .line 10 */
(( m.b.j.r0 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/r0;->d(Ljava/lang/String;)Z
} // .end method
public java.lang.String a ( java.lang.String...p0 ) {
/* .locals 2 */
/* .line 5 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
/* .line 6 */
} // :goto_0
v1 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
/* if-nez v1, :cond_0 */
v1 = (( m.b.j.r0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/r0;->b([Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 7 */
/* iget v1, p0, Lm/b/j/r0;->b:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lm/b/j/r0;->b:I */
/* .line 8 */
} // :cond_0
p1 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
(( java.lang.String ) p1 ).substring ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public Boolean a ( Object...p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* array-length v0, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* aget-char v3, p1, v2 */
/* .line 3 */
v4 = this.a;
/* iget v5, p0, Lm/b/j/r0;->b:I */
v4 = (( java.lang.String ) v4 ).charAt ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C
/* if-ne v4, v3, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public java.lang.String b ( ) {
/* .locals 3 */
/* .line 9 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
/* .line 10 */
} // :goto_0
v1 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
/* if-nez v1, :cond_1 */
v1 = (( m.b.j.r0 ) p0 ).g ( ); // invoke-virtual {p0}, Lm/b/j/r0;->g()Z
/* if-nez v1, :cond_0 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [C */
/* fill-array-data v1, :array_0 */
v1 = (( m.b.j.r0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lm/b/j/r0;->a([C)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 11 */
} // :cond_0
/* iget v1, p0, Lm/b/j/r0;->b:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lm/b/j/r0;->b:I */
/* .line 12 */
} // :cond_1
v1 = this.a;
/* iget v2, p0, Lm/b/j/r0;->b:I */
(( java.lang.String ) v1 ).substring ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* :array_0 */
/* .array-data 2 */
/* 0x2ds */
/* 0x5fs */
} // .end array-data
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = (( m.b.j.r0 ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/r0;->e(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 5 */
v0 = (( m.b.j.r0 ) p0 ).i ( ); // invoke-virtual {p0}, Lm/b/j/r0;->i()I
/* if-gt p1, v0, :cond_0 */
/* .line 6 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lm/b/j/r0;->b:I */
return;
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Queue not long enough to consume sequence"; // const-string v0, "Queue not long enough to consume sequence"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 8 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Queue did not match expected sequence"; // const-string v0, "Queue did not match expected sequence"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Boolean b ( java.lang.String...p0 ) {
/* .locals 4 */
/* .line 1 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* aget-object v3, p1, v2 */
/* .line 2 */
v3 = (( m.b.j.r0 ) p0 ).e ( v3 ); // invoke-virtual {p0, v3}, Lm/b/j/r0;->e(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public java.lang.String c ( ) {
/* .locals 5 */
/* .line 5 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
/* .line 6 */
} // :goto_0
v1 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
/* if-nez v1, :cond_1 */
v1 = (( m.b.j.r0 ) p0 ).g ( ); // invoke-virtual {p0}, Lm/b/j/r0;->g()Z
/* if-nez v1, :cond_0 */
final String v1 = "*|"; // const-string v1, "*|"
final String v2 = "|"; // const-string v2, "|"
final String v3 = "_"; // const-string v3, "_"
final String v4 = "-"; // const-string v4, "-"
/* filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String; */
v1 = (( m.b.j.r0 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lm/b/j/r0;->b([Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
} // :cond_0
/* iget v1, p0, Lm/b/j/r0;->b:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lm/b/j/r0;->b:I */
/* .line 8 */
} // :cond_1
v1 = this.a;
/* iget v2, p0, Lm/b/j/r0;->b:I */
(( java.lang.String ) v1 ).substring ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public java.lang.String c ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
p1 = (( java.lang.String ) v0 ).indexOf ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
(( java.lang.String ) v0 ).substring ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 3 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lm/b/j/r0;->b:I */
/* .line 4 */
} // :cond_0
(( m.b.j.r0 ) p0 ).h ( ); // invoke-virtual {p0}, Lm/b/j/r0;->h()Ljava/lang/String;
} // .end method
public Boolean d ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = (( m.b.j.r0 ) p0 ).f ( ); // invoke-virtual {p0}, Lm/b/j/r0;->f()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
/* iget v1, p0, Lm/b/j/r0;->b:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Lm/b/j/r0;->b:I */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public Boolean d ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( m.b.j.r0 ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/r0;->e(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v0, p0, Lm/b/j/r0;->b:I */
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lm/b/j/r0;->b:I */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( m.b.j.r0 ) p0 ).i ( ); // invoke-virtual {p0}, Lm/b/j/r0;->i()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean e ( java.lang.String p0 ) {
/* .locals 6 */
/* .line 2 */
v0 = this.a;
/* iget v2, p0, Lm/b/j/r0;->b:I */
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v1 = 1; // const/4 v1, 0x1
int v4 = 0; // const/4 v4, 0x0
/* move-object v3, p1 */
p1 = /* invoke-virtual/range {v0 ..v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z */
} // .end method
public Boolean f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
/* if-nez v0, :cond_0 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
v0 = (( java.lang.String ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
v0 = m.b.h.i .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean g ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( m.b.j.r0 ) p0 ).e ( ); // invoke-virtual {p0}, Lm/b/j/r0;->e()Z
/* if-nez v0, :cond_0 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
v0 = (( java.lang.String ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
v0 = java.lang.Character .isLetterOrDigit ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.String h ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
(( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 2 */
v1 = this.a;
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* iput v1, p0, Lm/b/j/r0;->b:I */
} // .end method
public final Integer i ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* iget v1, p0, Lm/b/j/r0;->b:I */
/* sub-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* iget v1, p0, Lm/b/j/r0;->b:I */
(( java.lang.String ) v0 ).substring ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // .end method
