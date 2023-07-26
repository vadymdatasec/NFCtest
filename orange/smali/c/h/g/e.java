public abstract class c.h.g.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( java.lang.String p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .line 23 */
	 } // :goto_0
	 v0 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 /* if-ge p1, v0, :cond_2 */
	 /* .line 24 */
	 v0 = 	 (( java.lang.String ) p0 ).charAt ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C
	 /* add-int/lit8 v1, v0, -0x41 */
	 /* add-int/lit8 v2, v0, -0x5a */
	 /* mul-int v1, v1, v2 */
	 /* if-lez v1, :cond_0 */
	 /* add-int/lit8 v1, v0, -0x61 */
	 /* add-int/lit8 v2, v0, -0x7a */
	 /* mul-int v1, v1, v2 */
	 /* if-gtz v1, :cond_1 */
} // :cond_0
/* const/16 v1, 0x65 */
/* if-eq v0, v1, :cond_1 */
/* const/16 v1, 0x45 */
/* if-eq v0, v1, :cond_1 */
} // :cond_1
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_2
} // .end method
public static void a ( java.lang.String p0, Integer p1, Object p2 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
/* .line 26 */
/* iput-boolean v0, p2, Lc/h/g/c;->b:Z */
/* move v1, p1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 27 */
} // :goto_0
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v1, v5, :cond_5 */
/* .line 28 */
v5 = (( java.lang.String ) p0 ).charAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
/* const/16 v6, 0x20 */
int v7 = 1; // const/4 v7, 0x1
/* if-eq v5, v6, :cond_3 */
/* const/16 v6, 0x45 */
/* if-eq v5, v6, :cond_2 */
/* const/16 v6, 0x65 */
/* if-eq v5, v6, :cond_2 */
/* packed-switch v5, :pswitch_data_0 */
/* :pswitch_0 */
/* if-nez v3, :cond_0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* .line 29 */
} // :cond_0
/* iput-boolean v7, p2, Lc/h/g/c;->b:Z */
/* :pswitch_1 */
/* if-eq v1, p1, :cond_1 */
/* if-nez v2, :cond_1 */
/* .line 30 */
/* iput-boolean v7, p2, Lc/h/g/c;->b:Z */
} // :cond_1
} // :goto_1
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_3
} // :goto_2
/* :pswitch_2 */
int v2 = 0; // const/4 v2, 0x0
int v4 = 1; // const/4 v4, 0x1
} // :goto_3
if ( v4 != null) { // if-eqz v4, :cond_4
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
/* .line 31 */
} // :cond_5
} // :goto_4
/* iput v1, p2, Lc/h/g/c;->a:I */
return;
/* :pswitch_data_0 */
/* .packed-switch 0x2c */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static void a ( java.util.ArrayList p0, Object p1, Float[] p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Lc/h/g/d;", */
/* ">;C[F)V" */
/* } */
} // .end annotation
/* .line 25 */
/* new-instance v0, Lc/h/g/d; */
/* invoke-direct {v0, p1, p2}, Lc/h/g/d;-><init>(C[F)V */
(( java.util.ArrayList ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public static Boolean a ( Object[] p0, Object[] p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_5
/* if-nez p1, :cond_0 */
/* .line 20 */
} // :cond_0
/* array-length v1, p0 */
/* array-length v2, p1 */
/* if-eq v1, v2, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 21 */
} // :goto_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_4 */
/* .line 22 */
/* aget-object v2, p0, v1 */
/* iget-char v2, v2, Lc/h/g/d;->a:C */
/* aget-object v3, p1, v1 */
/* iget-char v3, v3, Lc/h/g/d;->a:C */
/* if-ne v2, v3, :cond_3 */
/* aget-object v2, p0, v1 */
v2 = this.b;
/* array-length v2, v2 */
/* aget-object v3, p1, v1 */
v3 = this.b;
/* array-length v3, v3 */
/* if-eq v2, v3, :cond_2 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
} // :goto_1
} // :cond_4
int p0 = 1; // const/4 p0, 0x1
} // :cond_5
} // :goto_2
} // .end method
public static a ( Float[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* if-gt p1, p2, :cond_1 */
/* .line 1 */
/* array-length v0, p0 */
/* if-ltz p1, :cond_0 */
/* if-gt p1, v0, :cond_0 */
/* sub-int/2addr p2, p1 */
/* sub-int/2addr v0, p1 */
/* .line 2 */
v0 = java.lang.Math .min ( p2,v0 );
/* .line 3 */
/* new-array p2, p2, [F */
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
java.lang.System .arraycopy ( p0,p1,p2,v1,v0 );
/* .line 5 */
} // :cond_0
/* new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V */
/* throw p0 */
/* .line 6 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw p0 */
} // .end method
public static c.h.g.d a ( java.lang.String p0 ) {
/* .locals 7 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 7 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 8 */
} // :goto_0
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v3, v5, :cond_2 */
/* .line 9 */
v3 = c.h.g.e .a ( p0,v3 );
/* .line 10 */
(( java.lang.String ) p0 ).substring ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 11 */
v5 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_1 */
/* .line 12 */
c.h.g.e .c ( v4 );
/* .line 13 */
v4 = (( java.lang.String ) v4 ).charAt ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C
c.h.g.e .a ( v0,v4,v5 );
} // :cond_1
/* add-int/lit8 v4, v3, 0x1 */
/* move v6, v4 */
/* move v4, v3 */
/* move v3, v6 */
} // :cond_2
/* sub-int/2addr v3, v4 */
/* if-ne v3, v1, :cond_3 */
/* .line 14 */
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v4, v1, :cond_3 */
/* .line 15 */
p0 = (( java.lang.String ) p0 ).charAt ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
/* new-array v1, v2, [F */
c.h.g.e .a ( v0,p0,v1 );
/* .line 16 */
} // :cond_3
p0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* new-array p0, p0, [Lc/h/g/d; */
(( java.util.ArrayList ) v0 ).toArray ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast p0, [Lc/h/g/d; */
} // .end method
public static c.h.g.d a ( Object[] p0 ) {
/* .locals 4 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 17 */
} // :cond_0
/* array-length v0, p0 */
/* new-array v0, v0, [Lc/h/g/d; */
int v1 = 0; // const/4 v1, 0x0
/* .line 18 */
} // :goto_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_1 */
/* .line 19 */
/* new-instance v2, Lc/h/g/d; */
/* aget-object v3, p0, v1 */
/* invoke-direct {v2, v3}, Lc/h/g/d;-><init>(Lc/h/g/d;)V */
/* aput-object v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public static android.graphics.Path b ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Landroid/graphics/Path; */
/* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
/* .line 2 */
c.h.g.e .a ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
try { // :try_start_0
c.h.g.d .a ( v1,v0 );
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 4 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Error in parsing "; // const-string v3, "Error in parsing "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void b ( Object[] p0, Object[] p1 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
} // :goto_0
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_1 */
/* .line 6 */
/* aget-object v2, p0, v1 */
/* aget-object v3, p1, v1 */
/* iget-char v3, v3, Lc/h/g/d;->a:C */
/* iput-char v3, v2, Lc/h/g/d;->a:C */
int v2 = 0; // const/4 v2, 0x0
/* .line 7 */
} // :goto_1
/* aget-object v3, p1, v1 */
v3 = this.b;
/* array-length v3, v3 */
/* if-ge v2, v3, :cond_0 */
/* .line 8 */
/* aget-object v3, p0, v1 */
v3 = this.b;
/* aget-object v4, p1, v1 */
v4 = this.b;
/* aget v4, v4, v2 */
/* aput v4, v3, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public static c ( java.lang.String p0 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
v1 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v2, 0x7a */
/* if-eq v1, v2, :cond_4 */
v1 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v2, 0x5a */
/* if-ne v1, v2, :cond_0 */
/* .line 2 */
} // :cond_0
try { // :try_start_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* new-array v1, v1, [F */
/* .line 3 */
/* new-instance v2, Lc/h/g/c; */
/* invoke-direct {v2}, Lc/h/g/c;-><init>()V */
/* .line 4 */
v3 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_3 */
/* .line 5 */
c.h.g.e .a ( p0,v4,v2 );
/* .line 6 */
/* iget v6, v2, Lc/h/g/c;->a:I */
/* if-ge v4, v6, :cond_1 */
/* add-int/lit8 v7, v5, 0x1 */
/* .line 7 */
(( java.lang.String ) p0 ).substring ( v4, v6 ); // invoke-virtual {p0, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 8 */
v4 = java.lang.Float .parseFloat ( v4 );
/* aput v4, v1, v5 */
/* move v5, v7 */
/* .line 9 */
} // :cond_1
/* iget-boolean v4, v2, Lc/h/g/c;->b:Z */
if ( v4 != null) { // if-eqz v4, :cond_2
/* move v4, v6 */
} // :cond_2
/* add-int/lit8 v4, v6, 0x1 */
/* .line 10 */
} // :cond_3
c.h.g.e .a ( v1,v0,v5 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 11 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "error in parsing \""; // const-string v3, "error in parsing \""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "\""; // const-string p0, "\""
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // :cond_4
} // :goto_1
/* new-array p0, v0, [F */
} // .end method
