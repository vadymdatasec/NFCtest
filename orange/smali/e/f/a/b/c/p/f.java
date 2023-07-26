public abstract class e.f.a.b.c.p.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 /* # direct methods */
	 public static e.f.a.b.c.p.f ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x10 */
		 /* new-array v0, v0, [C */
		 /* .line 1 */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x30s */
		 /* 0x31s */
		 /* 0x32s */
		 /* 0x33s */
		 /* 0x34s */
		 /* 0x35s */
		 /* 0x36s */
		 /* 0x37s */
		 /* 0x38s */
		 /* 0x39s */
		 /* 0x41s */
		 /* 0x42s */
		 /* 0x43s */
		 /* 0x44s */
		 /* 0x45s */
		 /* 0x46s */
	 } // .end array-data
} // .end method
public static java.lang.String a ( Object[] p0, Boolean p1 ) {
	 /* .locals 5 */
	 /* .line 1 */
	 /* array-length v0, p0 */
	 /* .line 2 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* shl-int/lit8 v2, v0, 0x1 */
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* add-int/lit8 v3, v0, -0x1 */
	 /* if-ne v2, v3, :cond_0 */
	 /* .line 3 */
	 /* aget-byte v3, p0, v2 */
	 /* and-int/lit16 v3, v3, 0xff */
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* .line 4 */
	 } // :cond_0
	 v3 = e.f.a.b.c.p.f.a;
	 /* aget-byte v4, p0, v2 */
	 /* and-int/lit16 v4, v4, 0xf0 */
	 /* ushr-int/lit8 v4, v4, 0x4 */
	 /* aget-char v3, v3, v4 */
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 /* .line 5 */
	 v3 = e.f.a.b.c.p.f.a;
	 /* aget-byte v4, p0, v2 */
	 /* and-int/lit8 v4, v4, 0xf */
	 /* aget-char v3, v3, v4 */
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* .line 6 */
} // :cond_1
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
