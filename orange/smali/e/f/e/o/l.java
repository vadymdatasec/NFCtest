public abstract class e.f.e.o.l {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String a;
	 public static final Boolean b;
	 /* # direct methods */
	 public static e.f.e.o.l ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 java.nio.charset.Charset .defaultCharset ( );
		 (( java.nio.charset.Charset ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
		 final String v1 = "SJIS"; // const-string v1, "SJIS"
		 /* .line 2 */
		 v0 = 		 (( java.lang.String ) v1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_1 */
		 v0 = e.f.e.o.l.a;
		 final String v1 = "EUC_JP"; // const-string v1, "EUC_JP"
		 /* .line 3 */
		 v0 = 		 (( java.lang.String ) v1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
e.f.e.o.l.b = (v0!= 0);
return;
} // .end method
public static java.lang.String a ( Object[] p0, java.util.Map p1 ) {
/* .locals 19 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([B", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1 */
v2 = v2 = e.f.e.d.f;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 2 */
v0 = e.f.e.d.f;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 3 */
} // :cond_0
/* array-length v1, v0 */
/* .line 4 */
/* array-length v2, v0 */
int v3 = 2; // const/4 v3, 0x2
int v4 = 3; // const/4 v4, 0x3
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
/* if-le v2, v4, :cond_1 */
/* aget-byte v2, v0, v6 */
/* const/16 v7, -0x11 */
/* if-ne v2, v7, :cond_1 */
/* aget-byte v2, v0, v5 */
/* const/16 v7, -0x45 */
/* if-ne v2, v7, :cond_1 */
/* aget-byte v2, v0, v3 */
/* const/16 v7, -0x41 */
/* if-ne v2, v7, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
int v8 = 1; // const/4 v8, 0x1
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
/* const/16 v18, 0x0 */
} // :goto_1
/* if-ge v9, v1, :cond_14 */
/* if-nez v5, :cond_2 */
/* if-nez v7, :cond_2 */
if ( v8 != null) { // if-eqz v8, :cond_14
/* .line 5 */
} // :cond_2
/* aget-byte v4, v0, v9 */
/* and-int/lit16 v4, v4, 0xff */
if ( v8 != null) { // if-eqz v8, :cond_7
/* if-lez v10, :cond_3 */
/* and-int/lit16 v0, v4, 0x80 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* add-int/lit8 v10, v10, -0x1 */
} // :cond_3
/* and-int/lit16 v0, v4, 0x80 */
if ( v0 != null) { // if-eqz v0, :cond_7
/* and-int/lit8 v0, v4, 0x40 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* add-int/lit8 v10, v10, 0x1 */
/* and-int/lit8 v0, v4, 0x20 */
/* if-nez v0, :cond_4 */
/* add-int/lit8 v12, v12, 0x1 */
} // :cond_4
/* add-int/lit8 v10, v10, 0x1 */
/* and-int/lit8 v0, v4, 0x10 */
/* if-nez v0, :cond_5 */
/* add-int/lit8 v13, v13, 0x1 */
} // :cond_5
/* add-int/lit8 v10, v10, 0x1 */
/* and-int/lit8 v0, v4, 0x8 */
/* if-nez v0, :cond_6 */
/* add-int/lit8 v14, v14, 0x1 */
} // :cond_6
int v8 = 0; // const/4 v8, 0x0
} // :cond_7
} // :goto_2
/* const/16 v0, 0x7f */
if ( v5 != null) { // if-eqz v5, :cond_a
/* if-le v4, v0, :cond_8 */
/* const/16 v0, 0xa0 */
/* if-ge v4, v0, :cond_8 */
int v5 = 0; // const/4 v5, 0x0
} // :cond_8
/* const/16 v0, 0x9f */
/* if-le v4, v0, :cond_a */
/* const/16 v0, 0xc0 */
/* if-lt v4, v0, :cond_9 */
/* const/16 v0, 0xd7 */
/* if-eq v4, v0, :cond_9 */
/* const/16 v0, 0xf7 */
/* if-ne v4, v0, :cond_a */
} // :cond_9
/* add-int/lit8 v16, v16, 0x1 */
} // :cond_a
} // :goto_3
if ( v7 != null) { // if-eqz v7, :cond_13
/* if-lez v11, :cond_c */
/* const/16 v0, 0x40 */
/* if-lt v4, v0, :cond_12 */
/* const/16 v0, 0x7f */
/* if-eq v4, v0, :cond_12 */
/* const/16 v0, 0xfc */
/* if-le v4, v0, :cond_b */
} // :cond_b
/* add-int/lit8 v11, v11, -0x1 */
} // :cond_c
/* const/16 v0, 0x80 */
/* if-eq v4, v0, :cond_12 */
/* const/16 v0, 0xa0 */
/* if-eq v4, v0, :cond_12 */
/* const/16 v0, 0xef */
/* if-le v4, v0, :cond_d */
} // :cond_d
/* const/16 v0, 0xa0 */
/* if-le v4, v0, :cond_f */
/* const/16 v0, 0xe0 */
/* if-ge v4, v0, :cond_f */
/* add-int/lit8 v3, v3, 0x1 */
/* add-int/lit8 v0, v18, 0x1 */
/* if-le v0, v15, :cond_e */
/* move v15, v0 */
/* move/from16 v18, v15 */
} // :cond_e
/* move/from16 v18, v0 */
} // :goto_4
/* const/16 v17, 0x0 */
} // :cond_f
/* const/16 v0, 0x7f */
/* if-le v4, v0, :cond_11 */
/* add-int/lit8 v11, v11, 0x1 */
/* add-int/lit8 v0, v17, 0x1 */
/* if-le v0, v6, :cond_10 */
/* move v6, v0 */
/* move/from16 v17, v6 */
} // :cond_10
/* move/from16 v17, v0 */
} // :cond_11
/* const/16 v17, 0x0 */
} // :goto_5
/* const/16 v18, 0x0 */
} // :cond_12
} // :goto_6
int v7 = 0; // const/4 v7, 0x0
} // :cond_13
} // :goto_7
/* add-int/lit8 v9, v9, 0x1 */
int v4 = 3; // const/4 v4, 0x3
/* move-object/from16 v0, p0 */
/* goto/16 :goto_1 */
} // :cond_14
if ( v8 != null) { // if-eqz v8, :cond_15
/* if-lez v10, :cond_15 */
int v8 = 0; // const/4 v8, 0x0
} // :cond_15
if ( v7 != null) { // if-eqz v7, :cond_16
/* if-lez v11, :cond_16 */
int v7 = 0; // const/4 v7, 0x0
} // :cond_16
final String v0 = "UTF8"; // const-string v0, "UTF8"
if ( v8 != null) { // if-eqz v8, :cond_18
/* if-nez v2, :cond_17 */
/* add-int/2addr v12, v13 */
/* add-int/2addr v12, v14 */
/* if-lez v12, :cond_18 */
} // :cond_17
} // :cond_18
final String v2 = "SJIS"; // const-string v2, "SJIS"
if ( v7 != null) { // if-eqz v7, :cond_1a
/* .line 6 */
/* sget-boolean v4, Le/f/e/o/l;->b:Z */
/* if-nez v4, :cond_19 */
int v4 = 3; // const/4 v4, 0x3
/* if-ge v15, v4, :cond_19 */
/* if-lt v6, v4, :cond_1a */
} // :cond_19
} // :cond_1a
final String v4 = "ISO8859_1"; // const-string v4, "ISO8859_1"
if ( v5 != null) { // if-eqz v5, :cond_1e
if ( v7 != null) { // if-eqz v7, :cond_1e
int v6 = 2; // const/4 v6, 0x2
/* if-ne v15, v6, :cond_1b */
/* if-eq v3, v6, :cond_1c */
} // :cond_1b
/* mul-int/lit8 v0, v16, 0xa */
/* if-lt v0, v1, :cond_1d */
} // :cond_1c
} // :cond_1d
} // :cond_1e
if ( v5 != null) { // if-eqz v5, :cond_1f
} // :cond_1f
if ( v7 != null) { // if-eqz v7, :cond_20
} // :cond_20
if ( v8 != null) { // if-eqz v8, :cond_21
/* .line 7 */
} // :cond_21
v0 = e.f.e.o.l.a;
} // .end method
