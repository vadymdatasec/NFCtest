public abstract class e.f.e.t.b.l {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 /* # direct methods */
	 public static e.f.e.t.b.l ( ) {
		 /* .locals 1 */
		 final String v0 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:"; // const-string v0, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:"
		 /* .line 1 */
		 (( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
		 return;
	 } // .end method
	 public static Object a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/FormatException; */
		 /* } */
	 } // .end annotation
	 /* .line 56 */
	 v0 = e.f.e.t.b.l.a;
	 /* array-length v1, v0 */
	 /* if-ge p0, v1, :cond_0 */
	 /* .line 57 */
	 /* aget-char p0, v0, p0 */
	 /* .line 58 */
} // :cond_0
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // .end method
public static Integer a ( Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* const/16 v0, 0x8 */
/* .line 73 */
v1 = (( e.f.e.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/e/o/c;->a(I)I
/* and-int/lit16 v2, v1, 0x80 */
/* if-nez v2, :cond_0 */
/* and-int/lit8 p0, v1, 0x7f */
} // :cond_0
/* and-int/lit16 v2, v1, 0xc0 */
/* const/16 v3, 0x80 */
/* if-ne v2, v3, :cond_1 */
/* .line 74 */
p0 = (( e.f.e.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/e/o/c;->a(I)I
/* and-int/lit8 v1, v1, 0x3f */
/* shl-int/lit8 v0, v1, 0x8 */
/* or-int/2addr p0, v0 */
} // :cond_1
/* and-int/lit16 v0, v1, 0xe0 */
/* const/16 v2, 0xc0 */
/* if-ne v0, v2, :cond_2 */
/* const/16 v0, 0x10 */
/* .line 75 */
p0 = (( e.f.e.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/e/o/c;->a(I)I
/* and-int/lit8 v1, v1, 0x1f */
/* shl-int/lit8 v0, v1, 0x10 */
/* or-int/2addr p0, v0 */
/* .line 76 */
} // :cond_2
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // .end method
public static e.f.e.o.e a ( Object[] p0, Object p1, Object p2, java.util.Map p3 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([B", */
/* "Le/f/e/t/b/t;", */
/* "Le/f/e/t/b/n;", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/o/e;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* move-object/from16 v0, p1 */
/* .line 1 */
/* new-instance v7, Le/f/e/o/c; */
/* move-object/from16 v8, p0 */
/* invoke-direct {v7, v8}, Le/f/e/o/c;-><init>([B)V */
/* .line 2 */
/* new-instance v9, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x32 */
/* invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 3 */
/* new-instance v10, Ljava/util/ArrayList; */
int v11 = 1; // const/4 v11, 0x1
/* invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V */
int v1 = 0; // const/4 v1, 0x0
int v2 = -1; // const/4 v2, -0x1
int v12 = 0; // const/4 v12, 0x0
/* move-object/from16 v16, v12 */
int v13 = 0; // const/4 v13, 0x0
int v14 = -1; // const/4 v14, -0x1
int v15 = -1; // const/4 v15, -0x1
/* .line 4 */
} // :goto_0
try { // :try_start_0
v1 = (( e.f.e.o.c ) v7 ).a ( ); // invoke-virtual {v7}, Le/f/e/o/c;->a()I
int v2 = 4; // const/4 v2, 0x4
/* if-ge v1, v2, :cond_0 */
/* .line 5 */
v1 = e.f.e.t.b.p.c;
} // :goto_1
/* move-object v6, v1 */
/* .line 6 */
} // :cond_0
v1 = (( e.f.e.o.c ) v7 ).a ( v2 ); // invoke-virtual {v7, v2}, Le/f/e/o/c;->a(I)I
e.f.e.t.b.p .a ( v1 );
/* .line 7 */
} // :goto_2
v1 = e.f.e.t.b.p.c;
/* if-eq v6, v1, :cond_2 */
/* .line 8 */
v1 = e.f.e.t.b.p.j;
/* if-eq v6, v1, :cond_c */
v1 = e.f.e.t.b.p.k;
/* if-ne v6, v1, :cond_1 */
/* goto/16 :goto_4 */
/* .line 9 */
} // :cond_1
v1 = e.f.e.t.b.p.f;
/* if-ne v6, v1, :cond_4 */
/* .line 10 */
v1 = (( e.f.e.o.c ) v7 ).a ( ); // invoke-virtual {v7}, Le/f/e/o/c;->a()I
/* const/16 v2, 0x10 */
/* if-lt v1, v2, :cond_3 */
/* const/16 v1, 0x8 */
/* .line 11 */
v2 = (( e.f.e.o.c ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Le/f/e/o/c;->a(I)I
/* .line 12 */
v1 = (( e.f.e.o.c ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Le/f/e/o/c;->a(I)I
/* move v15, v1 */
/* move v14, v2 */
} // :cond_2
} // :goto_3
/* move-object v11, v6 */
/* goto/16 :goto_5 */
/* .line 13 */
} // :cond_3
com.google.zxing.FormatException .a ( );
/* throw v0 */
/* .line 14 */
} // :cond_4
v1 = e.f.e.t.b.p.h;
/* if-ne v6, v1, :cond_6 */
/* .line 15 */
v1 = e.f.e.t.b.l .a ( v7 );
/* .line 16 */
e.f.e.o.d .a ( v1 );
if ( v16 != null) { // if-eqz v16, :cond_5
/* .line 17 */
} // :cond_5
com.google.zxing.FormatException .a ( );
/* throw v0 */
/* .line 18 */
} // :cond_6
v1 = e.f.e.t.b.p.l;
/* if-ne v6, v1, :cond_7 */
/* .line 19 */
v1 = (( e.f.e.o.c ) v7 ).a ( v2 ); // invoke-virtual {v7, v2}, Le/f/e/o/c;->a(I)I
/* .line 20 */
v2 = (( e.f.e.t.b.p ) v6 ).a ( v0 ); // invoke-virtual {v6, v0}, Le/f/e/t/b/p;->a(Le/f/e/t/b/t;)I
v2 = (( e.f.e.o.c ) v7 ).a ( v2 ); // invoke-virtual {v7, v2}, Le/f/e/o/c;->a(I)I
/* if-ne v1, v11, :cond_2 */
/* .line 21 */
e.f.e.t.b.l .a ( v7,v9,v2 );
/* .line 22 */
} // :cond_7
v1 = (( e.f.e.t.b.p ) v6 ).a ( v0 ); // invoke-virtual {v6, v0}, Le/f/e/t/b/p;->a(Le/f/e/t/b/t;)I
v3 = (( e.f.e.o.c ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Le/f/e/o/c;->a(I)I
/* .line 23 */
v1 = e.f.e.t.b.p.d;
/* if-ne v6, v1, :cond_8 */
/* .line 24 */
e.f.e.t.b.l .c ( v7,v9,v3 );
/* .line 25 */
} // :cond_8
v1 = e.f.e.t.b.p.e;
/* if-ne v6, v1, :cond_9 */
/* .line 26 */
e.f.e.t.b.l .a ( v7,v9,v3,v13 );
/* .line 27 */
} // :cond_9
v1 = e.f.e.t.b.p.g;
/* if-ne v6, v1, :cond_a */
/* move-object v1, v7 */
/* move-object v2, v9 */
/* move-object/from16 v4, v16 */
/* move-object v5, v10 */
/* move-object v11, v6 */
/* move-object/from16 v6, p3 */
/* .line 28 */
/* invoke-static/range {v1 ..v6}, Le/f/e/t/b/l;->a(Le/f/e/o/c;Ljava/lang/StringBuilder;ILe/f/e/o/d;Ljava/util/Collection;Ljava/util/Map;)V */
} // :cond_a
/* move-object v11, v6 */
/* .line 29 */
v1 = e.f.e.t.b.p.i;
/* if-ne v11, v1, :cond_b */
/* .line 30 */
e.f.e.t.b.l .b ( v7,v9,v3 );
/* .line 31 */
} // :cond_b
com.google.zxing.FormatException .a ( );
/* throw v0 */
} // :cond_c
} // :goto_4
/* move-object v11, v6 */
int v13 = 1; // const/4 v13, 0x1
/* .line 32 */
} // :goto_5
v1 = e.f.e.t.b.p.c;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-ne v11, v1, :cond_f */
/* .line 33 */
/* new-instance v7, Le/f/e/o/e; */
/* .line 34 */
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = /* .line 35 */
if ( v0 != null) { // if-eqz v0, :cond_d
/* move-object v3, v12 */
} // :cond_d
/* move-object v3, v10 */
} // :goto_6
/* if-nez p2, :cond_e */
/* move-object v4, v12 */
/* .line 36 */
} // :cond_e
/* invoke-virtual/range {p2 ..p2}, Ljava/lang/Enum;->toString()Ljava/lang/String; */
/* move-object v4, v0 */
} // :goto_7
/* move-object v0, v7 */
/* move-object/from16 v1, p0 */
/* move v5, v14 */
/* move v6, v15 */
/* invoke-direct/range {v0 ..v6}, Le/f/e/o/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V */
} // :cond_f
int v11 = 1; // const/4 v11, 0x1
/* goto/16 :goto_0 */
/* .line 37 */
/* :catch_0 */
com.google.zxing.FormatException .a ( );
/* throw v0 */
} // .end method
public static void a ( Object p0, java.lang.StringBuilder p1, Integer p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* mul-int/lit8 v0, p2, 0xd */
/* .line 38 */
v1 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
/* if-gt v0, v1, :cond_2 */
/* mul-int/lit8 v0, p2, 0x2 */
/* .line 39 */
/* new-array v0, v0, [B */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lez p2, :cond_1 */
/* const/16 v2, 0xd */
/* .line 40 */
v2 = (( e.f.e.o.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/e/o/c;->a(I)I
/* .line 41 */
/* div-int/lit8 v3, v2, 0x60 */
/* shl-int/lit8 v3, v3, 0x8 */
/* rem-int/lit8 v2, v2, 0x60 */
/* or-int/2addr v2, v3 */
/* const/16 v3, 0x3bf */
/* if-ge v2, v3, :cond_0 */
/* const v3, 0xa1a1 */
} // :cond_0
/* const v3, 0xa6a1 */
} // :goto_1
/* add-int/2addr v2, v3 */
/* shr-int/lit8 v3, v2, 0x8 */
/* int-to-byte v3, v3 */
/* .line 42 */
/* aput-byte v3, v0, v1 */
/* add-int/lit8 v3, v1, 0x1 */
/* int-to-byte v2, v2 */
/* .line 43 */
/* aput-byte v2, v0, v3 */
/* add-int/lit8 v1, v1, 0x2 */
/* add-int/lit8 p2, p2, -0x1 */
/* .line 44 */
} // :cond_1
try { // :try_start_0
/* new-instance p0, Ljava/lang/String; */
final String p2 = "GB2312"; // const-string p2, "GB2312"
/* invoke-direct {p0, v0, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* .line 45 */
/* :catch_0 */
com.google.zxing.FormatException .a ( );
/* throw p0 */
/* .line 46 */
} // :cond_2
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // .end method
public static void a ( Object p0, java.lang.StringBuilder p1, Integer p2, Object p3, java.util.Collection p4, java.util.Map p5 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/e/o/c;", */
/* "Ljava/lang/StringBuilder;", */
/* "I", */
/* "Le/f/e/o/d;", */
/* "Ljava/util/Collection<", */
/* "[B>;", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* shl-int/lit8 v0, p2, 0x3 */
/* .line 47 */
v1 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
/* if-gt v0, v1, :cond_2 */
/* .line 48 */
/* new-array v0, p2, [B */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p2, :cond_0 */
/* const/16 v2, 0x8 */
/* .line 49 */
v2 = (( e.f.e.o.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/e/o/c;->a(I)I
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* if-nez p3, :cond_1 */
/* .line 50 */
e.f.e.o.l .a ( v0,p5 );
/* .line 51 */
} // :cond_1
(( java.lang.Enum ) p3 ).name ( ); // invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;
/* .line 52 */
} // :goto_1
try { // :try_start_0
/* new-instance p2, Ljava/lang/String; */
/* invoke-direct {p2, v0, p0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 53 */
return;
/* .line 54 */
/* :catch_0 */
com.google.zxing.FormatException .a ( );
/* throw p0 */
/* .line 55 */
} // :cond_2
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // .end method
public static void a ( Object p0, java.lang.StringBuilder p1, Integer p2, Boolean p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* .line 59 */
v0 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
/* if-le p2, v1, :cond_1 */
/* .line 60 */
v1 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
/* const/16 v2, 0xb */
/* if-lt v1, v2, :cond_0 */
/* .line 61 */
v1 = (( e.f.e.o.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/e/o/c;->a(I)I
/* .line 62 */
/* div-int/lit8 v2, v1, 0x2d */
v2 = e.f.e.t.b.l .a ( v2 );
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 63 */
/* rem-int/lit8 v1, v1, 0x2d */
v1 = e.f.e.t.b.l .a ( v1 );
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 p2, p2, -0x2 */
/* .line 64 */
} // :cond_0
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // :cond_1
/* if-ne p2, v1, :cond_3 */
/* .line 65 */
p2 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
int v2 = 6; // const/4 v2, 0x6
/* if-lt p2, v2, :cond_2 */
/* .line 66 */
p0 = (( e.f.e.o.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/e/o/c;->a(I)I
p0 = e.f.e.t.b.l .a ( p0 );
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 67 */
} // :cond_2
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // :cond_3
} // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_6
/* .line 68 */
} // :goto_2
p0 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
/* if-ge v0, p0, :cond_6 */
/* .line 69 */
p0 = (( java.lang.StringBuilder ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->charAt(I)C
/* const/16 p2, 0x25 */
/* if-ne p0, p2, :cond_5 */
/* .line 70 */
p0 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
/* sub-int/2addr p0, v1 */
/* if-ge v0, p0, :cond_4 */
/* add-int/lit8 p0, v0, 0x1 */
p3 = (( java.lang.StringBuilder ) p1 ).charAt ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->charAt(I)C
/* if-ne p3, p2, :cond_4 */
/* .line 71 */
(( java.lang.StringBuilder ) p1 ).deleteCharAt ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
} // :cond_4
/* const/16 p0, 0x1d */
/* .line 72 */
(( java.lang.StringBuilder ) p1 ).setCharAt ( v0, p0 ); // invoke-virtual {p1, v0, p0}, Ljava/lang/StringBuilder;->setCharAt(IC)V
} // :cond_5
} // :goto_3
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_6
return;
} // .end method
public static void b ( Object p0, java.lang.StringBuilder p1, Integer p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* mul-int/lit8 v0, p2, 0xd */
/* .line 1 */
v1 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
/* if-gt v0, v1, :cond_2 */
/* mul-int/lit8 v0, p2, 0x2 */
/* .line 2 */
/* new-array v0, v0, [B */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lez p2, :cond_1 */
/* const/16 v2, 0xd */
/* .line 3 */
v2 = (( e.f.e.o.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/e/o/c;->a(I)I
/* .line 4 */
/* div-int/lit16 v3, v2, 0xc0 */
/* shl-int/lit8 v3, v3, 0x8 */
/* rem-int/lit16 v2, v2, 0xc0 */
/* or-int/2addr v2, v3 */
/* const/16 v3, 0x1f00 */
/* if-ge v2, v3, :cond_0 */
/* const v3, 0x8140 */
} // :cond_0
/* const v3, 0xc140 */
} // :goto_1
/* add-int/2addr v2, v3 */
/* shr-int/lit8 v3, v2, 0x8 */
/* int-to-byte v3, v3 */
/* .line 5 */
/* aput-byte v3, v0, v1 */
/* add-int/lit8 v3, v1, 0x1 */
/* int-to-byte v2, v2 */
/* .line 6 */
/* aput-byte v2, v0, v3 */
/* add-int/lit8 v1, v1, 0x2 */
/* add-int/lit8 p2, p2, -0x1 */
/* .line 7 */
} // :cond_1
try { // :try_start_0
/* new-instance p0, Ljava/lang/String; */
final String p2 = "SJIS"; // const-string p2, "SJIS"
/* invoke-direct {p0, v0, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* .line 8 */
/* :catch_0 */
com.google.zxing.FormatException .a ( );
/* throw p0 */
/* .line 9 */
} // :cond_2
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // .end method
public static void c ( Object p0, java.lang.StringBuilder p1, Integer p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
} // :goto_0
int v0 = 3; // const/4 v0, 0x3
/* const/16 v1, 0xa */
/* if-lt p2, v0, :cond_2 */
/* .line 1 */
v0 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
/* if-lt v0, v1, :cond_1 */
/* .line 2 */
v0 = (( e.f.e.o.c ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/e/o/c;->a(I)I
/* const/16 v2, 0x3e8 */
/* if-ge v0, v2, :cond_0 */
/* .line 3 */
/* div-int/lit8 v2, v0, 0x64 */
v2 = e.f.e.t.b.l .a ( v2 );
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 4 */
/* div-int/lit8 v2, v0, 0xa */
/* rem-int/2addr v2, v1 */
v1 = e.f.e.t.b.l .a ( v2 );
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 5 */
/* rem-int/lit8 v0, v0, 0xa */
v0 = e.f.e.t.b.l .a ( v0 );
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 p2, p2, -0x3 */
/* .line 6 */
} // :cond_0
com.google.zxing.FormatException .a ( );
/* throw p0 */
/* .line 7 */
} // :cond_1
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // :cond_2
int v0 = 2; // const/4 v0, 0x2
/* if-ne p2, v0, :cond_5 */
/* .line 8 */
p2 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
int v0 = 7; // const/4 v0, 0x7
/* if-lt p2, v0, :cond_4 */
/* .line 9 */
p0 = (( e.f.e.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/e/o/c;->a(I)I
/* const/16 p2, 0x64 */
/* if-ge p0, p2, :cond_3 */
/* .line 10 */
/* div-int/lit8 p2, p0, 0xa */
p2 = e.f.e.t.b.l .a ( p2 );
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 11 */
/* rem-int/2addr p0, v1 */
p0 = e.f.e.t.b.l .a ( p0 );
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
return;
/* .line 12 */
} // :cond_3
com.google.zxing.FormatException .a ( );
/* throw p0 */
/* .line 13 */
} // :cond_4
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // :cond_5
int v0 = 1; // const/4 v0, 0x1
/* if-ne p2, v0, :cond_8 */
/* .line 14 */
p2 = (( e.f.e.o.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/o/c;->a()I
int v0 = 4; // const/4 v0, 0x4
/* if-lt p2, v0, :cond_7 */
/* .line 15 */
p0 = (( e.f.e.o.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/e/o/c;->a(I)I
/* if-ge p0, v1, :cond_6 */
/* .line 16 */
p0 = e.f.e.t.b.l .a ( p0 );
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 17 */
} // :cond_6
com.google.zxing.FormatException .a ( );
/* throw p0 */
/* .line 18 */
} // :cond_7
com.google.zxing.FormatException .a ( );
/* throw p0 */
} // :cond_8
} // :goto_1
return;
} // .end method
