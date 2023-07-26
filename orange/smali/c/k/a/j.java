public abstract class c.k.a.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( Object[] p0 ) {
		 /* .locals 5 */
		 /* .line 11 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* array-length v1, p0 */
		 /* mul-int/lit8 v1, v1, 0x2 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 12 */
	 } // :goto_0
	 /* array-length v3, p0 */
	 /* if-ge v2, v3, :cond_0 */
	 int v3 = 1; // const/4 v3, 0x1
	 /* new-array v3, v3, [Ljava/lang/Object; */
	 /* .line 13 */
	 /* aget-byte v4, p0, v2 */
	 java.lang.Byte .valueOf ( v4 );
	 /* aput-object v4, v3, v1 */
	 final String v4 = "%02x"; // const-string v4, "%02x"
	 java.lang.String .format ( v4,v3 );
	 (( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* .line 14 */
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean a ( Object[] p0, Object[] p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_4
	 /* if-nez p1, :cond_0 */
	 /* .line 8 */
} // :cond_0
/* array-length v1, p0 */
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
} // :goto_0
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_3 */
/* .line 10 */
/* aget-byte v2, p0, v1 */
/* aget-byte v3, p1, v1 */
/* if-eq v2, v3, :cond_2 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
int p0 = 1; // const/4 p0, 0x1
} // :cond_4
} // :goto_1
} // .end method
public static a ( java.lang.Object p0 ) {
/* .locals 4 */
/* .line 1 */
/* instance-of v0, p0, [I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* check-cast p0, [I */
/* .line 3 */
/* array-length v0, p0 */
/* new-array v0, v0, [J */
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_0 */
/* .line 5 */
/* aget v2, p0, v1 */
/* int-to-long v2, v2 */
/* aput-wide v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* .line 6 */
} // :cond_1
/* instance-of v0, p0, [J */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
/* check-cast p0, [J */
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
