public class c.e.f implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<E:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Cloneable;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object f;
/* # instance fields */
public Boolean b;
public c;
public java.lang.Object d;
public Integer e;
/* # direct methods */
public static c.e.f ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public c.e.f ( ) {
	 /* .locals 1 */
	 /* const/16 v0, 0xa */
	 /* .line 1 */
	 /* invoke-direct {p0, v0}, Lc/e/f;-><init>(I)V */
	 return;
} // .end method
public c.e.f ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 3 */
	 /* iput-boolean v0, p0, Lc/e/f;->b:Z */
	 /* if-nez p1, :cond_0 */
	 /* .line 4 */
	 p1 = c.e.e.b;
	 this.c = p1;
	 /* .line 5 */
	 p1 = c.e.e.c;
	 this.d = p1;
	 /* .line 6 */
} // :cond_0
p1 = c.e.e .c ( p1 );
/* .line 7 */
/* new-array v0, p1, [J */
this.c = v0;
/* .line 8 */
/* new-array p1, p1, [Ljava/lang/Object; */
this.d = p1;
} // :goto_0
return;
} // .end method
/* # virtual methods */
public Long a ( Integer p0 ) {
/* .locals 3 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/e/f;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.e.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/f;->b()V
/* .line 4 */
} // :cond_0
v0 = this.c;
/* aget-wide v1, v0, p1 */
/* return-wide v1 */
} // .end method
public void a ( ) {
/* .locals 5 */
/* .line 5 */
/* iget v0, p0, Lc/e/f;->e:I */
/* .line 6 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_0 */
int v4 = 0; // const/4 v4, 0x0
/* .line 7 */
/* aput-object v4, v1, v3 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 8 */
} // :cond_0
/* iput v2, p0, Lc/e/f;->e:I */
/* .line 9 */
/* iput-boolean v2, p0, Lc/e/f;->b:Z */
return;
} // .end method
public void a ( Long p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
(( c.e.f ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/e/f;->d(J)V
return;
} // .end method
public void a ( Long p0, java.lang.Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(JTE;)V" */
/* } */
} // .end annotation
/* .line 10 */
/* iget v0, p0, Lc/e/f;->e:I */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.c;
/* add-int/lit8 v0, v0, -0x1 */
/* aget-wide v0, v1, v0 */
/* cmp-long v2, p1, v0 */
/* if-gtz v2, :cond_0 */
/* .line 11 */
(( c.e.f ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/e/f;->c(JLjava/lang/Object;)V
return;
/* .line 12 */
} // :cond_0
/* iget-boolean v0, p0, Lc/e/f;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lc/e/f;->e:I */
v1 = this.c;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_1 */
/* .line 13 */
(( c.e.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/f;->b()V
/* .line 14 */
} // :cond_1
/* iget v0, p0, Lc/e/f;->e:I */
/* .line 15 */
v1 = this.c;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_2 */
/* add-int/lit8 v1, v0, 0x1 */
/* .line 16 */
v1 = c.e.e .c ( v1 );
/* .line 17 */
/* new-array v2, v1, [J */
/* .line 18 */
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 19 */
v3 = this.c;
/* array-length v4, v3 */
int v5 = 0; // const/4 v5, 0x0
java.lang.System .arraycopy ( v3,v5,v2,v5,v4 );
/* .line 20 */
v3 = this.d;
/* array-length v4, v3 */
java.lang.System .arraycopy ( v3,v5,v1,v5,v4 );
/* .line 21 */
this.c = v2;
/* .line 22 */
this.d = v1;
/* .line 23 */
} // :cond_2
v1 = this.c;
/* aput-wide p1, v1, v0 */
/* .line 24 */
p1 = this.d;
/* aput-object p3, p1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 25 */
/* iput v0, p0, Lc/e/f;->e:I */
return;
} // .end method
public java.lang.Object b ( Long p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(J)TE;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( c.e.f ) p0 ).b ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lc/e/f;->b(JLjava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.Object b ( Long p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(JTE;)TE;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.c;
/* iget v1, p0, Lc/e/f;->e:I */
p1 = c.e.e .a ( v0,v1,p1,p2 );
/* if-ltz p1, :cond_1 */
/* .line 3 */
p2 = this.d;
/* aget-object v0, p2, p1 */
v1 = c.e.f.f;
/* if-ne v0, v1, :cond_0 */
/* .line 4 */
} // :cond_0
/* aget-object p1, p2, p1 */
} // :cond_1
} // :goto_0
} // .end method
public final void b ( ) {
/* .locals 9 */
/* .line 8 */
/* iget v0, p0, Lc/e/f;->e:I */
/* .line 9 */
v1 = this.c;
/* .line 10 */
v2 = this.d;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v4, v0, :cond_2 */
/* .line 11 */
/* aget-object v6, v2, v4 */
/* .line 12 */
v7 = c.e.f.f;
/* if-eq v6, v7, :cond_1 */
/* if-eq v4, v5, :cond_0 */
/* .line 13 */
/* aget-wide v7, v1, v4 */
/* aput-wide v7, v1, v5 */
/* .line 14 */
/* aput-object v6, v2, v5 */
int v6 = 0; // const/4 v6, 0x0
/* .line 15 */
/* aput-object v6, v2, v4 */
} // :cond_0
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
/* .line 16 */
} // :cond_2
/* iput-boolean v3, p0, Lc/e/f;->b:Z */
/* .line 17 */
/* iput v5, p0, Lc/e/f;->e:I */
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 3 */
/* .line 5 */
v0 = this.d;
/* aget-object v1, v0, p1 */
v2 = c.e.f.f;
/* if-eq v1, v2, :cond_0 */
/* .line 6 */
/* aput-object v2, v0, p1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 7 */
/* iput-boolean p1, p0, Lc/e/f;->b:Z */
} // :cond_0
return;
} // .end method
public Integer c ( Long p0 ) {
/* .locals 2 */
/* .line 26 */
/* iget-boolean v0, p0, Lc/e/f;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 27 */
(( c.e.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/f;->b()V
/* .line 28 */
} // :cond_0
v0 = this.c;
/* iget v1, p0, Lc/e/f;->e:I */
p1 = c.e.e .a ( v0,v1,p1,p2 );
} // .end method
public java.lang.Object c ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TE;" */
/* } */
} // .end annotation
/* .line 23 */
/* iget-boolean v0, p0, Lc/e/f;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 24 */
(( c.e.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/f;->b()V
/* .line 25 */
} // :cond_0
v0 = this.d;
/* aget-object p1, v0, p1 */
} // .end method
public void c ( Long p0, java.lang.Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(JTE;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* iget v1, p0, Lc/e/f;->e:I */
v0 = c.e.e .a ( v0,v1,p1,p2 );
/* if-ltz v0, :cond_0 */
/* .line 2 */
p1 = this.d;
/* aput-object p3, p1, v0 */
} // :cond_0
/* not-int v0, v0 */
/* .line 3 */
/* iget v1, p0, Lc/e/f;->e:I */
/* if-ge v0, v1, :cond_1 */
v1 = this.d;
/* aget-object v2, v1, v0 */
v3 = c.e.f.f;
/* if-ne v2, v3, :cond_1 */
/* .line 4 */
v2 = this.c;
/* aput-wide p1, v2, v0 */
/* .line 5 */
/* aput-object p3, v1, v0 */
return;
/* .line 6 */
} // :cond_1
/* iget-boolean v1, p0, Lc/e/f;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget v1, p0, Lc/e/f;->e:I */
v2 = this.c;
/* array-length v2, v2 */
/* if-lt v1, v2, :cond_2 */
/* .line 7 */
(( c.e.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/f;->b()V
/* .line 8 */
v0 = this.c;
/* iget v1, p0, Lc/e/f;->e:I */
v0 = c.e.e .a ( v0,v1,p1,p2 );
/* not-int v0, v0 */
/* .line 9 */
} // :cond_2
/* iget v1, p0, Lc/e/f;->e:I */
v2 = this.c;
/* array-length v2, v2 */
/* if-lt v1, v2, :cond_3 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 10 */
v1 = c.e.e .c ( v1 );
/* .line 11 */
/* new-array v2, v1, [J */
/* .line 12 */
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 13 */
v3 = this.c;
/* array-length v4, v3 */
int v5 = 0; // const/4 v5, 0x0
java.lang.System .arraycopy ( v3,v5,v2,v5,v4 );
/* .line 14 */
v3 = this.d;
/* array-length v4, v3 */
java.lang.System .arraycopy ( v3,v5,v1,v5,v4 );
/* .line 15 */
this.c = v2;
/* .line 16 */
this.d = v1;
/* .line 17 */
} // :cond_3
/* iget v1, p0, Lc/e/f;->e:I */
/* sub-int v2, v1, v0 */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 18 */
v2 = this.c;
/* add-int/lit8 v3, v0, 0x1 */
/* sub-int/2addr v1, v0 */
java.lang.System .arraycopy ( v2,v0,v2,v3,v1 );
/* .line 19 */
v1 = this.d;
/* iget v2, p0, Lc/e/f;->e:I */
/* sub-int/2addr v2, v0 */
java.lang.System .arraycopy ( v1,v0,v1,v3,v2 );
/* .line 20 */
} // :cond_4
v1 = this.c;
/* aput-wide p1, v1, v0 */
/* .line 21 */
p1 = this.d;
/* aput-object p3, p1, v0 */
/* .line 22 */
/* iget p1, p0, Lc/e/f;->e:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lc/e/f;->e:I */
} // :goto_0
return;
} // .end method
public c.e.f clone ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/e/f<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 2 */
try { // :try_start_0
/* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
/* check-cast v0, Lc/e/f; */
/* .line 3 */
v1 = this.c;
(( ) v1 ).clone ( ); // invoke-virtual {v1}, [J->clone()Ljava/lang/Object;
/* check-cast v1, [J */
this.c = v1;
/* .line 4 */
v1 = this.d;
(( java.lang.Object ) v1 ).clone ( ); // invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
/* check-cast v1, [Ljava/lang/Object; */
this.d = v1;
/* :try_end_0 */
/* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 5 */
/* new-instance v1, Ljava/lang/AssertionError; */
/* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v1 */
} // .end method
public java.lang.Object clone ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/CloneNotSupportedException; */
/* } */
} // .end annotation
/* .line 1 */
(( c.e.f ) p0 ).clone ( ); // invoke-virtual {p0}, Lc/e/f;->clone()Lc/e/f;
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 5 */
/* iget-boolean v0, p0, Lc/e/f;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( c.e.f ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/f;->b()V
/* .line 7 */
} // :cond_0
/* iget v0, p0, Lc/e/f;->e:I */
} // .end method
public void d ( Long p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
/* iget v1, p0, Lc/e/f;->e:I */
p1 = c.e.e .a ( v0,v1,p1,p2 );
/* if-ltz p1, :cond_0 */
/* .line 2 */
p2 = this.d;
/* aget-object v0, p2, p1 */
v1 = c.e.f.f;
/* if-eq v0, v1, :cond_0 */
/* .line 3 */
/* aput-object v1, p2, p1 */
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
/* iput-boolean p1, p0, Lc/e/f;->b:Z */
} // :cond_0
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( c.e.f ) p0 ).d ( ); // invoke-virtual {p0}, Lc/e/f;->d()I
/* if-gtz v0, :cond_0 */
final String v0 = "{}"; // const-string v0, "{}"
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* iget v1, p0, Lc/e/f;->e:I */
/* mul-int/lit8 v1, v1, 0x1c */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* const/16 v1, 0x7b */
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
/* iget v2, p0, Lc/e/f;->e:I */
/* if-ge v1, v2, :cond_3 */
/* if-lez v1, :cond_1 */
final String v2 = ", "; // const-string v2, ", "
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
} // :cond_1
(( c.e.f ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/e/f;->a(I)J
/* move-result-wide v2 */
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* const/16 v2, 0x3d */
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 9 */
(( c.e.f ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/e/f;->c(I)Ljava/lang/Object;
/* if-eq v2, p0, :cond_2 */
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_2
final String v2 = "(this Map)"; // const-string v2, "(this Map)"
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
/* const/16 v1, 0x7d */
/* .line 12 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
