public abstract class k.e1.k.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final l.i a;
	 public static final java.lang.String b;
	 public static final java.lang.String c;
	 public static final java.lang.String d;
	 /* # direct methods */
	 public static k.e1.k.g ( ) {
		 /* .locals 16 */
		 final String v0 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"; // const-string v0, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
		 /* .line 1 */
		 l.i .c ( v0 );
		 final String v1 = "DATA"; // const-string v1, "DATA"
		 final String v2 = "HEADERS"; // const-string v2, "HEADERS"
		 final String v3 = "PRIORITY"; // const-string v3, "PRIORITY"
		 final String v4 = "RST_STREAM"; // const-string v4, "RST_STREAM"
		 final String v5 = "SETTINGS"; // const-string v5, "SETTINGS"
		 final String v6 = "PUSH_PROMISE"; // const-string v6, "PUSH_PROMISE"
		 final String v7 = "PING"; // const-string v7, "PING"
		 final String v8 = "GOAWAY"; // const-string v8, "GOAWAY"
		 final String v9 = "WINDOW_UPDATE"; // const-string v9, "WINDOW_UPDATE"
		 final String v10 = "CONTINUATION"; // const-string v10, "CONTINUATION"
		 /* .line 2 */
		 /* filled-new-array/range {v1 ..v10}, [Ljava/lang/String; */
		 /* const/16 v0, 0x40 */
		 /* new-array v0, v0, [Ljava/lang/String; */
		 /* .line 3 */
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [Ljava/lang/String; */
		 /* .line 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 5 */
	 } // :goto_0
	 v2 = k.e1.k.g.d;
	 /* array-length v3, v2 */
	 /* const/16 v4, 0x20 */
	 int v5 = 1; // const/4 v5, 0x1
	 /* if-ge v1, v3, :cond_0 */
	 /* new-array v3, v5, [Ljava/lang/Object; */
	 /* .line 6 */
	 java.lang.Integer .toBinaryString ( v1 );
	 /* aput-object v5, v3, v0 */
	 final String v5 = "%8s"; // const-string v5, "%8s"
	 k.e1.e .a ( v5,v3 );
	 /* const/16 v5, 0x30 */
	 (( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;
	 /* aput-object v3, v2, v1 */
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* .line 7 */
} // :cond_0
v1 = k.e1.k.g.c;
final String v2 = ""; // const-string v2, ""
/* aput-object v2, v1, v0 */
final String v2 = "END_STREAM"; // const-string v2, "END_STREAM"
/* .line 8 */
/* aput-object v2, v1, v5 */
/* new-array v2, v5, [I */
/* aput v5, v2, v0 */
final String v3 = "PADDED"; // const-string v3, "PADDED"
/* const/16 v6, 0x8 */
/* .line 9 */
/* aput-object v3, v1, v6 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
final String v3 = "|PADDED"; // const-string v3, "|PADDED"
/* if-ge v1, v5, :cond_1 */
/* .line 10 */
/* aget v7, v2, v1 */
/* .line 11 */
v8 = k.e1.k.g.c;
/* or-int/lit8 v9, v7, 0x8 */
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
v11 = k.e1.k.g.c;
/* aget-object v7, v11, v7 */
(( java.lang.StringBuilder ) v10 ).append ( v7 ); // invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).append ( v3 ); // invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput-object v3, v8, v9 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 12 */
} // :cond_1
v1 = k.e1.k.g.c;
int v7 = 4; // const/4 v7, 0x4
final String v8 = "END_HEADERS"; // const-string v8, "END_HEADERS"
/* aput-object v8, v1, v7 */
final String v7 = "PRIORITY"; // const-string v7, "PRIORITY"
/* .line 13 */
/* aput-object v7, v1, v4 */
/* const/16 v4, 0x24 */
final String v7 = "END_HEADERS|PRIORITY"; // const-string v7, "END_HEADERS|PRIORITY"
/* .line 14 */
/* aput-object v7, v1, v4 */
int v1 = 3; // const/4 v1, 0x3
/* new-array v4, v1, [I */
/* .line 15 */
/* fill-array-data v4, :array_0 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_2
/* if-ge v7, v1, :cond_3 */
/* .line 16 */
/* aget v8, v4, v7 */
int v9 = 0; // const/4 v9, 0x0
} // :goto_3
/* if-ge v9, v5, :cond_2 */
/* .line 17 */
/* aget v10, v2, v9 */
/* .line 18 */
v11 = k.e1.k.g.c;
/* or-int v12, v10, v8 */
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
v14 = k.e1.k.g.c;
/* aget-object v14, v14, v10 */
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v14, 0x7c */
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v15 = k.e1.k.g.c;
/* aget-object v15, v15, v8 */
(( java.lang.StringBuilder ) v13 ).append ( v15 ); // invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput-object v13, v11, v12 */
/* .line 19 */
v11 = k.e1.k.g.c;
/* or-int/2addr v12, v6 */
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
v15 = k.e1.k.g.c;
/* aget-object v10, v15, v10 */
(( java.lang.StringBuilder ) v13 ).append ( v10 ); // invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v10 = k.e1.k.g.c;
/* aget-object v10, v10, v8 */
(( java.lang.StringBuilder ) v13 ).append ( v10 ); // invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).append ( v3 ); // invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput-object v10, v11, v12 */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_2
/* add-int/lit8 v7, v7, 0x1 */
/* .line 20 */
} // :cond_3
} // :goto_4
v1 = k.e1.k.g.c;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_5 */
/* .line 21 */
/* aget-object v2, v1, v0 */
/* if-nez v2, :cond_4 */
v2 = k.e1.k.g.d;
/* aget-object v2, v2, v0 */
/* aput-object v2, v1, v0 */
} // :cond_4
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_5
return;
/* :array_0 */
/* .array-data 4 */
/* 0x4 */
/* 0x20 */
/* 0x24 */
} // .end array-data
} // .end method
public static java.lang.IllegalArgumentException a ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
k.e1.e .a ( p0,p1 );
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static java.lang.String a ( Object p0, Object p1 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
final String p0 = ""; // const-string p0, ""
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* if-eq p0, v0, :cond_6 */
int v0 = 3; // const/4 v0, 0x3
/* if-eq p0, v0, :cond_6 */
int v0 = 4; // const/4 v0, 0x4
/* if-eq p0, v0, :cond_4 */
int v0 = 6; // const/4 v0, 0x6
/* if-eq p0, v0, :cond_4 */
int v0 = 7; // const/4 v0, 0x7
/* if-eq p0, v0, :cond_6 */
/* const/16 v0, 0x8 */
/* if-eq p0, v0, :cond_6 */
/* .line 5 */
v0 = k.e1.k.g.c;
/* array-length v1, v0 */
/* if-ge p1, v1, :cond_1 */
/* aget-object v0, v0, p1 */
} // :cond_1
v0 = k.e1.k.g.d;
/* aget-object v0, v0, p1 */
} // :goto_0
int v1 = 5; // const/4 v1, 0x5
/* if-ne p0, v1, :cond_2 */
/* and-int/lit8 v1, p1, 0x4 */
if ( v1 != null) { // if-eqz v1, :cond_2
final String p0 = "HEADERS"; // const-string p0, "HEADERS"
final String p1 = "PUSH_PROMISE"; // const-string p1, "PUSH_PROMISE"
/* .line 6 */
(( java.lang.String ) v0 ).replace ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
} // :cond_2
/* if-nez p0, :cond_3 */
/* and-int/lit8 p0, p1, 0x20 */
if ( p0 != null) { // if-eqz p0, :cond_3
final String p0 = "PRIORITY"; // const-string p0, "PRIORITY"
final String p1 = "COMPRESSED"; // const-string p1, "COMPRESSED"
/* .line 7 */
(( java.lang.String ) v0 ).replace ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
} // :cond_3
} // :cond_4
int p0 = 1; // const/4 p0, 0x1
/* if-ne p1, p0, :cond_5 */
final String p0 = "ACK"; // const-string p0, "ACK"
/* .line 8 */
} // :cond_5
p0 = k.e1.k.g.d;
/* aget-object p0, p0, p1 */
} // :goto_1
/* .line 9 */
} // :cond_6
p0 = k.e1.k.g.d;
/* aget-object p0, p0, p1 */
} // .end method
public static java.lang.String a ( Boolean p0, Integer p1, Integer p2, Object p3, Object p4 ) {
/* .locals 4 */
/* .line 2 */
v0 = k.e1.k.g.b;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-ge p3, v1, :cond_0 */
/* aget-object v0, v0, p3 */
} // :cond_0
/* new-array v0, v3, [Ljava/lang/Object; */
java.lang.Byte .valueOf ( p3 );
/* aput-object v1, v0, v2 */
final String v1 = "0x%02x"; // const-string v1, "0x%02x"
k.e1.e .a ( v1,v0 );
/* .line 3 */
} // :goto_0
k.e1.k.g .a ( p3,p4 );
int p4 = 5; // const/4 p4, 0x5
/* new-array p4, p4, [Ljava/lang/Object; */
if ( p0 != null) { // if-eqz p0, :cond_1
final String p0 = "<<"; // const-string p0, "<<"
} // :cond_1
final String p0 = ">>"; // const-string p0, ">>"
} // :goto_1
/* aput-object p0, p4, v2 */
/* .line 4 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p0, p4, v3 */
int p0 = 2; // const/4 p0, 0x2
java.lang.Integer .valueOf ( p2 );
/* aput-object p1, p4, p0 */
int p0 = 3; // const/4 p0, 0x3
/* aput-object v0, p4, p0 */
int p0 = 4; // const/4 p0, 0x4
/* aput-object p3, p4, p0 */
final String p0 = "%s 0x%08x %5d %-13s %s"; // const-string p0, "%s 0x%08x %5d %-13s %s"
k.e1.e .a ( p0,p4 );
} // .end method
public static java.io.IOException b ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/io/IOException; */
k.e1.e .a ( p0,p1 );
/* invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
