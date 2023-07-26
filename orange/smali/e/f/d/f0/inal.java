public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0x200 */
		 /* new-array v0, v0, [Ljava/lang/String; */
		 /* .line 2 */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* move v1, p2 */
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* add-int v3, p2, p3 */
	 /* if-ge v1, v3, :cond_0 */
	 /* mul-int/lit8 v2, v2, 0x1f */
	 /* .line 1 */
	 /* aget-char v3, p1, v1 */
	 /* add-int/2addr v2, v3 */
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* ushr-int/lit8 v1, v2, 0x14 */
/* ushr-int/lit8 v3, v2, 0xc */
/* xor-int/2addr v1, v3 */
/* xor-int/2addr v1, v2 */
/* ushr-int/lit8 v2, v1, 0x7 */
/* ushr-int/lit8 v3, v1, 0x4 */
/* xor-int/2addr v2, v3 */
/* xor-int/2addr v1, v2 */
/* .line 2 */
v2 = this.a;
/* array-length v3, v2 */
/* add-int/lit8 v3, v3, -0x1 */
/* and-int/2addr v1, v3 */
/* .line 3 */
/* aget-object v2, v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_4
	 /* .line 4 */
	 v3 = 	 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
	 /* if-eq v3, p3, :cond_1 */
} // :cond_1
} // :goto_1
/* if-ge v0, p3, :cond_3 */
/* .line 5 */
v3 = (( java.lang.String ) v2 ).charAt ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C
/* add-int v4, p2, v0 */
/* aget-char v4, p1, v4 */
/* if-eq v3, v4, :cond_2 */
/* .line 6 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
/* .line 7 */
p1 = this.a;
/* aput-object v0, p1, v1 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* .line 8 */
} // :cond_4
} // :goto_2
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
/* .line 9 */
p1 = this.a;
/* aput-object v0, p1, v1 */
} // .end method
