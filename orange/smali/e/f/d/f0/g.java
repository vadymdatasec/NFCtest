public class e.f.d.f0.g implements java.io.Closeable implements java.io.Flushable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String j;
	 public static final java.lang.String k;
	 /* # instance fields */
	 public final java.io.Writer b;
	 public final java.util.List c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/f/d/f0/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.String d;
public java.lang.String e;
public Boolean f;
public Boolean g;
public java.lang.String h;
public Boolean i;
/* # direct methods */
public static e.f.d.f0.g ( ) {
/* .locals 5 */
/* const/16 v0, 0x80 */
/* new-array v0, v0, [Ljava/lang/String; */
/* .line 1 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* const/16 v2, 0x1f */
/* if-gt v1, v2, :cond_0 */
/* .line 2 */
v2 = e.f.d.f0.g.j;
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v1 );
/* aput-object v4, v3, v0 */
final String v4 = "\\u%04x"; // const-string v4, "\\u%04x"
java.lang.String .format ( v4,v3 );
/* aput-object v3, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 3 */
} // :cond_0
v0 = e.f.d.f0.g.j;
/* const/16 v1, 0x22 */
final String v2 = "\\\""; // const-string v2, "\\\""
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x5c */
final String v2 = "\\\\"; // const-string v2, "\\\\"
/* .line 4 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x9 */
final String v2 = "\\t"; // const-string v2, "\\t"
/* .line 5 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x8 */
final String v2 = "\\b"; // const-string v2, "\\b"
/* .line 6 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0xa */
final String v2 = "\\n"; // const-string v2, "\\n"
/* .line 7 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0xd */
final String v2 = "\\r"; // const-string v2, "\\r"
/* .line 8 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0xc */
final String v2 = "\\f"; // const-string v2, "\\f"
/* .line 9 */
/* aput-object v2, v0, v1 */
/* .line 10 */
(( java.lang.String ) v0 ).clone ( ); // invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;
/* check-cast v0, [Ljava/lang/String; */
/* const/16 v1, 0x3c */
final String v2 = "\\u003c"; // const-string v2, "\\u003c"
/* .line 11 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x3e */
final String v2 = "\\u003e"; // const-string v2, "\\u003e"
/* .line 12 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x26 */
final String v2 = "\\u0026"; // const-string v2, "\\u0026"
/* .line 13 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x3d */
final String v2 = "\\u003d"; // const-string v2, "\\u003d"
/* .line 14 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x27 */
final String v2 = "\\u0027"; // const-string v2, "\\u0027"
/* .line 15 */
/* aput-object v2, v0, v1 */
return;
} // .end method
public e.f.d.f0.g ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
/* .line 3 */
v1 = e.f.d.f0.d.g;
final String v0 = ":"; // const-string v0, ":"
/* .line 4 */
this.e = v0;
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Le/f/d/f0/g;->i:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
this.b = p1;
return;
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "out == null"; // const-string v0, "out == null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public final e.f.d.f0.g a ( Object p0, Object p1, java.lang.String p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
(( e.f.d.f0.g ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->t()Le/f/d/f0/d;
/* if-eq v0, p2, :cond_1 */
/* if-ne v0, p1, :cond_0 */
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Nesting problem: "; // const-string p3, "Nesting problem: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p3 = this.c;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 6 */
} // :cond_1
} // :goto_0
p1 = this.h;
/* if-nez p1, :cond_3 */
/* .line 7 */
v1 = p1 = this.c;
/* add-int/lit8 v1, v1, -0x1 */
/* if-ne v0, p2, :cond_2 */
/* .line 8 */
(( e.f.d.f0.g ) p0 ).r ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->r()V
/* .line 9 */
} // :cond_2
p1 = this.b;
(( java.io.Writer ) p1 ).write ( p3 ); // invoke-virtual {p1, p3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
/* .line 10 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Dangling name: "; // const-string p3, "Dangling name: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p3 = this.h;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final e.f.d.f0.g a ( Object p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( e.f.d.f0.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->a(Z)V
/* .line 2 */
v0 = this.c;
/* .line 3 */
p1 = this.b;
(( java.io.Writer ) p1 ).write ( p2 ); // invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
} // .end method
public e.f.d.f0.g a ( java.lang.Number p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 12 */
(( e.f.d.f0.g ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->s()Le/f/d/f0/g;
/* .line 13 */
} // :cond_0
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
/* .line 14 */
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 15 */
/* iget-boolean v1, p0, Le/f/d/f0/g;->f:Z */
/* if-nez v1, :cond_2 */
final String v1 = "-Infinity"; // const-string v1, "-Infinity"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
final String v1 = "Infinity"; // const-string v1, "Infinity"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
final String v1 = "NaN"; // const-string v1, "NaN"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 16 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Numeric values must be finite, but was "; // const-string v2, "Numeric values must be finite, but was "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 17 */
(( e.f.d.f0.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/g;->a(Z)V
/* .line 18 */
p1 = this.b;
(( java.io.Writer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* .line 11 */
v1 = v0 = this.c;
/* add-int/lit8 v1, v1, -0x1 */
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 19 */
v0 = e.f.d.f0.f.a;
(( e.f.d.f0.g ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->t()Le/f/d/f0/d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_3 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_4 */
int p1 = 3; // const/4 p1, 0x3
/* if-eq v0, p1, :cond_2 */
int p1 = 4; // const/4 p1, 0x4
/* if-eq v0, p1, :cond_1 */
int p1 = 5; // const/4 p1, 0x5
/* if-ne v0, p1, :cond_0 */
/* .line 20 */
p1 = this.b;
v0 = this.e;
(( java.io.Writer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
/* .line 21 */
p1 = e.f.d.f0.d.f;
(( e.f.d.f0.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/g;->a(Le/f/d/f0/d;)V
/* .line 22 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Nesting problem: "; // const-string v1, "Nesting problem: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 23 */
} // :cond_1
p1 = this.b;
/* const/16 v0, 0x2c */
(( java.io.Writer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
/* .line 24 */
(( e.f.d.f0.g ) p0 ).r ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->r()V
/* .line 25 */
} // :cond_2
p1 = e.f.d.f0.d.c;
(( e.f.d.f0.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/g;->a(Le/f/d/f0/d;)V
/* .line 26 */
(( e.f.d.f0.g ) p0 ).r ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->r()V
/* .line 27 */
} // :cond_3
/* iget-boolean v0, p0, Le/f/d/f0/g;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 28 */
} // :cond_4
/* iget-boolean v0, p0, Le/f/d/f0/g;->f:Z */
/* if-nez v0, :cond_6 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 29 */
} // :cond_5
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "JSON must start with an array or an object."; // const-string v0, "JSON must start with an array or an object."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 30 */
} // :cond_6
} // :goto_0
p1 = e.f.d.f0.d.h;
(( e.f.d.f0.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/g;->a(Le/f/d/f0/d;)V
} // :goto_1
return;
/* .line 31 */
} // :cond_7
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "JSON must have only one top-level value."; // const-string v0, "JSON must have only one top-level value."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public e.f.d.f0.g b ( java.lang.String p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 2 */
v0 = this.h;
/* if-nez v0, :cond_1 */
/* .line 3 */
v0 = v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 4 */
this.h = p1;
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "JsonWriter is closed."; // const-string v0, "JsonWriter is closed."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V */
/* throw p1 */
/* .line 7 */
} // :cond_2
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "name == null"; // const-string v0, "name == null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Le/f/d/f0/g;->f:Z */
return;
} // .end method
public e.f.d.f0.g c ( Boolean p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( e.f.d.f0.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->a(Z)V
/* .line 3 */
v0 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "true"; // const-string p1, "true"
} // :cond_0
final String p1 = "false"; // const-string p1, "false"
} // :goto_0
(( java.io.Writer ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
} // .end method
public final void c ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 13 */
(( e.f.d.f0.g ) p0 ).t ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->t()Le/f/d/f0/d;
/* .line 14 */
v1 = e.f.d.f0.d.f;
/* if-ne v0, v1, :cond_0 */
/* .line 15 */
v0 = this.b;
/* const/16 v1, 0x2c */
(( java.io.Writer ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V
/* .line 16 */
} // :cond_0
v1 = e.f.d.f0.d.d;
/* if-ne v0, v1, :cond_1 */
/* .line 17 */
} // :goto_0
(( e.f.d.f0.g ) p0 ).r ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->r()V
/* .line 18 */
v0 = e.f.d.f0.d.e;
(( e.f.d.f0.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->a(Le/f/d/f0/d;)V
return;
/* .line 19 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Nesting problem: "; // const-string v2, "Nesting problem: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void c ( java.lang.String p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
/* iget-boolean v0, p0, Le/f/d/f0/g;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = e.f.d.f0.g.k;
} // :cond_0
v0 = e.f.d.f0.g.j;
/* .line 5 */
} // :goto_0
v1 = this.b;
final String v2 = "\""; // const-string v2, "\""
(( java.io.Writer ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
/* .line 6 */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* if-ge v3, v1, :cond_6 */
/* .line 7 */
v5 = (( java.lang.String ) p1 ).charAt ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C
/* const/16 v6, 0x80 */
/* if-ge v5, v6, :cond_1 */
/* .line 8 */
/* aget-object v5, v0, v5 */
/* if-nez v5, :cond_3 */
} // :cond_1
/* const/16 v6, 0x2028 */
/* if-ne v5, v6, :cond_2 */
final String v5 = "\\u2028"; // const-string v5, "\\u2028"
} // :cond_2
/* const/16 v6, 0x2029 */
/* if-ne v5, v6, :cond_5 */
final String v5 = "\\u2029"; // const-string v5, "\\u2029"
} // :cond_3
} // :goto_2
/* if-ge v4, v3, :cond_4 */
/* .line 9 */
v6 = this.b;
/* sub-int v7, v3, v4 */
(( java.io.Writer ) v6 ).write ( p1, v4, v7 ); // invoke-virtual {v6, p1, v4, v7}, Ljava/io/Writer;->write(Ljava/lang/String;II)V
/* .line 10 */
} // :cond_4
v4 = this.b;
(( java.io.Writer ) v4 ).write ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V
/* add-int/lit8 v4, v3, 0x1 */
} // :cond_5
} // :goto_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_6
/* if-ge v4, v1, :cond_7 */
/* .line 11 */
v0 = this.b;
/* sub-int/2addr v1, v4 */
(( java.io.Writer ) v0 ).write ( p1, v4, v1 ); // invoke-virtual {v0, p1, v4, v1}, Ljava/io/Writer;->write(Ljava/lang/String;II)V
/* .line 12 */
} // :cond_7
p1 = this.b;
(( java.io.Writer ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
return;
} // .end method
public void close ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
(( java.io.Writer ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/Writer;->close()V
/* .line 2 */
v0 = v0 = this.c;
int v1 = 1; // const/4 v1, 0x1
/* if-gt v0, v1, :cond_1 */
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
v2 = this.c;
/* sub-int/2addr v0, v1 */
v1 = e.f.d.f0.d.h;
/* if-ne v0, v1, :cond_1 */
/* .line 4 */
} // :cond_0
v0 = this.c;
return;
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Incomplete document"; // const-string v1, "Incomplete document"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public e.f.d.f0.g d ( java.lang.String p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 1 */
(( e.f.d.f0.g ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->s()Le/f/d/f0/g;
/* .line 2 */
} // :cond_0
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( e.f.d.f0.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->a(Z)V
/* .line 4 */
(( e.f.d.f0.g ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/d/f0/g;->c(Ljava/lang/String;)V
} // .end method
public void flush ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.b;
(( java.io.Writer ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/Writer;->flush()V
return;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "JsonWriter is closed."; // const-string v1, "JsonWriter is closed."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public e.f.d.f0.g g ( Long p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( e.f.d.f0.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->a(Z)V
/* .line 3 */
v0 = this.b;
java.lang.Long .toString ( p1,p2 );
(( java.io.Writer ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
} // .end method
public e.f.d.f0.g l ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
/* .line 2 */
v0 = e.f.d.f0.d.b;
final String v1 = "["; // const-string v1, "["
(( e.f.d.f0.g ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/d/f0/g;->a(Le/f/d/f0/d;Ljava/lang/String;)Le/f/d/f0/g;
} // .end method
public e.f.d.f0.g m ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
/* .line 2 */
v0 = e.f.d.f0.d.d;
final String v1 = "{"; // const-string v1, "{"
(( e.f.d.f0.g ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/d/f0/g;->a(Le/f/d/f0/d;Ljava/lang/String;)Le/f/d/f0/g;
} // .end method
public e.f.d.f0.g n ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.d.f0.d.b;
v1 = e.f.d.f0.d.c;
final String v2 = "]"; // const-string v2, "]"
(( e.f.d.f0.g ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Le/f/d/f0/g;->a(Le/f/d/f0/d;Le/f/d/f0/d;Ljava/lang/String;)Le/f/d/f0/g;
} // .end method
public e.f.d.f0.g o ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.d.f0.d.d;
v1 = e.f.d.f0.d.f;
final String v2 = "}"; // const-string v2, "}"
(( e.f.d.f0.g ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Le/f/d/f0/g;->a(Le/f/d/f0/d;Le/f/d/f0/d;Ljava/lang/String;)Le/f/d/f0/g;
} // .end method
public final Boolean p ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/f/d/f0/g;->i:Z */
} // .end method
public Boolean q ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/f/d/f0/g;->f:Z */
} // .end method
public final void r ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = this.b;
final String v1 = "\n"; // const-string v1, "\n"
(( java.io.Writer ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
} // :goto_0
v1 = v1 = this.c;
/* if-ge v0, v1, :cond_1 */
/* .line 4 */
v1 = this.b;
v2 = this.d;
(( java.io.Writer ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public e.f.d.f0.g s ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* iget-boolean v0, p0, Le/f/d/f0/g;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( e.f.d.f0.g ) p0 ).u ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->u()V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.h = v0;
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
(( e.f.d.f0.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->a(Z)V
/* .line 6 */
v0 = this.b;
final String v1 = "null"; // const-string v1, "null"
(( java.io.Writer ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
} // .end method
public final e.f.d.f0.d t ( ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = this.c;
/* add-int/lit8 v0, v0, -0x1 */
/* check-cast v0, Le/f/d/f0/d; */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "JsonWriter is closed."; // const-string v1, "JsonWriter is closed."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void u ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.f.d.f0.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/d/f0/g;->c()V
/* .line 3 */
v0 = this.h;
(( e.f.d.f0.g ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/d/f0/g;->c(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.h = v0;
} // :cond_0
return;
} // .end method
